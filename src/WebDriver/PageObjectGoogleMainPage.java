package WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageObjectGoogleMainPage {

	//lst-ib
	@FindBy(how=How.ID, using = "lst-ib")
	private WebElement q;
	
	//@FindBy
	@FindBy(how=How.XPATH, using = "//*[contains(@value,'Google') and @class='lsb' and @type='button']")
	private WebElement lsb;
	
	
	//@FindBy(how=)
	public void printText(String text) {
		q.sendKeys(text);
		//q.submit();
	}
	
	public void clickButton() {
		lsb.click();
	}
	
}
