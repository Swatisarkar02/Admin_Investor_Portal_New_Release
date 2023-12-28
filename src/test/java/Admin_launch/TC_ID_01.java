package Admin_launch;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_ID_01 extends Launch{
	
		@Test	
			public void TC_ID_01_01() throws InterruptedException {
					
			
			//Email Id field
			//Email Id Field
				
				driver.findElement(By.xpath("//input[@id='email']")).click();
				
				driver.findElement(By.xpath("//input[@id='password']")).click();
				
				Thread.sleep(5000);	
				
			
			}	
		@Test
				
		public void TC_ID_01_02() throws InterruptedException	{
		
			//Login Button
			
			System.out.println("Login Button");
			
			Thread.sleep(5000);
		
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		}	
			
		@Test
		
		public void TC_ID_01_03() throws InterruptedException	{
		
			System.out.println("Email and Password is required!!");
			
			Thread.sleep(5000);
			
		}		
		
		@Test
		
		public void TC_ID_01_04() throws InterruptedException	{	
			
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("TestABC");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
            System.out.println("Email and Passwors is required !!");
			
			Thread.sleep(5000);
			
		}
		
		@Test
		
		public void TC_ID_01_05() throws InterruptedException	{	
			
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			Thread.sleep(5000);
			
            System.out.println("Email and Passwors is required !!");
			
			Thread.sleep(5000);
		}
		
		@Test
		
		public void TC_ID_01_06() throws InterruptedException	{
			
			driver.findElement(By.xpath("//input[@id='password']")).clear();
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Testsuperadmin_1");
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			Thread.sleep(5000);
			
			System.out.println("Wrong Credential !");
			
			Thread.sleep(5000);
			
		}
		@Test
				
		public void TC_ID_01_07() throws InterruptedException	{	
			
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			
			driver.findElement(By.xpath("//input[@id='password']")).clear();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("superadmin");
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			Thread.sleep(5000);
			
			}
}
