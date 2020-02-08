package com.hrms.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrms.testbase.PageInitiliazer;

public class CommonMethods extends PageInitiliazer {




	/**
	 * this method will accept the alert
	 * 
	 * @throws will throw NoAlertPresentException if alert is not present
	 */
	public static void acceptAlert() {
		try {
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}catch(NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
	}
	/**
	 * this method will dismiss the alert
	 * 
	 * @throws will throw NoAlertPresentException if alert is not present
	 */
	public static void dismissAlert() {
		try {
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
		}catch(NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
	}
	/**
	 * this method will get a text from the alert
	 * @return text of alert
	 * @throws willl throw NoAlertPresentException if alert is not present
	 */
public static String getAlertText() {
	String msg;
	try {
		Alert alert=driver.switchTo().alert();
	  return alert.getText();
	}catch(NoAlertPresentException e) {
	System.out.println("Alert is not present");
	return null;
	}
	
}
/**
 * this method will switch to the frame
 * @param nameOrId
 */
public static void switchToFrame(String nameOrId) {
	try {
		driver.switchTo().frame(nameOrId);
	}catch(NoSuchFrameException e) {
		System.out.println("frame is not present");
	}
}
/**
 * this method will switch to the frame
 * @param element
 */
public static void switchToFrame(WebElement element) {
	try {
		driver.switchTo().frame(element);
	}catch(NoSuchFrameException e) {
		System.out.println("frame is not present");
	}
}
/**
 * this method will switch to the frame
 * @param index
 */
public static void switchToFrame(int index) {
	try {
		driver.switchTo().frame(index);
	}catch(NoSuchFrameException e) {
		System.out.println("frame is not present");
	}
}
/**
 * this element will click on the element using JSExecutor
 * @param element
 */
	public static void jsClick(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	
}
	/**
	 * this element will scroll until find specified elemt
	 * @param element
	 */
	public static void scrollIntoElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	
}
	/**
	 * this method will scroll page down
	 * @param pixel
	 */
	public static void scrollDown(int pixel) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+pixel+")");
	
}
	/**
	 * this method will scroll page up
	 * @param pixel
	 */
	public static void scrollUp(int pixel) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-"+pixel+")");
	
}
	/**
	 * This method will take a screenshot
	 * 
	 * @param fileName
	 */
	public static byte[] takeScreenshot(String fileName) {

		TakesScreenshot ts = (TakesScreenshot)driver;
		
		byte[]picture=ts.getScreenshotAs(OutputType.BYTES);
	
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MMdd_HHmmss");
		String timeStamp = sdf.format(date.getTime());

		File file = ts.getScreenshotAs(OutputType.FILE);
		String scrshotFile = Constants.SCREENSHOTS_FILEPATH + fileName + timeStamp + ".png";

		try {
			FileUtils.copyFile(file, new File(scrshotFile));
		} catch (IOException e) {
			System.out.println("Cannot take a screenshot");
		}

		return picture;
	}
	/**
	 * this method will enter text
	 * @param element
	 * @param value
	 */
public static void sendText(WebElement element,String value) {
	
	element.clear();
	element.sendKeys(value);	
}
/**
 * this method will create an object of webdriver
 * @return
 */
public static WebDriverWait getWaitObject() {
	WebDriverWait wait=new WebDriverWait(driver,Constants.EXPLICIT_LOADTIME);
	return wait;
}
/**
 * wait for clickable
 * @param element
 */
public static void waitForClickability(WebElement element) {
	getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
}
/**
 * wait for visibilty
 * @param element
 */
public static void waitForVisibility(WebElement element) {
	getWaitObject().until(ExpectedConditions.visibilityOf(element));
}
/**
 * wait for unvisibility
 * @param element
 */
public static void waitForInvisibility(WebElement element) {
	getWaitObject().until(ExpectedConditions.invisibilityOf(element));
}
/**
 * will click on the element
 * @param element
 */
public static void click(WebElement element) {
	waitForClickability(element);
	element.click();
}

/**
 * This method will select value from DD
 * 
 * @param element
 * @param visibleText
 */
public static void selectDdValue(WebElement element, String visibleText) {
	Select select = new Select(element);
	List<WebElement> options = select.getOptions();

	boolean isFound = false;
	for (WebElement option : options) {
		if (option.getText().equals(visibleText)) {
			select.selectByVisibleText(visibleText);
			isFound = true;
			break;
		}
	}

	if (!isFound) {
		System.out.println("Value " + visibleText + "was not found in the dropdown");
	}
}

/**
 * This method will select value from dd
 * 
 * @param element
 * @param index
 */
public static void selectDdValue(WebElement element, int index) {
	Select select = new Select(element);
	List<WebElement> options = select.getOptions();
	boolean isFound = false;
	if (options.size() > index) {
		select.selectByIndex(index);
		isFound = true;
	}

	if (!isFound) {
		System.out.println("Value with index " + index + "was not selected");
	}
}

/**
 * This method will click on the radio based on the text
 * 
 * @param elements
 * @param radioText
 */
public static void clickRadio(List<WebElement> elements, String radioText) {

	for (WebElement el : elements) {

		if (el.getText().equals(radioText)) {
			el.click();
			break;
		}
	}
}

}