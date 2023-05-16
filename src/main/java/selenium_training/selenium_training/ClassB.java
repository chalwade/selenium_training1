package selenium_training.selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassB {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","Y://chromedriver_win32 (1)//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://nxtgenaiacademy.com/demo-site");
	driver.findElement(By.xpath("//*[@name=\"vfb-5\"]")).sendKeys("sam");
	driver.findElement(By.xpath("//*[@name=\"vfb-7\"]")).sendKeys("karan");
	driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"vfb-13-address\"]")).sendKeys("mumbai");
	driver.findElement(By.xpath("//*[@id=\"vfb-13-address-2\"]")).sendKeys("sagar wing A 555");
	driver.findElement(By.xpath("//input[@id=\"vfb-13-city\"]")).sendKeys("mumbai");
	driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("maharashtra");
	driver.findElement(By.xpath("//*[@name=\"vfb-13[zip]\"]")).sendKeys("411107");
	Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"select2-vfb-13-country-container\"]"));
	// WebElement drop=driver.findElement(By.xpath("//*[@title=\"India\"]"));
	//Select dropedown = new Select(drop);
	//dropedown.selectByVisibleText("India");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sam123@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"vfb-18\"]")).click();
	driver.findElement(By.xpath("//*[@data-date=\"10\"]")).click();
	//WebElement element = driver.findElement(By.id("element-id"));
//	element.click();

	JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("window.scrollBy(0,200)");

//	driver.findElement(By.xpath("//*[@id=\"select2-vfb-16-hour-container\"]")).click();
	driver.findElement(By.xpath("//*[@name=\"vfb-19\"]")).sendKeys("7754545554");
	driver.findElement(By.xpath("//*[@value=\"TestNG\"]")).click();
	driver.findElement(By.xpath("//*[@name=\"vfb-23\"]")).sendKeys("welcome");
	driver.findElement(By.xpath("//*[@name=\"vfb-3\"]")).sendKeys("34");
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	

	
	
	
	
	
	
	
	
	 
	 
	
	
    

  
  
  
  
	} 

}
