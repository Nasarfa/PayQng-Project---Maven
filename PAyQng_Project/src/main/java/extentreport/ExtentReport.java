package extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	public static ExtentReports extentreport;
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentTest testcase;
	
	public static void extentreport_setupt() {
		extentreport=new ExtentReports();
		extentreport.setSystemInfo("Environment","Automation Report");
		extentreport.setSystemInfo("Host Name", "Local Host");
		extentreport.setSystemInfo("OS", "MAC");
		extentreport.setSystemInfo("Browser Name", "Chrome");
		extentreport.setSystemInfo("Tester Name", "Nasar F");
		htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/Extent Reports/ExtentReport.html");
		htmlreporter.loadXMLConfig("/Users/nasar/eclipse-workspace/PAyQng_Project/src/main/resources/resource/extent_config.xml");
		extentreport.attachReporter(htmlreporter);
		ExtentTest testcase;
	}
}
