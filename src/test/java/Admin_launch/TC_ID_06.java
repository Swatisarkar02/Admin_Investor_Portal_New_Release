package Admin_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TC_ID_06 extends Login{
	
	public void TC_ID_06_01() throws InterruptedException {
		
		
        //Busniess_Process

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/perfect-scrollbar/div/div[1]/c-sidebar-nav/c-sidebar-nav-group[1]/a")).click();
		
		Thread.sleep(500000);

		//Select Account
		
		Select Select_Account = new Select(driver.findElement(By.xpath("//select[@formcontrolname='parking']")));
	   	
		Select_Account.selectByVisibleText("Test_Bank_Exim_R");

		//Page Name
		
		String Form_Mapping = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/app-default-header/c-container/c-header-nav[1]/c-breadcrumb-router/c-breadcrumb/c-breadcrumb-item[2]/span")).getText();
														  
		System.out.println("Form Mapping = " + Form_Mapping);	   

		Thread.sleep(5000);
		
		
		//Stage
		
		String Stage = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-formmapping/c-col/c-card/c-card-body/div/table/thead/tr/th[2]")).getText();
																  
		System.out.println("Stage = " + Stage);
		
		Thread.sleep(5000);
		
		//Label
		
		String Label = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-formmapping/c-col/c-card/c-card-body/div/table/thead/tr/th[3]")).getText();
																		  
		System.out.println("Label = " + Label);
				
		Thread.sleep(5000);
		
		//Local Label
		
		String Local_Label = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-formmapping/c-col/c-card/c-card-body/div/table/thead/tr/th[4]")).getText();
																				  
		System.out.println("Local Label = " + Local_Label);
						
		Thread.sleep(5000);
		
		//Type
		
		String Type = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-formmapping/c-col/c-card/c-card-body/div/table/thead/tr/th[5]")).getText();
																						  
		System.out.println("Type = " + Type);
								
		Thread.sleep(5000);
		
		//Table
		
		String Table = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-formmapping/c-col/c-card/c-card-body/div/table/thead/tr/th[6]")).getText();
																						  
		System.out.println("Table = " + Table);
								
		Thread.sleep(5000);
		
		//Column
		
		String Column = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-formmapping/c-col/c-card/c-card-body/div/table/thead/tr/th[7]")).getText();
																								  
		System.out.println("Column = " + Column);
										
		Thread.sleep(5000);
		
		//Field Position
		
		String Field_Position = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-formmapping/c-col/c-card/c-card-body/div/table/thead/tr/th[8]")).getText();
																										  
		System.out.println("Field_Position = " + Field_Position);
												
		Thread.sleep(5000);
	
		//Required
		
		String Required = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-formmapping/c-col/c-card/c-card-body/div/table/thead/tr/th[9]")).getText();
																												  
		System.out.println("Required = " + Required);
														
		Thread.sleep(5000);
		
		//Action
		
		String Action = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-formmapping/c-col/c-card/c-card-body/div/table/thead/tr/th[10]")).getText();
																														  
		System.out.println("Action = " + Action);
																
		Thread.sleep(5000);
	
	}
	
public void TC_ID_06_02() throws InterruptedException {
		
		
        //New Button
	
		String New_Button = driver.findElement(By.xpath("//button[@class=\\\"btn btn-dark\\")).getText();
																															  
		System.out.println("New Button is display = " + New_Button);
		
		//Click New Button
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-dark\"]")).click();
			
		Thread.sleep(5000);
				
}
		
