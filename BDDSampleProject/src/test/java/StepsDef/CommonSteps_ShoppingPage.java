package StepsDef;

import static BDD_driversUtils.WebdriversUtils.getDriver;
import static comm.implimentation.AppAccess.*;//accessapp(); is called for to initiate the driver & assign the url

import org.openqa.selenium.WebDriver;
import static Common_Variables.Global_Variables.*;
import io.cucumber.java.en.Given;

public class CommonSteps_ShoppingPage {
	@Given("User is on page")
	public void user_is_on_page() {
		accessapp();
	   
		}

}
