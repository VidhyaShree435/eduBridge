package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserWindow {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		

		driver.get("https://demoqa.com/browser-windows");

		driver.manage().window().maximize();

		

		driver.findElement(By.id("windowButton")).click();

		Thread.sleep(6000);

		

		driver.findElement(By.id("messageWindowButton")).click();

		Thread.sleep(6000);

		

		String MainWindow = driver.getWindowHandle();

		System.out.println("main window handle is" + MainWindow);

		Thread.sleep(6000);

		

		Set<String> s1 = driver.getWindowHandles();

		System.out.println("child window handle is" + s1);

		Thread.sleep(6000);

		

		java.util.Iterator<String> i1 = s1.iterator();

		

		while (i1.hasNext())

		{

			String ChildWindow = i1.next();

			if(!MainWindow.equalsIgnoreCase(ChildWindow));

			{

				WebElement gettext = driver.switchTo().window(ChildWindow).findElement(By.id("sampleHeading"));

				String text = gettext.getText();

				System.out.println(text);

				

			}

		}

		

	}



}