package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login_Page {
	private static WebElement element = null;

	public static WebElement txtbx_UserName(WebDriver driver) {
		element = driver.findElement(By.id("loginForm:userName-input-id"));
		return element;
	}

	public static WebElement txtbx_Password(WebDriver driver) {

		element = driver.findElement(By.id("loginForm:input-psw"));
		return element;
	}

	public static WebElement btn_Login(WebDriver driver) {
		element = driver.findElement(By.id("loginForm:login-btn-id"));
		return element;

	}

}
