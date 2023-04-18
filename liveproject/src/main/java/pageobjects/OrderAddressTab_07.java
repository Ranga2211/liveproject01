package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderAddressTab_07 {
	
	public WebDriver driver;
	
	By firstNameField = By.cssSelector("[name='firstname']");
	By lastNameField = By.cssSelector("[name='lastname']");
	By companyTextbox = By.cssSelector("[name='company']");
	By addressTextbox = By.cssSelector("[name='address1']");
	By addressComplimentTextBox = By.cssSelector("[name='address2']");
	By cityTextbox = By.cssSelector("[name='city']");
	By stateDropdown = By.cssSelector("[name='id_state']");
	By postalCodeTextbox = By.cssSelector("[name='postcode']");
	By countryDropdown = By.cssSelector("[name='id_country']");
	By phoneField = By.cssSelector("[name='phone']");
	By useAddressInvoiceCheckbox = By.id("use_same_address");
	By addressTab_ContinueBtn = By.cssSelector("[name='confirm-addresses']");
	
	
	public OrderAddressTab_07(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getFirstNameField() {
		return driver.findElement(firstNameField);
	}
	
	public WebElement getLastNameField() {
		return driver.findElement(lastNameField);
	}
	
	public WebElement getCompanyTextbox() {
		return driver.findElement(companyTextbox);
	}
	
	public WebElement getAddressTextbox() {
		return driver.findElement(addressTextbox);
	}
	
	public WebElement getAddressComplimentTextBox() {
		return driver.findElement(addressComplimentTextBox);
	}
	
	public WebElement getCityTextbox() {
		return driver.findElement(cityTextbox);
	}
	
	public WebElement getStateDropdown() {
		return driver.findElement(stateDropdown);
	}
	
	public WebElement getPostalCodeTextbox() {
		return driver.findElement(postalCodeTextbox);
	}
	
	public WebElement getCountryDropdown() {
		return driver.findElement(countryDropdown);
	}
	
	public WebElement getPhoneField() {
		return driver.findElement(phoneField);
	}
	
	public WebElement getUseAddressInvoiceCheckbox() {
		return driver.findElement(useAddressInvoiceCheckbox);
	}
	
	public WebElement getAddressTab_ContinueBtn() {
		return driver.findElement(addressTab_ContinueBtn);
	}

}
