package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://designsystem.digital.gov/components/checkbox/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	

        // Find the checkbox element
        WebElement checkbox = driver.findElement(By.xpath("//label[@for='check-historical-washington']"));
        
        checkbox.click();
        
        boolean select = checkbox.isSelected();
        System.out.println("Select value :"+ select);
        
		// performing click operation if element is not selected 
        if(select==true) {
        	checkbox.click();
            System.out.println("Checkbox clicked");
	     }
        else {
        	System.out.println("Checkbox clicked -- 29");
        }
	}

}
