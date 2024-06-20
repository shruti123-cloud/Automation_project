package handling_parent_child_windowtab;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import baseclass.Baseclass_1;

public class Class_001 extends Baseclass_1{

	public static void main(String[] args) {
launch_browser("chrome");
navigate_url("https://www.salesforce.com/in/");
//click watch demo    
driver.findElement(By.xpath("//a[@label='Watch demo']")).click();
//to capture window id
Set<String> window_id = driver.getWindowHandles();
//pull window id
Iterator<String> it = window_id.iterator();
//to shift parent window
String parent_window_id = it.next();
//to shift child window
String child_window_id = it.next();
//captured windows id
System.out.println("parent window id is :-"+parent_window_id);
System.out.println("child window id is :-"+child_window_id);
//switch parent tab to child tab
driver.switchTo().window(child_window_id);
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//click on user name
driver.findElement(By.xpath("//input[@id='UserFirstName-0Sav']")).sendKeys("abc");
//driver.findElement(By.cssSelector(""))





	
	}

}
