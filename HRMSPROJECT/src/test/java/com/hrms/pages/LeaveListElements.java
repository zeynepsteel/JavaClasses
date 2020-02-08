package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class LeaveListElements {
	 @FindBy(xpath="//a[@class='toggle tiptip']")
	public WebElement leaveListLabel;
	 
	 public LeaveListElements() {
			PageFactory.initElements(BaseClass.driver, this);
		}
}
