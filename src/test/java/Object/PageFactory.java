package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactory {
	WebDriver driver;

	public PageFactory(WebDriver driver) {
		this.driver = driver;
		org.openqa.selenium.support.PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//textarea[@id='APjFqb']")public  WebElement searchbox;
@FindBy(xpath ="(//input[@name='btnK'])[1]")  public WebElement searchbtn;
@FindBy(xpath="//a[@href='https://www.facebook.com/login/']//h3[@class='LC20lb MBeuO DKV0Md'][normalize-space()='Log into Facebook']")public  WebElement Facebook_login;
	//By searchbox = By.xpath("//textarea[@id='APjFqb']");
	//By searchbtn = By.xpath("(//input[@name='btnK'])[1]");
	//By Facebook_login = By.xpath("//a[@href='https://www.facebook.com/login/']//h3[@class='LC20lb MBeuO DKV0Md'][normalize-space()='Log into Facebook']");

	public void searchGoogle(String searchInput) {
		try {
			searchbox.sendKeys(searchInput);
			//driver.findElement(searchbox).sendKeys(searchInput);
			Thread.sleep(1000);
			searchbtn.click();
			//driver.findElement(searchbtn).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void ClickFacebook() {
		try {
			Facebook_login.click();
			//driver.findElement(Facebook_login).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
