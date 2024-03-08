package balsam.oasys.main;

import static org.testng.Assert.assertEquals;
import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Lazy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Lazy
public class Patiente2e {

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
		driver.findElement(By.id("10052-E")).click();
		driver.findElement(By.id("10053-E")).click();

	}

	@Test(priority = 3, description = "add new patient Names")
	public void addpatient() {
		driver.findElement(By.id("1000259-T")).click();
		System.out.println("Add Patient name");
		driver.findElement(By.id("pt1:contrRg:0:CntRgn:1:pt1:ot1:b4")).click();
		driver.findElement(By.xpath(
				"//span[contains(text(),'Title')]//ancestor::div[1]//span//span[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:0:oc19:ff5:fi31:dc_pgl2']//select"))
				.click();
		driver.findElement(By.xpath(
				"//span[contains(text(),'Title')]//ancestor::div[1]//span//span[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:0:oc19:ff5:fi31:dc_pgl2']//select"))
				.sendKeys("MR");
		driver.findElement(By.xpath(
				"//span[contains(text(),'Title')]//ancestor::div[1]//span//span[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:0:oc19:ff5:fi31:dc_pgl2']//select"))
				.click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//span[contains(text(),'Name')]//following::input[1]")).click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//span[contains(text(),'Name')]//following::input[1]")).sendKeys("Ali");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//span[contains(text(),'Name')]//following::input[4]")).click();

		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//span[contains(text(),'Name')]//following::input[4]")).sendKeys("Ali");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 4, description = "Add Patient details Gender,DIB,Marital,Nationality,Job,Religion")
	public void patientdetails() {

		System.out.println("Add Patient details Gender,DIB,Marital,Nationality,Job,Religion");

		driver.findElement(By.xpath("//label[contains(text(),'Male')]//parent::div//span//input[@type='radio']"))
				.click();
		driver.findElement(By.cssSelector("[placeholder='Greg Date']")).click();

		driver.findElement(By.cssSelector("[placeholder='Greg Date']")).sendKeys("22-04-1990");

		driver.findElement(By.xpath(
				"//select[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:fi2122:soc11:codesSelect::content']"))
				.click();

		driver.findElement(By.xpath(
				"//select[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:fi2122:soc11:codesSelect::content']"))
				.sendKeys("single");

		driver.findElement(By.xpath(
				"//select[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:fi2122:soc11:codesSelect::content']"))
				.click();

		driver.findElement(By.xpath(
				"//select[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:fi5:soc13:codesSelect::content']"))
				.click();

		driver.findElement(By.xpath(
				"//select[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:fi5:soc13:codesSelect::content']"))
				.sendKeys("Muslim");

		driver.findElement(By.xpath(
				"//select[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:fi5:soc13:codesSelect::content']"))
				.click();

		driver.findElement(By.id(
				"pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:nat_olov_fi:nat_olov:oasis_list_of_values_search_btn"))
				.click();

		driver.findElement(By.id(
				"pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:nat_olov_fi:nat_olov:dc_or2:dc_oc1:dc_ofi1:searchTxt::content"))
				.click();

		driver.findElement(By.id(
				"pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:nat_olov_fi:nat_olov:dc_or2:dc_oc1:dc_ofi1:searchTxt::content"))
				.sendKeys("EMIRATI");

		driver.findElement(By.id(
				"pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:nat_olov_fi:nat_olov:dc_or2:dc_oc1:dc_ot6:dc_b1"))
				.click();

		driver.findElement(By.id(
				"pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:nat_olov_fi:nat_olov:lov_search_diag_yes"))
				.click();
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.findElement(By.id(
				"pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:job_olov_fi:occ_olov:oasis_list_of_values_search_btn"))
				.click();
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.findElement(By.id(
				"pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:job_olov_fi:occ_olov:dc_or2:dc_oc1:dc_ofi1:searchTxt::content"))
				.sendKeys("MNGR");
	}

	@Test(priority = 5, description = "Addup Address and mobile number")
	public void addAddressMobileNumber() {
		System.out.println("Addup Address and mobile number");
		driver.findElement(By.id(
				"pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:job_olov_fi:occ_olov:dc_or2:dc_oc1:dc_ot6:dc_b1"))
				.click();

		driver.findElement(By.id(
				"pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:job_olov_fi:occ_olov:lov_search_diag_yes"))
				.click();

		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// mobile
		System.out.println("Mobile Number");
		driver.findElement(By.xpath(
				"//input[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r2:0:addresspt1:of1:fg1:fi10:mobileIt::content']"))
				.click();
		driver.findElement(By.xpath(
				"//input[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r2:0:addresspt1:of1:fg1:fi10:mobileIt::content']"))
				.sendKeys(generateInteger("05"));
		driver.findElement(By.xpath(
				"//input[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r2:0:addresspt1:of1:fg1:fi10:mobileIt::content']"))
				.click();

		// address
		System.out.println("address");
		driver.findElement(By.xpath(
				"//input[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r2:0:addresspt1:of1:addrsfg:fi9:adrs1it1::content']"))
				.click();
		driver.findElement(By.xpath(
				"//input[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r2:0:addresspt1:of1:addrsfg:fi9:adrs1it1::content']"))
				.sendKeys("Test Adress 1");

		// district
		System.out.println("district");
		driver.findElement(By.xpath(
				"//select[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r2:0:addresspt1:of1:addrsfg:fi4:soc1::content']"))
				.click();
		driver.findElement(By.xpath(
				"//select[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r2:0:addresspt1:of1:addrsfg:fi4:soc1::content']"))
				.sendKeys("AL AMMARIAH");
		driver.findElement(By.xpath(
				"//select[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r2:0:addresspt1:of1:addrsfg:fi4:soc1::content']"))
				.click();

		setpatientid();

	}

	@Test(priority = 6, description = "Save new patient")
	public void savepatient() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("patient save");

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath("//a//span[contains(text(),'Save Changes')]")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

//		driver.findElement(By.id("pt1:contrRg:0:CntRgn:2:pt1regi:osc1:ot1:of12212312:ot16:b223412")).click();
	}

	@Test(priority = 7, description = "Back")
	public void back() {
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@id='pt1:contrRg:0:CntRgn:2:pt1regi:osc1:btn_back_pmi']//a[@role='button']//span[contains(text(),'Back')]"))
				.click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 8, description = "Patient Search")
	public void patientsearch() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[contains(text(),'Advanced')]")).click();
		driver.findElement(By.id("pt1:contrRg:0:CntRgn:1:pt1:advff:fg1:ptidfi:PtnSrch::content")).click();
		driver.findElement(By.id("pt1:contrRg:0:CntRgn:1:pt1:advff:fg1:ptidfi:PtnSrch::content")).sendKeys(getis());
