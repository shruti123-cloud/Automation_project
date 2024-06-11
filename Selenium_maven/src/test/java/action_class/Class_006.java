package action_class;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import baseclass.Baseclass_1;

public class Class_006 extends Baseclass_1 {

	public static void main(String[] args) {
launch_browser("chrome");
navigate_url("https://www.reliancedigital.in/");
try {
	take_screenshot("reliance homepage");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
Actions act = new Actions(driver);
//press button page down
act.sendKeys(Keys.PAGE_DOWN).build().perform();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//press button page up
act.sendKeys(Keys.PAGE_UP).build().perform();
//when to enter in another textbox
act.sendKeys(Keys.TAB).build().perform();








		
	}

}
