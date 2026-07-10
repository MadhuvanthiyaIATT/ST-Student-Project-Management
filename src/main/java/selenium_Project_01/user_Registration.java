package selenium_Project_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
public class user_Registration {
    public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.dominos.co.in/");
    Thread.sleep(5000);
    WebElement clickBtn = driver.findElement(By.xpath("//a[@class='brand-home__hero-cta']"));
    clickBtn.click();
    WebElement skipBtn = driver.findElement(By.xpath("//span[text()='Skip']"));
    skipBtn.click();
    driver.navigate().to("https://www.dominos.co.in/"); 
    driver.navigate().back(); 
    
    Thread.sleep(3000);   //moe-dontallow_button
    WebElement deliveryNow = driver.findElement(By.xpath("//div[text()='Delivery']"));
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.elementToBeClickable(deliveryNow));
//	deliveryNow.click();/div[@class='order-type-btn btn-1 color-slaty']")).
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", deliveryNow);
    driver.findElement(By.id("root\"]/div[1]/div[1]/div")).sendKeys("Pizza");  
     
    }
}