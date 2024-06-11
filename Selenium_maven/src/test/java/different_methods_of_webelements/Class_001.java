package different_methods_of_webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_001 {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.salesforce.com/in/");
//capture title
System.out.println("the title of web page is :-"+driver.getTitle());
//click()
driver.findElement(By.xpath("(//img[@class='card__image'and@loading='lazy'])[1]")).click();
//get text




		
		
	}

}
