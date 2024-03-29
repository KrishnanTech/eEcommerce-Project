package org.tgp7;
//static data
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateLead  extends BaseClass {

	@BeforeClass
	public void setUp() {
		sheet  = "Sheet1";
	}


	@Test(dataProvider = "fetchData")
	public void createLead(String cName, String fName,String lName,String phone){

		//Page2:welcomepage
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Page3:MyHomepage
		driver.findElement(By.linkText("Leads")).click();

		//Page4:MyLeads
		driver.findElement(By.linkText("Create Lead")).click();

		//Page5:CreateLeads
		//companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		//FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		//LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		//PhoneNo
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phone);
		//clicking the button
		driver.findElement(By.name("submitButton")).click();

		//Page6:ViewLead

	}

	//@DataProvider(name = "fetchData")
	//public String[][] sendData() throws IOException {
	/*
		String[][] data = new String[2][3];


		data[0][1] = "Kumar";
		data[0][2] = "K";

		data[1][0] = "IBM";
		data[1][1] = "Sanjai";
		data[1][2] = "S";

		return data;
	 */		
	//	ReadExcel read = new ReadExcel();
	//	String[][] data = read.readExcel();
	//	return data;

	//	return ReadExcel.readExcel();
	//	}
}


