package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testPriority {
@Test(priority = 1)
public void dell() {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.dell.com/");
	driver.quit();
}
@Test(priority =-1,invocationCount = 2,threadPoolSize = 2)
public void lenskart() {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.lenskart.com/");
	driver.quit();
}
@Test(invocationCount = 3)
public void lenovo() {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.lenovo.com/");
	driver.quit();
}

}
