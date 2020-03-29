package selenium_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Zadatak_1_0316 {

	@BeforeMethod
	public void uslovi() {
		System.setProperty("webdriver.chrome.driver","src\\chromedriver.exe");
	}

	@Test
	public void f() {

		WebDriver wd = new ChromeDriver();
		wd.get("https://www.google.com");
		wd.navigate().to("https://itbootcamp.rs/");
		String titl = wd.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(titl,
				"ITBootcamp - Besplatna IT prekvalifikacija - Free IT Bootcamp in cooperation with the Divac Foundation");
		wd.close();
		sa.assertAll();

	}
}