public void TC_ID_06_03() throws InterruptedException {

	    //Stage field drop down		
		
		String Stage_field_Drop_Down = driver.findElement(By.xpath("select[@formcontrolname=\\\"fk_sys_checklist\\\"]")).getText();
	  
		System.out.println("Stage field Drop Down is display = " + Stage_field_Drop_Down);
		
		driver.findElement(By.xpath("//select[@formcontrolname=\"fk_sys_checklist\"]")).click();
		
		Thread.sleep(5000);
		
		//Table Name field drop down
		
		String Table_Name_field_drop_down = driver.findElement(By.xpath("//select[@formcontrolname=\"table_name\"]")).getText();
		  
		System.out.println("Table Name field drop down is display = " + Table_Name_field_drop_down);
		
		driver.findElement(By.xpath("//select[@formcontrolname=\"table_name\"]")).click();
		
		Thread.sleep(5000);
		
		//Column field drop down
		
		String Column_field_drop_down = driver.findElement(By.xpath("//select[@formcontrolname=\\\"column_name\\\"]")).getText();
				  
		System.out.println("Column field drop down is display = " + Column_field_drop_down);
				
		driver.findElement(By.xpath("//select[@formcontrolname=\"column_name\"]")).click();
				
		Thread.sleep(5000);
		
		//Lable field drop down
		
		String Lable_field_drop_down = driver.findElement(By.xpath("//input[@formcontrolname=\\\"label_en\\\"]")).getText();
						  
		System.out.println("Lable field drop down is display = " + Lable_field_drop_down);
						
		driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]")).click();
						
		Thread.sleep(5000);
		
		//Local Lable field drop down
		
		String Local_Lable_field_drop_down = driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")).getText();
								  
		System.out.println("Local Lable field drop down is display = " + Local_Lable_field_drop_down);
								
		driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")).click();
								
		Thread.sleep(5000);
		
		//Field drop down
		
		String Field_drop_down = driver.findElement(By.xpath("//select[@formcontrolname=\"field_type\"]")).getText();
										  
		System.out.println("Field drop down is display = " + Field_drop_down);
										
		driver.findElement(By.xpath("//select[@formcontrolname=\"field_type\"]")).click();
										
		Thread.sleep(5000);
		
		//Datasource drop down
		
		String Datasource_drop_down = driver.findElement(By.xpath("//textarea[@formcontrolname=\"datasource\"]")).getText();
												  
		System.out.println("Datasource drop down is display = " + Datasource_drop_down);
												
		driver.findElement(By.xpath("//textarea[@formcontrolname=\"datasource\"]")).click();
												
		Thread.sleep(5000);
		
		//Field Position drop down
		
		String Field_Position_drop_down = driver.findElement(By.xpath("//input[@formcontrolname=\"field_position\"]")).getText();
														  
		System.out.println("Field Position drop down is display = " + Field_Position_drop_down);
														
		driver.findElement(By.xpath("//input[@formcontrolname=\"field_position\"]")).click();
														
		Thread.sleep(5000);
		
		//Is Required checkbox
		
		String Is_Required_checkbox = driver.findElement(By.xpath("//input[@formcontrolname=\"is_required\"]")).getText();
																  
		System.out.println("Is Required checkbox is display = " + Is_Required_checkbox);
																
		driver.findElement(By.xpath("//input[@formcontrolname=\"is_required\"]")).click();
																
		Thread.sleep(5000);
		
		//Submit Button
		
		String Submit_Button = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).getText();
																		  
		System.out.println("Submit Button is display = " + Submit_Button);
																		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
																		
		Thread.sleep(5000);
		
		//Close Button
		
		String Close_Button = driver.findElement(By.xpath("//button[@class=\"btn btn-secondary\"]")).getText();
																				  
		System.out.println("Close Button is display = " + Close_Button);
																				
		driver.findElement(By.xpath("//button[@class=\"btn btn-secondary\"]")).click();
																				
		Thread.sleep(5000);
		
}

	public void TC_ID_06_04() throws InterruptedException {
		
		//Click on New button
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-dark\"]")).click();
		
		//Select Stage
		
		Select Select_Stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"fk_sys_checklist\"]")));
			   	
		Select_Stage.selectByVisibleText("Compare Your option");
		
		//Select Table
		
		Select Select_Table = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"table_name\"]")));
					   	
		Select_Stage.selectByVisibleText("Investor");
		
		//Select Column
		
		Select Select_Column = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"column_name\"]")));
							   	
		Select_Column.selectByVisibleText("salutation_code");

		//Select Lable Name
		
		Select Select_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]")));
									   	
		Select_Lable_Name.selectByVisibleText("Salutation");
		
		//Select Local Lable Name
		
		Select Select_Local_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")));
											   	
		Select_Local_Lable_Name.selectByVisibleText("अभिवादन");
		
		//Select Field Name
		
		Select Select_Field_Name = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"field_type\"]")));
													   	
		Select_Field_Name.selectByVisibleText("Text");
		
		//Enter Datasource Name
		
		Select Enter_Datasource = new Select(driver.findElement(By.xpath("//textarea[@formcontrolname=\"datasource\"]")));
															   	
		Enter_Datasource.selectByVisibleText("");
		
		//Enter Filed Position
		
		Select Enter_Filed_Position = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"field_position\"]")));
																	   	
		Enter_Filed_Position.selectByVisibleText("1");
		
		//Click on Submit button
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
	}
	
	
