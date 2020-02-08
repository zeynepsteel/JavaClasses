package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavePeriodElements {
@FindBy (id="btnEdit")
public WebElement editButton;
@FindBy (id="leaveperiod_cmbStartMonth")
public WebElement startMonth;
@FindBy (id="leaveperiod_cmbStartDate")
public WebElement startDate;
@FindBy (id="lblEndDateFollowingYear")
public WebElement endDateFollowingYear;

}
