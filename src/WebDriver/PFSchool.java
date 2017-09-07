package WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PFSchool {
	
	public PFSchool() {

	}
	
	//input[id=z_sender0]
	WebElement z_sender0;
	
	@FindBy(how=How.XPATH, using = "//*[@class='btn btn-success']")
	WebElement btn_success;
	
	//button[class='btn btn-success']
	
	@FindBy(xpath="//*[text()=' Тестирование ПО']")
	WebElement optionSWTesting;

	@FindBy(css="select[class='fox_select'][name='_7c8289bf6b8e80c1749ef54ab01b92b8']")
	WebElement dropDown;
}
