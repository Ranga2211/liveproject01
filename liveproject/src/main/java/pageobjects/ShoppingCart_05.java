package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart_05 {
	
	public WebDriver driver;
	
	By haveAPromocodeBtn = By.linkText("Have a promo code?");
	By promoCodeTextBox = By.cssSelector("[placeholder='Promo code']");
	By addButton = By.xpath("//button/span[.='Add']");
	By proceedToCheckout = By.linkText("PROCEED TO CHECKOUT");
	By deleteIconBtn_FirstItem = By.cssSelector(".cart-items .cart-item:nth-of-type(1) .float-xs-left");
	By deleteIconBtn_SecondItem = By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");
	By cartTotal = By.cssSelector(".cart-total > .value");
	
	public ShoppingCart_05(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getHaveAPromocodeBtn() {
		return driver.findElement(haveAPromocodeBtn);
	}
	
	public WebElement getPromoCodeTextBox() {
		return driver.findElement(promoCodeTextBox);
	}
	
	public WebElement getAddButton() {
		return driver.findElement(addButton);
	}
	
	public WebElement getProceedToCheckout() {
		return driver.findElement(proceedToCheckout);
	}
	
	public WebElement getDeleteIconBtn_FirstItem() {
		return driver.findElement(deleteIconBtn_FirstItem);
	}
	
	public WebElement getDeleteIconBtn_SecondItem() {
		return driver.findElement(deleteIconBtn_SecondItem);
	}
	
	public WebElement getCartTotal() {
		return driver.findElement(cartTotal);
	}
}
