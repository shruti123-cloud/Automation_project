package action_class;  //copy paste


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.Baseclass_1;

public class Class_008  extends Baseclass_1{

	public static void main(String[] args) {
launch_browser("chrome");
navigate_url("https://www.facebook.com/");
//locate email textbox
 WebElement email = driver.findElement(By.cssSelector("input#email"));
 //locate pass textbox
 WebElement password = driver.findElement(By.cssSelector("input#pass"));
 //actions class
 Actions act = new Actions(driver);
 //send input  (by using action class)
 act.sendKeys(email, "shruti").build().perform();
 //press control a   select
 act.moveToElement(email).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
 //press control c    copy
 act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
 //press tab to shift password
 act.keyDown(Keys.TAB).build().perform();
 //press control v      paste
 act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
 
 

 
 

 
	}

}
