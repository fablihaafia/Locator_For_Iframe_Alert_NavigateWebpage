package LocatorLearningThree;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class Iframe_Checkbox_Radiobutton extends DriverSetUp {

	public static String baseUrl = "https://jqueryui.com/checkboxradio";
	
	@Test
	public void checkIframe() throws InterruptedException {
		driver.get(baseUrl);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//label[@for='radio-1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='radio-3']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='checkbox-2']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='checkbox-nested-4']")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
	
	}
}
