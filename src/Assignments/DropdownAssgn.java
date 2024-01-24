package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAssgn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		
        WebElement dropDown = driver.findElement(By.id("oldSelectMenu"));
		
		Select select = new Select(dropDown);
		
		System.out.println("Printing the option at the index 8-----");
		select.selectByIndex(8);
		Thread.sleep(60);
		
		System.out.println("Select the Option by value 8");
		select.selectByValue("8");
		System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
		Thread.sleep(60);
		
		System.out.println("Select the option by visible text");
		select.selectByVisibleText("Indigo");
		System.out.println("Select visible text:"+select.getFirstSelectedOption().getText());
		
	}

}
