package TrendyolPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketPage {
	private static WebElement element = null;

	public static WebElement counterBtn(WebDriver driver) {
		element = driver.findElement(By.className("ty-numeric-counter-button"));
		return element;
	}
	public static WebElement trashIcon(WebDriver driver) {
		element = driver.findElement(By.className("i-trash"));
		return element;
	}

}
