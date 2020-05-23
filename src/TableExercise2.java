import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.xpath("//table[@class='table-display']/tbody"));
		System.out.println(table.findElements(By.xpath("//table[@class='table-display']/tbody/tr")).size());
		System.out.println(table.findElements(By.xpath("//table[@class='table-display']/tbody/tr/th")).size());
		System.out.println(table.findElement(By.xpath("//table[@class='table-display']/tbody/tr[3]")).getText());
		
		
		
		
		

	}

}
