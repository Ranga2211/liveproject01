package uk.co.automationtestingnew.liveproject;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BasePage;
import pageobjects.HomePage_01;
import pageobjects.OrderAddressTab_07;
import pageobjects.OrderPaymentTab_09;
import pageobjects.OrderPersonalInfoTab_06;
import pageobjects.OrderShippingMethodTab_08;
import pageobjects.ShopContentPanel_04;
import pageobjects.ShopHomePage_02;
import pageobjects.ShopProductPage_03;
import pageobjects.ShoppingCart_05;

public class OrderCompletionTest_01 extends BasePage {

	public OrderCompletionTest_01() throws IOException {
		super();
	}
	
	@BeforeTest
	public void setup() throws IOException {
		driver = getDriver();
		driver.get(getUrl());
		
	}
	
	@Test
	public void placingOrder() throws InterruptedException {
		
		HomePage_01 homePage_01_Obj = new HomePage_01(driver);
		homePage_01_Obj.getCookieCloseBtn().click();
		homePage_01_Obj.getTestStoreLink().click();
		
		ShopHomePage_02 shopHomePage_02_Obj = new ShopHomePage_02(driver);
		shopHomePage_02_Obj.getProductOne().click();
		
		ShopProductPage_03 shopHomePage_03_Obj = new ShopProductPage_03(driver);
		//Have to use select class for dropdowns
		Select sizeOption = new Select(shopHomePage_03_Obj.getSizeDropDown());
		sizeOption.selectByVisibleText("M");
		
		shopHomePage_03_Obj.getColorOption2().click();
		shopHomePage_03_Obj.getQuantityIncreaseButton().click();
		shopHomePage_03_Obj.getAddToCartBtn().click();
		Thread.sleep(2000);
		
		ShopContentPanel_04 shopContentPanel_04 = new ShopContentPanel_04(driver);
		shopContentPanel_04.getProceedToCheckoutBtn().click();
		
		ShoppingCart_05 shoppingCart_05 = new ShoppingCart_05(driver);
		shoppingCart_05.getHaveAPromocodeBtn().click();
		shoppingCart_05.getPromoCodeTextBox().sendKeys("20OFF");
		shoppingCart_05.getAddButton().click();
		Thread.sleep(2000);
		shoppingCart_05.getProceedToCheckout().click();
		
		OrderPersonalInfoTab_06 orderPersonalInfoTab_06 = new OrderPersonalInfoTab_06(driver);
		orderPersonalInfoTab_06.getSocialTitleMr().click();
		orderPersonalInfoTab_06.getFirstName().sendKeys("Test");
		orderPersonalInfoTab_06.getLastName().sendKeys("Test");
		orderPersonalInfoTab_06.getEmail().sendKeys("test1234##@gmail.com");
		orderPersonalInfoTab_06.getIAgreeCheckBox().click();
		Thread.sleep(2000);
		orderPersonalInfoTab_06.getContinueBtn().click();
		
		OrderAddressTab_07 orderAddressTab_07 = new OrderAddressTab_07(driver);
		orderAddressTab_07.getAddressTextbox().sendKeys("Testing");
		orderAddressTab_07.getCityTextbox().sendKeys("citytest");
		Select stateOption = new Select(orderAddressTab_07.getStateDropdown());
		stateOption.selectByIndex(5);
		orderAddressTab_07.getPostalCodeTextbox().sendKeys("55555");
		Select countryOption = new Select(orderAddressTab_07.getCountryDropdown());
		countryOption.selectByVisibleText("United States");
		Thread.sleep(2000);
		orderAddressTab_07.getAddressTab_ContinueBtn().click();
		
		OrderShippingMethodTab_08 orderShippingMethodTab_08 = new OrderShippingMethodTab_08(driver);
		orderShippingMethodTab_08.getAddCommentField().sendKeys("Test");
		Thread.sleep(2000);
		orderShippingMethodTab_08.getShippingMethod_continueBtn().click();
		
		OrderPaymentTab_09 orderPaymentTab_09 = new OrderPaymentTab_09(driver);
		orderPaymentTab_09.getPaymentOption_1RadioBtn().click();
		orderPaymentTab_09.getIAgreeCheckBox().click();
		Thread.sleep(2000);
		orderPaymentTab_09.getPayBtn().click();
		Thread.sleep(2000);
		
		
		
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;
	}

}
