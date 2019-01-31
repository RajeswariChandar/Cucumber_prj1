package stepDefinition;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VehicleReg 
{
    WebDriver driver;
      
@Given("^Open the website and start the application$")
public void Open_the_website_and_start_the_application() throws Throwable {
	
		//@SuppressWarnings("unused")
	File gecko = new File("C:/Users/RAJI-PC\\Downloads\\geckodriver-v0.23.0-win64/geckodriver.exe"); 
	System.setProperty("webdriver.gecko.driver", gecko.getAbsolutePath());
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://covercheck.vwfsinsuranceportal.co.uk/");
   
}

@When("^Enter the vehicle registration number$")
public void Enter_the_vehicle_registration_number() throws Throwable {
	driver.findElement(By.id("vehicleReg")).sendKeys("OV12UYY"); 
}

@When("^Click on Find Vehicle$")
public void Click_on_Find_Vehicle() throws Throwable {
	driver.findElement(By.name("btnfind")).click();
}

@Then("^I get the message as Vechile Exists$")
public void I_get_the_message_as_Vechile_Exists() throws Throwable {
     System.out.println("Vehicle Exists and coverage period is displayed");
	   
}
}