package selenium_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class day_2_basic_selenium {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.navigate().to("https://www.chatgpt.com");
	driver.navigate().back();
	System.out.println(driver.getTitle());
	
}
}
