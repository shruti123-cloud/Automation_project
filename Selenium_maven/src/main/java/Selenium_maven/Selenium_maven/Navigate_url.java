package Selenium_maven.Selenium_maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_url {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//hit url
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox"));
		driver.findElement(By.name("crid"));
		driver.findElement(By.className(""));
		driver.findElement(By.linkText(""));
		driver.findElement(By.partialLinkText(""));
		driver.findElement(By.cssSelector("input#glowDestinationType"));
		
		
		
	
	}

}
