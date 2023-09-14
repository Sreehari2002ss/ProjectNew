package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@CacheLookup
	
	
	
	@FindBy(name="firstname")
	private WebElement firstName;
	
	@FindBy(name="lastname")
	private WebElement lastName;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement mobileNumber;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(id="day")
	private WebElement day;
	
	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(id="year")
	private WebElement year;
	
	@FindBy(xpath="(//input[@name='sex'])[1]")
	private WebElement female;
	
	@FindBy(xpath="(//input[@name='sex'])[2]")
	private WebElement male;
	
	@FindBy(xpath="(//input[@name='sex'])[3]")
	private WebElement custom;
	
	@FindBy(name="websubmit")
	private WebElement signUp;
	
	@FindBy(xpath="//a[contains(text(),'Already')]")
	private WebElement alreadyHaveAnAccount;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getFemale() {
		return female;
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getCustom() {
		return custom;
	}

	public WebElement getSignUp() {
		return signUp;
	}

	public WebElement getAlreadyHaveAnAccount() {
		return alreadyHaveAnAccount;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
