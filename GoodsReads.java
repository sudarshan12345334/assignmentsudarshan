package Login_goodsreads;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoodsReads {
	
WebDriver driver;
	
	@Test
	public void login() throws Exception {
		
		 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   ChromeOptions co = new ChromeOptions();
		   co.addArguments("--headless");
		   
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get("https://www.goodreads.com/");
		
		   driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
		   Thread.sleep(1000);
		   
		   driver.findElement(By.xpath("//button[normalize-space()='Sign in with email']")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("sudarshanpatil859@gmail.com");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Sud@1998");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		   
	}
	
	@Test(priority = 1)
	public void Search() throws Exception {	   
		   
		   driver.findElement(By.xpath("//input[@class='searchBox__input searchBox__input--navbar']")).sendKeys("The Story Of Art");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//div[normalize-space()='The Story of Art']")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//div[@class='Sticky']//button[@aria-label='Tap to shelve book as want to read']")).click();
		   Thread.sleep(1000);
		   
	}
	

	@Test(priority = 2)
	public void MyBooksSelect() throws Exception {	   
		   
		   driver.findElement(By.xpath("//a[normalize-space()='My Books']")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//img[@title='Remove from my books']")).click();
		   Thread.sleep(1000);
		   
	}
	
	@Test(priority = 3)
	public void AlertHandle() throws Exception {	   
		   
		  driver.switchTo().alert().accept();
		   
	}
	
	@Test(priority = 4)
	public void LogOut() throws Exception {	  
	
		   driver.findElement(By.xpath("//a[@class='dropdown__trigger dropdown__trigger--profileMenu dropdown__trigger--personalNav']//img[@alt='Sudarshan Patil']")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//div[@class='siteHeader__subNav siteHeader__subNav--profile gr-box gr-box--withShadowLarge']//a[@class='siteHeader__subNavLink'][normalize-space()='Sign out']")).click();
		   Thread.sleep(1000);
		
		
	}
	
	
	

}
