package helper;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserSelect {

	WebDriver  driver=null;

	@Parameters({"browser","appUrl"})
  @Test
  public WebDriver getBrowser(String b, String appUrl) {
	  switch(b) {

	  case "chrome":
		  driver = new ChromeDriver();
		  break;

	  case "firefox":
		  driver = new FirefoxDriver();
		  break;

	  case "safari":
		  driver = new SafariDriver();
		  break;



		  default:
			  System.out.println("unknown browser");


	  }
	  driver.get(appUrl);
	  return driver;

  }
}
