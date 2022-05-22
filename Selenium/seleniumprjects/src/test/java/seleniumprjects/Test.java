package seleniumprjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	//driver.findElement(null)

	Thread.sleep(1000);
	driver.findElement(By.className("login")).click();
	driver.findElement(By.id("email")).sendKeys("aniketrode1760@gmail.com");
	driver.findElement(By.id("passwd")).sendKeys("Aniket");
	driver.findElement(By.cssSelector("#SubmitLogin > span > i")).click();
	
	
	WebElement element=driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
	Actions action=new Actions(driver);
	action.moveToElement(element).perform();
	Thread.sleep(1000);

	driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
	Thread.sleep(1000);

	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("scroll(0, 700);");

	WebElement element1=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
	action.moveToElement(element1).perform();

	driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span")).click();
	Thread.sleep(2000);

	jse.executeScript("scroll(0, 400);");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span")).click();
	Thread.sleep(1000);
	
	jse.executeScript("scroll(0,400);");
	Thread.sleep(1000);
	
	driver. findElement(By.xpath("//*[@id=\"group_1\"]/option[3]")) .click();
	driver.findElement (By.name ("Blue")) .click() ;
	driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
	Thread. sleep (1000) ;
	
	
}
}
