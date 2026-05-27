package gitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstcommit {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/?hl=en");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tom___murphy__");
	}

}
