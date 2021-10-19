import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmericanAirlines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.edge.driver","C:\\Selenium-Software\\Drivers-New\\edgedriver_win64\\msedgedriver.exe")	;
		   WebDriver d= new EdgeDriver();
		      
		   d.get("https://www.aa.com/homePage.do");
		   d.manage().window().maximize();
		   d.findElement(By.id("log-in-button")).click();
		   d.findElement(By.name("loginId")).sendKeys("AALINES");
		   d.findElement(By.name("lastName")).sendKeys("Uppara");
		   d.findElement(By.name("password")).sendKeys("abc123");
		   
		
	}

}
