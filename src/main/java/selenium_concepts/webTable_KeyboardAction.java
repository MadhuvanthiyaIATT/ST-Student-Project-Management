package selenium_concepts;

import java.awt.Toolkit;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class webTable_KeyboardAction {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(null, null);
	
	
	
	
	
	
	
}
}
