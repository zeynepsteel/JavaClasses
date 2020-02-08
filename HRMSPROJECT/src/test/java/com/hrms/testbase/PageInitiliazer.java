package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPagesElements;
import com.hrms.pages.PersonaDetailsPageElements;
import com.hrms.pages.ReportPageElements;
import com.hrms.pages.TimesheetsPageElements;

public class PageInitiliazer extends BaseClass {
	protected static LoginPagesElements login;
	protected static DashboardPageElements dashboard;
	protected static AddEmployeePageElements addEmp;
	protected static PersonaDetailsPageElements pdetails;
	protected static ReportPageElements report;
	protected static TimesheetsPageElements time;
	public static void initializeAllPage() {
	   time=new 	TimesheetsPageElements();
		login = new LoginPagesElements();
		dashboard = new DashboardPageElements();
		addEmp = new AddEmployeePageElements();
		pdetails = new PersonaDetailsPageElements();
	 report=new 	ReportPageElements();
	}
}
