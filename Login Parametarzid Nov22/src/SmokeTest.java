import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SmokeTest 
{
	
	
	public static void main(String[] args) 
	{
		
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://www.bluefly.com");
		dr.manage().window().maximize();
		BaseTest bs=new BaseTest(dr);
		bs.type(By.xpath("//input[@id='searchterms']"), "shahid");
		bs.verifyText("bluefly");
		bs.verifyElementPresent(By.xpath(".//*[@id='homeContainer']/header/div[1]/div[1]/a"));
		bs.click(By.xpath("//*[@id='main-nav-new']/a"));
		bs.verifyTitle("BLUEFLY");
		
		
		//dr.quit();

	}

}
