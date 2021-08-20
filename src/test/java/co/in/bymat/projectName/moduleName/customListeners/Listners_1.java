package co.in.bymat.projectName.moduleName.customListeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import co.in.bymat.projectName.moduleName.testBase.TestBase_1;

public class Listners_1 extends TestBase_1 implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		try {
			launchBrowser();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
	
	public void onTestSuccess(ITestResult result) {
		try {
			takeScreenShot();
			test.log(LogStatus.PASS, "Execution for Testcase "+testCaseName+" is passed");
			closeBrowser();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void onTestFailure(ITestResult result) {
		try {
			test.log(LogStatus.FAIL, result.getThrowable().getMessage());
			takeScreenShot_Fail();
			test.log(LogStatus.FAIL, "Execution for Testcase "+testCaseName+" has been failed");
			closeBrowser();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
