package PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewCustomerss {
	public WebDriver ldriver;
	//constructor
	public AddNewCustomerss(WebDriver rdriver)
	{	
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	//click on Customers Menu
	@FindBy(xpath="//a[@href='#']//p[contains(text(),'Customers')]")	 
	WebElement lnkCustomers_menu;

    //click on customers menu item
	@FindBy(xpath="//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	WebElement lnkCustomers_menuitem;

	//click on Add New Customers
	@FindBy(xpath = "//a[@class='btn btn-primary']/i")	 
	WebElement btnAddnew;

    //Email
	@FindBy(xpath = "//input[@id='Email']")
	WebElement txtEmail;

    //Password
	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPassword;
	
	//FirstName
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement txtFirstName;

   //LastName
	@FindBy(xpath = "//input[@id='LastName']")
	WebElement txtLastName;
	
	//Gender Male
	@FindBy(id = "Gender_Male")
	WebElement MaleGender;

   //Gender Female
	@FindBy(id = "Gender_Female")
	WebElement FeMaleGender;
	
	//Dateof Birth
	@FindBy(xpath = "//input[@id='DateOfBirth']")
	WebElement txtDob;
	
	//Company Name
	@FindBy(xpath = "//input[@id='Company']")
	WebElement txtCompanyName;
	
	//NewsLetter
	@FindBy(xpath = "//div[@class='k-multiselect-wrap k-floatwrap']")
	WebElement txtCustomerRoles;
	
	//Click Manager of Vender
	@FindBy(xpath = "//*[@id='VendorId']")
	WebElement dropdownVendorMgr;

   // This field found in Customers roles dropdown
	@FindBy(xpath = "//li[contains(text(),'Administrators')]")
	WebElement listItemAdministrators;

	  // This field found in Customers roles dropdown
	@FindBy(xpath = "//li[contains(text(),'Registered')]")
	WebElement listItemRegistered;

	  // This field found in Customers roles dropdown
	@FindBy(xpath = "//li[contains(text(),'Guests')]")
	WebElement listItemGuests;

	  // This field found in Customers roles dropdown
	@FindBy(xpath = "//li[contains(text(),'Vendors')]")
	WebElement listItemVendors;
	
    //Admin Comment
	@FindBy(xpath = "//textarea[@id='AdminComment']")
	WebElement txtAdminContent;

	//Click on Save button
	@FindBy(xpath = "//button[@name='save']")
	WebElement btnSave;

	//Actions Methods for web elements

	public String getPageTitle()
	{
		return ldriver.getTitle();
	}

	public void clickOnCustomersMenu() {
		lnkCustomers_menu.click();
	}

	public void clickOnCustomersMenuItem() {
		lnkCustomers_menuitem.click();
	}

	public void clickOnAddnew() {
		btnAddnew.click();
	}

	public void enterEmail(String email)
	{
		txtEmail.sendKeys(email);
	}

	public void enterPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	public void enterFirstName(String firstName)
	{
		txtFirstName.sendKeys(firstName);
	}

	public void enterLastName(String lastName)
	{
		txtLastName.sendKeys(lastName);
	}

	public void enterDob(String dob)
	{
		txtDob.sendKeys(dob);
	}

	public void enterCompanyName(String coName)
	{
		txtCompanyName.sendKeys(coName);
	}

	public void enterAdminContent(String content)
	{
		txtAdminContent.sendKeys(content);
	}
	public void enterManagerOfVendor(String value)
	{
		Select drp=new Select(dropdownVendorMgr);
		drp.selectByVisibleText(value);
	}

	public void enterGender(String gender)
	{
		if(gender.equals("Male"))
		{
			MaleGender.click();
		}
		else if(gender.equals("Female"))
		{
			FeMaleGender.click();
		}
		else//default set Male gender
		{
			MaleGender.click();
		}

	}
	public void clickOnSave()
	{
		btnSave.click();
	}
}