public void TC_ID_06_05() throws InterruptedException {
		
		//Click on New button
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-dark\"]")).click();
		
		//Select Stage
		
		Select Select_Stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"fk_sys_checklist\"]")));
			   	
		Select_Stage.selectByVisibleText("Compare Your option");
		
		//Select Table
		
		Select Select_Table = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"table_name\"]")));
					   	
		Select_Stage.selectByVisibleText("Investor");
		
		//Select Column
		
		Select Select_Column = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"column_name\"]")));
							   	
		Select_Column.selectByVisibleText("first_name_en");

		//Select Lable Name
		
		Select Select_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]")));
									   	
		Select_Lable_Name.selectByVisibleText("First Name");
		
		//Select Local Lable Name
		
		Select Select_Local_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")));
											   	
		Select_Local_Lable_Name.selectByVisibleText("पहला नाम");
		
		//Select Field Name
		
		Select Select_Field_Name = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"field_type\"]")));
													   	
		Select_Field_Name.selectByVisibleText("Text");
		
		//Enter Datasource Name
		
		Select Enter_Datasource = new Select(driver.findElement(By.xpath("//textarea[@formcontrolname=\"datasource\"]")));
															   	
		Enter_Datasource.selectByVisibleText("");
		
		//Enter Filed Position
		
		Select Enter_Filed_Position = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"field_position\"]")));
																	   	
		Enter_Filed_Position.selectByVisibleText("2");
		
		//Click on Submit button
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
}


public void TC_ID_06_06() throws InterruptedException {
	
	//Click on New button
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-dark\"]")).click();
	
	//Select Stage
	
	Select Select_Stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"fk_sys_checklist\"]")));
		   	
	Select_Stage.selectByVisibleText("Compare Your option");
	
	//Select Table
	
	Select Select_Table = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"table_name\"]")));
				   	
	Select_Stage.selectByVisibleText("Investor");
	
	//Select Column
	
	Select Select_Column = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"column_name\"]")));
						   	
	Select_Column.selectByVisibleText("first_name_en");

	//Select Lable Name
	
	Select Select_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]")));
								   	
	Select_Lable_Name.selectByVisibleText("First Name");
	
	//Select Local Lable Name
	
	Select Select_Local_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")));
										   	
	Select_Local_Lable_Name.selectByVisibleText("पहला नाम");
	
	//Select Field Name
	
	Select Select_Field_Name = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"field_type\"]")));
												   	
	Select_Field_Name.selectByVisibleText("Text");
	
	//Enter Datasource Name
	
	Select Enter_Datasource = new Select(driver.findElement(By.xpath("//textarea[@formcontrolname=\"datasource\"]")));
														   	
	Enter_Datasource.selectByVisibleText("");
	
	//Enter Filed Position
	
	Select Enter_Filed_Position = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"field_position\"]")));
																   	
	Enter_Filed_Position.selectByVisibleText("3");
	
	//Click on Submit button
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
}

public void TC_ID_06_07() throws InterruptedException {
	
	//Click on New button
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-dark\"]")).click();
	
	//Select Stage
	
	Select Select_Stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"fk_sys_checklist\"]")));
		   	
	Select_Stage.selectByVisibleText("Gather required documents");
	
	//Select Table
	
	Select Select_Table = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"table_name\"]")));
				   	
	Select_Stage.selectByVisibleText("Address");
	
	//Select Column
	
	Select Select_Column = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"column_name\"]")));
						   	
	Select_Column.selectByVisibleText("type");

	//Select Lable Name
	
	Select Select_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]")));
								   	
	Select_Lable_Name.selectByVisibleText("Adress Type");
	
	//Select Local Lable Name
	
	Select Select_Local_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")));
										   	
	Select_Local_Lable_Name.selectByVisibleText("पता मुद्रलेख");
	
	//Select Field Name
	
	Select Select_Field_Name = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"field_type\"]")));
												   	
	Select_Field_Name.selectByVisibleText("Single Select");
	
	//Enter Datasource Name
	
	Select Enter_Datasource = new Select(driver.findElement(By.xpath("//textarea[@formcontrolname=\"datasource\"]")));
														   	
	Enter_Datasource.selectByVisibleText("");
	
	//Enter Filed Position
	
	Select Enter_Filed_Position = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"field_position\"]")));
																   	
	Enter_Filed_Position.selectByVisibleText("1");
	
	//Click on Submit button
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
}

