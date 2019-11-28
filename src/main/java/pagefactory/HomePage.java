package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Pages{

	public HomePage(WebDriver driver){
		super(driver);
	}

	@FindBy(xpath="//a[contains(text(),'REGISTER')]")
	public WebElement register1;
	
}
