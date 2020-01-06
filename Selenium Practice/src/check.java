import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String url = "http://testleaf.herokuapp.com/pages/checkbox.html";
		
	//	String chkverification = "//*[@id=\"contentblock\"]/section/div[3]/input[2]";
		String chkverification = "//*[@id=\"contentblock\"]/section/div[3]/input[1]";
		
		WebElement i1;
		
		// Selenium Begins
				System.setProperty("webdriver.chrome.driver", "G:\\Scripting Tools\\ChromeDriver v77\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get(url);
				
				i1 = driver.findElement(By.xpath(chkverification));
				boolean b = i1.isSelected();
				if(b==true)
				{
					i1.click();
					System.out.println("Its unselected now");
				}
				else {
					System.out.println("Its Selected");
				}
				
	}

}
