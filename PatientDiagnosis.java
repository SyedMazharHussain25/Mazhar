package balsam.oasys.main;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PatientDiagnosis {
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
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Test(priority = 2, description = "Menus Navigate")
	public void patient() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		System.out.println("Menu Navigate");
		driver.findElements(By.id("pt1:OasisHedarToolBar:hamburgerBtn")).get(0).click();
		driver.findElement(By.cssSelector("[id='10024-E']")).click();
		driver.findElement(By.id("10025-T")).click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("[placeholder='Search by Patient Id , MRN ,Name  ']")).click();
		driver.findElement(By.cssSelector("[placeholder='Search by Patient Id , MRN ,Name  ']")).sendKeys("");
		driver.findElement(By.cssSelector("[placeholder='Search by Patient Id , MRN ,Name  ']")).sendKeys(Keys.ENTER);
	}
}


