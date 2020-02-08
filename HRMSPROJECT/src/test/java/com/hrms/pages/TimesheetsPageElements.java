package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class TimesheetsPageElements extends CommonMethods{
	@FindBy(id="employee")
	public WebElement employeeName;
	@FindBy(xpath="//span[@class='validation-error']")
	public WebElement invalidMsg;
	@FindBy(id="btnView")
	public WebElement buttonView;
	@FindBy(xpath="//div[@class='message warning']")
	public WebElement noTimeSheetFound;
	
	@FindBy(id="btnAddTimesheet")
	public WebElement addTimesheetBtn;
	@FindBy(id="time_date")
	public WebElement dateOfTimesheet;
	
	
	public TimesheetsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void enterEmpName(String name) {
		sendText(employeeName,name);
		
		
	}
}
