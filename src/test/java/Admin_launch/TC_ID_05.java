package Admin_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_ID_05 extends Login{

@Test	
	public void TC_ID_05_01() throws InterruptedException {
	
	
		        //Busniess_Process
		
				driver.findElement(By.xpath("//*[@id=\"sidebar\"]/perfect-scrollbar/div/div[1]/c-sidebar-nav/c-sidebar-nav-group[1]/a")).click();
				
				Thread.sleep(500000);

				//Select Account
				
				Select Select_Account = new Select(driver.findElement(By.xpath("//select[@formcontrolname='parking']")));
			   	
				Select_Account.selectByVisibleText("Test_Bank_Exim_R");
				
				//Process
				
				Select Select_Process = new Select(driver.findElement(By.xpath("//select[@formcontrolname='page']")));
			   	
				Select_Process.selectByVisibleText("Open New Bank Account");
				
				//Stage Movement 
				
				driver.findElement(By.xpath("//*[@id=\"sidebar\"]/perfect-scrollbar/div/div[1]/c-sidebar-nav/c-sidebar-nav-group[1]/c-sidebar-nav/c-sidebar-nav-link[3]/a/c-sidebar-nav-link-content")).click();
				
				Thread.sleep(500000);
				
				//#
				
				String column1 = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklistmovement/c-col/c-card/c-card-body/div/table/thead/tr/th[1]")).getText();
				  
				System.out.println("# = " + column1);	   
			
				Thread.sleep(50000);
				
				//From Stage
				
				String From_Stage = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklistmovement/c-col/c-card/c-card-body/div/table/thead/tr/th[2]")).getText();
				  
				System.out.println("From Stage = " + From_Stage);	   
			
				Thread.sleep(50000);
				
				//To Stage
				
				String To_Stage = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklistmovement/c-col/c-card/c-card-body/div/table/thead/tr/th[3]")).getText();
				  
				System.out.println("To Stage = " + To_Stage);	   
			
				Thread.sleep(50000);

				//Button Name
				
				String Button_Name = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklistmovement/c-col/c-card/c-card-body/div/table/thead/tr/th[4]")).getText();
				  
				System.out.println("Button Name = " + Button_Name);	   
			
				Thread.sleep(50000);

				//Local Button Name
				
				String Local_Button_Name = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklistmovement/c-col/c-card/c-card-body/div/table/thead/tr/th[5]")).getText();
				  
				System.out.println("Local Button Name = " + Local_Button_Name);	   
			
				Thread.sleep(50000);

				//Button Type
				
				String Button_Type = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklistmovement/c-col/c-card/c-card-body/div/table/thead/tr/th[6]")).getText();
				  
				System.out.println("Button Type = " + Button_Type);	   
			
				Thread.sleep(50000);
				
				//Is Delete
				
				String Is_Delete = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklistmovement/c-col/c-card/c-card-body/div/table/thead/tr/th[7]")).getText();
				  
				System.out.println("Is Delete = " + Is_Delete);	   
			
				Thread.sleep(50000);

				//Action

				String Action = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklistmovement/c-col/c-card/c-card-body/div/table/thead/tr/th[8]")).getText();
				  
				System.out.println("Action = " + Action);	   
			
				Thread.sleep(50000);

}


@Test	
	public void TC_ID_05_02() throws InterruptedException {
				
	//Select Drop down
	
				driver.findElement(By.xpath("//select[@class='form-select ng-valid ng-dirty ng-touched']")).click();
	
				Thread.sleep(500000);
		
}


@Test	
	public void TC_ID_05_03() throws InterruptedException {
				
	//New Button
	
				String Action = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklistmovement/c-col/c-card/c-card-body/div/table/thead/tr/th[8]")).getText();
	  
				System.out.println("Action = " + Action);	   

				Thread.sleep(50000);
	
				driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
	
				Thread.sleep(500000);

}

@Test	
public void TC_ID_05_04() throws InterruptedException {


		//From stage
		
		String From_stage = driver.findElement(By.xpath("//select[@formcontrolname='from_checklist']")).getText();
		  
		System.out.println("From stage = " + From_stage);	   
	
		Thread.sleep(50000);
	
		driver.findElement(By.xpath("//select[@formcontrolname='from_checklist']")).click();
	
		Thread.sleep(5000);
	
		//To stage
		
		String To_stage = driver.findElement(By.xpath("//select[@formcontrolname='from_checklist']")).getText();
		  
		System.out.println("To stage = " + To_stage);	   
	
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//select[@formcontrolname='to_checklist']")).click();
		
		Thread.sleep(5000);

		//Button Name
		
		String Button_Name = driver.findElement(By.xpath("//select[@formcontrolname='to_checklist']")).getText();
		  
		System.out.println("Button Name = " + Button_Name);	   
	
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//select[@formcontrolname='to_checklist']")).click();
		
		Thread.sleep(5000);

		//Button Name Local
		
		String Button_Name_Local = driver.findElement(By.xpath("//select[@formcontrolname='label_lcl']")).getText();
				  
		System.out.println("Button Name Local = " + Button_Name_Local);	   
			
		Thread.sleep(5000);
				
		driver.findElement(By.xpath("//select[@formcontrolname='label_lcl']")).click();
				
		Thread.sleep(5000);
		
		//Button Type
		
		String Button_Type = driver.findElement(By.xpath("//select[@formcontrolname='btn_type']]")).getText();
						  
		System.out.println("Button Type = " + Button_Type);	   
					
		Thread.sleep(5000);
						
		driver.findElement(By.xpath("//select[@formcontrolname='btn_type']")).click();
						
		Thread.sleep(5000);
		
		//Submit Button
		
		String Submit_Button = driver.findElement(By.xpath("//button[@class='btn btn-primary']]")).getText();
								  
		System.out.println("Submit Button = " + Submit_Button);	   
							
		Thread.sleep(5000);
								
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
								
		Thread.sleep(5000);
		
		
		//Close Button
		
		String Close_Button = driver.findElement(By.xpath("//button[@class='btn btn-secondary']]")).getText();
										  
		System.out.println("Close Button = " + Close_Button);	   
									
		Thread.sleep(5000);
										
		driver.findElement(By.xpath("//button[@class='btn btn-secondary']")).click();
										
		Thread.sleep(5000);
		
				
}

@Test	
public void TC_ID_05_05() throws InterruptedException {
	
		//New Button
	
	driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
	
	Thread.sleep(5000);
	
	//select from stage 
		
	Select Select_from_stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname='from_checklist']")));
   	
	Select_from_stage.selectByVisibleText("Compare your options");
	
	Thread.sleep(5000);
	
	//Select To stage
	
	Select Select_To_stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname='to_checklist']")));
   	
	Select_To_stage.selectByVisibleText("Gather required documents");
	
	Thread.sleep(5000);
	
	//Enter value button Name
	
	driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]]")).sendKeys("Next");
	
	//Enter value in Button Name Local
	
	driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")).sendKeys("अगला");
	
	//Select Button Type
	
	Select Select_button_type = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"btn_type\"]")));
   	
	Select_button_type.selectByVisibleText("Next");
	
	Thread.sleep(5000);
	
	//Is Delete checkbox
	
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//Submit button
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	
	
}
@Test

