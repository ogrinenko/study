package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomeWebPage {

	// Two basic fields to work with
	
	WebElement searchField;
	WebElement searchButton;
	
	/**
	 * Constructor  for searchField
	 * @param driver
	 */
	GoogleHomeWebPage(WebDriver driver) {
		searchField = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[class='gsfi lst-d-f'][type=text]")));
	}
	
	
	/**
	 * Lazy initialization of field searchButton
	 * @param driver
	 * @return
	 */
    public GoogleHomeWebPage updatedGoogleHomePage(WebDriver driver) {
    	
    	searchButton = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type=\"button\"][class=lsb][value*=Google]")));
    	return this;
    }
	
    /**
     * Home task 3 - point a).
     * @param textToFill
     * @param webElementToFill
     */
    public void sendKeys(String textToFill, WebElement webElementToFill) {
    	webElementToFill.sendKeys(textToFill);    	 
    }
    
    /**
     * Home task 3 - point b).
     * @param textToFill
     * @param locator
     * @param driver
     */
    public void sendKeys(String textToFill, By locator, WebDriver driver) {
    	searchField = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(locator));
    	searchField.sendKeys(textToFill);    	 
    }
    
}
