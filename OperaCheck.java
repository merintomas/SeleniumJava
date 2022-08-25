import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OperaCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions options=new ChromeOptions();
System.setProperty("webdriver.opera.driver","C:\\SeleniumFolders\\operadriver.exe");
WebDriver driver=new ChromeDriver(options);
driver.get("https://www.facebook.com/");

	}

}
