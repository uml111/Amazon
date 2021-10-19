import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazondropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver","C:\\Selenium-Software\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver d1=new EdgeDriver();
		
		d1.get("https://www.amazon.com/");
		d1.manage().window().maximize();
		
		WebElement a=d1.findElement(By.id("searchDropdownBox"));
		
		java.util.List<WebElement>a1=a.findElements(By.tagName("option"));
		System.out.println(a1.size());
		for(int i=0;i<a1.size();i++)
		{
			
			System.out.println(a1.get(i).getText());
		}
		
		d1.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		Thread.sleep(2000);
	    d1.findElement(By.id("twotabsearchtextbox")).sendKeys("harrypotter");
	  
	    d1.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
}
}