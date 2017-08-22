package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://ukr.net");
		//driver.
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		UkrNetWebPage mainPage = new UkrNetWebPage(driver);
		mainPage.webElementLogin.sendKeys("Hello");
		mainPage.webElementPassword.sendKeys("pass");
		mainPage.webButtonSubmit.click();
		
		//mainPage = new UkrNetWebPage(driver);
		//String erroMsg = mainPage.errorMessage.getText();
		WebElement mess = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.error-text")));
		System.out.println(mess.getText());
		String erroMsg = mainPage.errorMessage.getText();   
		System.out.println(erroMsg);
		
		//driver.get("http://google.com");
		
//		WebElement webElementLogin = driver.findElement(By.cssSelector("input.login-block__input[type='text']"));
//		//webElementLogin.sendKeys("immortal_cr@ukr.net");
//		webElementLogin.sendKeys("immortal");
//		WebElement webElementPassword = driver.findElement(By.cssSelector("input.login-block__input[type='password']"));
//		//webElementPassword.sendKeys("ImMortal2011");
//		webElementPassword.sendKeys("ImMka");
//		
		
		
	//	driver.findElement(By.cssSelector("div.login-block__submit-but")).click();
		
		
		
		
		
		driver.quit();
		
	}

}
