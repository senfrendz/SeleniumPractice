import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ButtonVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaration

		String url = "http://testleaf.herokuapp.com/pages/Button.html";

		String HomeURL = "http://testleaf.herokuapp.com/home.html";

		String url_store,color_display;

		WebElement b1, b2, b3, b4;

		String button1 = "home"; // represents ID
		String button2 = "position"; // represents ID
		String button3 = "color"; // represents ID
		String button4 = "size"; // represents ID

		// Selenium Begins
		System.setProperty("webdriver.chrome.driver", "G:\\Scripting Tools\\ChromeDriver v77\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		//1st Testcase
		b1 = driver.findElement(By.id(button1));
		b1.click();
		url_store = driver.getCurrentUrl();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");

		if (url_store.equalsIgnoreCase(HomeURL)) {
			System.out.println("Reached Home URL" + url_store);
		} else {
			System.out.println("Retry again");
		}

		//2nd TestCase
		b2 = driver.findElement(By.id(button2));
		Point p1 = b2.getLocation();
		
		int xvalue = p1.getX();
		int yvalue = p1.getY();
		
		System.out.println("The X Coordiantes is:"+xvalue);
		System.out.println("The Y Coordiantes is:"+yvalue);
	
		//3rd TestCase
		b3 = driver.findElement(By.id(button3));
		color_display = b3.getCssValue("background-color");
		System.out.println("The Background Value is : "+color_display);
        String hexColorValue = Color.fromString(color_display).asHex();
        System.out.println(hexColorValue);

		
		//4th TestCase
		b4 = driver.findElement(By.id(button4));
		Dimension hw = b4.getSize();
		int h = hw.getHeight();
		int w = hw.getWidth();
		
		System.out.println("The Height is"+h);
		System.out.println("The Weight is"+w);
		
	}

}
