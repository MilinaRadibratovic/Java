package bankatest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import bankatest.Account;
import bankatest.Bank;

public class TestNgB {
	Bank mobi = new Bank();

	@BeforeMethod
	public Bank reset() {
		mobi.reset();
		return null;
	}

	@Test
	public void bankReset() {
		SoftAssert sa = new SoftAssert();
		mobi.reset();
		sa.assertNotSame(mobi, null);
		sa.assertAll();
	}

	@Test
	public void getAccount() {
		Account[] racuni = new Account[5];
		SoftAssert sa = new SoftAssert();
		for (int i = 0; i < racuni.length; i++) {
			String ime = "Ime " + i;
			racuni[i] = mobi.openAccount(ime);
			sa.assertNotNull(mobi.getAccount(racuni[i].getNumber()));
		}
		sa.assertAll();
	}

	@Test
	public void payIn1() {
		Account a1 = mobi.openAccount("Nikola");
		SoftAssert sa = new SoftAssert();
		mobi.payInMoney(a1.getNumber(), 500d);
		mobi.payInMoney(a1.getNumber(), 300d);
		sa.assertEquals(a1.getAmount(), 800d);

		sa.assertAll();
	}

	@Test
	public void payIn2() {
		Account a1 = mobi.openAccount("Nikola");
		SoftAssert sa = new SoftAssert();
		mobi.payInMoney(a1.getNumber(), 600d);
		sa.assertEquals(a1.getAmount(), 600d);

		mobi.payInMoney(a1.getNumber(), -1000d);
		sa.assertEquals(a1.getAmount(), 600d);

		mobi.payInMoney(a1.getNumber(), 0d);
		sa.assertEquals(a1.getAmount(), 600d);
		sa.assertAll();
	}

	@Test
	public void transfer() {
		Account b1 = mobi.openAccount("Nikola");
		Account b2 = mobi.openAccount("Marko");
		SoftAssert sa = new SoftAssert();

		b1.setAmount(999d); 				
		mobi.transferMoney(b1.getNumber(), b2.getNumber(), 300d);
		sa.assertEquals(b1.getAmount(), 699d);
		sa.assertEquals(b2.getAmount(), 300d);

		sa.assertAll();
	}

	@Test
	public void transfer2() {
		Account c1 = mobi.openAccount("Nikola");
		Account c2 = mobi.openAccount("Marko");
		SoftAssert sa = new SoftAssert();

		c1.setAmount(999d);
		mobi.transferMoney(c1.getNumber(), c2.getNumber(), -1000d);
		sa.assertEquals(c1.getAmount(), 999d);
		sa.assertEquals(c2.getAmount(), 0d);
		sa.assertAll();
	}

	@Test
	public void transfer3() {
		Account b1 = mobi.openAccount("Nikola");
		Account b2 = mobi.openAccount("Marko");
		SoftAssert sa = new SoftAssert();

		b1.setAmount(999d);
		mobi.transferMoney(b1.getNumber(), b2.getNumber(), 1000d);
		sa.assertEquals(b1.getAmount(), 999d);
		sa.assertEquals(b2.getAmount(), 0d);
		sa.assertAll();
	}
	
	
	@Test
	public void sumMoney() {
		Account a1 = mobi.openAccount("Nikola");
		Account a2 = mobi.openAccount("Marko");
		Account a3 = mobi.openAccount("Lazar");
		SoftAssert sa = new SoftAssert();

		a1.setAmount(2000d);
		a2.setAmount(3000d);
		a3.setAmount(4000d);
		sa.assertEquals(mobi.getSumMoney(), 9000d);
		sa.assertAll();
	}
}