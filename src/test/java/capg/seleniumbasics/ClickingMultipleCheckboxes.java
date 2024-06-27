package capg.seleniumbasics;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class ClickingMultipleCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriver driver;
			String actURL = "https://www.sparkstone.co.nz/sampleapp/101/app.php";
			System.setProperty("Webdriver.edge.driver", "C:\\selenium\\edgedriver_win64");
			driver = new EdgeDriver();
			driver.get("https://www.sparkstone.co.nz/sampleapp/101/app.php");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			String ExtUrl = driver.getCurrentUrl();
			Assert.assertEquals(actURL, ExtUrl);

			System.out.println("sucessfull");
			driver.findElement(By.id("enterinsurantdata")).click();
			List<WebElement> list = driver.findElements(By.xpath("(//p[@class='group'])[position()=2]/label"));
			for (WebElement webElement : list) {
				if(!(webElement.isSelected())){
					webElement.click();
					
			}
			}
				
	}

}
