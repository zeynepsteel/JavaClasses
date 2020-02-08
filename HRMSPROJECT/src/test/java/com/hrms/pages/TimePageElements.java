package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class TimePageElements {
@FindBy(id="time_startingDays")
public WebElement daySelect;
@FindBy(xpath="//input[@id='btnSave']")
public WebElement saveBtn;
public TimePageElements() {
	PageFactory.initElements(BaseClass.driver, this);
}
}
