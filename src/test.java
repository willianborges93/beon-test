import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	public By search_page = By.id("(//[@id='input'])");
	
		public static void main(String[] args) {
		WebDriver driver = new chromeDriver();
		driver.get("http://www.google.com.br");
		
		Object ExpectedConditions;
		Object wait;
		wait.until(ExpectedConditions.visibilityOfElementLocated(search);
		new.Actions(driver).sendKeys("Beon");
		driver.findElement(By.class("(//[@class='LC20lb MBeuO DKV0Md'])"));
		
		Thread.sleep(5000);
		
		correct_url = driver.getCurrentUrl();
		
		System.out.println("Linkedin Beon page");
		
	}
}