public void TC_ID_05_06() throws InterruptedException {

	
	//New Button
	
	driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
	
	Thread.sleep(5000);
	
	//select from stage 
		
	Select Select_from_stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname='from_checklist']")));
   	
	Select_from_stage.selectByVisibleText("Gather required documents");
	
	Thread.sleep(5000);
	
	//Select To stage
	
	Select Select_To_stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname='to_checklist']")));
   	
	Select_To_stage.selectByVisibleText("Choose a joint or individual account");
	
	Thread.sleep(5000);
	
	//Enter value button Name
	
	driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]]")).sendKeys("Next");
	
	//Enter value in Button Name Local
	
	driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")).sendKeys("अगला");
	
	//Select Button Type
	
	Select Select_button_type = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"btn_type\"]")));
   	
	Select_button_type.selectByVisibleText("Next");
	
	Thread.sleep(5000);
	
	//Is Delete checkbox
	
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//Submit button
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	
}

@Test
public void TC_ID_05_07() throws InterruptedException {

	
	//New Button
	
	driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
	
	Thread.sleep(5000);
	
	//select from stage 
		
	Select Select_from_stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname='from_checklist']")));
   	
	Select_from_stage.selectByVisibleText("Choose a joint or individual account");
	
	Thread.sleep(5000);
	
	//Select To stage
	
	Select Select_To_stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname='to_checklist']")));
   	
	Select_To_stage.selectByVisibleText("Fund your account");
	
	Thread.sleep(5000);
	
	//Enter value button Name
	
	driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]]")).sendKeys("Next");
	
	//Enter value in Button Name Local
	
	driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")).sendKeys("अगला");
	
	//Select Button Type
	
	Select Select_button_type = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"btn_type\"]")));
   	
	Select_button_type.selectByVisibleText("Next");
	
	Thread.sleep(5000);
	
	//Is Delete checkbox
	
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//Submit button
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	
}

