package TrendyolPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private static WebElement element = null;

	public static WebElement accountBtn(WebDriver driver) {
		element = driver.findElement(By.id("accountBtn"));
		return element;
	}
	
	public static WebElement emailTextbox(WebDriver driver) {
		element = driver.findElement(By.id("email"));
		return element;
	}
	public static WebElement passwordTextbox(WebDriver driver) {
		element = driver.findElement(By.id("password"));
		return element;
	}
	public static WebElement submitBtn(WebDriver driver) {
		element = driver.findElement(By.id("loginSubmit"));
		return element;
	}
	public static WebElement searchBox(WebDriver driver) {
		element = driver.findElement(By.id("search-box"));
		return element;
	}
	
}
