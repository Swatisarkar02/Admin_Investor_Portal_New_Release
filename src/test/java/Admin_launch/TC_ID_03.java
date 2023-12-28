package Admin_launch;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
public class TC_ID_03 extends Login{
@Test
	public void TC_ID_03_01() throws InterruptedException {
		

		//Select Account
		//Select SelectAccount =new Select(driver.findElement(By.xpath("//select[@class='form-select form-select-sm ng-untouched ng-pristine ng-valid']")));
		//SelectAccount.selectByVisibleText("Test_Bank_Exim_R");
		//Thread.sleep(500000);
		
		
		//Busniess_Process
		
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/perfect-scrollbar/div/div[1]/c-sidebar-nav/c-sidebar-nav-group[1]/a")).click();
		
		Thread.sleep(500000);
		
		//Click_on_Process
		
		driver.findElement(By.xpath("//a[@href=\"#/businessprocesscontroll\"]")).click();
		 
		Thread.sleep(5000);
		
		//Column1 #
		  
		String column1 = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-businessprocesscontroll/c-col/c-card/c-card-body/div/table/thead/tr/th[1]")).getText();
		  
		System.out.println("# = " + column1);	   
	
		Thread.sleep(50000);
		
		//ID
		
		String ID = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-businessprocesscontroll/c-col/c-card/c-card-body/div/table/thead/tr/th[1]")).getText();
		   
		System.out.println("ID = " + ID);
		
		Thread.sleep(50000);
		
		//Type
		
		String Type = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-businessprocesscontroll/c-col/c-card/c-card-body/div/table/thead/tr/th[3]")).getText();
		  
		System.out.println("Type = " + Type);
		
		Thread.sleep(50000);
		
		//Is_Delete
		
		String Is_Delete = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-businessprocesscontroll/c-col/c-card/c-card-body/div/table/thead/tr/th[4]")).getText();
		  
		System.out.println("Is_Delete = " + Is_Delete);
		
		Thread.sleep(50000);
		
		//Action
		
		String Action = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-businessprocesscontroll/c-col/c-card/c-card-body/div/table/thead/tr/th[5]")).getText();
		  
		System.out.println("Action = " + Action);
		Thread.sleep(50000);
		
	}
		
	
@Test	
	    public void TC_ID_03_02() throws InterruptedException {
	
	    //To check that New button 	
			
    	driver.findElement(By.xpath("//button[@class=\"btn btn-dark\"]")).click();	
    	
    	Thread.sleep(50000);
    	
	    }
	 
	 

@Test

	    public void TC_ID_03_03() throws InterruptedException {
	    
		//Type
	
	    String Type = driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-body/form/c-row/c-col[1]/div/label")).getText();
			  
		System.out.println("Type = " + Type);	
		
		Thread.sleep(50000);
	     
		//Submit_Button
		
		String Submit_Button = driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-body/form/c-row/c-col[1]/div/label")).getText();
		  
		System.out.println("Submit_Button = " + Submit_Button);	
		
		Thread.sleep(50000);

		//Submit_Button
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		Thread.sleep(50000);
		
		//Close_Button
		
		String Close_Button = driver.findElement(By.xpath("//button[@class=\"btn btn-secondary\"]")).getText();
		  
		System.out.println("Close_Button = " + Close_Button);	
		
		Thread.sleep(50000);
		
		//Close_Button
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-secondary\"]")).click();
		
		Thread.sleep(50000);
		
		//Enter Process Name
		
		//input[@formcontrolname="process_type"]
		
		//driver.findElement(By.xpath("*[@id=\\\"verticallyCenteredScrollableModal\\\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-body/form/c-row/c-col[1]/div/label")).sendKeys("Open New Bank Account_1");
		driver.findElement(By.xpath("input[@formcontrolname=\"process_type\"]")).sendKeys("Open New Bank Account_1");
		Thread.sleep(50000);
		
		//Submit Button
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		Thread.sleep(50000);
	    	
			
	    }

@Test
       public void TC_ID_03_04() throws InterruptedException {
    	 
       //Type Name
       	   
       	   String Process_Type_Name = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-businessprocesscontroll/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[3]")).getText();
    	  
       	   System.out.println("Open New Bank Account_1 = " + Process_Type_Name);	
    	
       	   Thread.sleep(50000);	   
    	   
       	 //Is Delete
       	   
       	   String Is_Delete = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-businessprocesscontroll/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[4]")).getText();
  	  
    	   System.out.println("No = " + Is_Delete);	
 	
    	   Thread.sleep(50000);	
    	   
       
}

@Test

       public void TC_ID_03_05() throws InterruptedException {

    	 //View Icon
    	   
           driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-businessprocesscontroll/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[5]/span[1]")).click();
       		
       	   Thread.sleep(50000);   

       	   //Type Name
       	   
       	   String Process_Type_Name = driver.findElement(By.xpath("//input[@formcontrolname=\"process_type\"]")).getText();
    	  
       	   System.out.println("Open New Bank Account_1 = " + Process_Type_Name);	
    	
       	   Thread.sleep(50000);
       	   
       	   //Checkbox
       	   
       	   driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
       	   
        	Thread.sleep(50000);
       	   
       	   driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
       	   
       	   //Close
       	   
       	   driver.findElement(By.xpath("//button[@class=\"btn btn-secondary\"]")).click();


       }
       
 @Test      

       public void TC_ID_03_06() throws InterruptedException {
    	   
    //Edit Icon	   

    driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-businessprocesscontroll/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[5]/span[3]")).click();   
      
    //Type Name
    
  	String Type_Name = driver.findElement(By.xpath("//input[@formcontrolname=\\\"process_type\\\"]")).getText();
 	  
	System.out.println("Open New Bank Account_1 = " + Type_Name);	

	Thread.sleep(50000);
  	   
	//Checkbox
  	   
	String Checkbox = driver.findElement(By.xpath("//input[@type=\\\"checkbox\\\"]")).getText();
	  
	System.out.println("Checkbox = " + Checkbox);	

	Thread.sleep(50000);
	
	//Close Button
	
	String Close_Button = driver.findElement(By.xpath("//button[@class=\"btn btn-secondary\"]")).getText();

	System.out.println("Close_Button = " + Close_Button);	

	Thread.sleep(50000);
	
	//Update Button
	
	String Update_Button = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).getText();
	  
	System.out.println("Update_Button = " + Update_Button);	

	Thread.sleep(50000);
	
	//Close Button
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-secondary\"]")).click();
	
	
 }



}