@Test
public void TC_ID_05_08() throws InterruptedException {

	
	//New Button
	
	driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
	
	Thread.sleep(5000);
	
	//select from stage 
		
	Select Select_from_stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname='from_checklist']")));
   	
	Select_from_stage.selectByVisibleText("Fund your account");
	
	Thread.sleep(5000);
	
	//Select To stage
	
	Select Select_To_stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname='to_checklist']")));
   	
	Select_To_stage.selectByVisibleText("Submit your application");
	
	Thread.sleep(5000);
	
	//Enter value button Name
	
	driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]]")).sendKeys("Next");
	
	//Enter value in Button Name Local
	
	driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")).sendKeys("अगला");
	
	//Select Button Type
	
	Select Select_button_type = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"btn_type\"]")));
   	
	Select_button_type.selectByVisibleText("Next");
	
	Thread.sleep(5000);
	
	//Is Delete checkbox
	
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//Submit button
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();	
	
}
@Test
public void TC_ID_05_09() throws InterruptedException {

	
	//New Button
	
	driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
	
	Thread.sleep(5000);
	
	//select from stage 
		
	Select Select_from_stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname='from_checklist']")));
   	
	Select_from_stage.selectByVisibleText("Submit your application");
	
	Thread.sleep(5000);
	
	//Select To stage
	
	Select Select_To_stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname='to_checklist']")));
   	
	Select_To_stage.selectByVisibleText("Set up online banking");
	
	Thread.sleep(5000);
	
	//Enter value button Name
	
	driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]]")).sendKeys("Next");
	
	//Enter value in Button Name Local
	
	driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")).sendKeys("अगला");
	
	//Select Button Type
	
	Select Select_button_type = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"btn_type\"]")));
   	
	Select_button_type.selectByVisibleText("Next");
	
	Thread.sleep(5000);
	
	//Is Delete checkbox
	
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//Submit button
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		
}
@Test
public void TC_ID_05_10() throws InterruptedException {

	
	//New Button
	
	driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
	
	Thread.sleep(5000);
	
	//select from stage 
		
	Select Select_from_stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname='from_checklist']")));
   	
	Select_from_stage.selectByVisibleText("Set up online banking");
	
	Thread.sleep(5000);
	
	//Select To stage
	
	Select Select_To_stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname='to_checklist']")));
   	
	Select_To_stage.selectByVisibleText("Submit your application");
	
	Thread.sleep(5000);
	
	//Enter value button Name
	
	driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]]")).sendKeys("Back");
	
	//Enter value in Button Name Local
	
	driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")).sendKeys("पीछे");
	
	//Select Button Type
	
	Select Select_button_type = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"btn_type\"]")));
   	
	Select_button_type.selectByVisibleText("Back");
	
	Thread.sleep(5000);
	
	//Is Delete checkbox
	
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//Submit button
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	
}
@Test
public void TC_ID_05_11() throws InterruptedException {

	
	//New Button
	
	driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
	
	Thread.sleep(5000);
	
	//select from stage 
		
	Select Select_from_stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname='from_checklist']")));
   	
	Select_from_stage.selectByVisibleText("Submit your application");
	
	Thread.sleep(5000);
	
	//Select To stage
	
	Select Select_To_stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname='to_checklist']")));
   	
	Select_To_stage.selectByVisibleText("Fund your account");
	
	Thread.sleep(5000);
	
	//Enter value button Name
	
	driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]]")).sendKeys("Back");
	
	//Enter value in Button Name Local
	
	driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")).sendKeys("पीछे");
	
	//Select Button Type
	
	Select Select_button_type = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"btn_type\"]")));
   	
	Select_button_type.selectByVisibleText("Back");
	
	Thread.sleep(5000);
	
	//Is Delete checkbox
	
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//Submit button
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	
}

