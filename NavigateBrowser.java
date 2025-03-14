package LocatorLearningThree;
import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertNotEquals;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class NavigateBrowser extends DriverSetUp {
	
	public static String baseUrl = "https://www.foodpanda.com.bd/";
	@Test(priority =1 )
	public void navigateToWebpage() throws InterruptedException {
		driver.get(baseUrl);
		System.out.println("Get in foodpanda page");
		driver.navigate().to("https://pathao.com/food/");
		System.out.println("Navigate to pathao food");
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://pathao.com/food/");
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.w3schools.com/jsref/met_win_alert.asp");
		Thread.sleep(3000);
		
		
		
	}

	@Test(priority = 2)
	public void VerifyPageTitle_Assertion() throws InterruptedException {
	    
	    driver.get(baseUrl);
	    System.out.println(driver.getTitle());
	    String currentTitle = driver.getTitle();
	    assertEquals(currentTitle,"Food & Grocery Delivery in Bangladesh | foodpanda");
	    Thread.sleep(3000);
	    
	    SoftAssert softAssert = new SoftAssert();
	    softAssert.assertNotEquals(currentTitle,"Food & Grocery Delivery in Bangladesh | foodpand");
	    softAssert.assertAll();
	    
	   
	}
	
	@Test
	
	public void verifyPageUrl() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		assertNotEquals(driver.getCurrentUrl(), "https://www.foodpanda.com");
		
	}

	
}
