package com.hrms.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TimeSheets extends CommonMethods{
	@Given("I am logged into HRMS")
	public void i_am_logged_into_HRMS() {
	   login.login("Admin", "Syntax@123");
	}

	@Given("I navigated to Timesheet menu")
	public void i_navigated_to_Timesheet_menu() {
	    dashboard.navigateTime();
	}

	@When("I enter employee name")
	public void i_enter_employee_name() {
	    time.enterEmpName("ZEYNEEPp CELIK");
	}

	@Then("I click view")
	public void i_click_view() {
		jsClick(time.buttonView);
	}

	@Then("I see error message")
	public void i_see_error_message() {
	    boolean message=time.noTimeSheetFound.isDisplayed();
	    Assert.assertTrue(message);
	}


	@When("I see No Timesheets found text")
	public void i_see_No_Timesheets_found_text() {
		 time.enterEmpName("James Smith");
		 jsClick(time.buttonView);
	}

	@When("i click add timesheet")
	public void i_click_add_timesheet() {
	    jsClick(time.addTimesheetBtn);
	}

	@Then("I select a day to create Timesheet")
	public void i_select_a_day_to_create_Timesheet() {
		sendText(time.addTimesheetBtn,"2020-02-04");
	}

	@Then("I click add timesheet button")
	public void i_click_add_timesheet_button() {
	   click(time.addTimesheetBtn);
	}
	
}
