package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          WebDriver driver;
          
          System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
          
          driver = new ChromeDriver();
          
          driver.get("https://demoqa.com/select-menu"); 
  		  driver.manage().window().maximize();
		
		  WebElement element = driver.findElement(By.id("cars"));
		  Select select = new Select(element);
		  
		  List<WebElement> list = select.getOptions();
		  
		//Looping through the options and printing dropdown options
		  System.out.println("The multi-dropdown options are:");
		  
		  for (WebElement option : list) {
			System.out.println(option.getText());
		   }
	   
		  if(select.isMultiple()) {
			  System.out.println("Selecting options by index");
			  select.selectByIndex(2);
			  
			  System.out.println("Select option by value");
			  select.selectByValue("saab");
			  
			  System.out.println("Select option by visible text");
			  select.selectByVisibleText("Audi");
			  
			  System.out.println("Listing out the selected options..");
			  
			  List<WebElement> selectedList = select.getAllSelectedOptions();
			  
			  for(WebElement getSelOptions: selectedList) {
				  System.out.println(getSelOptions.getText());
			  }
		  }
	}

}
