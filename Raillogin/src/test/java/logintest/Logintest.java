package logintest;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.firefoxdriver().setup();
	      WebDriver driver = new FirefoxDriver();
	      
	      driver.get("https://eticket.railway.gov.bd/login/");
	      driver.findElement(By.id("mobile_number")).sendKeys("01997018748");
	      driver.findElement(By.id("password")).sendKeys("@nik_9teen");
	      driver.findElement(By.cssSelector("div.login-form-control-single:nth-child(3)")).click();
	      
		}

	}