package com.navfort.stepDefinitions;

import com.navfort.pages.NavfortLoginPage;
import com.navfort.pages.US_198_DescriptionPage;
import com.navfort.pages.VehiclesPage;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_198_Description_StepDefinitions {
    NavfortLoginPage navfortLoginPage=new NavfortLoginPage();
    US_198_DescriptionPage us198DescriptionPage=new US_198_DescriptionPage();

    @When("user hover over on the Fleet")
    public void user_hover_over_on_the_fleet() {
BrowserUtils.hover(us198DescriptionPage.Fleet);
    }


    @When("user click on vehicle")
    public void user_click_on_vehicle() {
        us198DescriptionPage.Vehicles.click();
        BrowserUtils.sleep(5);
    }

    @Then("user must see {int} dot\"...\" far right of the page")
    public void user_must_see_dot_far_right_of_the_page() {
BrowserUtils.hover(us198DescriptionPage.Dots);
BrowserUtils.sleep(30);
    }
}
