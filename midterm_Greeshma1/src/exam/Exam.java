package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class Exam {
	
	WebDriver driver= new FirefoxDriver(); 
@BeforeTest
 public void launchBrowser()
	{
		  System.out.println("launching firefox browser");
		  System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		  driver.get("https://demo.openmrs.org/openmrs/");
		   System.out.println("tt");
	}
@Test(priority=-1)
public void login()
{
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin123");
	driver.findElement(By.xpath("//li[contains(text(),'Registration Desk')]")).click();
	driver.findElement(By.xpath("//input[@id='loginButton']")).click();
	driver.findElement(By.xpath("//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")).click();
	}
@Test(priority=0)
public void registerPatient()
{
	driver.findElement(By.xpath("//input[@name=\"givenName\"]")).sendKeys("Greeshma");
	driver.findElement(By.xpath("//input[@name=\"middleName\"]")).sendKeys("Chowdary");
	driver.findElement(By.xpath("//input[@name=\"familyName\"]")).sendKeys("Gunnam");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
	driver.findElement(By.xpath("//select[@id=\"gender-field\"]//option[2]")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"birthdateDay-field\"]")).sendKeys("24");
	driver.findElement(By.xpath("//select[@id=\"birthdateMonth-field\"]//option[@value=\"4\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"birthdateYear-field\"]")).sendKeys("1998");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
	driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("4560");
	driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Decarie");
	driver.findElement(By.xpath("//input[@id='cityVillage']")).sendKeys("Montreal");
	driver.findElement(By.xpath("//input[@id='stateProvince']")).sendKeys("Quebec");
	driver.findElement(By.xpath("//input[@id='country']")).sendKeys("Canada");
	driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("H3X2H6");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
	driver.findElement(By.xpath("//input[@name=\"phoneNumber\"]")).sendKeys("5147958938");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
	driver.findElement(By.xpath("//select[@id=\"relationship_type\"]//option[@data-val=\"Doctor\"]")).click();
	driver.findElement(By.xpath("//input[@ng-model=\"relationship.name\"]")).sendKeys("Naveen");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//button[@id=\"next-button\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"submit\"]")).click();
}
@Test(priority=3)
public void Logout()
{
	driver.findElement(By.xpath("//a[@href=\"/openmrs/appui/header/logout.action?successUrl=openmrs\"]")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.quit();
	
}
}

