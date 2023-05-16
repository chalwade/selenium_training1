package selenium_training.selenium_training;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class App {
 @Test
 public void Test1() {
	 System.out.println("Test case is execute first");
 }
 @BeforeClass
 public void Test2() {
	 System.out.println("before test is execute");
 }
 @BeforeMethod
 public void Method1() {
	 System.out.println("befoe execute ");
 }
 }