//		driver.findElement(By.id("pt1:contrRg:0:CntRgn:1:pt1:advff:fg1:ptidfi:PtnSrch::content")).sendKeys("417021");
		driver.findElement(By.id("pt1:contrRg:0:CntRgn:1:pt1:advff:obt2:b5")).click();
		driver.findElement(By.id("pt1:contrRg:0:CntRgn:1:pt1:TableA:0:ot24:obt4:b13")).click();

	}

	@Test(priority = 9, description = "patient identification")
	public void patientIdentification() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElements(By.xpath("//label[contains(text(),'Type')]//following::select[1]")).get(1).click();
		driver.findElements(By.xpath("//label[contains(text(),'Type')]//following::select[1]")).get(1)
				.sendKeys("LICENCE");
		driver.findElements(By.xpath("//label[contains(text(),'Type')]//following::select[1]")).get(1).click();

		driver.findElement(By.xpath("//label[contains(text(),'Doc Number')]//following::span[1]//input[@type='text']"))
				.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath("//label[contains(text(),'Doc Number')]//following::span[1]//input[@type='text']"))
				.click();
		driver.findElement(By.xpath("//label[contains(text(),'Doc Number')]//following::span[1]//input[@type='text']"))
				.sendKeys(setpatientid());

		driver.findElement(By.xpath("//label[contains(text(),'Issued On')]//following::span[1]//input")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath("//label[contains(text(),'Issued On')]//following::span[1]//input")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Issued On')]//following::span[1]//input"))
				.sendKeys("20-02-2023");

		driver.findElement(By.xpath("//label[contains(text(),'Expired On.')]//following::span[1]//input")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath("//label[contains(text(),'Expired On.')]//following::span[1]//input")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Expired On.')]//following::span[1]//input"))
				.sendKeys("20-03-2025");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElements(By.xpath("//span[contains(text(),'Add')]")).get(0).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	@Test(priority = 10, description = "Add Insurance")
	public void insurance() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElements(By.xpath("//label[contains(text(),'Purchaser')]//following::span[3]//div[1]")).get(2)
				.click();
		driver.findElements(By.xpath("//td//div//span//input")).get(0).click();
		driver.findElements(By.xpath("//td//div//span//input")).get(0).sendKeys("Ab Company 2");
		driver.findElements(By.xpath("//div//a//span[(text()='Search')]")).get(0).click();
		driver.findElement(By.xpath("//div//a//span[(text()='Ok')]")).click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//td//div//span//input")).click();
		driver.findElement(By.xpath("//td//div//span//input")).sendKeys("CLASS");
		driver.findElement(By.xpath("//div//a//span[(text()='Search')]")).click();
		driver.findElement(By.xpath("//div//a//span[(text()='Ok')]")).click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElements(By.xpath("//span[contains(text(),'Add')]")).get(1).click();
		driver.findElements(By.cssSelector("[class='x3zb']")).get(1).getText();
		WebElement element = driver.findElement(By.xpath("//tr//td[1]//span[@class='x3zb']"));
		String elements = element.getText();
		assertEquals(elements, "Ab Company 2");

	}

	@Test(priority = 11, description = "Save Patient")
	public void savechanges() {
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		driver.findElement(By.xpath("//a//span[contains(text(),'Save Changes')]")).click();
	}

	@Test(priority = 12, description = "Patient Death Register",enabled=false)
	public void deathregister() {
		driver.findElement(By.id("pt1:OasisHedarToolBar:hamburgerBtn")).click();
		driver.findElement(By.id("10052-E")).click();
		driver.findElement(By.id("10053-E")).click();
		driver.findElement(By.id("10058-T")).click();
		try {
			Thread.sleep(7000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//label[text()='Patient Id']//following::input[1]")).click();
		driver.findElement(By.xpath("//label[text()='Patient Id']//following::input[1]")).sendKeys(getis());
		driver.findElement(By.xpath("//label[text()='Patient Id']//following::input[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(text(),'Death In Hospital')]//parent::span[1]//input")).click();
		driver.findElements(By.xpath("//*[contains(@id, 'list_of_values_search_btn')]")).get(0).click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElements(By.xpath("//td//span[1]//input")).get(6).sendKeys("Ali Abdullah Othman");
		driver.findElement(By.xpath("//span[(text()='Search')]//parent::a")).click();
		driver.findElement(By.xpath("//span[(text()='Ok')]//parent::a")).click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElements(By.xpath("//*[contains(@id, 'list_of_values_search_btn')]")).get(1).click();
		driver.findElements(By.xpath("//div[text()='Search and select : Staff Presen']//following::div//input")).get(0)
				.click();
		driver.findElements(By.xpath("//div[text()='Search and select : Staff Presen']//following::div//input")).get(0)
				.sendKeys("Emad Mohammed Ismail");
		driver.findElement(By.xpath(
				"//div[text()='Search and select : Staff Presen']//following::span[text()='Search']//ancestor::td[1]//div//a"))
				.click();
		driver.findElement(By.xpath(
				"//div[text()='Search and select : Staff Presen']//following::span[text()='Ok']//ancestor::td[1]//div[1]//a[1]"))
				.click();

		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.findElements(By.xpath("//label[text()='Date Of Death']//following::span//input")).get(0).click();
		driver.findElements(By.xpath("//label[text()='Date Of Death']//following::span//input")).get(0)
				.sendKeys("08-02-2024 12:03");

		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.findElements(By.xpath("//*[contains(@id, 'list_of_values_search_btn')]")).get(4).click();
		driver.findElement(By.xpath("//div[text()='Search and Select Place Of Death']//following::div//input"))
				.sendKeys("Emergency Room");
		driver.findElement(By.xpath(
				"//div[text()='Search and Select Place Of Death']//following::span[text()='Search']//ancestor::td[1]//div//a"))
				.click();
		driver.findElement(By.xpath(
				"//div[text()='Search and Select Place Of Death']//following::span[text()='Ok']//ancestor::td[1]//div[1]//a[1]"))
				.click();

		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//span[text()='Register Death']//ancestor::a")).click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String element = driver.findElement(By.xpath("//label[contains(text(),'Status')]//following::span[1]"))
				.getText();
		assertEquals(element, "Dead");

	}

	@Test(priority = 13, description = "logout,driverquit")
	public void logout() {
		driver.findElement(By.xpath("//span[text()='Logout']")).click();
		driver.quit();
	}

	// Random Data Generator for Integers

	public String generatestring(int length) {
		String result = "";
		String charecters = "abcdefghijklmnopqrstuvwxyz";
		int charlength = charecters.length();

		for (int i = 0; i < length; i++) {
			result += charecters.charAt((int) Math.floor(Math.random() * charlength));
		}
		return result;
	}

	public String generateInteger(String input) {
		Random random = new Random();
		int randomNumber = random.nextInt(900000) + 100000; // Generates a random integer between 100000 and 999999

		// Concatenate "05" to the generated integer
		String concatenatedNumber = input + String.format("%08d", randomNumber);

		// Print the concatenated number
		System.out.println("Concatenated number: " + concatenatedNumber);
		return concatenatedNumber;
	}

	// Patient ID Getting

	String patientId;

	public String setpatientid() {
		WebElement patientElement = driver
				.findElements(By.xpath("//label[contains(text(),'Patient Id')]//following::span[1]//span[1]")).get(0);
		patientId = patientElement.getText();
		System.out.println(patientId);
		return patientId;
	}

	public String getis() {
		System.out.println(patientId);
		return patientId;
	}
}
