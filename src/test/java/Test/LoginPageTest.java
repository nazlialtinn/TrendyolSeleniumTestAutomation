package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Before;
import org.junit.Test;
import TrendyolPages.LoginPage;
import junit.framework.Assert;

public class LoginPageTest {
	
	private static WebDriver driver = null;
	@Before
	public static void main(String[] args) {
		
		TrendyolLoginOperations();
	}
	@Test
	public static void TrendyolLoginOperations() {
		
			String projectPath = System.getProperty("user.dir");
			System.out.println("projectPath :"+projectPath);
			
			System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			driver.get("https://trendyol.com/");	
			//Assert.assertEquals(driver, "https://www.trendyol.com/" ); 
			
			try {
				LoginPage.accountBtn(driver).click();
				
				LoginPage.emailTextbox(driver).sendKeys("trendyoltestbynazli@gmail.com");
				
				LoginPage.passwordTextbox(driver).sendKeys("qqww9876");
				
				LoginPage.submitBtn(driver).click();
				
				System.out.println("Giris islemi basarili bir sekilde tamamlanmistir.");
		    } catch (Exception e) {
		    	
		      System.out.println("Giris islemi basarili bir sekilde tamamlanamamistir.");
		      
		    }
			
			
		
			
	}
		
	
}

