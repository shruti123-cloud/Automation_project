package static_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.Baseclass_1;
//without loop select brother
public class Class_003   extends Baseclass_1 {

	public static void main(String[] args) {
		 launch_browser("chrome");
		  navigate_url("https://www.jeevansathi.com/");
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//click on dropdown
		  WebElement dropdown = driver.findElement(By.xpath("//div[@id='relationshipBlock']"));
		  dropdown.click();
		  //click brother
		  driver.findElement(By.xpath("(//div[@id='relationshipOptions']//li)[4]")).click();
		 //System.out.println("selcted option is :-"+dropdown.getAttribute("value"));
   //String option_name = driver.findElement(By.xpath("//div[@id='relationship']")).getAttribute("value");  
	//System.out.println("selected option is :-"+option_name);	  
		  
	}

}
