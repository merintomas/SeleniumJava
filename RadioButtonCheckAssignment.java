package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonCheckAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.demo.guru99.com/test/radio.html");
driver.getTitle();
WebElement radioButton1=driver.findElement(By.id("vfb-7-1"));
radioButton1.click();
if(radioButton1.isSelected())
{
	System.out.println("radioButton1 is selected");
}



	}

}