public void TC_ID_06_08() throws InterruptedException {
	
	//Click on New button
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-dark\"]")).click();
	
	//Select Stage
	
	Select Select_Stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"fk_sys_checklist\"]")));
		   	
	Select_Stage.selectByVisibleText("Gather required documents");
	
	//Select Table
	
	Select Select_Table = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"table_name\"]")));
				   	
	Select_Stage.selectByVisibleText("Address");
	
	//Select Column
	
	Select Select_Column = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"column_name\"]")));
						   	
	Select_Column.selectByVisibleText("building_no");

	//Select Lable Name
	
	Select Select_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]")));
								   	
	Select_Lable_Name.selectByVisibleText("Building Number");
	
	//Select Local Lable Name
	
	Select Select_Local_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")));
										   	
	Select_Local_Lable_Name.selectByVisibleText("भवन का नंबर");
	
	//Select Field Name
	
	Select Select_Field_Name = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"field_type\"]")));
												   	
	Select_Field_Name.selectByVisibleText("Number");
	
	//Enter Datasource Name
	
	Select Enter_Datasource = new Select(driver.findElement(By.xpath("//textarea[@formcontrolname=\"datasource\"]")));
														   	
	Enter_Datasource.selectByVisibleText("");
	
	//Enter Filed Position
	
	Select Enter_Filed_Position = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"field_position\"]")));
																   	
	Enter_Filed_Position.selectByVisibleText("2");
	
	//Click on Submit button
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
}

public void TC_ID_06_09() throws InterruptedException {
	
	//Click on New button
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-dark\"]")).click();
	
	//Select Stage
	
	Select Select_Stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"fk_sys_checklist\"]")));
		   	
	Select_Stage.selectByVisibleText("Gather required documents");
	
	//Select Table
	
	Select Select_Table = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"table_name\"]")));
				   	
	Select_Stage.selectByVisibleText("Address");
	
	//Select Column
	
	Select Select_Column = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"column_name\"]")));
						   	
	Select_Column.selectByVisibleText("address1");

	//Select Lable Name
	
	Select Select_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]")));
								   	
	Select_Lable_Name.selectByVisibleText("Locality");
	
	//Select Local Lable Name
	
	Select Select_Local_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")));
										   	
	Select_Local_Lable_Name.selectByVisibleText("इलाका");
	
	//Select Field Name
	
	Select Select_Field_Name = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"field_type\"]")));
												   	
	Select_Field_Name.selectByVisibleText("Text");
	
	//Enter Datasource Name
	
	Select Enter_Datasource = new Select(driver.findElement(By.xpath("//textarea[@formcontrolname=\"datasource\"]")));
														   	
	Enter_Datasource.selectByVisibleText("");
	
	//Enter Filed Position
	
	Select Enter_Filed_Position = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"field_position\"]")));
																   	
	Enter_Filed_Position.selectByVisibleText("3");
	
	//Click on Submit button
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
}

public void TC_ID_06_10() throws InterruptedException {
	
	//Click on New button
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-dark\"]")).click();
	
	//Select Stage
	
	Select Select_Stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"fk_sys_checklist\"]")));
		   	
	Select_Stage.selectByVisibleText("Gather required documents");
	
	//Select Table
	
	Select Select_Table = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"table_name\"]")));
				   	
	Select_Stage.selectByVisibleText("Address");
	
	//Select Column
	
	Select Select_Column = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"column_name\"]")));
						   	
	Select_Column.selectByVisibleText("city");

	//Select Lable Name
	
	Select Select_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]")));
								   	
	Select_Lable_Name.selectByVisibleText("city");
	
	//Select Local Lable Name
	
	Select Select_Local_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")));
										   	
	Select_Local_Lable_Name.selectByVisibleText("शहर");
	
	//Select Field Name
	
	Select Select_Field_Name = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"field_type\"]")));
												   	
	Select_Field_Name.selectByVisibleText("Text");
	
	//Enter Datasource Name
	
	Select Enter_Datasource = new Select(driver.findElement(By.xpath("//textarea[@formcontrolname=\"datasource\"]")));
														   	
	Enter_Datasource.selectByVisibleText("");
	
	//Enter Filed Position
	
	Select Enter_Filed_Position = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"field_position\"]")));
																   	
	Enter_Filed_Position.selectByVisibleText("4");
	
	//Click on Submit button
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
}

