package co.in.bymat.projectName.moduleName.utility;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import co.in.bymat.projectName.moduleName.testBase.TestBase_1;

public class CommonMethods extends TestBase_1 {

	public static String getPageTitle() {
		
		return driver.getTitle();
	}
	
	public static void clickOnWebElement(String xpath, String WebElementName) throws Exception {
		
		driver.findElement(By.xpath(or.getProperty(xpath))).click();
		test.log(LogStatus.PASS, "User clicked on" +WebElementName);
		takeScreenShot();
	}
	
public static void clickOnButton(String xpath, String button) {
		
		driver.findElement(By.xpath(or.getProperty(xpath))).click();
		test.log(LogStatus.PASS, "User clicked on" +button);
		
	}
public static void enterTextIntoTextBox(String xpath, String text, String TextBoxName) throws Exception {
	
	driver.findElement(By.xpath(or.getProperty(xpath))).sendKeys(text);
	test.log(LogStatus.PASS, "User clicked on" +TextBoxName);
	takeScreenShot();
}
public static String getText(String xpath) {
	
	return driver.findElement(By.xpath(or.getProperty(xpath))).getText();
	
}
}
