package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ReportPageElements {
	@FindBy(id="search_search")
	public WebElement reportName;
	@FindBy(name="_search")
	public WebElement search;
	@FindBy(xpath="//input[@class='searchBtn']")
	public WebElement searchBtn;
	@FindBy(xpath="//input[@class='reset hover']")
	public WebElement resetBtn;
	
	@FindBy(id="btnAdd")
	public WebElement addBtn;
	@FindBy(id="btnDelete")
	public WebElement deleteBtn;
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr/td[1]")
	public WebElement selectFirstResultcheck;
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr/td[2]")
	public WebElement selectfirstResult;
	
	
	public ReportPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
