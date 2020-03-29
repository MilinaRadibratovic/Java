package bankatest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestNgA {
	String ime = "Marko";

	String broj = "012345";
	Account racun = new Account(ime, broj);

	@Test
	public void constructor1() {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(racun.getName(), "Marko");
		sa.assertEquals(racun.getNumber(), "012345");
		sa.assertEquals(racun.getAmount(), 0d);
		sa.assertAll();
	}

	@Test
	public void get() {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(racun.getAmount(), 0d);
		sa.assertAll();
	}

	@Test
	public void set1() {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(racun.getAmount(), 0d);
		Double novac = 1000d;
		racun.setAmount(novac);
		sa.assertEquals(racun.getAmount(), 1000d); 
		sa.assertAll();
	}

	@Test
	public void set2() {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(racun.getAmount(), 1000d);
		Double novac = -10000d;
		racun.setAmount(novac);
		sa.assertEquals(racun.getAmount(), 1000d);
		sa.assertAll();
	}

	@Test
	public void ispis() {
		String s = String.format("%s%8s%s%8s%.2f", broj, " ", ime, " ", racun.getAmount());
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(racun.toString(), s);

		sa.assertAll();
	}

	@BeforeGroups(groups = { "const2" })
	public void createAccounts() {
		HSSFWorkbook wb = new HSSFWorkbook();
		for (int n = 0; n < 10; n++) {
			HSSFSheet sheet = wb.createSheet("racuni_data" + n);
			for (int i = 0; i < 100; i++) {
				Row row = sheet.createRow(i);
				for (int j = 0; j < 100; j++) {
					Cell cell = row.createCell(j);
					cell.setCellValue(UUID.randomUUID().toString());
				}
			}
		}
		try {
			FileOutputStream os = new FileOutputStream("racuni.xls");
			wb.write(os);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(groups = { "const2" })
	public void constructor2() {
		HSSFWorkbook wb;
		FileInputStream fi;

		try {
			fi = new FileInputStream("racuni.xls");
			wb = new HSSFWorkbook(fi);
			for (int n = 0; n < 10; n++) {
				HSSFSheet sheet = wb.getSheetAt(n);
				for (int i = 0; i < 100; i++) {
					Row row = sheet.getRow(i);
					for (int j = 0; j < 100; j++) {
						Cell cell = row.getCell(j);
						for (int m = j + 1; m < 100; m++) {
							Assert.assertNotEquals(row.getCell(j), row.getCell(m));
						}
					}
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
