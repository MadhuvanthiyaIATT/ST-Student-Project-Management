package selenium_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class selenium_MockTest_Coding {
public static void main(String[] args) {
	//1.chrome browser,maximize,open URL;
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	//2.id,name,tagname,xpath.css selector,classname;
	driver.findElement(By.id("[@id='name']"));
	driver.findElement(By.name("[text()='value']"));
	driver.findElement(By.cssSelector("[#name]"));
	driver.findElement(By.xpath("[//div['@id=value']"));
	driver.findElement(By.tagName("[button]"));
}
}
