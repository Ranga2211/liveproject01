package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPaymentTab_09 {
	
	public WebDriver driver;
	
	By paymentOption_1RadioBtn = By.id("payment-option-1");
	By paymentOption_2RadioBtn = By.id("payment-option-2");
	By iAgreeCheckBox = By.id("conditions_to_approve[terms-and-conditions]");
	By termsOfServiceLink = By.xpath("//a[.='terms of service']");
	By payBtn = By.cssSelector("div#payment-confirmation > div > button");
	
	public OrderPaymentTab_09(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getPaymentOption_1RadioBtn() {
		return driver.findElement(paymentOption_1RadioBtn);
	}
	
	public WebElement getPaymentOption_2RadioBtn() {
		return driver.findElement(paymentOption_2RadioBtn);
	}
	
	public WebElement getIAgreeCheckBox() {
		return driver.findElement(iAgreeCheckBox);
	}
	
	public WebElement getTermsOfServiceLink() {
		return driver.findElement(termsOfServiceLink);
	}
	
	public WebElement getPayBtn() {
		return driver.findElement(payBtn);
	}


}
