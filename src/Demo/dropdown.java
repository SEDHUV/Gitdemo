package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
	      ChromeOptions options = new ChromeOptions();
	      options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	      WebDriver driver1 = new ChromeDriver(options);
   driver1.get("https://www.hdfc.com/");
driver1.manage().window().maximize();
Thread.sleep(3000);
Actions act = new Actions(driver1);
WebElement ele =driver1.findElement(By.xpath("//ul[@class=\"primary-menu-list\"]//a[@title=\"Banking Products\"]"));
act.moveToElement(ele).perform();
 WebElement personal = driver1.findElement(By.linkText("Personal Loan"));
 //act.moveToElement(personal).click().perform();
 JavascriptExecutor js = (JavascriptExecutor)driver1;
 System.out.print("sedhu");
		System.out.print("haema");
	}

}
