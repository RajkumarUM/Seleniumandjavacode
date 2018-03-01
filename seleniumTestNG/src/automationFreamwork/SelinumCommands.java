package automationFreamwork;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;












import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automationFreamwork.CommoFunctions;
import automationFreamwork.Login_TC;


public class SelinumCommands {
  FirefoxDriver driver = new FirefoxDriver();
	
	@BeforeMethod
public void beforeall() throws Exception {
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("http://way2automation.com/way2auto_jquery/draggable.php");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='load_box']/form/div/div[1]/p/a")).click();
		driver.findElement(By.xpath("//div[@id='login']/form/fieldset[1]/input")).sendKeys("rkautomation");
		driver.findElement(By.xpath("//div[@id='login']/form/fieldset[2]/input")).sendKeys("fourfour");
		driver.findElement(By.xpath("//div[@id='login']/form/div/div[2]/input")).click();
		JavascriptExecutor scrol = ((JavascriptExecutor) driver);
		scrol.executeScript("scroll(0,1200)");
		
  }
	
@Test
public void drangAndDrop() throws Exception{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='droppable.php']/figure")).click();
		Thread.sleep(5000);
		//switch frame by frame xpath
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));
		System.out.println("test");
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));	
		Actions builder = new Actions(driver);
		Thread.sleep(5000);
		Action dragAndDrop = builder.clickAndHold(from).moveToElement(to).release().build();
		dragAndDrop.perform();
	}
	 @Test
public void dragAndResize() throws Exception{
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@href='resizable.php']/figure")).click();
			Thread.sleep(5000);
			//switch frame by frame xpath
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));
			WebElement reelement = driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
			Actions builder = new Actions(driver);
			Actions resize = builder.dragAndDropBy(reelement, 600, 100);
		    resize.build().perform();
			//resize by offset 
		       //Actions resizing = builder.clickAndHold(reelement).moveByOffset(100, 200).release();
		       //resizing.build().perform();
		 
	 } 
	 
	 @Test
public void autoComplete () throws Exception{
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@href='autocomplete.php']/figure")).click();
		 Thread.sleep(5000);
			//switch frame by frame xpath
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));
		driver.findElement(By.id("tags")).sendKeys("te",Keys.DOWN);
		 
		 
 }
	@Test
public void mouseover() throws Exception{
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@href='tooltip.php']/figure")).click();
		 Thread.sleep(5000);
		//switch frame by frame xpath
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));
		 Thread.sleep(3000);
		WebElement mouseover1 = driver.findElement(By.linkText("Tooltips"));
		WebElement mouseover2 = driver.findElement(By.linkText("ThemeRoller"));
		
		Actions mouse = new Actions(driver);
		mouse.moveToElement(mouseover1).build().perform();
		mouse.moveToElement(mouseover2).build().perform();
		
	}
	@Test
public void Alerts() throws Exception{
		  Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@href='alert.php']/figure")).click();
		 Thread.sleep(5000);
			//switch frame by frame xpath
			//driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));
			 Thread.sleep(3000);
			
		     //simple alert 
			 /*driver.findElement(By.xpath("html/body/button")).click();
			 Alert alert = driver.switchTo().alert();
		     alert.accept();*/
			 
		      // confirmation alert and prompt alert(enter text)
		      driver.findElement(By.xpath(".//*[@id='wrapper']/div/div[1]/div[1]/ul/li[2]/a")).click();
		      driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("html/body/button")).click();
		      Alert alert = driver.switchTo().alert();
		     alert.sendKeys("test");
		     alert.dismiss();
	}
public void multipleWindows(){
	
	
	driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
    String parent = driver.getWindowHandle();
	
	driver.findElement(By.name("New Message Window")).click();
	
 
     
     Set<String> multiwin = driver.getWindowHandles();
     
     Iterator <String>ite = multiwin.iterator(); 
     
     driver.switchTo().window(parent);

}
public  void findNoselectedCheckBox(){
	int count = 0;
	  driver.get("https://qa2.revature.com/core");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	  Login_TC.login(driver);
	  driver.findElement(By.xpath(".//*[@id='employe-user']/a")).click();
	 
	  driver.findElement(By.xpath(".//*[@id='employeeUsersForm:employeeUser']/tbody/tr[1]/td[9]/a")).click();
	  List<WebElement> all = driver.findElements(By.xpath("//input[@type='checkbox']"));
	 
	 for(int i=0;i<all.size();i++){
		 if(all.get(i).isSelected()){
			  count ++;
		 } 
	 }
	 
	 
	 System.out.println(count);
	  
	
}

public static void take_screenshot(WebDriver driver, String imgName)
		throws IOException {

	 File image =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(image, new File("./Screenshots/"+imgName+".jpeg"));

}

@AfterMethod
public void teardown(ITestResult result) throws IOException{
	  if(ITestResult.FAILURE== result.getStatus()){
		  
		  CommoFunctions.take_screenshot(driver,"failure");
		  
	  }
	  driver.quit();
	  
}

	
}
