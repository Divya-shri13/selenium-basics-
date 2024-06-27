package capg.seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Clickanddoubleclick {

	public static void main(String[] args) throws InterruptedException {
		/*WebDriver driver;
		String actURL = "https://soliterata.com/testing-tool-wep-page/elements/buttons/";
		System.setProperty("Webdriver.edge.driver", "C:\\selenium\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.get("https://soliterata.com/testing-tool-wep-page/elements/buttons/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String ExtUrl = driver.getCurrentUrl();
		Assert.assertEquals(actURL, ExtUrl);

		System.out.println("view");
		
	//	driver.findElement(By.xpath("(//span[@class='elementor-button-text'])[7]")).click();
		driver.findElement(By.linkText("Accept")).click();
		//driver.findElement(By.xpath("//span[text()='Check Box']")).click();
//		driver.findElement(By.xpath(("//span[@class='bellows-target-title bellows-target-text'])[position()=4]"))).click();
		Thread.sleep(3000);  // it throws exceptions and io 
//		driver.manage().timeouts().implicitlyWait(10);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		
		js.executeScript("window.scrollBy(0,100)");
		 Actions actions = new Actions(driver);
		 WebElement Element = driver.findElement(By.xpath("//button[text()='Double-click me']")); //webelement as parameter
		  actions.doubleClick(Element).perform();
	        String text = "//p[@id='demo'])";
	       // .getText();*/
		
		WebDriver driver;
		String actUrl ="https://soliterata.com/testing-tool-wep-page/elements/buttons/";
		System.setProperty("WebDriver.Edge.driver"," \"C:\\selenium\\edgedriver_win64");
		//System.setProperty("WebDriver.edge.driver", ("user dir")+ "msedgedriver.exe");                                                                                                                                                                                                                                                                                                                                                 
		driver = new EdgeDriver();
		driver.get("https://soliterata.com/testing-tool-wep-page/elements/buttons/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String expUrl = driver.getCurrentUrl();
		Assert.assertEquals(expUrl, actUrl);
		System.out.println("Validation Successful");
		driver.findElement(By.linkText("Accept")).click();
		driver.findElement(By.xpath("//span[text()='Buttons']")).click();
	//whenever the Element not clickabale Error occurs with coordinate point - Perform Scroll action.
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.xpath("//button[text()='Click me']")).click();
		WebElement ele = driver.findElement(By.id("singleClick"));
		System.out.println(ele.getText());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	//Printing Text
		WebElement elem = driver.findElement(By.id("singleClick"));
		System.out.println(ele.getText());
	//Double Click
		WebElement element = driver.findElement(By.xpath("//button[@ondblclick='myFunction2()']"));
		Actions action = new Actions(driver);
		//WebElement element = driver.findElement(By.xpath("//button[@ondblclick='myFunction2()']"));
		action.doubleClick(element).perform();
		WebElement Ele = driver.findElement(By.id("demo"));
		System.out.println(Ele.getText());
	
		
	}

}
