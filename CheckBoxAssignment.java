package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.demo.guru99.com/test/radio.html");
WebElement checkBox2=driver.findElement(By.id("vfb-6-1"));
checkBox2.click();
WebElement checkBox3=driver.findElement(By.id("vfb-6-2"));
checkBox3.click();
if(checkBox2.isSelected())

{
	System.out.println("CheckBox1 is selected");
}
if(checkBox3.isSelected())
{
	System.out.println("CheckBox2 is selected");
	
}

}

}
