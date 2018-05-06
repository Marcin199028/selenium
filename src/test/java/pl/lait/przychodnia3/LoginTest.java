package pl.lait.przychodnia3;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;
import static pl.lait.przychodnia3.Init.getDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest {
	
WebDriver driver = null;

	@Before
	public void openPage() {
		driver = getDriver();
	}
	
	@Ignore
	@Test
	public void clickOnMenuItems() {
		System.out.println("--test 1");
		System.out.println(driver.getTitle());
		assertTrue("Nie odnaleziono strony", driver.getTitle().equals("Welcome: Mercury Tours"));
		
		System.out.println("test clickOnMenuItems");
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.linkText("SUPPORT")).click();
		driver.findElement(By.linkText("CONTACT")).click();
	}
	
	@Ignore
	@Test
	public void logIn() {
		
		System.out.println("--test 2");
		driver.findElement(By.linkText("SIGN-ON")).click();
		assertTrue("Nie odnaleziono strony", driver.getTitle().equals("Sign-on: Mercury Tours"));
		driver.findElement(By.name("userName")).sendKeys("abb@wp.pl");
		driver.findElement(By.name("password")).sendKeys("qwe123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("CONTACT")).click();
		
		
	}
	
	
	
	@After
	public void tearDown() {
		Init.endTest();
	}

}
