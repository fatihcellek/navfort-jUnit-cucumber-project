package com.navfort.stepDefinitions;
import com.navfort.pages.NavfortLoginPage;
import com.navfort.utilities.ConfigurationReader;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class NavfortLogin_StepDefinitions {

    NavfortLoginPage navfortLoginPage = new NavfortLoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
    }

    @When("user enters the driver information")
    public void user_enters_the_driver_information() {
        navfortLoginPage.login(ConfigurationReader.getProperty("driver_username"),ConfigurationReader.getProperty("driver_password"));

    }



    @When("user enters the sales manager information")
    public void user_enters_the_sales_manager_information() {
        navfortLoginPage.login(ConfigurationReader.getProperty("sales_manager_username"),ConfigurationReader.getProperty("sales_manager_password"));

    }

    @When("user enters the store manager information")
    public void user_enters_the_store_manager_information() {
        navfortLoginPage.login(ConfigurationReader.getProperty("store_manager_username"),ConfigurationReader.getProperty("store_manager_password"));
    }


    @When("user enters the {string} information")
    public void user_enters_the_information(String userType) {

    navfortLoginPage.loginDynamic(userType);

    }








}
