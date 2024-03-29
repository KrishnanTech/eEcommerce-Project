package org.tgp7;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteLead extends BaseClass{

	@BeforeClass
	public void setUp() {
	sheet = "Sheet3";

	}

	@Test(dataProvider = "fetchData")
	public void deleteLead(String phone) throws InterruptedException {
	
		//Page2:welcomepage
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Page3:MyHomepage
		driver.findElement(By.linkText("Leads")).click();

		//Page4:MyLeads
		driver.findElement(By.linkText("Find Leads")).click();

		//Page5:FindLeads
		driver.findElement(By.linkText("Phone")).click();
		Thread.sleep(1500);
		//	driver.findElement(By.name("phoneCountryCode")).sendKeys("1");
		driver.findElement(By.name("phoneNumber")).sendKeys(phone);
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr[1]//a[1]")).click();
		Thread.sleep(1500);
		//Page6:ViewLead
		driver.findElement(By.linkText("Delete")).click();
		
		//Page7:Mylead
	}
}