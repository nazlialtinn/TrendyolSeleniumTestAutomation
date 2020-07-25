package TrendyolPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	private static WebElement element = null;

	public static WebElement searchBox(WebDriver driver) {
		element = driver.findElement(By.className("search-box"));
		return element;
	}
	public static WebElement basketBtn(WebDriver driver) {
		element = driver.findElement(By.className("btn-basket"));
		return element;
	}
	public static WebElement basketIcon(WebDriver driver) {
		element = driver.findElement(By.className("icon navigation-icon-basket"));
		return element;
	}
	
	
}
