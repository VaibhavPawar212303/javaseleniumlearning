package base;

import java.io.File;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Constants;

public class baseTest {
	public static WebDriver driver;
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest logger;

	@BeforeTest
	public void beforeTestMethod() {
		sparkReporter = new ExtentSparkReporter(
				System.getProperty("user.dir") + File.separator + "reports" + File.separator + "Framework");
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		sparkReporter.config().setTheme(Theme.DARK);
		//extent.setSystemInfo();
		//extent.setSystemInfo();
		sparkReporter.config().setDocumentTitle("Automation Reprt");
		sparkReporter.config().setReportName("Framework test");
	}

	@BeforeMethod
	//@Parameters("browser")
	public void beforeMethodMethod(@Optional("chrome") String browser, Method testmethod) {
		logger = extent.createTest(testmethod.getName());
		setupDriver(browser);
		driver.manage().window().maximize();
		driver.get(Constants.url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	}

	@AfterMethod
	public void afterMethod(ITestResult result ) {
   if(result.getStatus() == ITestResult.FAILURE) {
	   logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()
			   + " - Test case failed", ExtentColor.RED));
	   logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable()
			   + " - Test case failed", ExtentColor.RED)); }
	   else if(result.getStatus() == ITestResult.SKIP) {
		   logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()
				   + " - Test case skipped", ExtentColor.ORANGE)) ;
	   }
	   else if(result.getStatus() == ITestResult.SUCCESS) {
		   logger.log(Status.PASS, MarkupHelper.createLabel(result.getName()
				   + " - Test case pass", ExtentColor.GREEN)) ; }
	  driver.quit();
	   
   }
		
		
	

	@AfterTest
	public void afterTest() {
		extent.flush();
	}

	private void setupDriver(String browser) {
		// TODO Auto-generated method stub
		if (browser.equalsIgnoreCase("chrome")) {
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

	}
}