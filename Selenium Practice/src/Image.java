import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String url = "http://testleaf.herokuapp.com/pages/Image.html";
		
		String imgverification = "//*[@id='contentblock']/section/div[2]/div/div/img";
		
		WebElement i1;
		
		// Selenium Begins
				System.setProperty("webdriver.chrome.driver", "G:\\Scripting Tools\\ChromeDriver v77\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get(url);
				
				i1 = driver.findElement(By.xpath(imgverification));
				if(i1.getAttribute("naturalWidth")!= null) {
				System.out.println("The Image is broken"+i1);
				}
				else {
					System.out.println("This Image is not broken");
				}
	}

}
