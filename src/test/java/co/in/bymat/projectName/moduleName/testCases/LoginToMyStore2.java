package co.in.bymat.projectName.moduleName.testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Hashtable;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import co.in.bymat.projectName.moduleName.testBase.TestBase_1;
import co.in.bymat.seleniumTraining.DataCollection;
import co.in.bymat.seleniumTraining.ExcelReader;

public class LoginToMyStore2 extends TestBase_1 {
	
	@BeforeClass
	public void testCaseName() {
		testCaseName = this.getClass().getSimpleName();
	}
	
		@Test (dataProvider="data_Collection")
		public void loginToMyStore(Hashtable<String, String> htdata) throws Exception {
			//test = report.startTest("loginToMyStore2");
			test.log(LogStatus.PASS, "User Navigated to:-"+driver.getTitle());
		//System.out.println("User Navigated to:-"+driver.getTitle());
//		if (driver.getTitle().equalsIgnoreCase("My Store"))
//		System.out.println("My test case is pass");
//		else
//			System.out.println("My test case is fail");
		//Assert.assertEquals(driver.getTitle(),excel.getCellData("Test_Data", "Page_Title", 2) );
			Assert.assertEquals(driver.getTitle(), htdata.get("Page_Title"));
		//System.out.println("Page title verified");
		takeScreenShot();
		test.log(LogStatus.PASS, "Page title verified");
		driver.findElement(By.xpath(or.getProperty("SignIn"))).click();
		//System.out.println("user clicked on sign in button");
		takeScreenShot();
		test.log(LogStatus.PASS, "user clicked on sign in button");
		String pageText = driver.findElement(By.xpath(or.getProperty("CreateAnAccountText"))).getText();
		//Assert.assertEquals(pageText, excel.getCellData("Test_Data", "Page_Text", 2));
		Assert.assertEquals(pageText, htdata.get("Page_Text"));
		//System.out.println("Create an account text has been verified");
		takeScreenShot();
		test.log(LogStatus.PASS, "Create an account text has been verified");
		//driver.findElement(By.xpath(or.getProperty("Email_ID"))).sendKeys(excel.getCellData("Test_Data", "Email_ID", 2));
		driver.findElement(By.xpath(or.getProperty("Email_ID"))).sendKeys(htdata.get("Email_ID"));
		//System.out.println("user entered email address");
		takeScreenShot();
		test.log(LogStatus.PASS, "user entered email address");
		driver.findElement(By.xpath(or.getProperty("Submit_btn"))).click();
		//System.out.println("user clicked on submit button");
		takeScreenShot();
		test.log(LogStatus.PASS, "user clicked on submit button");
		
		
		
		}
}


