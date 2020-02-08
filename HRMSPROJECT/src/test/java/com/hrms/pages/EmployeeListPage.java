package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class EmployeeListPage extends CommonMethods {
	@FindBy(xpath="//div[@id='profile-pic']/h1")
	public WebElement verifyName;
	@FindBy(xpath="//table[@id='resultTable']/thead/tr/th")
	public WebElement theadCells;
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr")
	public List<WebElement> tableRows;
	@FindBy(id="empsearch_employee_name_empName")
	public WebElement name;
	@FindBy(id="empsearch_id")
	public WebElement id;
	
	@FindBy(id="empsearch_employee_status")
	public WebElement employeeStatus;
	@FindBy(id="empsearch_sub_unit")
	public WebElement subUnit;
	@FindBy(id="empsearch_termination")
	public WebElement include;
	@FindBy(id="empsearch_supervisor_name")
	public WebElement supervisorName;
	@FindBy(id="empsearch_job_title")
	public WebElement jobTitle;
	@FindBy(id="searchBtn")
	public WebElement searchBtn;
	@FindBy(id="resetBtn")
	public WebElement resetBtn;
	@FindBy(id="btnAdd")
	public WebElement btnAdd;
	@FindBy(id="btnDelete")
	public WebElement btnDelete;
	
	
	public EmployeeListPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	public void deleteEmployee(String id) {
		boolean foundId=false;
		   while(!foundId) {
			   //clicking employee list
			   DashboardPageElements dash=new DashboardPageElements();
			   dash.navigateToEmployeeList();
			 
			   //list of rows
			   
			   List<WebElement> rows=tableRows;
			   for(int i=1; i<rows.size(); i++) {
				   String rowText=rows.get(i-1).getText();
				   if(rowText.contains(id)) {
					   driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+i+"]/td")).click();
						 //delete the employee
						//clicking delete button
						jsClick(btnDelete);
					   System.out.println(id+" employee is deleted");
					   foundId=true;
					   takeScreenshot("deleteemployee");
					   break;
				   }
			   }
	}

	
	}
	

}
