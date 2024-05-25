
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class Test {
	public static void main(String[] args) {

	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
	      ChromeOptions options = new ChromeOptions();
	      options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	      WebDriver driver1 = new ChromeDriver(options);
    driver1.get("https://artoftesting.com/samplesiteforselenium");
 driver1.manage().window().maximize();
 Actions act = new Actions(driver1);
     
  WebElement dbclick =   driver1.findElement(By.id("dblClkBtn"));
  JavascriptExecutor executor = (JavascriptExecutor)driver1;
  executor.executeScript("arguments[0].click();",dbclick);
 
  act.doubleClick(dbclick).perform();
  Alert alert = driver1.switchTo().alert();
  System.out.println("Alert Text:\n" +alert.getText());
  alert.accept();
 
  System.out.println("Double click operation performed");

  driver1.quit();
  
  
   


	   
    //    driver1.findElement(By.id("user-name")).sendKeys("standard_user");
//    driver1.findElement(By.id("password")).sendKeys("secret_sauce");
//    driver1.findElement(By.id("login-button")).click();
//    driver1.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
//    
    



}
}