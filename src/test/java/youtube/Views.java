package youtube;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Views {


	public WebDriver driver;

	String url = "https://www.youtube.com/";
	String qua = "Quality";
	String pix = "144p";

	@BeforeTest
	public void tear_Up() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\workspace\\click\\utilities\\chromedriver.exe");

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);

		driver = new ChromeDriver(options);
		 driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@AfterTest(enabled = true)
	public void tear_Down() {
		 driver.close(); 
	}

	
	@Test(priority = 1) /* (invocationCount = 10) */
	public void get_URL() throws InterruptedException {

		driver.get(url);
		WebElement element = driver.findElement(By.xpath("//input[@id='search']"));
		element.sendKeys("aapka advocate");
		
		element.sendKeys(Keys.ENTER);
		
		WebElement AA = driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'aapka advocate')]"));
		AA.click();
		
		WebElement CB = driver.findElement(By.xpath("//a[contains(text(),'| cheque bounc')]"));
		CB.click();
		
		/*
		 * WebElement SetVideo = driver.findElement(By.
		 * xpath("//button[@class='ytp-button ytp-settings-button']"));
		 * SetVideo.click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement Quality =
		 * driver.findElement(By.xpath("//div[contains(text(),'Quality')]"));
		 * Quality.click();

		 * Thread.sleep(2000);
		 * 
		 * 
		 * Actions act = new Actions(driver);
		 * 
		 * act.moveByOffset(687, 398).click().build().perform();
		 */
		/*----------------------------------------*/
		/* last line code is imp for video quality change */
		
		
	
		Thread.sleep(10000);
		
	}

}
