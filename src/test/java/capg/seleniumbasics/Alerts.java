package capg.seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String actURL = "https://the-internet.herokuapp.com/javascript_alerts";
		System.setProperty("Webdriver.edge.driver", "C:\\selenium\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String ExtUrl = driver.getCurrentUrl();
		Assert.assertEquals(actURL, ExtUrl);
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	Alert alert = driver.switchTo().alert();
	alert.accept();   // object .accept
	WebElement a = driver.findElement(By.xpath("//p[@id='result']"));
	String s = a.getText();
	System.out.println(s);
	
    driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
    Alert ale = driver.switchTo().alert();
	ale.dismiss();
	WebElement b = driver.findElement(By.id("result"));
	String m = a.getText();
	System.out.println(s);
	
	driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
    Alert alem = driver.switchTo().alert();
    alem.sendKeys("Divya");
    
    alem.accept();
    WebElement c = driver.findElement(By.id("result"));
    String n = c.getText();
    System.out.println(n);
	
	}

}
