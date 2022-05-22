package day;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scriptexicution {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('welcome to selenium')");
		}

}
