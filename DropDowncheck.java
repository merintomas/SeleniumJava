package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowncheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/newtours/register.php");
Select dropDownCountry=new Select(driver.findElement(By.name("country")));
dropDownCountry.selectByValue("ARMENIA");
dropDownCountry.selectByIndex(2);
dropDownCountry.selectByVisibleText("ANGOLA");


		
	}

}
