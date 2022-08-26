package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/upload/");
driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\SeleniumFolders\\New folder");
driver.findElement(By.id("terms")).click();
driver.findElement(By.id("submitbutton")).click();


	}

}
