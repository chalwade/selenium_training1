package selenium_training.selenium_training;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler; 

public class ClassA {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","Y://chromedriver_win32 (1)//chromedriver.exe");
WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize(); 
driver.get("https://www.ebay.com/");
driver.findElement(By.xpath("//input[@value= 'Search']")).click();
driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div/div[2]/div[1]/ul/li[2]/a")).click();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@title='T-Shirt T-Shirts for Men']")).click();
driver.findElement(By.xpath("//*[@id=\"s0-27-9-0-1[0]-0-1[0]-0-12-list\"]/li[3]/a")).click();
driver.findElement(By.xpath("//*[@id=\"s0-27-9-0-1[0]-0-0-6-5-4[2]-flyout\"]/button")).click();
driver.findElement(By.xpath("//li[1]//ul[1]//li[3]//a[1]//span[2]")).click();
driver.findElement(By.xpath("//*[@class=\"s-item__title\"]")).click();
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,500)");
String tex = driver.getTitle();
System.out.println("Ebay website");  
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.close();


 







 
 
 
 




	}

}
