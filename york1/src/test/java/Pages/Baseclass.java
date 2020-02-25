package Pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.Browserfactory;

public class Baseclass {

	

	
	
public WebDriver driver;
@BeforeClass
public void setup(){
driver=Browserfactory.startapplication(driver, "Chrome", "http://www.gcrit.com/build3/admin/login.php");
}
@AfterClass
public void shutdown(){
	Browserfactory.quitbrowser(driver);	
}
}
