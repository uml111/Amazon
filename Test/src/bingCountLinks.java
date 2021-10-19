import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class bingCountLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver","C:\\Selenium-Software\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver d2=new EdgeDriver();
		d2.get("http://www.bing.com");
		
		d2.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement a1=d2.findElement(By.id("sb_form_q"));
		
		List<WebElement>a2=a1.findElements(By.tagName("q"));
		
		System.out.println(a2.size());
		
		for(int i=0;i<a2.size();i++)
		{
			System.out.println(a2.get(i).getText());
		}
		
		
	}

}
