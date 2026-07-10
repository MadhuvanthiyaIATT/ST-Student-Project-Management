package selenium_concepts;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts_concept {
	public static void main(String[] args) throws InterruptedException {
//xpath --> parent,child method ---> //div//child::button[@id='alertBtn']
	
WebDriver driver=new EdgeDriver();
	WebDriver drag = driver;
	drag.manage().window().maximize();
	    drag.get("https://testautomationpractice.blogspot.com/");
	    
  WebElement element = drag.findElement(By.cssSelector("div button#alertBtn"));
	    element.click();
	    Thread.sleep(2000);
	    Alert al  = drag.switchTo().alert();	    
	    al.accept();
	    
	WebElement element2 = drag.findElement(By.xpath("//div//child::button[@id='confirmBtn']"));    
	element2.click();
	Thread.sleep(2000);
	al.dismiss();
WebElement element3 = drag.findElement(By.cssSelector("div button#promptBtn"));	
element3.click();
al.sendKeys("Vijii press the cancell button");
	   al.dismiss();
	   WebElement element4 = drag.findElement(By.xpath("//button[@class='dropbtn']"));
	   element4.click();
	   Thread.sleep(2000);
	   al.sendKeys("Gracy press the cancel button");
	   al.accept();
	  WebElement pointMe = drag.findElement(By.cssSelector("button.dropbtn"));
Actions act=new Actions(drag);
act.moveToElement(pointMe).build().perform();
WebElement copyText = driver.findElement(By.xpath("//button[text()='Copy Text']"));
act.doubleClick(copyText).perform();
WebElement source = driver.findElement(By.cssSelector("div#draggable"));

  WebElement destination = driver.findElement(By.cssSelector("div#droppable"));
act.dragAndDrop(source, destination).perform();





	    	
	    }}