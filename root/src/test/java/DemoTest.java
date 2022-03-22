

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTest {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	driver.findElement(By.partialLinkText("Regist")).click();
	driver.close();
}
}