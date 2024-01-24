package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChckBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://designsystem.digital.gov/components/checkbox/");
		
		/*
		 * 
		 * Validate isSelected and click
		 */
		WebElement checkBoxSelected = driver.findElement(By.xpath(""));
		boolean isSelected = checkBoxSelected.isSelected();
		
		if(isSelected== false) {
			checkBoxSelected.click();
			System.out.println("CheckBox Home-- Selected");
		}
		
		/*
		 * 
		 * Validate isDisplayed and click
		 */
		WebElement checkBoxDisplayed = driver.findElement(By.xpath(""));
		boolean isDisplayed = checkBoxDisplayed.isDisplayed();
		
		if(isDisplayed== true) {
			 checkBoxDisplayed.click();
			 System.out.println("CheckBox Home-- Deselected");
		}
		
		/*
		 * 
		 * Validate isEnabled and click
		 */
		WebElement checkBoxEnabled = driver.findElement(By.xpath(""));
		boolean isEnabled = checkBoxEnabled.isEnabled();
		
		if(isEnabled==true) {
			System.out.println("It is Enabled");
		}
	}
}

