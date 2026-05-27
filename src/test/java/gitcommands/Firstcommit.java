package gitcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstcommit {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Monish");
		driver.get("https://www.facebook.com/login.php/");
	}

}
