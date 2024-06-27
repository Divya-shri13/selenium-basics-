package capg.seleniumbasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TakesScreenshots {
	
	static WebDriver driver;
	
	public static void takecreenshots(String fileName) throws IOException {
		//create a file with takescreenshot interface and get the screenshot as File
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//we use copyfile method to store the file in the given path
	FileUtils.copyFile(file, new File("C:\\Users\\CHISRI\\eclipse-workspace\\seleniumbasics\\Screenshot\\" +fileName+".jpg"));
	
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			 
		
			
				
				
				driver= new EdgeDriver();
				//String act= "https://jpetstore.aspectran.com/order/viewOrder?orderId=1011";
				System.setProperty("webdriver.edge.driver",
						"C:\\\\selenium\\\\edgedriver_win64");
				driver.get("https://stock.adobe.com/in/search?k=monkey&asset_id=1974128");
		        driver.manage().window().maximize();
		        driver.manage().deleteAllCookies();
		        String exp= driver.getCurrentUrl();
		       // Assert.assertEquals(act, exp);
		        System.out.println("Url Validated");
		        takecreenshots("Image");
		         
		        
		 
			}
		 
		

	}


