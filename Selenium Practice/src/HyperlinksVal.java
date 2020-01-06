import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinksVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "http://testleaf.herokuapp.com/pages/Link.html";


		String url_store,color_display;

		String Val;
		
		WebElement h1, h3, h4;
		List<WebElement> h2;
		
		// Selenium Begins
		System.setProperty("webdriver.chrome.driver", "G:\\Scripting Tools\\ChromeDriver v77\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		//Partial Link Text
		h1 = driver.findElement(By.partialLinkText("Find where"));
		Val = h1.getAttribute("href");
		System.out.println(Val);
	
		// Links Verification
		
		List<WebElement> l = new ArrayList<WebElement>();
		
		h2 = driver.findElements(By.tagName("a"));
		l.addAll(h2);
		System.out.println("The List Size is"+l.size());
		
	}

}
