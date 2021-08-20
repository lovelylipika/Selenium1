package co.in.bymat.projectName.moduleName.pages;

import java.util.Hashtable;

import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import co.in.bymat.projectName.moduleName.testBase.TestBase_1;
import co.in.bymat.projectName.moduleName.utility.CommonMethods;

public class HomePage extends TestBase_1{
	
	public static void createAnAccount(Hashtable<String, String> htdata) throws Exception {
		
		Assert.assertEquals(CommonMethods.getPageTitle(), htdata.get("Page_Title"));//verification
		test.log(LogStatus.PASS, "Page title has been verified");
		
		CommonMethods.clickOnWebElement("SignIn", "Sign In Button");
	
		Assert.assertEquals(CommonMethods.getText("CreateAnAccountText"), htdata.get("Page_Text"));//Verification
		test.log(LogStatus.PASS, "Create an account text has been verified");
		takeScreenShot();
		
		CommonMethods.enterTextIntoTextBox("Email_ID", htdata.get("Email_ID"), "Email address");//step

		CommonMethods.clickOnWebElement("Submit_btn", "Submit Button");//step
	

}
	

	public static void alreadyRegistered() {

}
}
