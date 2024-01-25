package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTestAssgn {
	
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
    	WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		// Step 1: Navigate to the URL
        driver.get("https://www.lambdatest.com/blog/protractor-tutorial-handling-iframes-frames-in-selenium/");
        
        driver.manage().window().maximize();

		 // Step 2: Get the count of links
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        int linkCount = allLinks.size();
        System.out.println("Number of links on the page: " + linkCount);

        // Step 3: Get the text for all links and check for a specific condition
        for (WebElement link : allLinks) {
            String linkText = link.getText();
            System.out.println("Link Text: " + linkText);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            
            // Step 4: Use if statement inside the for loop
            if (linkText.contains("Automation")) {
                // Perform any action if the link contains the word "Selenium"
                System.out.println("Found a link containing 'Selenium': " + linkText);
                // Add your specific action here, e.g., click on the link
                link.click();
            }
        }

        // Close the browser window
        driver.quit();
    }
}
