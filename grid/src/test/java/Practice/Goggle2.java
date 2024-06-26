package Practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Goggle2 {
	
	
	@Parameters("browser")
	@Test
	public void opengoogles(String browser) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		 if (browser.equalsIgnoreCase("chrome")) {
	            caps.setBrowserName("chrome");
	        } else if (browser.equalsIgnoreCase("firefox")) {
	        	 caps.setBrowserName("firefox");
	             FirefoxOptions options = new FirefoxOptions();
	             options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); // Specify the path to your Firefox binary
	             caps.setCapability("moz:firefoxOptions", options);
	        }
		
		WebDriver driver=new RemoteWebDriver(new URL("http://172.16.5.131:5555"),caps);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("India paksitan");
		
		driver.close();
		
		
	}
}
		


