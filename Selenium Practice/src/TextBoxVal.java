import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxVal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Declaration

		String textbox1 = "//*[@id='email']";
		String textbox2 = "//input[@value='Append ']";		
		String textbox3 = "//input[@value='TestLeaf']";	
		String textbox4 = "//input[@value='Clear me!!']";	
		String textbox5 = "//input[@disabled='true']";	
		
		String display;

		WebElement email_input,email_input1,email_input2,email_input3,email_input4;
		
		Boolean test;

		// Selenium Starts Here

		System.setProperty("webdriver.chrome.driver", "G:\\Scripting Tools\\ChromeDriver v77\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");

		email_input = driver.findElement(By.xpath(textbox1));
		email_input.sendKeys("test@selenium.com");
		Thread.sleep(2000);

		email_input1 = driver.findElement(By.xpath(textbox2));
		email_input1.sendKeys("test by senthil");
		Thread.sleep(2000);
		
		email_input2 = driver.findElement(By.xpath(textbox3));
		display = email_input2.getAttribute("Value");
		System.out.println(display);
		Thread.sleep(2000);
		
		email_input3 = driver.findElement(By.xpath(textbox4));
		email_input3.clear();
		Thread.sleep(2000);
		
		email_input4 = driver.findElement(By.xpath(textbox5));
		test = email_input4.isEnabled();
		System.out.println(test);
		Thread.sleep(5000);

		driver.close();
	}

}
