package Demo;

import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class new1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();
		 WebElement link = driver.findElement(By.linkText("Toggle"));
		    link.click();
		List<WebElement> agreed = driver.findElements(By.cssSelector("label.checkbox"));
//		List<WebElement> firstbox = driver.findElements(By.xpath("//*[@id='sortable']/li"));
		Thread.sleep(3000);
		
		System.out.println(agreed.get(2).getText());
//		System.out.println(firstbox.get(3).getText());
//		
//		
//		Actions act = new Actions(driver);
//		Thread.sleep(4000);
////		act.clickAndHold(firstbox.get(2)).moveToElement(firstbox.get(0)).release().build().perform();
//	   
//		act.dragAndDrop(firstbox.get(2), firstbox.get(0)).build().perform();
//		
//        
        
        
        
        
    	
   
        
        
      
        
    
        


	}}


