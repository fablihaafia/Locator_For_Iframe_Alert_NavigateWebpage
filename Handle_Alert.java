package LocatorLearningThree;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;

public class Handle_Alert extends DriverSetUp {
	String baseUrl ="https://the-internet.herokuapp.com/javascript_alerts";
	
	@Test
	public void handleAlert() throws InterruptedException {

		driver.get(baseUrl);
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(5000);
		
		String ResultForAlert = driver.findElement(By.id("result")).getText();
		
		System.out.println(ResultForAlert);
		Thread.sleep(5000);
		assertEquals(ResultForAlert, "You successfully clicked an alert");
		Thread.sleep(5000);
		
	    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		System.out.println(alert.getText());
		
		alert.dismiss();
		Thread.sleep(5000);
		ResultForAlert = driver.findElement(By.id("result")).getText();
		assertEquals(ResultForAlert, "You clicked: Cancel");
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		System.out.println(alert.getText());
		alert.sendKeys("hi afia");
		alert.accept();
		Thread.sleep(2000);
		
		
		
	}

}
