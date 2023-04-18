package uk.co.automationtestingnew.liveproject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BasePage;
import pageobjects.HomePage_01;
import pageobjects.ShopContentPanel_04;
import pageobjects.ShopHomePage_02;
import pageobjects.ShopProductPage_03;
import pageobjects.ShoppingCart_05;

public class AddRemoveItemFromBasketTest_02 extends BasePage{

	public AddRemoveItemFromBasketTest_02() throws IOException {
		super();
	}

	@BeforeTest
	public void setUp() throws IOException {
		driver = getDriver();
		driver.get(getUrl());
	}

	@Test
	public void AddRemoveProductsFromCartTest() throws InterruptedException {

		//Step-1 : Closing cookies popup and clicking teststore link
		HomePage_01 homePage_01_Obj = new HomePage_01(driver);
		homePage_01_Obj.getCookieCloseBtn().click();
		homePage_01_Obj.getTestStoreLink().click();

		//Step-2 : Clicking product one
		ShopHomePage_02 shopHomePage_02_Obj = new ShopHomePage_02(driver);
		shopHomePage_02_Obj.getProductOne().click();

		//Step-3 : Choosing size,color,quantity, and clicking Add to cart button
		ShopProductPage_03 shopHomePage_03_Obj = new ShopProductPage_03(driver);
		Select sizeOption = new Select(shopHomePage_03_Obj.getSizeDropDown());
		sizeOption.selectByVisibleText("M");
		shopHomePage_03_Obj.getColorOption2().click();
		shopHomePage_03_Obj.getQuantityIncreaseButton().click();
		shopHomePage_03_Obj.getAddToCartBtn().click();
		Thread.sleep(2000);

		//Step-4 : Clicking continue shopping
		ShopContentPanel_04 shopContentPanel_04_Obj = new ShopContentPanel_04(driver);
		shopContentPanel_04_Obj.getContinueShoppingBtn().click();

		//Step-5 : Clicking home link
		shopHomePage_03_Obj.getHomeLink().click();

		//Step-6 : selecting product two in home page
		shopHomePage_02_Obj.getProductTwo().click();

		//Step-6 : Choosing size,quantity, and clicking Add to cart button
		//sizeOption.selectByVisibleText("XL");
		for(int i=0; i<3; i++) {
			Thread.sleep(2000);
			shopHomePage_03_Obj.getQuantityIncreaseButton().click();
		}
		shopHomePage_03_Obj.getAddToCartBtn().click();
		Thread.sleep(2000);

		//Step-7 : Click Proceed to check out button
		shopContentPanel_04_Obj.getProceedToCheckoutBtn().click();
		Thread.sleep(2000);

		//Step-8 : Delete second product in the cart list
		ShoppingCart_05 shoppingCart_05_Obj = new ShoppingCart_05(driver);
		shoppingCart_05_Obj.getDeleteIconBtn_SecondItem().click();

		//Step-9 : Wait till second product item deleted successfully, as it will return the total value correctly
		WebDriverWait waitTillProductDeletion = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitTillProductDeletion.until(ExpectedConditions.invisibilityOf(shoppingCart_05_Obj.getDeleteIconBtn_SecondItem()));

		Assert.assertEquals(shoppingCart_05_Obj.getCartTotal().getText(), "$45.24");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;
	}

}
