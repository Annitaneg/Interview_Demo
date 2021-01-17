package ATest;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest2 {
	private String baseUrl;
	private WebDriver driver;
	private TestA myclass;
	String file_name = "//src//resources//chantest.txt";
	
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
  	  
    @Before
    public void setUp() throws Exception {
        //driver = new FirefoxDriver();
        driver = new InternetExplorerDriver();
        baseUrl = "http://www.sky.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
	@Before
	public void openBrowser() {
		
		//baseUrl = System.getProperty("webdriver.base.url");
		//driver = new InternetExplorerDriver();
	/*	
		FirefoxProfile fp = new FirefoxProfile();
		fp.setPreference("webdriver.load.strategy", "unstable"); 
			
		
	//	FirefoxProfile firefoxProfile = new ProfilesIni().getProfile("web");
	//	firefoxProfile.setPreference("webdriver.load.strategy", "unstable");
		
		driver = new FirefoxDriver(fp);
		
		*/
		
		//driver = new InternetExplorerDriver();
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); 
		//driver.get("http://www.sky.com/");
		
		//driver.navigate().refresh();	    
		//driver.get(baseUrl);
	
	}
  
	@After
	public void saveScreenshotAndCloseBrowser() throws IOException {
		driver.quit();
	}
  
    public boolean checkElementPresentByXPath(String locator) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS); 
        if (driver.findElements(By.xpath(locator) ).size() != 0 ){
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            return true;
        }else {
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            return false;
        }
    }   
    
	@Test
	public void TestCustLogin () {
		
		driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("dannydenco");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Bradley1");
        driver.findElement(By.id("signinButton")).click();
      
        assertEquals("Welcome Danny Denco",  driver.findElement(By.xpath("//div[@id='intro']/h2")).getText());
	  
		//if (checkElementPresentByXPath("//*[@id='C4LoginLink']/a")){
		//	driver.findElement(By.xpath("//*[@id='C4LoginLink']/a")).click();
		//} 
	//	driver.findElement(By.xpath("//li[@id='skycom-signin']/a")).click();
		
	//	driver.findElement(By.linkText("Sign In")).click();
		//driver.findElement(By.xpath("//*[@id='C4LoginLink']/a")).click();
		//driver.findElement(By.linkText("Sign in")).click();
	/*	
		try{
			TestA myclass = new TestA();
			String [] arr = myclass.ReadFile3(file_name);
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			//String T1 = arr[0];
			//String T2 = arr[1];
			//String T3 = arr[2];
			//String T4 = arr[3];
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	*/	
		//assertEquals("The page title should equal Google at the start of the test.", "Google", driver.getTitle());
		// WebElement searchField = driver.findElement(By.name("q"));
		//searchField.sendKeys("Drupal!");
		// searchField.submit();
  
	}

}
