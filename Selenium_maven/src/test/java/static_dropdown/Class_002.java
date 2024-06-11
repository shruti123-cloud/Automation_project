package static_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.Baseclass_1;
//with loop
public class Class_002 extends Baseclass_1{

	public static void main(String[] args) {
  launch_browser("chrome");
  navigate_url("https://www.jeevansathi.com/");
//click on dropdown
  WebElement dropdown = driver.findElement(By.xpath("//div[@id='relationshipBlock']"));
  dropdown.click();
  //locate all options
 List<WebElement> options = driver.findElements(By.xpath("//div[@id='relationshipOptions']/ul/li"));
 //find out no. of options
 System.out.println(options.size());
 //choose one option from seven
 for(int i = 0; i<7; i++) {
	 if(options.get(i).getText().equalsIgnoreCase("self")) {
		 options.get(i).click();
	 }
 }
 
  
  
  
		
		
	}

}
