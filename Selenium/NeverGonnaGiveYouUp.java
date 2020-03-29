package youtube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NeverGonnaGiveYouUp {

	public static void main(String[] args) {
		/*
		 * Pomocu jave i selenijuma 1) otici na sajt youtube 2) u search-u pronaci Rick
		 * Astley i pustiti pesmu Never gonna give you up // voditi racuna da ako
		 * postoje reklame da ih preskocite
		 * 
		 * Dodatni zadatak Nakon sto je pustena pesma, iz liste sa desne strane (watch
		 * next) pustiti drugi predlozen video
		 */

		System.setProperty("webdriver.chrome,driver", "src\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get("https://www.youtube.com/");
		//wd.manage().window().maximize();
		wd.findElement(By.cssSelector("input#search")).sendKeys("Rick Astley", Keys.ENTER);
		
		wd.findElement(By.linkText("Rick Astley - Never Gonna Give You Up (Video)")).click();

		
		
		

	}

}
