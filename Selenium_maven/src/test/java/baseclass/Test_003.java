package baseclass;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test_003 extends Baseclass_1{
	public static String month_year;

	public static void main(String[] args) {
launch_browser("chrome");
navigate_url("https://www.railyatri.in/");
scroll_page(200);
//locate from city  
WebElement from_city = driver.findElement(By.xpath("//input[@id='from_stn_input']"));
from_city.sendKeys("hinganghat");
//locate from city options   
List<WebElement> from_city_options = driver.findElements(By.xpath("//ul[@id='ui-id-5']/li"));
//choose one option from
for(int i = 0; i <from_city_options.size(); i++ ) {
if (from_city_options.get(i).getText().contains("HINGANGHAT | HGT")) {
from_city_options.get(i).click();
 }    
}
System.out.println("entered from city is:-"+from_city.getAttribute("value"));
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
//to city
WebElement to_city = driver.findElement(By.xpath("//input[@id='to_stn_input']"));
to_city.sendKeys("chandrapur");
//locate to city options   
List<WebElement> to_city_options = driver.findElements(By.xpath("(//ul[@id='ui-id-6']//li)[1]"));
//choose one option to       
for(int x = 0; x <to_city_options.size(); x++ ) {
if (to_city_options.get(x).getText().contains("CHANDRAPUR | CD")) {
to_city_options.get(x).click();
}
System.out.println("entered to city is:-"+to_city.getAttribute("value"));

//click on calender
WebElement date_dropdown = driver.findElement(By.cssSelector("input#datepicker_train"));
date_dropdown.click();

while (true) {
	 //capture month and year
String month_year = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
if(!(month_year.equalsIgnoreCase("June 2024"))) {
	//click next button
	driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
}
else {
	break;
}}
//select date
driver.findElement(By.xpath("//td[text()='9']")).click();
//capture selected month
System.out.println("selected month is :-"+month_year);
//CAPTURE SELECTED date
System.out.println("selected date is :-"+date_dropdown.getAttribute("value"));

	}
try {
	take_screenshot("train");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//search train
driver.findElement(By.xpath("//button[@id='search_btn_dweb']")).click();
scroll_page(200);
try {
	take_screenshot("train");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 //book now
 driver.findElement(By.xpath("(//button[text()='Book Now'])[1]")).click();
try {
	take_screenshot("book now");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//scroll page
scroll_page(300);
//locate gender
driver.findElement(By.xpath("(//li[text()='Female'])[1]")).click();
 //send full name
driver.findElement(By.xpath("//input[@id='adult_add_fullname']")).sendKeys("Shruti Kirtane");
//age
driver.findElement(By.xpath("//input[@class='inputText ageinput']")).sendKeys("21");
//berth
 driver.findElement(By.xpath("//input[@id='adult_add_berth']")).click();
//save
 driver.findElement(By.xpath("//button[text()=' Save ']")).click();
try {
	take_screenshot("details");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
scroll_page(200);
//email
driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("shrutikirtane83@gmail.com");
//phone no.
driver.findElement(By.xpath("//input[@name='phone_no']")).sendKeys("8767346716");
//irctc user id
driver.findElement(By.xpath("//input[@id='no_call_irctc']")).sendKeys("maheshkhere11");
//verify
driver.findElement(By.xpath("//button[@id='verifyIdBtn']")).click();
try {
	take_screenshot("verify");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//continue
driver.findElement(By.xpath("//div[text()='Continue ']")).click();



		
		
	
}}
