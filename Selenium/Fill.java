package practice_form;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fill {

	public static void main(String[] args) {

		/*
		 * Koristeci Selenium webdriver otici na sajt
		 * https://www.techlistic.com/p/selenium-practice-form.html i popuniti formu
		 * (idealno celu, ako ne ide onda probajte bar do kontinenta) Potrudite se da
		 * koristite vise lokatora za pronalazenje elemenata.
		 */
		System.setProperty("webdriver.chrome,driver", "src\\chromedriver.exe");
		WebDriver wb = new ChromeDriver();

		wb.get(" https://www.techlistic.com/p/selenium-practice-form.html");

		wb.findElement(By.name("firstname")).sendKeys("Milina");
		wb.findElement(By.name("lastname")).sendKeys("Radibratovic");
		wb.findElement(By.id("sex-1")).click();
		wb.findElement(By.id("exp-0")).click();

		DateTimeFormatter formatdatuma = DateTimeFormatter.ISO_DATE;
		String datum = formatdatuma.format(LocalDate.now());
		wb.findElement(By.cssSelector("input[id=datepicker]")).sendKeys(datum);
		wb.findElement(By.cssSelector("input[id=profession-1]")).click();

		wb.findElement(By.xpath("//input[@id='tool-2']")).click();

		Select kontinent = new Select(wb.findElement(By.id("continents")));
		kontinent.selectByVisibleText("Europe");

		JavascriptExecutor je = (JavascriptExecutor) wb;
		WebElement element = wb.findElement(By.xpath("//option[contains(text(),'WebElement Commands')]"));
		je.executeScript("arguments[0].scrollIntoView(true);", element);

		wb.findElement(By.className("input-file")).sendKeys("C:\\Users\\KORISNIK\\Desktop\\Slicica.png");

		wb.findElement(By.linkText("Click here to Download File")).click();
		wb.navigate().back();

		wb.findElement(By.id("submit")).click();
	}

}
