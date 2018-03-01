package automationFreamwork;

import java.io.IOException;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test; 

import pageObject.System_admin;



public class CreateEmployee_TC {
  public static WebDriver driver = new FirefoxDriver();
  

  public void createEmployee() throws IOException, Exception{
	  
	  driver.get("https://qa2.revature.com/core");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	  Login_TC.login(driver);
	  CommoFunctions.take_screenshot(driver,"test");
	  System_admin.employee.menu_employee(driver).click();
	  System_admin.employee.btn_Addemployee(driver).click();
	  
	  
  }


   
  

  
  @Test
  public void assertionChecking(){
	  
	  driver.get("https://qa2.revature.com/core");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	  Login_TC.login(driver);
	  String compare = driver.findElement(By.xpath(".//*[@id='employe-user']/a")).getText();
	  Boolean chek= driver.findElement(By.xpath(".//*[@id='employe-user']/a")).isDisplayed();
	  Assert.assertEquals("test",compare);
	  Assert.assertEquals("test", compare,"assertmessage");
	  Assert.assertTrue(chek);
	  Assert.assertFalse(chek);
	  
	  
	  
  }
	
	
	
}
