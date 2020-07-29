package com.careerhack.stepdef;

import com.careerhack.common.FlightBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserRegistration extends FlightBase {

	@Given("^I am on new tours homepage$")
	public void i_am_on_new_tours_homepage()  {
		launchbrowser();
	    
	}

	@When("^I click on the register link$")
	public void i_click_on_the_register_link()  {
	    
	}

	@When("^I enter \"([^\"]*)\"last name>\"([^\"]*)\"(\\d+)\"([^\"]*)\"mypet@gmail\\.com\"([^\"]*)\"Rubrel\"([^\"]*)\"password(\\d+)\"([^\"]*)\"password(\\d+)\"$")
	public void i_enter_last_name_mypet_gmail_com_Rubrel_password_password(String arg1, String arg2, int arg3, String arg4, String arg5, String arg6, int arg7, String arg8, int arg9)  {
	    
	}

	@When("^i click on submit button$")
	public void i_click_on_submit_button()  {
	   
	}

	@Then("^I receive confirmation page and message$")
	public void i_receive_confirmation_page_and_message()  {
	  
	}


}