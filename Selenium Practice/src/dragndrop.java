import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		String url = "http://www.leafground.com/pages/drop.html";
				
		String from = "draggable";
		String to ="droppable";
		
		WebElement i1;
		
		// Selenium Begins
				System.setProperty("webdriver.chrome.driver", "G:\\Scripting Tools\\ChromeDriver v78\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get(url);
				
    			WebElement source = driver.findElement(By.id(from));
				WebElement destination = driver.findElement(By.id(to));
				
				Actions mouse = new Actions(driver);
				
				mouse.clickAndHold(source).moveToElement(destination).release(destination).build().perform();
				
			//	mouse.dragAndDrop(source, destination).build().perform();
				Thread.sleep(5000);
				driver.close();
	}

}
