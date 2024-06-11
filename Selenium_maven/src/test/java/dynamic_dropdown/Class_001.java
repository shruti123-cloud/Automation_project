package dynamic_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.Baseclass_1;
//from loop
public class Class_001 extends Baseclass_1 {

	public static void main(String[] args) {
		 launch_browser("chrome");
		   navigate_url("https://www.railyatri.in/");
		   scroll_page(200);
		   
		   //locate from city  
		 WebElement from_city = driver.findElement(By.xpath("//input[@id='from_stn_input']"));
		    from_city.sendKeys("mumbai");
		 //locate from city options   
		 List<WebElement> from_city_options = driver.findElements(By.xpath("//ul[@id='ui-id-5']/li"));
		  //choose one option from
		 for(int i = 0; i <from_city_options.size(); i++ ) {
			 if (from_city_options.get(i).getText().contains("MUMBAI CSMT | CSMT")) {//or equal ignore case use
				 from_city_options.get(i).click();
			 }
	}
System.out.println("entered from city is:-"+from_city.getAttribute("value"));
//to city
WebElement to_city = driver.findElement(By.xpath("//input[@id='to_stn_input']"));
to_city.sendKeys("bangalore");
//locate to city options   
List<WebElement> to_city_options = driver.findElements(By.xpath("//ul[@id='ui-id-6']/li"));
 //choose one option to       
for(int x = 0; x <from_city_options.size(); x++ ) {
	 if (to_city_options.get(x).getText().contains("BANGALORE CANT | BNC")) {//or equal ignore case use
		 to_city_options.get(x).click();
	 }
 System.out.println("entered to city is:-"+to_city.getAttribute("value"));



}
}
}

