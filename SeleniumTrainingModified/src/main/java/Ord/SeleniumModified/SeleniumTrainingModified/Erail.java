package Ord.SeleniumModified.SeleniumTrainingModified;
import java.io.IOException;
 
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
 
public class Erail extends Commonmethods {
	static Xls_Reader excel = new Xls_Reader("Book1.xlsx");
	static ExtentReports reports;
	static ExtentTest test;
	
 
	
public static void main(String[] args) throws IOException, InterruptedException {
	TC1();
}
 
	public static void TC1() throws IOException, InterruptedException {
		reports = new ExtentReports("Result.html", true);
		test = reports.startTest("TestName");
		
		prop();
		chrome();
		url(get_value("URL"));
		ID_Clear(get_value("from"));
		ID_sendkeys(get_value("from"), excel.getCellData("Sheet1", 0, 1));
		Thread.sleep(4000);
		XPATH_Click(get_value("sbc"));
		Thread.sleep(2000);
		ID_Clear(get_value("to"));
		ID_sendkeys(get_value("to"), excel.getCellData("Sheet1", 1, 1));
		Thread.sleep(2000);
		XPATH_Click(get_value("bza"));
		Thread.sleep(2000);
		XPATH_Click(get_value("tatkal"));
		XPATH_Click(get_value("classfilter"));
		ID_Click(get_value("gettrains"));
		
		test.log(LogStatus.PASS,"Test passed");
		reports.endTest(test);
		reports.flush();;
			
	}
	
	
}
