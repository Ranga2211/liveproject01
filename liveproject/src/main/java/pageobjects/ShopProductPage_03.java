package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopProductPage_03 {
	
	public WebDriver driver;
	
	By sizeDropdown = By.xpath("//select[@id='group_1']");
	By colorOption1 = By.xpath("//ul[@id='group_2']/li[1]//label/input");
	By colorOption2 = By.xpath("//ul[@id='group_2']/li[2]//label/input");
	By quantityNumber = By.cssSelector("[name='qty']");
	By quantityIncreaseButton = By.xpath("//form[@id='add-to-cart-or-refresh']/div[2]/div/div/div/span[3]/button[1]");
	By quantityDecreaseButton = By.xpath("//form[@id='add-to-cart-or-refresh']/div[2]/div/div/div/span[3]/button[2]");
	By addToCartBtn = By.cssSelector("[data-button-action='add-to-cart']");
	By homeLink = By.xpath("//span[.='Home']");
	
	public ShopProductPage_03(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSizeDropDown() {
		return driver.findElement(sizeDropdown);
	}
	
	public WebElement getColorOption1() {
		return driver.findElement(colorOption1);
	}
	
	public WebElement getColorOption2() {
		return driver.findElement(colorOption2);
	}
	
	public WebElement getQuantityNumber() {
		return driver.findElement(quantityNumber);
	}
	
	public WebElement getQuantityIncreaseButton() {
		return driver.findElement(quantityIncreaseButton);
	}
	
	public WebElement getQuantityDecreaseButton() {
		return driver.findElement(quantityDecreaseButton);
	}
	
	public WebElement getAddToCartBtn() {
		return driver.findElement(addToCartBtn);
	}
	
	public WebElement getHomeLink() {
		return driver.findElement(homeLink);
	}

}
