package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Register extends Pages {

	public Register(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//input[@name='firstName']")
	public WebElement firstName;

	
	@FindBy(xpath="//input[@name='lastName']")
	public WebElement lastName;

	
	@FindBy(xpath="//input[@name='phone']")
	public WebElement phoneNumber;

	@FindBy(xpath="//input[@name='userName']")
	public WebElement emailAddress;
	
	@FindBy(xpath="//input[@name='address1']")
	public WebElement address1;

	@FindBy(xpath="//input[@name='address2']")
	public WebElement address2;
	
	@FindBy(xpath="//input[@name='city']")
	public WebElement cityName;

	@FindBy(xpath="//input[@name='state']")
	public WebElement stateName;
	
	@FindBy(xpath="//input[@name='postalCode']")
	public WebElement postalCode;
	
	@FindBy(xpath="//input[@name='country']")
	public WebElement countyDropdown;
			
	@FindBy(xpath="//input[@name='email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@name='confirmPassword']")
	public WebElement confirmPassword;
	
	@FindBy(xpath="//input[@name='register']")
	public WebElement register;
		
}
