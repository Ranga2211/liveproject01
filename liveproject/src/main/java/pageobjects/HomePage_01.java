package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage_01 {
	
	public WebDriver driver;
	
	By toggleBtn = By.cssSelector("div#sidebar > .toggle");
	By homePageLink = By.xpath("//nav[@id='menu']/ul/li[1]");
	By accordionLink = By.xpath("//nav[@id='menu']/ul/li[2]");
	By actionsLink = By.xpath("//nav[@id='menu']/ul/li[3]");
	By browserTabsLink = By.xpath("//nav[@id='menu']/ul/li[4]");
	By buttonsLink = By.xpath("//nav[@id='menu']/ul/li[5]");
	By calculatorjsLink = By.xpath("//nav[@id='menu']/ul/li[6]");
	By contactUsFormTestLink = By.xpath("//nav[@id='menu']/ul/li[7]");
	By datePickerLink = By.xpath("//nav[@id='menu']/ul/li[8]");
	By dropDownCheckboxRadioLink = By.xpath("//nav[@id='menu']/ul/li[9]");
	By fileUploadLink = By.xpath("//nav[@id='menu']/ul/li[10]");
	By hiddenElementsLink = By.xpath("//nav[@id='menu']/ul/li[11]");
	By iframesLink = By.xpath("//nav[@id='menu']/ul/li[12]");
	By loaderLink = By.xpath("//nav[@id='menu']/ul/li[13]");
	By loaderTwoLink = By.xpath("//nav[@id='menu']/ul/li[14]");
	By loginPortalTestLink = By.xpath("//nav[@id='menu']/ul/li[15]");
	By mouseMovementLink = By.xpath("//nav[@id='menu']/ul/li[16]");
	By popupsAndAlertsLink = By.xpath("//nav[@id='menu']/ul/li[17]");
	By predictiveSearchLink = By.xpath("//nav[@id='menu']/ul/li[18]");
	By tablesLink = By.xpath("//nav[@id='menu']/ul/li[19]");
	By testStoreLink = By.xpath("//nav[@id='menu']/ul/li[20]");
	By aboutMeLink = By.xpath("//nav[@id='menu']/ul/li[21]");	
	
	By cookieCloseBtn = By.cssSelector(".close-cookie-warning > span");
	
	public HomePage_01(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getToggleBtn() {
		return driver.findElement(toggleBtn);
	}
	
	public WebElement getHomePAgeLink() {
		return driver.findElement(homePageLink);
	}
	
	public WebElement getAccordionLink() {
		return driver.findElement(accordionLink);
	}
	
	public WebElement getActionsLink() {
		return driver.findElement(actionsLink);
	}
	
	public WebElement getBrowserTabsLink() {
		return driver.findElement(browserTabsLink);
	}
	
	public WebElement getButtonsLink() {
		return driver.findElement(buttonsLink);
	}
	
	public WebElement getCalculatorjsLink() {
		return driver.findElement(calculatorjsLink);
	}
	
	public WebElement getContactUsFormtestLink() {
		return driver.findElement(contactUsFormTestLink);
	}
	
	public WebElement getDatePickerLink() {
		return driver.findElement(datePickerLink);
	}
	
	public WebElement getDropDownCheckboxRadioLink() {
		return driver.findElement(dropDownCheckboxRadioLink);
	}
	
	public WebElement getFileUploadLink() {
		return driver.findElement(fileUploadLink);
	}
	
	public WebElement getHiddenElementsLink() {
		return driver.findElement(hiddenElementsLink);
	}
	
	public WebElement getIframesLink() {
		return driver.findElement(iframesLink);
	}
	
	public WebElement getLoaderLink() {
		return driver.findElement(loaderLink);
	}
	
	public WebElement getLoaderTwoLink() {
		return driver.findElement(loaderTwoLink);
	}
	
	public WebElement getLoginPortalTestLink() {
		return driver.findElement(loginPortalTestLink);
	}
	
	public WebElement getMouseMovementLink() {
		return driver.findElement(mouseMovementLink);
	}
	
	public WebElement getPopupsAndAlertsLink() {
		return driver.findElement(popupsAndAlertsLink);
	}
	
	public WebElement getPredictiveSearchLink() {
		return driver.findElement(predictiveSearchLink);
	}
	
	public WebElement getTablesLink() {
		return driver.findElement(tablesLink);
	}
	
	public WebElement getTestStoreLink() {
		return driver.findElement(testStoreLink);
	}
	
	public WebElement getAboutMeLink() {
		return driver.findElement(aboutMeLink);
	}
	
	public WebElement getCookieCloseBtn() {
		return driver.findElement(cookieCloseBtn);
	}

}
