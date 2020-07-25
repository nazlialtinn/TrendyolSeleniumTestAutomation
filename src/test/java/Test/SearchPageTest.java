package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TrendyolPages.LoginPage;
import TrendyolPages.SearchPage;
import org.junit.Before;
import org.junit.Test;
public class SearchPageTest {
	
	private static WebDriver driver = null;
	@Before
	public static void main(String[] args) {
		
		LoginPageTest.TrendyolLoginOperations();
		
		TrendyolAddBasket();
		
	}
	@Test
	public static void TrendyolAddBasket() {
		
		try {
			SearchPage.searchBox(driver).sendKeys("bilgisayar");
			
			SearchPage.basketBtn(driver).click();
			
			SearchPage.basketIcon(driver).click();
			
			System.out.println("Sepete ekleme islemi basarili bir sekilde tamamlanmistir.");
			
		}catch(Exception e){
			
			System.out.println("Sepete ekleme islemi basarili bir sekilde tamamlanamamistir.");
		}
		
		//Aþaðýdaki kod satýrý ile xpath yoluyla giriþ yapmýþ bir kullanýcýnýn herhangi
		//bir itema ulaþmasýný saðlamaya çalýþtým ancak firefox driverý eriþimime engel oldu.
		//driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/div/div/div[1]/a[1]")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='campaign campaign-big'])[1]")));
		
		//driver.findElement(By.xpath("(//*[@class=\"category-header\"])[1]")).click();

		//Actions act =  new Actions(driver);
		//act.moveToElement(HomePage.searchBox(driver)).click().perform();
		//act.moveToElement(driver.findElement(By.id("myBasketListItem"))).click().perform();
		//HomePage.searchBox(driver).click();
			
	}
	
	
}
