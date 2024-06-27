package capg.seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class windowshandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String actURL = "https://demo.automationtesting.in/Windows.html";
		System.setProperty("Webdriver.edge.driver", "C:\\selenium\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String ExtUrl = driver.getCurrentUrl();
		driver.findElement(By.partialLinkText("Open New Seperate")).click();
		driver.findElement(By.xpath("//button[text()='click]")).click();
		
	String parent_w = driver.getWindowHandle();
	Set <String> set = driver.getWindowHandles();// collections
	
	Iterator<String> I = set.iterator();
	
	while(I.hasNext()) {
		String child_w = I.next();
		if(!(parent_w.equals(child_w))) {
			driver.switchTo().window(child_w);
		}
		String title = driver.getTitle();
		System.out.println(title);
		driver.switchTo().window(parent_w);
		}
		
	}
	
	}

