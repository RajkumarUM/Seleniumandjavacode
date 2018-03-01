package automationFreamwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pageObject.Login_Page;

public class Login_TC {

	public static void login(WebDriver driver) {
		Login_Page.txtbx_UserName(driver).sendKeys("rajkumar@revature001.com");
		Login_Page.txtbx_Password(driver).sendKeys("Pass123$");
		Login_Page.btn_Login(driver).click();

	}

}
