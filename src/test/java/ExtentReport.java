import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	public static void main(String[] args) 
	{
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test = extent.createTest("Login","This is a test to validate Login to Angular Project");
		

	}

}
