package com.navfort.stepDefinitions;

import com.navfort.pages.NavfortLoginPage;
import com.navfort.pages.US_198_DescriptionPage;
import com.navfort.pages.VehiclesPage;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

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
        BrowserUtils.sleep(15);
    }

    @And("user must see 3 dot\"...\" far right of the page")
    public void user_must_see_dot_far_right_of_the_page() {
   BrowserUtils.hover(us198DescriptionPage.Dots);
BrowserUtils.sleep(5);
    }
    @Then("users should see “view, edit, delete” icons")
    public void users_should_see_view_edit_delete_icons() {
      Assert.assertTrue(us198DescriptionPage.ViewIcon.isDisplayed());
      Assert.assertTrue(us198DescriptionPage.EditIcon.isDisplayed());
      Assert.assertTrue(us198DescriptionPage.DeleteIcon.isDisplayed());
    }

}
