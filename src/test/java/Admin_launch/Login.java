package Admin_launch;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends Launch{
	
@Test	
	public void Admin_Login() throws InterruptedException {
	
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("superadmin");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
	
	}
}
