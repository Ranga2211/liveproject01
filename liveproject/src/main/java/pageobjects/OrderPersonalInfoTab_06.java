package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPersonalInfoTab_06 {
	
	public WebDriver driver;
	
	By socialTitleMr = By.cssSelector(".radio-inline:nth-of-type(1) [name]");
	By socialTitleMrs = By.cssSelector(".radio-inline:nth-of-type(2) [name]");
	By firstName = By.cssSelector("[name='firstname']");
	By lastName = By.cssSelector("[name='lastname']");
	By email = By.cssSelector("[name='email']");
	By password = By.cssSelector("[name='password']");
	By passwordShowBtn = By.cssSelector("[data-text-show='Show']");
	By dateOfBirth = By.cssSelector("[placeholder='MM/DD/YYYY']");
	By receiveOffersCheckBox = By.cssSelector("div:nth-of-type(7)  span > label > span");
	By signUpNewsletterCheckBox = By.cssSelector("div:nth-of-type(8)  span > label > span");
	By iAgreeCheckBox = By.cssSelector("div:nth-of-type(9)  span > label > input");
	By continueBtn = By.cssSelector("[name='continue']");
	
	public OrderPersonalInfoTab_06(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSocialTitleMr() {
		return driver.findElement(socialTitleMr);
	}
	
	public WebElement getSocialTitleMrs() {
		return driver.findElement(socialTitleMrs);
	}
	
	public WebElement getFirstName() {
		return driver.findElement(firstName);
	}
	
	public WebElement getLastName() {
		return driver.findElement(lastName);
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getPasswordShowBtn() {
		return driver.findElement(passwordShowBtn);
	}
	
	public WebElement getDateOfBirth() {
		return driver.findElement(dateOfBirth);
	}
	
	public WebElement getReceiveOffersCheckBox() {
		return driver.findElement(receiveOffersCheckBox);
	}
	
	public WebElement getSignUpNewsletterCheckBox() {
		return driver.findElement(signUpNewsletterCheckBox);
	}
	
	public WebElement getIAgreeCheckBox() {
		return driver.findElement(iAgreeCheckBox);
	}
	
	public WebElement getContinueBtn() {
		return driver.findElement(continueBtn);
	}

}
