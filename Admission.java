package balsam.oasys.main;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Lazy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Admission {
	
	@Lazy
	public class PatienDeathRegister {
		private WebDriver driver;

		@BeforeClass
		public void setUp() {
			// Set up WebDriver
			driver = new ChromeDriver();
			driver.get("https://testplus.oasisapp.services/dhbhp/faces/Login.jsf");
		}

		@Test(priority = 1, description = "Login and Select Yes in popup")
		public void Login() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
			System.out.println("Login and Select Yes in popup");
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("[name='it1']")).sendKeys("test_1");
			driver.findElement(By.cssSelector("[name='it2']")).sendKeys("test_1");
			driver.findElement(By.cssSelector("[id='login']")).click();
			driver.findElement(
					By.xpath("//span[contains(text(),'Yes')]//parent::a[@class='xfn']//parent::div[@role='presentation']"))
					.click();
		}

	@Test(priority = 2, description = "Menus Navigate")
	public void patient() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		System.out.println("Menu Navigate");
		driver.findElements(By.id("pt1:OasisHedarToolBar:hamburgerBtn")).get(0).click();
		driver.findElement(By.id("10089-E")).click();
		driver.findElement(By.id("10096-E")).click();
		driver.findElement(By.id("1000291-T")).click();
	}
	
	
	@Test(priority = 3,description = "Patient Admission")
	public void patientadmission() {
		driver.findElement(By.xpath("//label[contains(text(),'Patient Id')]//following::span[1]//input[@type='text']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Patient Id')]//following::span[1]//input[@type='text']")).sendKeys("");
		driver.findElement(By.xpath("//label[contains(text(),'Patient Id')]//following::span[1]//input[@type='text']")).sendKeys(Keys.ENTER);


	}
	
	

	}

}
