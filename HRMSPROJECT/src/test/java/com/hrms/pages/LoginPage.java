package com.hrms.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hrms.testbase.BaseClass;

public class LoginPage extends BaseClass {


public WebElement username=driver.findElement(By.id("txtUsername"));
public WebElement password=driver.findElement(By.id("txtPassword"));
public WebElement loginBtn=driver.findElement(By.id("btnLogin"));
public String noSuchElmt() {
try {
	String text=driver.findElement(By.xpath("//*[@id=\"spanMessage\"]")).getText();
	return text;
}catch(NoSuchElementException e) {
	System.out.println("check it");
	return null;
}

}
public WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']/img"));
final String photoLogin="";

}
