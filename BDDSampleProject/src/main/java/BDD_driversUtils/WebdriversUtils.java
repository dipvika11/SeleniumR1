package BDD_driversUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebdriversUtils 
{
	public static WebDriver driver;
	public static WebDriver getDriver()
	{
	System.setProperty("webdriver.edge.driver", "src/test/resources/WebDrivers/msedgeDriver.exe");
    driver= new EdgeDriver();
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    return driver;
	}

}
