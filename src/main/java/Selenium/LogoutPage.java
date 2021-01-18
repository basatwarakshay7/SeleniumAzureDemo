package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage 
{
	private static WebElement element = null;
	
	public static WebElement logoutButton(WebDriver driver) 
	{
		element = driver.findElement(By.xpath("//button[contains(text(),'Logout')]"));
		//element = driver.findElement(By.xpath(".//*[text() = 'Logout']"));
		return element;
	}
}
