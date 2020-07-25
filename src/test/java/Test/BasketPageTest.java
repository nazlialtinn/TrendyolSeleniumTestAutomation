package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import TrendyolPages.BasketPage;
import TrendyolPages.LoginPage;
import TrendyolPages.SearchPage;
import org.junit.Before;
import org.junit.Test;
public class BasketPageTest {
	
	private static WebDriver driver = null;
	@Before
	public static void main(String[] args) {
		
		LoginPageTest.TrendyolLoginOperations();
		
		SearchPageTest.TrendyolAddBasket();
		
		TrendyolBasketOperations();
	}
	@Test
	public static void TrendyolBasketOperations() {
		
		try {
			BasketPage.counterBtn(driver).click();
			
			BasketPage.trashIcon(driver).click();
			
			System.out.println("Sepet islemleri basarili bir sekilde tamamlanmistir.");
			
		}catch(Exception e){
			
			System.out.println("Sepet islemleri basarili bir sekilde tamamlanamamistir.");
			
		}
	}
}
