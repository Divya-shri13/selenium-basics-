package capg.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String actURL = "https://www.lambdatest.com/selenium-playground/drag-and-drop-demo";
		System.setProperty("Webdriver.edge.driver", "C:\\selenium\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/drag-and-drop-demo");
		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		String ExtUrl = driver.getCurrentUrl();
		WebElement d1 = driver.findElement(By.xpath("//span[text()='Draggable 1']"));
		WebElement d2 = driver.findElement(By.xpath("//span[text()='Draggable 2']"));
		WebElement d3 = driver.findElement(By.id("mydropzone"));

		Actions actions = new Actions(driver);
		actions.dragAndDrop(d2, d3).perform();
		actions.dragAndDrop(d1, d3).perform();
		WebElement a = driver.findElement(By.id("droppedlist"));
		String s = a.getText();
		System.out.println(s);
//demo-2 drraggable
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		actions.dragAndDropBy(source, 125, 34).build().perform();

	}

}
