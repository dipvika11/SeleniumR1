package StepsDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static Common_Variables.Global_Variables.*;//import all globale declared variable e.g driver 
import io.cucumber.java.en.*;
import static BDD_driversUtils.WebdriversUtils.*;//driver browser declared imported from this class
//dipvika11@gmail.com-//Dipvika11 pwd-http: //automationpractice.com/index.php?controller=authentication&back=my-account

public class Demo1Steps {
	
	@When("User click on signin link")
	public void user_click_on_sign_link() {
		driver.findElement(By.linkText("Sign in")).click();

	}
	@And ("User Enter login details {string}  pasword {string} and click on signin")
	public void Signin_Details_entered_by_user(String emailid, String pass) 
	{
		cdriver.findElement(By.id("email")).sendKeys(emailid);
		cdriver.findElement(By.id("passwd")).sendKeys(pass);
		cdriver.findElement(By.id("SubmitLogin")).click();
		
	}

	@Then("User should be logged in successfully.")
	public void User_logged_in_successfully() 
	{

	    System.out.println("output-step3");
	}

}
