package co.in.bymat.projectName.moduleName.testCases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import co.in.bymat.projectName.moduleName.pages.HomePage;
import co.in.bymat.projectName.moduleName.testBase.TestBase_1;
import co.in.bymat.projectName.moduleName.utility.CommonMethods;

public class LoginToMyStore5 extends TestBase_1 {
	
	@BeforeClass
	public void testCaseName() {
		testCaseName = this.getClass().getSimpleName();
	}
		@Test (dataProvider="data_Collection")
		public void loginToMyStore(Hashtable<String, String> htdata) throws Exception {
		
		HomePage.createAnAccount(htdata);
	
		}
		
}


