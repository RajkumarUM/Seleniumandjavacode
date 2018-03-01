package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class System_admin {
	private static WebElement element = null;

	public static class employee {

		public static WebElement btn_Addemployee(WebDriver driver) {

			element = driver.findElement(By.linkText("Add Employee"));
			return element;

		}

		public static WebElement menu_employee(WebDriver driver) {

			element = driver.findElement(By.xpath(".//*[@href='employeeSystemUser.xhtml2']"));
			return element;
		}

		public static class organisation {

		}

	}

}
