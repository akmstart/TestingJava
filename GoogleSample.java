import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSample {
	
	
	public static void main(String[] args) {

  //System.setProperty("webdriver.gecko.driver","/home/mohahmed/Selenium Files/gecko64/geckodriver.exe");
		
  //System.setProperty("webdriver.firefox.marionette","/home/mohahmed/Selenium Files/gecko32/geckodriver.exe");
    
 // if above property is not working or not opening the application in browser then try below property

 //System.setProperty("webdriver.firefox.marionette","G:\\Selenium\\Firefox driver\\geckodriver.exe");

  WebDriver driver = new FirefoxDriver();

  driver.get("http://www.facebook.com");

  System.out.println("Application title is =============> "+driver.getTitle());

  driver.quit();

}

}