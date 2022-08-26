package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.demo.guru99.com/test/drag_drop.html");
Actions builder=new Actions(driver);
WebElement source2=driver.findElement(By.xpath("//*[@id='fourth']"));
WebElement target2=driver.findElement(By.xpath("//*[@id='amt7']/li"));
WebElement source=driver.findElement(By.xpath("//*[@id='credit2']/a"));
WebElement target=driver.findElement(By.xpath("//*[@id='bank']/li"));
WebElement source1=driver.findElement(By.xpath("//*[@id='credit1']/a"));
WebElement target1=driver.findElement(By.xpath("//*[@id='loan']/li"));
WebElement source3=driver.findElement(By.xpath("//*[@id='fourth']/a"));
WebElement target3=driver.findElement(By.xpath("//*[@id='amt8']/li"));
builder.dragAndDrop(source,target).build().perform();
builder.dragAndDrop(source1,target1).build().perform();
builder.dragAndDrop(source2,target2).build().perform();
builder.dragAndDrop(source3,target3).build().perform();
		
	
	}

}
