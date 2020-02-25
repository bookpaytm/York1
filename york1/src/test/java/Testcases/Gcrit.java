package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Baseclass;
import Pages.Loginpage;

public class Gcrit extends Baseclass {
	
	
	
	
	
 
@Test
public void launchappliction(){

System.out.println(driver.getTitle());
Loginpage login1=PageFactory.initElements(driver, Loginpage.class);
login1.user1("admin");
login1.pass1("admin@123");
login1.button1();
}
}
