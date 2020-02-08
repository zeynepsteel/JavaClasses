package com.hrms.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonaDetailsPageElements {
	@FindBy(id="empPic")
	public WebElement empPicture;
	
	@FindBy(xpath="//div[@id='profile-pic']/h1")
	public WebElement nameOnPicture;
	
	@FindBy(id="personal_txtEmployeeId")
	public WebElement empId;
	
	@FindBy(id="btnSave")
	public WebElement editBtn;
	@FindBy(id="personal_txtLicenNo")
	public WebElement driverLisence;
	@FindBy(id="personal_txtNICNo")
	public WebElement SSN;
	@FindBy(id="personal_txtLicExpDate")
	public WebElement expiryDate;
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	public WebElement selectMonth;
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	public WebElement selectYear;
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr/td")
	public WebElement cellsOfCalendar;
	@FindBy(xpath="//a[@class='ui-datepicker-next ui-corner-all ui-state-hover ui-datepicker-next-hover']")
	public WebElement nextBtn;
	@FindBy(id="personal_txtSINNo")
	public WebElement SIN;
	
	@FindBy(xpath="//label[contains(@for, 'personal_optGender')]")
	public List<WebElement> genderLabels;
	@FindBy(id="personal_optGender_1")
	public WebElement genderMale;
	@FindBy(id="personal_optGender_2")
	public WebElement genderFemale;
	@FindBy(xpath="//select[@id='personal_cmbMarital']")
	public WebElement maritalStatus;
	@FindBy(xpath="//select[@id='personal_cmbNation']")
	public WebElement nationality;
	@FindBy(id="personal_DOB")
	public WebElement doBirthday;
	
	public PersonaDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void validationOfAddedEmployee(String name,String mname, String lastName) {
		String fullName=name+" "+mname+" "+lastName;
		Assert.assertEquals(nameOnPicture.getText(), fullName);
	}
	public void validationOfAddedEmployeeWithoutMiddlename(String name, String lastName) {
		String fullName=name+" "+lastName;
		Assert.assertEquals(nameOnPicture.getText(), fullName);
	}
	
}
