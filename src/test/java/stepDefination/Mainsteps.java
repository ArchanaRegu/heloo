package stepDefination;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mainsteps {
	@Given("User is on NetBanking Landing Page.")
	public void user_is_on_net_banking_landing_page() {
	    System.out.println("User is on NetBanking Landing Page.");
	}
	@When("^User login into application with username (.+) and password (.+)$")
	public void user_login_into_application(String username,String password) {
	    System.out.println("Username "+username+" password "+password);
	   
	}
	@Then("Homepage is displayed")
	public void homepage_is_displayed() {
	    System.out.println("Homepage is displayed");
	}
	@Then("cards are displayed")
	public void cards_are_displayed() {
	    System.out.println("cards are displayed");
	}
	@Given("User is on Practice Landing Page.")
	public void landing_page() {
	    System.out.println("User is on NetBanking Landing Page.");
	}
	@When("^User Signup into application")
	public void user_login_application(List<String>data) {
		for(int i=0;i<data.size();i++)
	    System.out.println(data.get(i));
	}
	@Given("setup the entries in DataBase")
	public void entries_in_DataBase() {
		System.out.println("**********************");
		System.out.println("setup the entries in DataBase");
	}
	 @When("launch the browser from config variables")
	 public void Launch_browser() {
		System.out.println("launch the browser from config variables");
		//Assert.assertTrue(false);

	}
	  @When("hit the HomePage url of banking site")
	  public void HomePage() {
		 System.out.println("hit the HomePage url of banking site"); 
	  }
}
