package com.navfort.stepDefinitions;

import com.navfort.pages.VehicleModelPage;
import com.navfort.pages.VehiclesPage;
import com.navfort.utilities.BrowserUtils;
import com.navfort.pages.NavfortLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VehiclePage_StepDefinitions {


    NavfortLoginPage navfortLoginPage = new NavfortLoginPage();

    VehicleModelPage vehicleModelPage = new VehicleModelPage();
    NavfortLogin_StepDefinitions navfortLoginStepDefinitions = new NavfortLogin_StepDefinitions();

    BrowserUtils browserUtils = new BrowserUtils();
    @Given("Login as store manager")
    public void loginAsStoreManager() {

        navfortLoginStepDefinitions.user_enters_the_store_manager_information();


    }

    @When("user clicks on Fleet module")
    public void userClicksOnFleetModule() throws InterruptedException {

       vehicleModelPage.fleetModule.click();
       // browserUtils.hover(vehiclePage.fleetModule);
       // Thread.sleep(3000);
    }

    @And("user clicks on Vehicles Model")
    public void userClicksOnVehiclesModel() {

        BrowserUtils.waitFor(5);
        vehicleModelPage.vehicleModel.click();
        BrowserUtils.waitFor(5);
    }

    @Then("user should see {int} columns")
    public void userShouldSeeColumns(int arg0) {

        List<WebElement> columnNames = vehicleModelPage.columnNames.findElements(By.xpath("//a[@class='grid-header-cell__link']"));

        Assert.assertEquals(columnNames.size(),10);
    }


    @Given("Login as sales manager")
    public void loginAsSalesManager() {

        navfortLoginStepDefinitions.user_enters_the_sales_manager_information();

    }

    @Given("Login as a driver")
    public void loginAsADriver() {

        navfortLoginStepDefinitions.user_enters_the_driver_information();
    }

    @Then("user should see {string}")
    public void userShouldSee(String arg0) throws InterruptedException {

        Thread.sleep(3000);
      // vehiclePage.closeBtn.click();
        vehicleModelPage.errorMsg.isDisplayed();

    }
}
