import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int sum =0;
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
        WebElement tabledriver = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        int rowcount = tabledriver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
        System.out.println(rowcount);
        int colcount = tabledriver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
        
        for(int i=0 ; i < colcount-2 ; i++) {
        	String value = tabledriver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
            int value1 = Integer.parseInt(value);
            sum =sum + value1;
        }
        
        String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
        int Extras1 = Integer.parseInt(Extras);
        int Total = sum + Extras1 ;
        System.out.println("Total = " + Total);
        
        String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
        int ActualTotalVAlue=Integer.parseInt(ActualTotal);
        if(ActualTotalVAlue==Total)
        {
        System.out.println("Count Matches");
        }
        else
        {
        System.out.println("count fails");
        
        
        
	}
	}
}
