package Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.google.co.in/");
String title=driver.getTitle();
System.out.println(title);
if(title.equals("Google"))
{
	System.out.println("test case is pass");
	
}
else
{
	System.out.println("test is fail");
	
}
	}
}
	


		

