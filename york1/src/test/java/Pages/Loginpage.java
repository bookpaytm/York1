package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	
	
	
	
WebDriver driver;
By user=By.name("username");
By pass=By.name("password");
By button=By.id("tdb1");
public Loginpage(WebDriver driver1){
	this.driver=driver1;
}
public void user1(String Uname){
	driver.findElement(user).sendKeys(Uname);
}
public void pass1(String pwd){
	driver.findElement(pass).sendKeys(pwd);
	
}
public void button1(){
	driver.findElement(button).click();
}


}
