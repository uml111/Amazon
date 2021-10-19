package Amazon.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Gittest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		
		System.setProperty("webdriver.edge.driver","C:\\Selenium-Software\\Drivers-New\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1=new EdgeDriver();

		driver1.get("https://www.target.com/");
		driver1.manage().window().maximize();
		driver1.close();
		
	}

}
