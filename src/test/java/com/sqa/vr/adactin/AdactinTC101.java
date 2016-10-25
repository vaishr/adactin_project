package com.sqa.vr.adactin;
import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.*;
import org.testng.annotations.*;

/**
 *   File Name: AdactinTC101.java<br>
 *
 *   Reddy, Vaishnavi<br>
 *   Created: Oct 24, 2016
 *   
 */

/**
 * AdactinTC101 //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Reddy, Vaishnavi
 * @version     1.0.0
 * @since       1.0
 *
 */
public class AdactinTC101 {
	private static String baseURL = "http://adactin.com/HotelAppBuild2";
	private static WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testLogin() throws InterruptedException {
		String actualPageTitle;
		String expectedPageTitle = "AdactIn.com - Search Hotel";
		AdactinLogin homePage = new AdactinLogin(driver);
		homePage.login("SQABCOct3", "sqaadmin2016");
		actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
	}
}