public void TC_ID_06_11() throws InterruptedException {
	
	//Click on New button
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-dark\"]")).click();
	
	//Select Stage
	
	Select Select_Stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"fk_sys_checklist\"]")));
		   	
	Select_Stage.selectByVisibleText("Gather required documents");
	
	//Select Table
	
	Select Select_Table = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"table_name\"]")));
				   	
	Select_Stage.selectByVisibleText("Address");
	
	//Select Column
	
	Select Select_Column = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"column_name\"]")));
						   	
	Select_Column.selectByVisibleText("Pincode");

	//Select Lable Name
	
	Select Select_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]")));
								   	
	Select_Lable_Name.selectByVisibleText("Pincode");
	
	//Select Local Lable Name
	
	Select Select_Local_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")));
										   	
	Select_Local_Lable_Name.selectByVisibleText("पिन कोड");
	
	//Select Field Name
	
	Select Select_Field_Name = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"field_type\"]")));
												   	
	Select_Field_Name.selectByVisibleText("Number");
	
	//Enter Datasource Name
	
	Select Enter_Datasource = new Select(driver.findElement(By.xpath("//textarea[@formcontrolname=\"datasource\"]")));
														   	
	Enter_Datasource.selectByVisibleText("");
	
	//Enter Filed Position
	
	Select Enter_Filed_Position = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"field_position\"]")));
																   	
	Enter_Filed_Position.selectByVisibleText("5");
	
	//Click on Submit button
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
}

public void TC_ID_06_12() throws InterruptedException {
	
	//Click on New button
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-dark\"]")).click();
	
	//Select Stage
	
	Select Select_Stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"fk_sys_checklist\"]")));
		   	
	Select_Stage.selectByVisibleText("Compare Your option");
	
	//Select Table
	
	Select Select_Table = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"table_name\"]")));
				   	
	Select_Stage.selectByVisibleText("Investor");
	
	//Select Column
	
	Select Select_Column = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"column_name\"]")));
						   	
	Select_Column.selectByVisibleText("Last Name");

	//Select Lable Name
	
	Select Select_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]")));
								   	
	Select_Lable_Name.selectByVisibleText("Last Name");
	
	//Select Local Lable Name
	
	Select Select_Local_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")));
										   	
	Select_Local_Lable_Name.selectByVisibleText("उपनाम");
	
	//Select Field Name
	
	Select Select_Field_Name = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"field_type\"]")));
												   	
	Select_Field_Name.selectByVisibleText("Text");
	
	//Enter Datasource Name
	
	Select Enter_Datasource = new Select(driver.findElement(By.xpath("//textarea[@formcontrolname=\"datasource\"]")));
														   	
	Enter_Datasource.selectByVisibleText("");
	
	//Enter Filed Position
	
	Select Enter_Filed_Position = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"field_position\"]")));
																   	
	Enter_Filed_Position.selectByVisibleText("3");
	
	//Click on Submit button
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
}

public void TC_ID_06_13() throws InterruptedException {
	
	//Click on Edit icon
	
	driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-formmapping/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[10]/span[3]")).click();
	
	//Select Stage
	
	Select Select_Stage = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"fk_sys_checklist\"]")));
		   	
	Select_Stage.selectByVisibleText("Compare Your option");
	
	//Select Table
	
	Select Select_Table = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"table_name\"]")));
				   	
	Select_Stage.selectByVisibleText("Investor");
	
	//Select Column
	
	Select Select_Column = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"column_name\"]")));
						   	
	Select_Column.selectByVisibleText("Last Name");

	//Select Lable Name
	
	Select Select_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_en\"]")));
								   	
	Select_Lable_Name.selectByVisibleText("Last Name");
	
	//Select Local Lable Name
	
	Select Select_Local_Lable_Name = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"label_lcl\"]")));
										   	
	Select_Local_Lable_Name.selectByVisibleText("उपनाम");
	
	//Select Field Name
	
	Select Select_Field_Name = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"field_type\"]")));
												   	
	Select_Field_Name.selectByVisibleText("Text");
	
	//Enter Datasource Name
	
	Select Enter_Datasource = new Select(driver.findElement(By.xpath("//textarea[@formcontrolname=\"datasource\"]")));
														   	
	Enter_Datasource.selectByVisibleText("");
	
	//Enter Filed Position
	
	Select Enter_Filed_Position = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"field_position\"]")));
																   	
	Enter_Filed_Position.selectByVisibleText("");
	
	//Enter Filed Position
	
	Select Enter_Filed_Position_Update = new Select(driver.findElement(By.xpath("//input[@formcontrolname=\"field_position\"]")));
																	   	
	Enter_Filed_Position_Update.selectByVisibleText("10");
	
	//Click on Submit button
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
}




}