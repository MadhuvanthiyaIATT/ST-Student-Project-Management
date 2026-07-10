package selenium_Project_01;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class seleniumProject_Dominos {
public static void main(String[] args) throws InterruptedException, IOException {
	//1.User Registration
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.dominos.co.in/");
Thread.sleep(5000);
//2. User Registration
driver.findElement(By.xpath("//a[text()='CORPORATE ENQUIRY']")).click();
driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Dharshini");	
driver.findElement(By.xpath("//input[@id='organisation']")).sendKeys("IAT Tachnology");	
driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8790654321");
driver.findElement(By.xpath("//input[@id='emailid']")).sendKeys("dharshini1421@gmail.com");
driver.findElement(By.xpath("//input[@id='location']")).sendKeys("R.V Tower,Guindy,Chennai,TamilNadu");
driver.findElement(By.xpath("//input[@class='form-input with-icon hasDatepicker']")).sendKeys("04-07-2026");
driver.findElement(By.xpath("//textarea[@id='query']")).sendKeys("Need information about corporate orders");
driver.findElement(By.xpath("//button[@id='corporatesubmit']")).click();
//3.User Login
driver.navigate().to("https://www.dominos.co.in/");
//4.Restaurant Search
driver.findElement(By.xpath("//a[@class='brand-home__hero-cta']")).click();
driver.findElement(By.xpath("//span[text()='Skip']")).click();
JavascriptExecutor js = (JavascriptExecutor) driver;
Thread.sleep(5000);
driver.findElement(By.xpath("//span[text()='Garlic Bread & Dips']")).click();
WebElement addCart_1 = driver.findElement(By.xpath("(//button[text()=' Add '])[1]"));
js.executeScript("arguments[0].click();", addCart_1);
driver.findElement(By.xpath("//span[text()='Desserts ']")).click();
WebElement addCart_2=driver.findElement(By.xpath("(//button[text()=' Add '])[1]"));
js.executeScript("arguments[0].click();",addCart_2);
driver.findElement(By.xpath("//span[text()='Chicken Feast ']")).click();
WebElement addCart_3=driver.findElement(By.xpath("(//button[text()=' Add '])[1]"));
js.executeScript("arguments[0].click();",addCart_3);
driver.findElement(By.xpath("//span[text()='View Cart']")).click();
//TakeScreenshot 
TakesScreenshot ts=(TakesScreenshot) driver;
File sourceFile = ts.getScreenshotAs(OutputType.FILE);
File targetFolder=new File("./Screenshot/viewCart.png");
FileUtils.copyFile(sourceFile, targetFolder);

//Product 1 Verify
String product1 = driver.findElement(By.xpath("//span[text()='Cheese Lava Golden Corn']")).getText();
if(product1.equals("Cheese Lava Golden Corn")) {
	System.out.println("Product 1 Verified Successfully");
}else {
	System.out.println("Product 1 Verification Failed");
}
//Product 2 Verify
String product2 = driver.findElement(By.xpath("//span[text()='Garlic Breadsticks + Beverage']")).getText();
if(product2.equals("Garlic Breadsticks + Beverage")) {
	System.out.println("Product 2 Verified Successfully");
}else {
	System.out.println("Product 2 Verification Failed");
}
//Product 3 Verify
/*String product3 = driver.findElement(By.xpath("//span[text()='Cheese Lava Spiced Double Chicken ]")).getText();
if(product3.equals("Cheese Lava Spiced Double Chicken")) {
	System.out.println("Product 3 Verified Successfully");
}else {
	System.out.println("Product 3 Verification Failed");
}*/
//Total Amount Verify
String total = driver.findElement(By.xpath("//div[@class='fs-14 medium fs-14']")).getText();
System.out.println("Total="+ total);
if(total.contains("₹1060.50")) {
	System.out.println("Total Amount Verified Successfully");
}else {
	System.out.println("Total Amount Verification Failed");
}
//Apply Coupon
String coupon = driver.findElement(By.xpath("//p[text()='Apply Coupon']")).getText();
if(coupon.equals("Apply Coupon")) {
	System.out.println("Coupon Option Available");
}else {
	System.out.println("Coupon Option Not Available");
}
//Delivery Charge
String delivery_charge = driver.findElement(By.xpath("//div[text()='Delivery Charges ']")).getText();
System.out.println("Delivery="+delivery_charge);
if(delivery_charge.contains("FREE")) {
	System.out.println("Delivery Charge Verified Successfully");
}else {
	System.out.println("Delivery Charge Verification Failed");
}
//TAX
String taxes = driver.findElement(By.xpath("//span[text()=' ₹83.50']")).getText();
System.out.println("Taxes&Charges="+taxes);
if(taxes.contains("FREE")) {
	System.out.println("Taxes&Charges Verified Successfully");
}else {
	System.out.println("Taxes&Charges Verification Failed");
}
//Add Address Verify
String address = driver.findElement(By.xpath("//button[text()='Add Address']")).getText();
if(address.equals("Add Address")) {
	System.out.println("Add Address Button Verified");
}else {
	System.out.println("Add Address Button Not Found");
}
//Add Address
driver.findElement(By.xpath("//button[text()='Add Address']")).click();
driver.findElement(By.xpath("(//input[@name='BuildingNumber']")).sendKeys("No.119");
driver.findElement(By.xpath("//span[text()='Home']")).click();
driver.findElement(By.xpath("//label[text()='Your Name']")).sendKeys("Dharshini");
driver.findElement(By.xpath("//label[text()='Your Contact Number*']")).sendKeys("8790654321");
driver.findElement(By.xpath("//span[text()='Save Address']")).click();
driver.findElement(By.xpath("//span[text()='Pay']")).click();
//ScreenShot
TakesScreenshot tsh=(TakesScreenshot) driver;
File SourceFile2=tsh.getScreenshotAs(OutputType.FILE);
File targetFolder2=new File("./ScreenShot/PaymentPage.png");
FileUtils.copyFile(SourceFile2, targetFolder2);
driver.quit();

}}
