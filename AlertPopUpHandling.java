package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/delete_customer.php");
driver.findElement(By.name("cusid")).sendKeys("123456");
driver.findElement(By.name("submit")).submit();
Alert alert=driver.switchTo().alert();
String altText=alert.getText();
alert.accept();   //to click on 'OK' button
System.out.println(altText); //printing alert message
}
}
