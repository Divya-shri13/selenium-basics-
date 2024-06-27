package capg.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class seleniumday1 {
	public static void main(String[] args) {
		WebDriver driver;
		String actURL = "https://soliterata.com/testing-tool-wep-page/elements/check-box/";
		System.setProperty("Webdriver.edge.driver", "C:\\selenium\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.get("https://soliterata.com/testing-tool-wep-page/elements/check-box/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String ExtUrl = driver.getCurrentUrl();
		Assert.assertEquals(actURL, ExtUrl);

		System.out.println("view");
		
	//	driver.findElement(By.xpath("(//span[@class='elementor-button-text'])[7]")).click();
		driver.findElement(By.linkText("Accept")).click();
		WebElement ele = driver.findElement(By.xpath("//input[@id='myCheck']"));
		ele.click();
		
		if (ele.isSelected()) {
			System.out.println("selected");
		}
			driver.findElement((By.xpath("//button[@onclick='myFunction()']"))).click();
			
			String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
	System.out.println("s");
	
		}
	}


