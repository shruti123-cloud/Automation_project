package alert_handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import baseclass.Baseclass_1;

public class Simple_alert extends Baseclass_1{

	public static void main(String[] args) {
launch_browser("chrome");
navigate_url("https://demoqa.com/alerts");
scroll_page(100);
//click on button 
driver.findElement(By.cssSelector("button#alertButton")).click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//switch alert
  Alert al = driver.switchTo().alert();
//to click ok button
  al.accept();
  //to click on cancel button
  al.dismiss();
	}

}
