package WebDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryUsage {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", new File("chromedriver.exe").getAbsolutePath());
	
		WebDriver newDriver = new ChromeDriver();
	
		newDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		newDriver.get("http://google.com");
	
		PageObjectGoogleMainPage gPage = PageFactory.initElements(newDriver, PageObjectGoogleMainPage.class);
		
		gPage.printText("Page Factory");
		
		gPage.clickButton();
	}

}
