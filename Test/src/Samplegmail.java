import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Samplegmail {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Selenium-Software\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.id("identifierId")).sendKeys("lavanya67uppar@gmail.com");
		Thread.sleep(2000);
		String at=driver.getTitle();
	    String et="gmail";
	    driver.close();

	    if(at.equalsIgnoreCase(et))
	    	
	    {
	    	System.out.println("test successful");
	    	
	    }
	    else
	    {
	    	System.out.println("test failure");
	    }
	
		
		
	}

}
