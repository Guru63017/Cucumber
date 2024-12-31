package GmailStepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MeghanaStedef 
{
	public WebDriver driver;

	@Given("^user able to open any browser$")
	public void user_able_to_open_any_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\GuruOnlineClass\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Then("^user able to enter url$")
	public void user_able_to_enter_url() throws Throwable {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("^user able to enter userName as \"([^\"]*)\"$")
	public void user_able_to_enter_userName_as(String username) throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);
	}

	@Then("^user able to enter password as \"([^\"]*)\"$")
	public void user_able_to_enter_password_as(String password) throws Throwable {
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
	}

	@Then("^user able to click login button$")
	public void user_able_to_click_login_button() throws Throwable {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

	@Then("^user able to check the status \"([^\"]*)\"$")
	public void user_able_to_check_the_status(String status) throws Throwable {
		System.out.println("status  : "+status);
		Thread.sleep(3000);
		driver.quit();
	}

}
