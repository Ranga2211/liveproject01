package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	
	public static WebDriver driver;
	private String url;
	private Properties prop;
	
	//Inside constructor, we are loading the data from the config.properties file
	public BasePage() throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/resources/config.properties");
		prop.load(data);
	}
	
	//Browser setup
	public WebDriver getDriver() throws IOException {

		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			//After adding the drivers into packages, check all the execute column in each driver properties
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver");
			driver = new ChromeDriver();
			
		}else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir") + "/src/main/java/drivers/geckodriver");
			
			driver = new FirefoxDriver();
			
		}else if(prop.getProperty("browser").equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", 
					System.getProperty("user.dir") + "/src/main/java/drivers/msedgedriver");
			driver = new EdgeDriver();
		}else {
			System.out.println("No browser key-value pair present in config.properties file -- check");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return driver;
	}
	
	//Retrieving url
	public String getUrl() throws IOException {
		
		url = prop.getProperty("url");
		return url;
	}

	//Taking screenshot
	public void takeScreenshot(WebDriver webdriver) throws IOException {

		File srcFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir") + "/target/screenshots" + timeStamp() + ".png");
		FileUtils.copyFile(srcFile, destFile);
		System.out.println("took Screenshot");
	}

	public String timeStamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());

	}

}
