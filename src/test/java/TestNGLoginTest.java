
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Selenium.LoginPage;
import Selenium.LogoutPage;


public class TestNGLoginTest 
{
	
	ExtentSparkReporter htmlReporter;
	static ExtentReports extent;
	static ExtentTest test;
	static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest()
	{   
		htmlReporter = new ExtentSparkReporter("extentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/java/utilities/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
	}
	 
	@Test
	public static void Login() throws Exception
	{
		test = extent.createTest("Login","This is a test to validate Login to Angular Project");
		String baseurl = "https://angular-spring-demo.azurewebsites.net/";
		
		driver.get(baseurl);
		test.pass("Navigated to Website");
		
		driver.manage().window().maximize();
		String expectedTitle = "AngularFrontend";
		String actualTitle = driver.getTitle();
		
		System.out.println("Actual title is = "+actualTitle);
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Verify Title Test Case Passed");
		}
		else
		{
			System.out.println("Verify Title Test Case Failed");
		}
		
		test.pass("Comparison of Website Title Done");
		/*LoginPage.userName(driver).sendKeys("admin");  // Remove following lines when we run full pipeline
		test.pass("Entered UserName");
		LoginPage.password(driver).sendKeys("password");
		test.pass("Entered Password");
		LoginPage.loginButton(driver).click();
		test.pass("Clicked Login Button");
		Thread.sleep(5000);
		//LogoutPage.logoutButton(driver).click();
		//test.pass("Clicked Logout Button");
		
		/*
		if(baseurl.equalsIgnoreCase("http://localhost:4200/login?returnUrl=%2Fhome"))
		{
		
		//driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("admin");
		
		//driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("password");
		
		//driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		System.out.println("Login Tese Case Passed");
		}
		else
		{
			System.out.println("Login Tese Case Failed");
		}
		String url = driver.getCurrentUrl();
		//System.out.println("url is ="+url);
		
		if(driver.getCurrentUrl().equalsIgnoreCase("http://localhost:4200/login?returnUrl=%2Fhome"))
		{
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath(".//*[text() = 'Logout']"));
		//System.out.println("Logout Element is ="+element);
		element.click();
		System.out.println("Logout Tese Case Passed");
		}
		else
		{
			//System.out.println("Logout Tese Case Failed");
		}
		driver.close();
		*/
		
	}
	
	@AfterTest
	public void TearDownTest()
	{
		driver.close();
		driver.quit();
		test.pass("Test Execution Completed Successfully");
		extent.flush();
		System.out.println("Test Completed Successfully");
	}

}
