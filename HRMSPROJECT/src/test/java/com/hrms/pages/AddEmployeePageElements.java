package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;


public class AddEmployeePageElements extends CommonMethods{

	@FindBy(id = "firstName")
	public WebElement firstName;

	@FindBy(id = "middleName")
	public WebElement middleName;
	
	@FindBy(id = "lastName")
	public WebElement lastName;
	
	@FindBy(id = "chkLogin")
	public WebElement createLoginDetails;
	
	@FindBy(id = "user_name")
	public WebElement username;
	
	@FindBy(id = "user_password")
	public WebElement userPassword;
	
	@FindBy(id = "re_password")
	public WebElement confirmUserPassword;
	
	@FindBy(id = "btnSave")
	public WebElement saveBtn;
	
	@FindBy(id = "employeeId")
	public WebElement empId;
	@FindBy(css= "span[class='validation-error']")
	public List<WebElement> errorMsg;//0
	
	
	
public AddEmployeePageElements() {
	PageFactory.initElements(BaseClass.driver, this);
}
public void addEmployee(String empName,String empMiddlename,String empLastname) throws InterruptedException {
	    sendText(firstName,empName);
	    sendText(middleName,empMiddlename);
	    sendText(lastName,empLastname);
}

public void addEmployeeWithDetails(String userName,String password) throws InterruptedException {
    sendText(username,userName);
    sendText(userPassword,password);
    sendText(confirmUserPassword,password);
}

public void saveEmployee() {
	jsClick(saveBtn);
}



}
