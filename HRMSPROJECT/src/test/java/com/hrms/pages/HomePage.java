package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrms.testbase.BaseClass;

public class HomePage extends BaseClass {
	
		
	//public WebElement syntaxLogo=driver.findElement(By.xpath("//div[@id='branding']/a/img"));
	public WebElement welcomeText=driver.findElement(By.id("welcome"));
	public WebElement LEAVE=driver.findElement(By.linkText("Leave"));
	public WebElement addEmployee=driver.findElement(By.id("menu_pim_addEmployee"));
	public final WebElement add() {
	try {
		 WebElement addEmployee=driver.findElement(By.id("menu_pim_addEmployee"));
	return addEmployee;
	}catch(NoSuchElementException e ) {
		System.out.println("check it");
	return null;
	}

	
	}/*public WebElement configuration=driver.findElement(By.linkText("Configuration"));
	public WebElement employeeList=driver.findElement(By.linkText("Employee List"));
	public WebElement reports=driver.findElement(By.linkText("Reports"));*/
	
 
	
}
