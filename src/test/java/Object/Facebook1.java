package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebook1 {
	WebDriver driver;

	public Facebook1(WebDriver driver) {
		this.driver = driver;
	}
	By username=By.xpath("//input[@name='email']");
	By password=By.xpath("//input[@name='pass']");
	By login=By.xpath("//input[@name='pass']");

public void enterUsername()
{driver.findElement(username).clear();
	driver.findElement(username).sendKeys("tjshirage@gmail.com");
}
public void enterPaasword()
{driver.findElement(password).clear();
	driver.findElement(password).sendKeys("Harshad@82");
}
public void loginPage()
{driver.findElement(login).clear();
	driver.findElement(login).click();

}

}

////span[contains(text(),'Your Login, Your Facebook - Sign Up and Log In to ')]