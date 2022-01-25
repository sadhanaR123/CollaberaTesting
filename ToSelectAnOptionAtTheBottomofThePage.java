package testNG_Basics;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchCookieException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSelectAnOptionAtTheBottomofThePage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.google.com/doodles");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	for(;;) {
		try {
			driver.findElement(By.linkText("Get Vaccinated. Wear a Mask. Save Lives. (January 18)")).click();
			break;
		}catch(NoSuchElementException e) {
			js.executeScript("window.scrollBy(0,200)");
		}
	}

}
}
