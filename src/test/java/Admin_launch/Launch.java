package Admin_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Launch {

	public static WebDriver driver = null;
	//public static WebDriver driver;
	
	@BeforeClass
	
 	
	public void launchBrowser() {
	
	Reporter.log("======Browser session started=========", true);
	
	//ChromeOptions S = new ChromeOptions();
	
	//S.addArguments("--remote-allow-origins=*");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();	
	
    driver.get("https://ip.reyanarth.com/ipadmin/#/login");

    Reporter.log("======Browser session started=========", true);

}
@AfterClass
public void closeBrowser() {
	
	driver.quit();
	
	Reporter.log("======Browser session ended=========", true);
	


		
	}
}
	
	

