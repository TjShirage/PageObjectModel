package Object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPackage {
	WebDriver driver;
	FacebookSearch ObjectRepo;
	Facebook1 fb;
	PageFactory pg;
	@Test(priority = 0, enabled=false)
	public void Serch() {
		//FacebookSearch page = new FacebookSearch(driver);
		//page.searchGoogle("facebook login page");
		pg= new PageFactory(driver);
		pg.searchGoogle("facebook login page");
		
	}

	@Test(priority = 1)
	public void FacebookClick() {
		ObjectRepo = new FacebookSearch(driver);
		ObjectRepo.ClickFacebook();
	}

	@Test(priority = 2)
	public void facebookLoginCrede() {
		fb = new Facebook1(driver);
		fb.enterUsername();
		fb.enterPaasword();
		fb.loginPage();

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}

}
