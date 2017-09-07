package WebDriver;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FieldEditor {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", new File("chromedriver.exe").getAbsolutePath());
		
		WebDriver newDriver = new ChromeDriver();
		
		newDriver.get("http://www.google.com");
		
		// Create PO
		GoogleHomeWebPage gPage = new GoogleHomeWebPage(newDriver);
		
		//Home task 3 - point a).
		gPage.sendKeys("Who am I",gPage.searchField);
		gPage.searchField.clear();
		
		//Home task 3 - point b).
		gPage.sendKeys("I'm a Superman", By.cssSelector("input[class='gsfi lst-d-f'][type=text]"), newDriver);
		
		//Lazy initialization for field - searchButton 
		gPage = gPage.updatedGoogleHomePage(newDriver);
		
		gPage.searchButton.click();
		newDriver.quit();
	}

}
