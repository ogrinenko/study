package WebDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javafx.beans.property.SetProperty;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PFSchoolUsage {

		private static WebDriver theDriver;
		
	
		@BeforeClass
		public static void beforeTest() {
			
		System.setProperty("webdriver.chrome.driver", new File("chromedriver.exe").getAbsolutePath());
		theDriver = new ChromeDriver();
		theDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		theDriver.get("http://old.qalight.com.ua/zapisatsya-na-kursy.html");
		
		
		}
		
		@Test
		public void enterKeys() {
			PFSchool newSchool = PageFactory.initElements(theDriver, PFSchool.class);
			newSchool.z_sender0.sendKeys("Grinenko");
		}
		
		@Test
		public void selectDropDown() throws InterruptedException {
			PFSchool newSchool = PageFactory.initElements(theDriver, PFSchool.class);
			//newSchool.dropDown.click();
			//Thread.sleep(500);
			//newSchool.optionSWTesting.;
			//System.out.println("");
			
			Select newSelect = new Select(newSchool.dropDown);
			List<WebElement> list = newSelect.getOptions();
			System.out.println(list.get(3).getText());
			newSelect.selectByVisibleText(list.get(3).getText());
			
			
		}
		
		
//		@Test
//		public void sendInfo() {
//			PFSchool newSchool = PageFactory.initElements(theDriver, PFSchool.class);
//			newSchool.btn_success.click();
//		}
//		
		
}
