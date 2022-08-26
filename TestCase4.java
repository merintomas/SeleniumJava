package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	WebElement searchInputBox= driver.findElement(By.id("twotabsearchtextbox"));
	searchInputBox.sendKeys("Mobiles Under 30000"+Keys.ENTER);
	
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles Under 30000"+Keys.ENTER);
		driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.navigate().back();
		
		
		
	}

}
