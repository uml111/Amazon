package Amazon.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Addcart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.edge.driver","C:\\Selenium-Software\\Drivers-New\\edgedriver_win64\\msedgedriver.exe");
		WebDriver d=new EdgeDriver();

		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("toys");
		d.findElement(By.id("nav-search-submit-button")).click();
	    Thread.sleep(2000);
		d.findElement(By.className("s-image")).click();
		d.findElement(By.id("add-to-cart-button")).click();

	
	}

}
