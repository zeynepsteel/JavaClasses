package com.kayak.testcases;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.kayak.pages.FlightOfKayak;
import com.kayak.pages.MultiCityWebElements;
import com.kayak.utils.CommonMethods;

public class CalendarDemo extends CommonMethods {
	FlightOfKayak flight;
	MultiCityWebElements multi;
	
@Test(enabled=false)
public void swapDestination() throws InterruptedException {
	flight=new FlightOfKayak();
	jsClick(flight.clearFROM.get(0));
	Thread.sleep(3000);
	sendText(flight.FROM.get(0),"New York");
	Thread.sleep(3000);
	jsClick(flight.select_airport.get(1));
	Thread.sleep(3000);
	Actions act1=new Actions(driver);
	act1.release();
	
	
	
	
	jsClick(flight.toDESTINATION.get(0));
	Thread.sleep(3000);
	sendText(flight.sendTextToDestination.get(0),"Dallas");
	Thread.sleep(3000);
	jsClick(flight.select_airport.get(2));
	Thread.sleep(3000);
	
	act1.release();
	jsClick(flight.swapDEPARTURE.get(0));
	
	String val=flight.destinationText.get(0).getText();
	System.out.println(val);
	Thread.sleep(3000);
	//Assert.assertEquals(flight.destinationText.get(0).getAttribute("value"), "Dallas");
}
@Test(enabled=false)
public void oneWay() throws InterruptedException {
	flight=new FlightOfKayak();
	jsClick(flight.roundTrip);
	jsClick(flight.oneWay.get(0));
	jsClick(flight.clearFROM.get(0));
	Thread.sleep(3000);
	
	
	sendText(flight.FROM.get(0),"New York");
	Thread.sleep(3000);
	
	
	jsClick(flight.toDESTINATION.get(0));
	//Thread.sleep(3000);
	sendText(flight.sendTextToDestination.get(0),"Dallas");
	Thread.sleep(3000);
	
	jsClick(flight.oneWayCalendar.get(0));
	boolean flag=false;
	//while(!flag) {
		for(int i=0; i<12; i++) {
			jsClick(flight.nextMonth);
			Thread.sleep(3000);
			//System.out.println(flight.monthYear.get(1).getText());
		if(flight.monthYear.get(1).getText().equals("June 2020")) {
			
			jsClick(flight.dayCELLS.get(15));
			Thread.sleep(3000);
			
					break;
		}
			}
		String textofDATE=flight.textOfONEWAYdate.get(0).getText();
		
		Assert.assertEquals(textofDATE, "Mon 6/15");
	
}


@Test(enabled=true)
public void roundTrip() throws InterruptedException {
	flight=new FlightOfKayak();
	jsClick(flight.clearFROM.get(0));
	sendText(flight.FROM.get(0),"New York");
	Thread.sleep(3000);
	
	
	jsClick(flight.toDESTINATION.get(0));
	//Thread.sleep(3000);
	sendText(flight.sendTextToDestination.get(0),"Dallas");
	Thread.sleep(3000);
	
	
	jsClick(flight.inputDateofDEPARTURE.get(0));
	boolean flag=false;
	//while(!flag) {
		for(int i=0; i<12; i++) {
			jsClick(flight.nextMonth);
			Thread.sleep(3000);
			//System.out.println(flight.monthYear.get(1).getText());
		if(flight.monthYear.get(1).getText().equals("June 2020")) {
			
			jsClick(flight.dayCELLS.get(15));
			Thread.sleep(3000);
		}
		if(flight.monthYear.get(1).getText().equals("September 2020"))	{
			jsClick(flight.dayCELLSofSebtember.get(20));
			Thread.sleep(3000);break;
			
		}
			
		
			}
jsClick(flight.searchButton);
Thread.sleep(4000);
boolean searchText=flight.searchText.isDisplayed();
Thread.sleep(4000);
//Assert.assertTrue(searchText);

}
	
	

@Test(enabled=false)
public void TripBuilder() {
	
}

@Test(enabled=false)
public void cantDecide() {
	
}



}
	
