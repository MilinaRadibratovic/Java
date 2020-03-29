package zadatak10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.TakesScreenshot;

public class Zadatak_2_0309 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "src\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get("https://drive.google.com/drive/my-drive");
		wd.manage().window().maximize();
		wd.findElement(By.id("identifierId")).sendKeys("mradibratovic87@gmail.com");
		wd.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();

		TakesScreenshot ssh = (TakesScreenshot) wd;
		File source = ssh.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(source, new File("./Screenshots/Screenshot.png"));

		System.out.println("Screenshot je uradjen.");
		wd.close();

	}

}
