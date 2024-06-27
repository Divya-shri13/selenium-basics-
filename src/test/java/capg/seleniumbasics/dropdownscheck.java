package capg.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropdownscheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String actURL = "https://www.globalsqa.com/demo-site/select-dropdown-menu/";
		System.setProperty("Webdriver.edge.driver", "C:\\selenium\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		String ExtUrl = driver.getCurrentUrl();
		Assert.assertEquals(actURL, ExtUrl);

		Select select = new Select(driver.findElement(By.xpath("//div[@class='single_tab_div']/p/select")));
		
		select.selectByValue("IRQ");
		//select.selectByIndex("2");
		//select.selectByVisibleText("India");
		
		List<WebElement> options = select.getOptions();
		
		System.out.println("Size is: " + options.size());
		for (WebElement element : options) {
			//System.out.println(element.getText());
			if (element.getText().equals("India")) {
				element.click();
				
			}
			
		}
	}

}
