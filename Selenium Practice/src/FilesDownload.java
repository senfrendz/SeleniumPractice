import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilesDownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		String url = "http://www.leafground.com/pages/download.html";
		
		
		// Selenium Begins
		System.setProperty("webdriver.chrome.driver", "G:\\Scripting Tools\\ChromeDriver v78\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.partialLinkText("Download Excel")).click();
		
		Thread.sleep(5000);
		File loc = new File("C:\\Users\\Senthil Raju\\Downloads");
		
		File[] store = loc.listFiles();
		
		for(File s : store) {
			
			if(s.getName().contains("testleaf.xlsx")){
			System.out.println("File Downloaded Successfully");
			break;
			}
		}
		
		
	}

}
