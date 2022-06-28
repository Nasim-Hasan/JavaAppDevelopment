/**
 * 
 */
package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author BJIT
 *
 */
public class Steps {
	
	WebDriver driver;
	
	@Given("^Open the Chrome and launch the application$")				
    public void open_the_Chrome_and_launch_the_application() throws Throwable							
    {		
        //System.out.println("This Step open the Chrome and launch the application.");	
		//setting the driver executable
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");

		//Initiating your chromedriver
		driver=new ChromeDriver();
	    driver.manage().window().maximize();			
        driver.get("http://demo.guru99.com/v4");
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       //System.out.println("This step enter the Username and Password on the login page.");	
    	
    	driver.findElement(By.name("uid")).sendKeys("username12");							
        driver.findElement(By.name("password")).sendKeys("password12");	
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {    		
        //System.out.println("This step click on the Reset button.");	
    	
    	Thread.sleep(2000);
    	driver.findElement(By.name("btnReset")).click();
    }

}
