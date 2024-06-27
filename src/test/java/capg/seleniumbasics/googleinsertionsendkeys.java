package capg.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class googleinsertionsendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String actURL = "https://www.google.com/";
		System.setProperty("Webdriver.edge.driver", "C:\\selenium\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		String ExtUrl = driver.getCurrentUrl();
		Assert.assertEquals(actURL, ExtUrl);

		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Divya");

	}

}