@Test
public void TC_ID_05_12() throws InterruptedException {

	
	//New Button
	
	driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
	
	Thread.sleep(5000);
	
	//select from stage 
		
	Select Select_from_stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname='from_checklist']")));
   	
	Select_from_stage.selectByVisibleText("Compare your options");
	
	Thread.sleep(5000);
	
	//Select To stage
	
	Select Select_To_stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname='to_checklist']")));
   	
	Select_To_stage.selectByVisibleText("Gather required documents");
	
	Thread.sleep(5000);
	
	//Enter value button Name
	
	driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]]")).sendKeys("Reject");
	
	//Enter value in Button Name Local
	
	driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")).sendKeys("अस्वीकार करना");
	
	//Select Button Type
	
	Select Select_button_type = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"btn_type\"]")));
   	
	Select_button_type.selectByVisibleText("Reject");
	
	Thread.sleep(5000);
	
	//Is Delete checkbox
	
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//Submit button
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	
}
@Test
public void TC_ID_05_13() throws InterruptedException {

	
	//View Icon
	
	driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklistmovement/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[8]/span[1]")).click();
	
	Thread.sleep(5000);
	
	//Page Name
	
	String Stages_Details = driver.findElement(By.xpath("<h5 _ngcontent-fsw-c65=\"\" cmodaltitle=\"\" class=\"modal-title\">Stages Details</h5>")).getText();
													  
	System.out.println("Stages Details = " + Stages_Details);	   

	Thread.sleep(5000);	
	
	//From Stage
	
	String From_Stage = driver.findElement(By.xpath("//select[@formcontrolname=\"from_checklist\"]")).getText();
														  
	System.out.println("From Stage = " + From_Stage);	   

	Thread.sleep(5000);
	
	//To Stage
	
	String To_Stage = driver.findElement(By.xpath("//select[@formcontrolname=\"to_checklist\"]")).getText();
															  
	System.out.println("To Stage = " + To_Stage);	   

	Thread.sleep(5000);
	
	//Button Name
	
	String Button_Name = driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]")).getText();
																  
	System.out.println("Button Name = " + Button_Name);	   

	Thread.sleep(5000);
	
	//Button Name Local
	
	String Button_Name_Local = driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")).getText();
																	  
	System.out.println("Button Name Local = " + Button_Name_Local);	   

	Thread.sleep(5000);
	
	//Button Type
	
	String Button_Type = driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")).getText();
																		  
	System.out.println("Button Type = " + Button_Type);	   

	Thread.sleep(5000);
	
	//Is Delete Checkbox
	
	String Is_Delete_Checkbox = driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")).getText();
																			  
	System.out.println("Is Delete Checkbox = " + Is_Delete_Checkbox);	   

	Thread.sleep(5000);
	
	//Close Button
	
	String Close_Button = driver.findElement(By.xpath("//button[@class=\"btn btn-secondary\"]")).getText();
																			  
	System.out.println("Close Button = " + Close_Button);	   

	Thread.sleep(5000);
	
	
}
@Test
public void TC_ID_05_14() throws InterruptedException {

	
	//Edit Icon
	
	driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklistmovement/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[8]/span[3]")).click();
	
	Thread.sleep(5000);
	
	//Page Name
	
	String Stages_Details = driver.findElement(By.xpath("<h5 _ngcontent-fsw-c65=\"\" cmodaltitle=\"\" class=\"modal-title\">Stages Details</h5>")).getText();
													  
	System.out.println("Stages Details = " + Stages_Details);	   

	Thread.sleep(5000);	
	
	//From Stage
	
	String From_Stage = driver.findElement(By.xpath("//select[@formcontrolname=\"from_checklist\"]")).getText();
														  
	System.out.println("From Stage = " + From_Stage);	   

	Thread.sleep(5000);
	
	//To Stage
	
	String To_Stage = driver.findElement(By.xpath("//select[@formcontrolname=\"to_checklist\"]")).getText();
															  
	System.out.println("To Stage = " + To_Stage);	   

	Thread.sleep(5000);
	
	//Button Name
	
	String Button_Name = driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]")).getText();
																  
	System.out.println("Button Name = " + Button_Name);	   

	Thread.sleep(5000);
	
	//Button Name Local
	
	String Button_Name_Local = driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")).getText();
																	  
	System.out.println("Button Name Local = " + Button_Name_Local);	   

	Thread.sleep(5000);
	
	//Button Type
	
	String Button_Type = driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")).getText();
																		  
	System.out.println("Button Type = " + Button_Type);	   

	Thread.sleep(5000);
	
	//Is Delete Checkbox
	
	String Is_Delete_Checkbox = driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")).getText();
																			  
	System.out.println("Is Delete Checkbox = " + Is_Delete_Checkbox);	   

	Thread.sleep(5000);
	
	//Close Button
	
	String Close_Button = driver.findElement(By.xpath("//button[@class=\"btn btn-secondary\"]")).getText();
																			  
	System.out.println("Close Button = " + Close_Button);	   

	Thread.sleep(5000);
	
	//Update Button
	
	String Update_Button = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).getText();
																				  
	System.out.println("Update Button = " + Update_Button);	   

	Thread.sleep(5000);
	
}


}
