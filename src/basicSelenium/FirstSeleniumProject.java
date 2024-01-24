package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumProject {

	public static void main(String[] args) {
		
		//First step to create webdriver instance
		System.setProperty("webdriver.chrome.driver",
				  "C:\\browserDriver\\chromedriver.exe");
		
				WebDriver driver;

				driver = new ChromeDriver();
				
				// Navigate to Google
				driver.get("https://www.facebook.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				
					
				driver.navigate().to("https://www.flipkart.com");
				driver.navigate().back();
				
				driver.close(); // close the current window
				driver.quit(); // close all the opened windows
	}

}
