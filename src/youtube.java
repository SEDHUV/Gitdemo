import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class youtube {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
	      ChromeOptions options = new ChromeOptions();
	      options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	      WebDriver driver = new ChromeDriver(options);
	      driver.navigate().to("https://www.youtube.com/");
	      WebElement  searchbar = driver.findElement(By.xpath("//input[@placeholder='Search']"));
	      searchbar.sendKeys("learn automation");
	      searchbar.sendKeys(Keys.ENTER);
	      
	     
	      
	      
	      

	}

}
