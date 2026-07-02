package gitFlow.Real_time_GitWorkflow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverMethods {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	System.out.println(driver.getTitle());
}
}
