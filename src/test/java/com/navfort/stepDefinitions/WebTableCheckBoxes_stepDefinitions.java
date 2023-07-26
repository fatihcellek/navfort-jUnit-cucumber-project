package com.navfort.stepDefinitions;

import com.navfort.pages.HomePage;
import com.navfort.pages.NavfortLoginPage;
import com.navfort.pages.NavfortLoginPage;
import com.navfort.pages.WebTablePage;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.ConfigurationReader;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebTableCheckBoxes_stepDefinitions {
    HomePage homePage = new HomePage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    WebTablePage tablePage = new WebTablePage();

    @When("user launch on the Vehicle page")
    public void user_launch_on_the_vehicle_page() {
    }
    @Then("user hover over on the Fleet")
    public void user_hover_over_on_the_fleet() {

        wait.until(ExpectedConditions.visibilityOf(homePage.Fleet));

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(homePage.Fleet).perform();


    }
    @Then("user click on Vehicles")
    public void user_click_on_vehicles() {
        homePage.Vehicles.click();
    }
    @Then("all the checkboxes should be unchecked")
    public void all_the_checkboxes_should_be_unchecked() {

        Assert.assertFalse("All the boxes are checked",tablePage.firstCheckBox.isSelected());

    }

    @When("user click on the first checkbox")
    public void user_click_on_the_first_checkbox() {
        Driver.getDriver().get(ConfigurationReader.getProperty("dataTableUrl"));
        BrowserUtils.sleep(7);
        tablePage.firstCheckBox.click();
    }
    @Then("user should be able to check all the boxes")
    public void user_should_be_able_to_check_all_the_boxes() {
       Assert.assertTrue(tablePage.firstCheckBox.isSelected());
    }


    @Then("user is able to select any car")
    public void user_is_able_to_select_any_car() {

        wait.until(ExpectedConditions.invisibilityOf(tablePage.anyBox));

        Driver.getDriver().get(ConfigurationReader.getProperty("dataTableUrl"));
        BrowserUtils.sleep(7);
        tablePage.anyBox.click();

        Assert.assertTrue(tablePage.anyBox.isSelected());
    }


}
