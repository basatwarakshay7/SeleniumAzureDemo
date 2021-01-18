package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	private static WebElement element = null;
	public static WebElement userName(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"));
		return element;
	}
	public static WebElement password(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]"));
		return element;
	}
	public static WebElement loginButton(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		return element;
	}
}
