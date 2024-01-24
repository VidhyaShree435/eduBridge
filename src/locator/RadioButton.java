package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/radio-button");
		
		driver.manage().window().maximize();
	
		/**
		 * Find radio button using ID, Validate isSelected and then click to select
		 */
		WebElement radioEle = driver.findElement(By.xpath("//label[contains(text(),'Yes')]"));
		boolean select = radioEle.isSelected();
	//	System.out.print(select);
		// performing click operation if element is not already selected
		if (select == false) {
			radioEle.click();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement text = driver.findElement(By.xpath("//p[@class='mt-3']"));
		String s1 = text.getText();
		System.out.println("Print text : " + s1);

		/**
		 * Find radio button using Xpath, Validate isDisplayed and click to select
		 */
		WebElement radioElem = driver.findElement(By.xpath("//label[contains(text(),'Impressive')]"));
		boolean sel = radioEle.isDisplayed();

		// performing click operation if element is displayed
		if (sel == true) {
			radioElem.click();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement text1 = driver.findElement(By.xpath("//p[@class='mt-3']"));
		String s2 = text1.getText();
		System.out.println("Print text : " + s2);

		/**
		 * Find radio button using CSS Selector, Validate isEnabled and click to select
		 */
		WebElement radioNo = driver.findElement(By.xpath("//label[contains(text(),'No')]"));
		boolean selectNo = radioEle.isDisplayed();

		// performing click operation if element is enabled
		if (selectNo == true) {
			radioNo.click();
		}

	}
}


