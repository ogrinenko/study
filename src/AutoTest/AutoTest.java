package AutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://Ukr.net");
		WebElement webElementLogin = driver.findElement(By.cssSelector("input.login-block__input[type='text']"));
		webElementLogin.sendKeys("immortal_cr@ukr.net");
		WebElement webElementPassword = driver.findElement(By.cssSelector("input.login-block__input[type='password']"));
		webElementPassword.sendKeys("ImMortal2011");
		
		driver.findElement(By.cssSelector("div.login-block__submit-but")).click();
		
		
		
		driver.quit();
		
	}

}
