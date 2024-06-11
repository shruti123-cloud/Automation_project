package handling_parent_child_windowtab;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import baseclass.Baseclass_1;

public class Class_002 extends Baseclass_1{

	public static void main(String[] args) {{
		launch_browser("chrome");
		navigate_url("https://www.naukri.com/");
		scroll_page(250);
		//click mnc link
		driver.findElement(By.xpath("//span[text()='MNC']")).click();
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
		//click on login button
//driver.findElement(By.xpath("//a[text()='Login']")).click();
driver.findElement(By.xpath("//span[text()='Marketing Jobs']")).click();





		
			}

		

	}

}
