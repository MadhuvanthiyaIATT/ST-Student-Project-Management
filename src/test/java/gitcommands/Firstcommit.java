package gitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstcommit {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.get("https://www.facebook.com/login.php/");
	driver.findElement(By.xpath("//input[@autocomplete='username webauthn']")).sendKeys("jonny1234@gmail.com");
	
	}

}
