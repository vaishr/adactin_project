/**
 *   File Name: BasicTest.java<br>
 *
 *   Reddy, Vaishnavi<br>
 *   Created: Oct 24, 2016
 *   
 */

package com.sqa.vr.adactin;

import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.*;
import org.testng.*;
import org.testng.annotations.*;

/**
 * BasicTest //ADDD (description of class)
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
public class BasicTest {
	private static String baseURL;
	private static WebDriver driver;
	
	public BasicTest (String baseURL) {
			this.baseURL = baseURL;
			PageFactory.initElements(driver, this);
	}
	
	@BeforeMethod
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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

	/**
	 * @return the baseURL
	 */
	public static String getBaseURL() {
		return baseURL;
	}

	/**
	 * @return the driver
	 */
	public static WebDriver getDriver() {
		return driver;
	}
}
