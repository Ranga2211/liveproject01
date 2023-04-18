package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderShippingMethodTab_08 {
	
	public WebDriver driver;
	
	By myCarrierRadioBtn = By.id("delivery_option_2");
	By addCommentField = By.xpath("//textarea[@id='delivery_message']");
	By shippingMethod_continueBtn = By.cssSelector("[name='confirmDeliveryOption']");
	
	
	public OrderShippingMethodTab_08(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getMyCarrierRadioBtn() {
		return driver.findElement(myCarrierRadioBtn);
	}
	
	public WebElement getAddCommentField() {
		return driver.findElement(addCommentField);
	}

	public WebElement getShippingMethod_continueBtn() {
		return driver.findElement(shippingMethod_continueBtn);
	}
}
