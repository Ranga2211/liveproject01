package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopContentPanel_04 {
	
	public WebDriver driver;
	
	By continueShoppingBtn = By.xpath("//button[contains(text(),'Continue shopping')]");
	By proceedToCheckoutBtn = By.cssSelector(".cart-content-btn > .btn-primary");
	
	public ShopContentPanel_04(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getContinueShoppingBtn() {
		return driver.findElement(continueShoppingBtn);
	}
	
	public WebElement getProceedToCheckoutBtn() {
		return driver.findElement(proceedToCheckoutBtn);
	}

}
