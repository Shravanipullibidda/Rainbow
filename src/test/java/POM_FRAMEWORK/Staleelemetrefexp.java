package POM_FRAMEWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Staleelemetrefexp {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
	//eneter email address
	WebElement UN = driver.findElement(By.xpath("//input[@id='email']"));
	//refresh the page
	//driver.navigate().refresh();
	UN.sendKeys("abc@gmail.com");
	System.out.println("Boss I am from github");
}
}
