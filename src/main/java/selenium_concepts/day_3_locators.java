package selenium_concepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class day_3_locators {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	
	
	driver.manage().window().maximize();
	driver.get("https://automationexercise.com");
	WebElement btnSignUP = driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
	btnSignUP.click();
	WebElement element= driver.findElement(By.name("name"));
element.sendKeys("Vijii");
    	WebElement mail=driver.findElement(By.cssSelector("input[data-qa='signup-email']"));
	mail.sendKeys("Vijigra@gmail.com");
	WebElement signup=driver.findElement(By.cssSelector("button[data-qa='signup-button']"));
	signup.click();
	WebElement title=driver.findElement(By.id("id_gender1"));
	title.click();
	WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
	pass.sendKeys("2905.47#06");
	WebElement first=driver.findElement(By.xpath("//input[@id='first_name']"));
	first.sendKeys("Vijaya");
	WebElement last=driver.findElement(By.xpath("//input[@id='last_name']"));
	last.sendKeys("Lakshmi");
	WebElement company=driver.findElement(By.xpath("//input[@id='company']"));
	company.sendKeys("ZOHO");
	WebElement address=driver.findElement(By.xpath("//input[@id='address1']"));
address.sendKeys("Plot No.140 & 151,GST Road,Vallancherry Village,Chengalpattu Dist,TN-02");	
	WebElement address2=driver.findElement(By.xpath("//input[@id='address2']"));
	address2.sendKeys("Velacharry village,Chengalpattu dist,TamilNadu-02");
	WebElement state =driver.findElement(By.xpath("//input[@id='state']"));
	state.sendKeys("TamilNadu");
	WebElement city=driver.findElement(By.xpath("//input[@id='city']"));
	city.sendKeys("Chennai");
	WebElement code=driver.findElement(By.xpath("//input[@id='zipcode']"));
	code.sendKeys("0529-472006");
	WebElement number=driver.findElement(By.xpath("//input[@id='mobile_number']"));
	number.sendKeys("8925491567");
	WebElement create=driver.findElement(By.xpath("//button[@data-qa='create-account']"));
	create.click();
	WebElement button =driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
	button.click();
	
	
	
	
	
	
	
	
	
}
}
