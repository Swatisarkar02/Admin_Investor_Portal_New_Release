package Admin_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class TC_ID_04 extends Login{

@Test	
	public void TC_ID_04_01() throws InterruptedException {
	
	
		        //Busniess_Process
		
				driver.findElement(By.xpath("//*[@id=\"sidebar\"]/perfect-scrollbar/div/div[1]/c-sidebar-nav/c-sidebar-nav-group[1]/a")).click();
				
				Thread.sleep(500000);

				//Select Account
				
				Select Select_Account = new Select(driver.findElement(By.xpath("//select[@formcontrolname='parking']")));
			   	
				Select_Account.selectByVisibleText("Test_Bank_Exim_R");
				
				//Process
				
				Select Select_Process = new Select(driver.findElement(By.xpath("//select[@formcontrolname='page']")));
			   	
				Select_Process.selectByVisibleText("Open New Bank Account");
				
				//Stage
				
				driver.findElement(By.xpath("//*[@id=\"sidebar\"]/perfect-scrollbar/div/div[1]/c-sidebar-nav/c-sidebar-nav-group[1]/c-sidebar-nav/c-sidebar-nav-link[2]/a")).click();
				
				Thread.sleep(500000);
								
				//#
				
				String column1 = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/thead/tr/th[1]")).getText();
				  
				System.out.println("# = " + column1);	   
			
				Thread.sleep(50000);
				
				//Name
				
				String Name = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/thead/tr/th[2]")).getText();
				  
				System.out.println("Name = " + Name);	   
			
				Thread.sleep(50000);				
				
				//Local Name
				
				String Local_Name = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/thead/tr/th[3]")).getText();
				  
				System.out.println("Local Name = " + Local_Name);	   
			
				Thread.sleep(50000);
				
				//Teams
				
				String Teams = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/thead/tr/th[4]")).getText();
				  
				System.out.println("Teams = " + Teams);	   
			
				Thread.sleep(50000);
				
				//Stage
				
				String Stage = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/thead/tr/th[5]")).getText();
				  
				System.out.println("Stage = " + Stage);	   
			
				Thread.sleep(50000);
				
				//Color
				
				String Color = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/thead/tr/th[6]")).getText();
				  
				System.out.println("Color = " + Color);	   
			
				Thread.sleep(50000);
				
				//Edit_Controll
				
				String Edit_Controll = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/thead/tr/th[7]")).getText();
				  
				System.out.println("Edit Controll = " + Edit_Controll);	   
			
				Thread.sleep(50000);
				
				//Is Delete	
				
				String Is_Delete = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/thead/tr/th[8]")).getText();
				  
				System.out.println("Is Delete = " + Is_Delete);	   
			
				Thread.sleep(50000);
				
				//Action
				
				String Action = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/thead/tr/th[9]")).getText();
				  
				System.out.println("Action = " + Action);	   
			
				Thread.sleep(50000);
				
				
				
				//View Icon
				
				String View_Icon = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[9]/span[1]")).getText();
				  
				System.out.println("View Icon = " + View_Icon);	   
			
				Thread.sleep(50000);
				
				//Edit Icon
				
				String Edit_Icon = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[9]/span[3]")).getText();
				  
				System.out.println("Edit Icon = " + Edit_Icon);	   
			
				Thread.sleep(50000);
				
	}	
		
@Test
	public void TC_ID_04_02() throws InterruptedException {
		
			  //New Button
		
			  String New_Button = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-header/div/table/th[1]/button")).getText();
		  
			  System.out.println("New Button = " + New_Button);	   
	
			  Thread.sleep(5000);	
		
		      driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-header/div/table/th[1]/button")).click();
		
		      Thread.sleep(5000);
		      
	}
@Test	
	public void TC_ID_04_03() throws InterruptedException {
		
		  //Name
		
	      String Name = driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-body/form/c-row/c-col[1]/div/label")).getText();
		  
		  System.out.println("Name = " + Name);	   

		  Thread.sleep(5000);	
	
	      driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-body/form/c-row/c-col[1]/div/input")).click();
	
	      Thread.sleep(5000);
		
	      //Local Name
	      
	      String Local_Name = driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-body/form/c-row/c-col[2]/div/label")).getText();
		  
		  System.out.println("Local Name = " + Local_Name);	   

		  Thread.sleep(5000);	
	
	      driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-body/form/c-row/c-col[2]/div/input")).click();
	
	      Thread.sleep(5000);
	      
	      //Team
	      
	      String Team = driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-body/form/c-row/c-col[3]/div/label")).getText();
		  
		  System.out.println("Team = " + Team);	   

		  Thread.sleep(5000);	
	
	      driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-body/form/c-row/c-col[3]/div/select")).click();
	
	      Thread.sleep(5000);
	      
	      //Stage
	      
	      String Stage = driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-body/form/c-row/c-col[4]/div/label")).getText();
		  
		  System.out.println("Stage = " + Stage);	   

		  Thread.sleep(5000);	
	
	      driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-body/form/c-row/c-col[4]/div/input")).click();
	
	      Thread.sleep(5000);
	      
	      //Color
		
	      String Color = driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-body/form/c-row/c-col[5]/div/label")).getText();
		  
		  System.out.println("Color = " + Color);	   

		  Thread.sleep(5000);	
	
	      driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-body/form/c-row/c-col[5]/div/input")).click();
	
	      Thread.sleep(5000);
	      
	      //Edit Control
	      	      
	      String Edit_Control = driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-body/form/c-row/c-form-check/label")).getText();
		  
		  System.out.println("Edit Control = " + Edit_Control);	   

		  Thread.sleep(5000);	
	
	      driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-body/form/c-row/c-form-check/input")).click();
	
	      Thread.sleep(5000);
		
	    //Close_Button
  	      
	      String Close_Button = driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-footer/button")).getText();
		  
		  System.out.println("Close Button = " + Close_Button);	   

		  Thread.sleep(5000);	
	
	      driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-footer/button")).click();
	
	      Thread.sleep(5000);
	      
	      //Submit_Button
	      
	      driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-header/div/table/th[1]/button")).click();
			
	      Thread.sleep(5000);
	      
	      String Submit_Button = driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-footer/span/button")).getText();
		  
		  System.out.println("Submit Button = " + Submit_Button);	   

		  Thread.sleep(5000);	
	
	      driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-footer/span/button")).click();
	
	      Thread.sleep(5000);
	                 
	}
@Test
	
	public void TC_ID_04_04() throws InterruptedException {
		
		//Name
		
		driver.findElement(By.xpath("//input[@formcontrolname='name_en']")).sendKeys("Compare your Options");
		
		Thread.sleep(5000);
		
		//Local Name
		
		driver.findElement(By.xpath("//input[@formcontrolname='name_lcl']")).sendKeys("अपने विकल्पों की तुलना करें");
		
		Thread.sleep(5000);
		
		//Team
		
		Select Select_Team = new Select(driver.findElement(By.xpath("//select[@formcontrolname='fk_team']")));
	   	
		Select_Team.selectByVisibleText("Administration Management");
		
		Thread.sleep(5000);
		
		//Stage
		
		driver.findElement(By.xpath("//input[@formcontrolname='index_position']")).sendKeys("1");
		
		Thread.sleep(5000);
		
		//Color
		
		driver.findElement(By.xpath("//input[@formcontrolname='checklist_color']")).sendKeys("#008000");
		
		Thread.sleep(5000);
		
		//Edit Control
		
		driver.findElement(By.xpath("//input[@formcontrolname='edit_controll']")).click();
		
		//Submit
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		//Name column
		
		String Compare_your_Options = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[2]")).getText();
		  
		System.out.println("Compare your Options = " + Compare_your_Options);	   

		Thread.sleep(5000);
		
		//Name column
		
		String अपने_विकल्पों_की_तुलना_करें = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[3]")).getText();
				  
		System.out.println("अपने विकल्पों की तुलना करें = " + अपने_विकल्पों_की_तुलना_करें);	   

		Thread.sleep(5000);
		
		//Team Column
		
		String Administration_Management = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[4]")).getText();
		  
		System.out.println("Administration Management = " + Administration_Management);	   

		Thread.sleep(5000);
		
		//Stage Column
		
		String Stage_1 = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[4]")).getText();
		  
		System.out.println("1 = " + Stage_1);	   

		Thread.sleep(5000);
		
		//Color Column
		
		String Color = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[6]")).getText();
				  
		System.out.println("#008000 = " + Color);	   

		Thread.sleep(5000);
		
		//Edit Controll Column
		
		String Edit_Controll = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[7]")).getText();
						  
		System.out.println("Yes = " + Edit_Controll);	   

		Thread.sleep(5000);
		
		//Is Delete Column
		
		String Is_Delete = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[8]")).getText();
								  
		System.out.println("No = " + Is_Delete);	   

		Thread.sleep(5000);
				
	}
@Test

	public void TC_ID_04_05() throws InterruptedException {
		
		//Name
		
		driver.findElement(By.xpath("//input[@formcontrolname='name_en']")).sendKeys("Gather required documents");
				
		Thread.sleep(5000);
				
		//Local Name
				
		driver.findElement(By.xpath("//input[@formcontrolname='name_lcl']")).sendKeys("आवश्यक दस्तावेज़ एकत्र करें");
				
		Thread.sleep(5000);
				
		//Team
				
		Select Select_Team = new Select(driver.findElement(By.xpath("//select[@formcontrolname='fk_team']")));
			   	
		Select_Team.selectByVisibleText("Administration Management");
				
		Thread.sleep(5000);
				
		//Stage
				
		driver.findElement(By.xpath("//input[@formcontrolname='index_position']")).sendKeys("2");
				
		Thread.sleep(5000);
				
		//Color
				
		driver.findElement(By.xpath("//input[@formcontrolname='checklist_color']")).sendKeys("#FFFF00");
				
		Thread.sleep(5000);
				
		//Edit Control
				
		driver.findElement(By.xpath("//input[@formcontrolname='edit_controll']")).click();
				
		//Submit
				
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
				
		//Name column
				
		String Gather_required_documents = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[2]")).getText();
				  
		System.out.println("Gather required documents = " + Gather_required_documents);	   

		Thread.sleep(5000);
				
		//Name column
				
		String आवश्यक_दस्तावेज़_एकत्र_करें = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[3]")).getText();
						  
		System.out.println("आवश्यक दस्तावेज़ एकत्र करें = " + आवश्यक_दस्तावेज़_एकत्र_करें);	   

		Thread.sleep(5000);
				
		//Team Column
				
		String Administration_Management = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[4]")).getText();
				  
		System.out.println("Administration Management = " + Administration_Management);	   

		Thread.sleep(5000);
				
		//Stage Column
				
		String Stage_2 = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[4]")).getText();
				  
		System.out.println("2 = " + Stage_2);	   

		Thread.sleep(5000);
				
		//Color Column
				
		String Color = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[6]")).getText();
						  
		System.out.println("#FFFF00 = " + Color);	   

		Thread.sleep(5000);
				
		//Edit Controll Column
				
		String Edit_Controll = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[7]")).getText();
								  
		System.out.println("Yes = " + Edit_Controll);	   

		Thread.sleep(5000);
				
		//Is Delete Column
				
		String Is_Delete = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[8]")).getText();
										  
		System.out.println("No = " + Is_Delete);	   

		Thread.sleep(5000);

	}
	
@Test
	public void TC_ID_04_06() throws InterruptedException {
		
		//Name
		
		driver.findElement(By.xpath("//input[@formcontrolname='name_en']")).sendKeys("Choose a joint or individual account");
						
		Thread.sleep(5000);
						
		//Local Name
						
		driver.findElement(By.xpath("//input[@formcontrolname='name_lcl']")).sendKeys("संयुक्त या व्यक्तिगत खाता चुनें");
						
		Thread.sleep(5000);
						
		//Team
						
		Select Select_Team = new Select(driver.findElement(By.xpath("//select[@formcontrolname='fk_team']")));
					   	
		Select_Team.selectByVisibleText("Finance Team");
						
		Thread.sleep(5000);
						
		//Stage
						
		driver.findElement(By.xpath("//input[@formcontrolname='index_position']")).sendKeys("3");
						
		Thread.sleep(5000);
						
		//Color
						
		driver.findElement(By.xpath("//input[@formcontrolname='checklist_color']")).sendKeys("#008000");
						
		Thread.sleep(5000);
						
		//Edit Control
						
		driver.findElement(By.xpath("//input[@formcontrolname='edit_controll']")).click();
						
		//Submit
						
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
						
		//Name column
						
		String Choose_a_joint_or_individual_account = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[2]")).getText();
						  
		System.out.println("Choose a joint or individual account = " + Choose_a_joint_or_individual_account);	   

		Thread.sleep(5000);
						
		//Name column
						
		String संयुक्त_या_व्यक्तिगत_खाता_चुनें = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[3]")).getText();
								  
		System.out.println("संयुक्त या व्यक्तिगत खाता चुनें = " + संयुक्त_या_व्यक्तिगत_खाता_चुनें);	   

		Thread.sleep(5000);
						
		//Team Column
						
		String Finance_Team = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[4]")).getText();
						  
		System.out.println("Finance Team = " + Finance_Team);	   

		Thread.sleep(5000);
						
		//Stage Column
						
		String Stage_3 = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[4]")).getText();
						  
		System.out.println("3 = " + Stage_3);	   

		Thread.sleep(5000);
						
		//Color Column
						
		String Color = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[6]")).getText();
								  
		System.out.println("#008000 = " + Color);	   

		Thread.sleep(5000);
						
		//Edit Controll Column
						
		String Edit_Controll = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[7]")).getText();
										  
		System.out.println("Yes = " + Edit_Controll);	   

		Thread.sleep(5000);
						
		//Is Delete Column
						
		String Is_Delete = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[8]")).getText();
												  
		System.out.println("No = " + Is_Delete);	   

		Thread.sleep(5000);
		
}	
	
@Test
public void TC_ID_04_07() throws InterruptedException {
		
		//Name
		
		driver.findElement(By.xpath("//input[@formcontrolname='name_en']")).sendKeys("Fund your account");
						
		Thread.sleep(5000);
						
		//Local Name
						
		driver.findElement(By.xpath("//input[@formcontrolname='name_lcl']")).sendKeys("अपने खाते में फंड डालें");
						
		Thread.sleep(5000);
						
		//Team
						
		Select Select_Team = new Select(driver.findElement(By.xpath("//select[@formcontrolname='fk_team']")));
					   	
		Select_Team.selectByVisibleText("Finance Management");
						
		Thread.sleep(5000);
						
		//Stage
						
		driver.findElement(By.xpath("//input[@formcontrolname='index_position']")).sendKeys("4");
						
		Thread.sleep(5000);
						
		//Color
						
		driver.findElement(By.xpath("//input[@formcontrolname='checklist_color']")).sendKeys("#A52A2A");
						
		Thread.sleep(5000);
						
		//Edit Control
						
		driver.findElement(By.xpath("//input[@formcontrolname='edit_controll']")).click();
						
		//Submit
						
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
						
		//Name column
						
		String Fund_your_account = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[2]")).getText();
						  
		System.out.println("Fund your account = " + Fund_your_account);	   

		Thread.sleep(5000);
						
		//Name column
						
		String अपने_खाते_में_फंड_डालें = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[3]")).getText();
								  
		System.out.println("अपने खाते में फंड डालें = " + अपने_खाते_में_फंड_डालें);	   

		Thread.sleep(5000);
						
		//Team Column
						
		String Finance_Team = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[4]")).getText();
						  
		System.out.println("Finance Team = " + Finance_Team);	   

		Thread.sleep(5000);
						
		//Stage Column
						
		String Stage_4 = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[4]")).getText();
						  
		System.out.println("4 = " + Stage_4);	   

		Thread.sleep(5000);
						
		//Color Column
						
		String Color = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[6]")).getText();
								  
		System.out.println("#A52A2A = " + Color);	   

		Thread.sleep(5000);
						
		//Edit Controll Column
						
		String Edit_Controll = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[7]")).getText();
										  
		System.out.println("Yes = " + Edit_Controll);	   

		Thread.sleep(5000);
						
		//Is Delete Column
						
		String Is_Delete = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[8]")).getText();
												  
		System.out.println("No = " + Is_Delete);	   

		Thread.sleep(5000);
		
}
@Test
	public void TC_ID_04_08() throws InterruptedException {
	
	//Name
	
	driver.findElement(By.xpath("//input[@formcontrolname='name_en']")).sendKeys("Submit your application");
					
	Thread.sleep(5000);
					
	//Local Name
					
	driver.findElement(By.xpath("//input[@formcontrolname='name_lcl']")).sendKeys("अपने आवेदन जमा करें");
					
	Thread.sleep(5000);
					
	//Team
					
	Select Select_Team = new Select(driver.findElement(By.xpath("//select[@formcontrolname='fk_team']")));
				   	
	Select_Team.selectByVisibleText("IT Management");
					
	Thread.sleep(5000);
					
	//Stage
					
	driver.findElement(By.xpath("//input[@formcontrolname='index_position']")).sendKeys("5");
					
	Thread.sleep(5000);
					
	//Color
					
	driver.findElement(By.xpath("//input[@formcontrolname='checklist_color']")).sendKeys("#FFA500");
					
	Thread.sleep(5000);
					
	//Edit Control
					
	driver.findElement(By.xpath("//input[@formcontrolname='edit_controll']")).click();
					
	//Submit
					
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
					
	//Name column
					
	String Submit_your_application = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[2]")).getText();
					  
	System.out.println("Submit your application = " + Submit_your_application);	   

	Thread.sleep(5000);
					
	//Name column
					
	String अपने_आवेदन_जमा_करें = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[3]")).getText();
							  
	System.out.println("अपने आवेदन जमा करें = " + अपने_आवेदन_जमा_करें);	   

	Thread.sleep(5000);
					
	//Team Column
					
	String IT_Management = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[4]")).getText();
					  
	System.out.println("IT Management = " + IT_Management);	   

	Thread.sleep(5000);
					
	//Stage Column
					
	String Stage_5 = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[4]")).getText();
					  
	System.out.println("5 = " + Stage_5);	   

	Thread.sleep(5000);
					
	//Color Column
					
	String Color = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[6]")).getText();
							  
	System.out.println("#FFA500 = " + Color);	   

	Thread.sleep(5000);
					
	//Edit Controll Column
					
	String Edit_Controll = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[7]")).getText();
									  
	System.out.println("Yes = " + Edit_Controll);	   

	Thread.sleep(5000);
					
	//Is Delete Column
					
	String Is_Delete = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[8]")).getText();
											  
	System.out.println("No = " + Is_Delete);	   

	Thread.sleep(5000);
	
}

@Test
	public void TC_ID_04_09() throws InterruptedException {
		
		//Name
		
		driver.findElement(By.xpath("//input[@formcontrolname='name_en']")).sendKeys("Set up online banking");
						
		Thread.sleep(5000);
						
		//Local Name
						
		driver.findElement(By.xpath("//input[@formcontrolname='name_lcl']")).sendKeys("ऑनलाइन बैंकिंग स्थापित करें");
						
		Thread.sleep(5000);
						
		//Team
						
		Select Select_Team = new Select(driver.findElement(By.xpath("//select[@formcontrolname='fk_team']")));
					   	
		Select_Team.selectByVisibleText("Administration Management");
						
		Thread.sleep(5000);
						
		//Stage
						
		driver.findElement(By.xpath("//input[@formcontrolname='index_position']")).sendKeys("6");
						
		Thread.sleep(5000);
						
		//Color
						
		driver.findElement(By.xpath("//input[@formcontrolname='checklist_color']")).sendKeys("#28282B");
						
		Thread.sleep(5000);
						
		//Edit Control
						
		driver.findElement(By.xpath("//input[@formcontrolname='edit_controll']")).click();
						
		//Submit
						
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		//Name column
		
		String Set_up_online_banking = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[3]")).getText();
										  
		System.out.println("Set up online banking = " + Set_up_online_banking);	   

		Thread.sleep(5000);
		
		//Name column
						
		String ऑनलाइन_बैंकिंग_स्थापित_करें = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[2]")).getText();
						  
		System.out.println("ऑनलाइन बैंकिंग स्थापित करें = " + ऑनलाइन_बैंकिंग_स्थापित_करें);	   

		Thread.sleep(5000);
						
		
						
		//Team Column
						
		String Administration_Management = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[4]")).getText();
						  
		System.out.println("Administration Management = " + Administration_Management);	   

		Thread.sleep(5000);
						
		//Stage Column
						
		String Stage_6 = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[4]")).getText();
						  
		System.out.println("6 = " + Stage_6);	   

		Thread.sleep(5000);
						
		//Color Column
						
		String Color = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[6]")).getText();
								  
		System.out.println("#28282B = " + Color);	   

		Thread.sleep(5000);
						
		//Edit Controll Column
						
		String Edit_Controll = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[7]")).getText();
										  
		System.out.println("Yes = " + Edit_Controll);	   

		Thread.sleep(5000);
						
		//Is Delete Column
						
		String Is_Delete = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[8]")).getText();
												  
		System.out.println("No = " + Is_Delete);	   

		Thread.sleep(5000);
	
	}
	
@Test
public void TC_ID_04_10() throws InterruptedException {
		
								
		//View Icon
						
		driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[9]/span[1]")).click();
		
		//Page Name
		
		String Stages_Details = driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-header/h5]")).getText();
												  
		System.out.println("Stages Details = " + Stages_Details);	   

		Thread.sleep(5000);
		
		//Name Field
		
		String Compare_your_options = driver.findElement(By.xpath("//input[@formcontrolname='name_en']")).getText();
										  
		System.out.println("Compare your options = " + Compare_your_options);	   

		Thread.sleep(5000);
		
		//Local Name Field
						
		String अपने_विकल्पों_की_तुलना_करें = driver.findElement(By.xpath("//input[@formcontrolname='name_lcl']")).getText();
						  
		System.out.println("अपने विकल्पों की तुलना करें = " + अपने_विकल्पों_की_तुलना_करें);	   

		Thread.sleep(5000);
						
		//Team Drop down
						
		String Administration_Management = driver.findElement(By.xpath("//select[@formcontrolname='fk_team']")).getText();
						  
		System.out.println("Administration Management = " + Administration_Management);	   

		Thread.sleep(5000);
						
		//Stage field
						
		String Stage_1 = driver.findElement(By.xpath("//input[@formcontrolname='index_position']")).getText();
						  
		System.out.println("1 = " + Stage_1);	   

		Thread.sleep(5000);
						
		//Color filed
						
		String Color = driver.findElement(By.xpath("//input[@formcontrolname='checklist_color']")).getText();
								  
		System.out.println("#008000 = " + Color);	   

		Thread.sleep(5000);
						
		//Edit Controll checkbox
						
		String Edit_Controll = driver.findElement(By.xpath("//input[@formcontrolname='edit_controll']")).getText();
										  
		System.out.println("Yes = " + Edit_Controll);	   

		Thread.sleep(5000);
						
		//Close Button
						
		String Close_Button = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[8]")).getText();
												  
		System.out.println("Close Button = " + Close_Button);	   

		Thread.sleep(5000);
	
	}
@Test	

public void TC_ID_04_11() throws InterruptedException {
	
	
	//Edit Icon
					
		driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div/c-container/app-checklist/c-col/c-card/c-card-body/div/table/tbody/tr[1]/td[9]/span[3]")).click();
	
		//Page Name
		
				String Update_Stages = driver.findElement(By.xpath("//*[@id=\"verticallyCenteredScrollableModal\"]/c-modal-dialog/c-modal-content/div[2]/c-modal-header/h5")).getText();
														  
				System.out.println("Update Stages = " + Update_Stages);	   

				Thread.sleep(5000);
				
		//Color field
				
				driver.findElement(By.xpath("//input[@formcontrolname='checklist_color']")).clear();
				
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//input[@formcontrolname='checklist_color']")).sendKeys("#008000");
				
				Thread.sleep(5000);
		//Update button		
				driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
				
}

	
	
}
	
	
	