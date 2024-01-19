package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookSearch {
	WebDriver driver;

	public FacebookSearch(WebDriver driver) {
		this.driver = driver;
	}

	By searchbox = By.xpath("//textarea[@id='APjFqb']");
	By searchbtn = By.xpath("(//input[@name='btnK'])[1]");
	By Facebook_login = By.xpath("//a[@href='https://www.facebook.com/login/']//h3[@class='LC20lb MBeuO DKV0Md'][normalize-space()='Log into Facebook']");
////h3[normalize-space()='Log into Facebook | Facebook']
	////a//h3[text()='Log into Facebook | Facebook']
	public void searchGoogle(String searchInput) {
		try {
			driver.findElement(searchbox).sendKeys(searchInput);
			Thread.sleep(1000);
			
			driver.findElement(searchbtn).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void ClickFacebook() {
		try {
			driver.findElement(Facebook_login).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
