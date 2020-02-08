package com.hrms.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;



public class DashboardPageElements extends CommonMethods {
	//logo
	@FindBy(xpath="//div[@id='branding']/a/img")
	public WebElement syntaxLogo;
	//welcome admin text
	@FindBy(xpath="//a[@id='welcome']")
	public WebElement welcomeText;
	@FindBy(xpath="//a[@id='aboutDisplayLink']")
	public WebElement about;
	@FindBy(linkText="Change Password")
	public WebElement changePassword;
	@FindBy(linkText="Logout")
	public WebElement logOut;
	//admin menu
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule' ]/b")
	public WebElement admin;
	//user management
	@FindBy(linkText="User Management")
	public WebElement userManagement;
	@FindBy(linkText="Users")
	public WebElement users;
	//job
	@FindBy(linkText="Job")
	public WebElement job;
	@FindBy(linkText="Pay Grades")
	public WebElement payGrades;
	@FindBy(linkText="Job Titles")
	public WebElement jobTitles;
	@FindBy(linkText="Employment Status")
	public WebElement employmentStatus;
	@FindBy(linkText="Job Categories")
	public WebElement jobCategories;
	@FindBy(linkText="Work Shifts")
	public WebElement workShifts;
	//organization menu
	@FindBy(linkText="Organization")
	public WebElement organization;
	@FindBy(linkText="General Information")
	public WebElement generalInformation;
	@FindBy(linkText="Locations")
	public WebElement locations;
	@FindBy(linkText="Structure")
	public WebElement structure;
	//qualification menu
	@FindBy(linkText="Qualifications")
	public WebElement qualifications;
	@FindBy(linkText="Skills")
	public WebElement skills;
	@FindBy(linkText="Education")
	public WebElement education;
	@FindBy(linkText="Licenses")
	public WebElement licenses;
	@FindBy(linkText="Memberships")
	public WebElement memberships;
	//nationalities menu
	@FindBy(linkText="Nationalities")
	public WebElement nationalities;
	//congiguration menu
	@FindBy(linkText="Configuration")
	public WebElement configuration;
	@FindBy(linkText="Email Configuration")
	public WebElement emailConfiguration;
	@FindBy(linkText="Email Subscriptions")
	public WebElement emailSubscriptions;
	@FindBy(linkText="Localization")
	public WebElement localization;
	@FindBy(linkText="Modules")
	public WebElement modules;
	@FindBy(linkText="Social Media Authentication")
	public WebElement socialMediaAuthentication;
	@FindBy(linkText="Register OAuth Client")
	public WebElement registerOAuthClient;
	//PIM Menu
	@FindBy(linkText="PIM")
	public WebElement pim;
	//Configuretion menu
	@FindBy(id="menu_pim_Configuration")
	public WebElement configurationofPIM;
	@FindBy(linkText="Optional Fields")
	public WebElement OptionalFields;
	@FindBy(linkText="Custom Fields")
	public WebElement customFields;
    @FindBy(linkText="Data Import")
	public WebElement dataImport;
    @FindBy(id="Reporting Methods")
	public WebElement reportingMethods;
	@FindBy(linkText="Termination Reasons")
	public WebElement terminationReasons;
	//employee list
	@FindBy(linkText="Employee List")
	public WebElement employeeList;
	//add employee
    @FindBy(linkText="Add Employee")
	public WebElement addEmployee;
    //reports of PIM
	@FindBy(id="menu_core_viewDefinedPredefinedReports")
	public WebElement reportsPim;
	 //Leave
	@FindBy(id="menu_leave_viewLeaveModule")
	public WebElement leave;
	@FindBy(linkText="Leave List")
	public WebElement leaveList;
	
	//Time menu
	@FindBy(xpath="//a[@id='menu_time_viewTimeModule']")
	public WebElement time;
	//TimeSheet
	@FindBy(xpath="//a[@id='menu_time_Timesheets']")
	public WebElement timesheets;
    @FindBy(xpath="//a[@id='menu_time_viewEmployeeTimesheet']")
	public WebElement employeeTimeSheets;
    //attendence
    @FindBy(xpath="//a[@id='menu_attendance_Attendance']")
   	public WebElement attendanceMenu;
    @FindBy(xpath="//a[@id='menu_attendance_viewAttendanceRecord']")
	public WebElement employeeRecords;
    @FindBy(xpath="//a[@id='menu_attendance_configure']")
	public WebElement attendanceRecord;
    //reports
    @FindBy(xpath="//a[@id='menu_time_Reports']")
   	public WebElement reportsMenu;
    @FindBy(xpath="//a[@id='menu_time_displayProjectReportCriteria']")
	public WebElement projectReports;
    @FindBy(xpath="//a[@id='menu_time_displayEmployeeReportCriteria']")
	public WebElement employeeReports;
    @FindBy(xpath="//a[@id='menu_time_displayAttendanceSummaryReportCriteria']")
	public WebElement attendanceSummary;
    //project info
    @FindBy(xpath="//a[@id='menu_admin_ProjectInfo']")
	public WebElement projectInfomenu;
	 @FindBy(xpath="//a[@id='menu_admin_viewCustomers']")
	public WebElement customers;
    @FindBy(xpath="//a[@id='menu_admin_viewProjects']")
	public WebElement projects;
   
	
	//recruitment
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	public WebElement recruitment;
	@FindBy(id="menu_recruitment_viewCandidates")
	public WebElement Candidates;
	@FindBy(id="menu_recruitment_viewJobVacancy")
	public WebElement Vacancy;
	
	//performance menu
	@FindBy(id="menu__Performance")
	public WebElement performance;
	@FindBy(id="menu_performance_Configure")
	public WebElement configureOfPerformance;
	@FindBy(id="menu_performance_searchKpi")
	public WebElement KPIs;
	@FindBy(id="menu_performance_addPerformanceTracker")
	public WebElement tracker;
	@FindBy(id="menu_performance_ManageReviews")
	public WebElement reviews;
	@FindBy(id="menu_performance_searchPerformancReview")
	public WebElement menu_performance_searchPerformancReview;
	
    //Dashboard 
	@FindBy(id="menu_dashboard_index")
	public WebElement dashboard;
	//directory
	@FindBy(id="menu_directory_viewDirectory")
	public WebElement directory;
	
	
	//assign Leave
	@FindBy(xpath="//div[@class='quickLaunge']/a/img[1]")
	public WebElement assignLeave;
	//Leave list
	@FindBy(xpath="//div[@class='quickLaunge']/a/span[text()='Leave List']")
	public WebElement leaveListt;
	//Time Sheets
	@FindBy(xpath="//div[@class='quickLaunge']/a/span[text()='Timesheets']")
	public WebElement timeSheets;
	
	 public DashboardPageElements() {
			PageFactory.initElements(BaseClass.driver, this);
		}
	 
	 public void navigateToLeaveList() {
		 jsClick(leaveList);
		 
		 		 
	 }
	 public void navigateToAddEmployee() {
		 jsClick(pim);
		 jsClick(addEmployee);
		 		 
	 }
	 public void navigateToEmployeeList() {
		 jsClick(pim);
		 jsClick(employeeList);
		 		 
	 }
	 public void verifyLogin() {
		 Assert.assertEquals(welcomeText.getText(), "Welcome Admin");
		    takeScreenshot("loginProperties");
	 }
	 public void navigateReport() {
		 jsClick(pim);
		 jsClick(reportsPim);
	 }
	 public void navigateTime() {
		 jsClick(time);
		 jsClick(timesheets);
		 jsClick(employeeTimeSheets);
		 
	 }
	 
}
