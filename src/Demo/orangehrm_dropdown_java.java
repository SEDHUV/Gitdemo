package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class orangehrm_dropdown_java{
	
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
WebDriver driver = new ChromeDriver(options);
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//div[@class=\"oxd-topbar-header-userarea\"]//li")).click();
Thread.sleep(2000);
driver.findElement(By.linkText("About")).click();
Thread.sleep(2000);
String tes = driver.findElement(By.xpath("//div[@class=\"oxd-dialog-container-default--inner\"]//div")).getText();

if(tes.contains("Version"))
	System.out.println("True");
driver.findElement(By.cssSelector(".oxd-dialog-close-button.oxd-dialog-close-button-position")).click();
List <WebElement> oxdicon = driver.findElements(By.xpath("//i"));
oxdicon.get(6).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class=\"oxd-date-input\"]//i")).click();

}

}