package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    WebDriver driver;
			
			System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("http://the-internet.herokuapp.com/nested_frames");

	        // Step 2: Find all frames
	        List<WebElement> frames = driver.findElements(By.tagName("body"));
            
	        // Step 3: Switch to one of the frames
	        driver.switchTo().frame(frames.get(0));

	        // Step 4: Get the text from the frame
	        WebElement frameElement = driver.findElement(By.tagName("body"));
	        String frameText = frameElement.getText();
	        System.out.println("Text from the frame: " + frameText);

	        // Close the browser window
	        driver.quit();
	}

}
