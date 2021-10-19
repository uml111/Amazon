import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstTest {
	
//  WebDriver driver;
	
	public void launchBrowser() throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver","C:\\Selenium-Software\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium-Software\\Drivers\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.amazon.com/");
      //  driver.manage().window().maximize();
		driver.get("https://login.yahoo.com");
		 driver.manage().window().maximize();
		//Thread.sleep(2000);
       // driver.findElement(By.linkText("Forgot username?")).click();
		
        //driver.findElement(By.cssSelector("#login-username")).sendKeys("lavanya.um@yahoo.com");
       // driver.findElement(By.id("login-signin")).click();
		//driver.findElement(By.partialLinkText("Forgot")).click();
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("lavanya.um@yahoo.com");
        driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	}
      
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		FirstTest obj=new FirstTest();
		obj.launchBrowser();
	}

}
