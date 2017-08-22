package WebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UkrNetWebPage {

	//WebDriver driver;
	
	public WebElement webElementLogin; 
	public WebElement webElementPassword;
	public WebElement webButtonSubmit;
	public WebElement errorMessage;
	
	
//	WebElement webElementLogin = driver.findElement(By.cssSelector("input.login-block__input[type='text']"));
//	//webElementLogin.sendKeys("immortal_cr@ukr.net");
//	webElementLogin.sendKeys("immortal");
//	WebElement webElementPassword = driver.findElement(By.cssSelector("input.login-block__input[type='password']"));
//	//webElementPassword.sendKeys("ImMortal2011");
//	webElementPassword.sendKeys("ImMka");
//	
	
	
//	driver.findElement(By.cssSelector("div.login-block__submit-but")).click();
	
	public UkrNetWebPage(WebDriver driver ) {
		//this.driver = driver;
		webElementLogin = driver.findElement(By.cssSelector("input.login-block__input[type='text']"));
		webElementPassword = driver.findElement(By.cssSelector("input.login-block__input[type='password']"));
		webButtonSubmit = driver.findElement(By.cssSelector("div.login-block__submit-but"));
		//errorMessage = driver.findElement(By.cssSelector("div.error-text"));
		errorMessage = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.error-text")));
		//webButtonSubmit.click();
	}
	
}
