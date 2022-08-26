package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonAndCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement radioButton1=driver.findElement(By.id("vfb-7-1"));
		radioButton1.click();
		if(radioButton1.isSelected())
		{
			System.out.println("radioButton1 is selected");
		}
		WebElement checkbox1=driver.findElement(By.id("vfb-6-0"));
		checkbox1.click();
		if(checkbox1.isDisplayed())
		{
			System.out.println("checkbox1 is Displayed");
		}
		if(checkbox1.isEnabled())
		{
			System.out.println("checkbox1 is enabled");
		}
		WebElement checkbox3=driver.findElement(By.xpath("//input[@id='vfb-6-2']"));
		checkbox3.click();
		if(checkbox1.isSelected())
		{
			System.out.println("checkbox3 is selected");
		}
		//driver.close();
		
		
		
	}

}
