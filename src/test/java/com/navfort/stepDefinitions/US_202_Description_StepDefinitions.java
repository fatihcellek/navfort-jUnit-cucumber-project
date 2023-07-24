package com.navfort.stepDefinitions;

import com.navfort.pages.NavfortLoginPage;
import com.navfort.pages.US_202_DescriptionPage;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.ConfigurationReader;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US_202_Description_StepDefinitions {

    NavfortLoginPage navfortLoginPage = new NavfortLoginPage();
    US_202_DescriptionPage us202DescriptionPage = new US_202_DescriptionPage();


    @Then("user should be able to login")
    public void user_should_be_able_to_login() {

        BrowserUtils.sleep(3);

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";



        Assert.assertEquals("Title verification failed!", expectedTitle, actualTitle);


    }


    @Then("user clicks on the Activities module")
    public void user_clicks_on_the_activities_module() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(us202DescriptionPage.activitiesModule));

        us202DescriptionPage.activitiesModule.click();

    }


    @Then("user clicks on the Calendar Events button")
    public void user_clicks_on_the_calendar_events_button() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(us202DescriptionPage.calendarEvent));

        us202DescriptionPage.calendarEvent.click();


    }


    @Then("User sees Calendar Events is in the title")
    public void user_sees_calendar_events_is_in_the_title() {

        String expectedInTitle = "Calendar Events - Activities";

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.titleIs(expectedInTitle));

        Assert.assertEquals(expectedInTitle, Driver.getDriver().getTitle());

    }


    @Then("user clicks Create Calendar Event button")
    public void user_clicks_create_calendar_event_button() {

        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.visibilityOf(us202DescriptionPage.createCalendarEvent));

        BrowserUtils.sleep(5);

        us202DescriptionPage.createCalendarEvent.click();


    }


    @Then("User sees Create Calendar event is in the title")
    public void user_sees_create_calendar_event_is_in_the_title() {

        String expectedTitle = "Calendar Events";

       //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
       //wait.until(ExpectedConditions.titleIs(expectedTitle));

        BrowserUtils.sleep(2);

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));


    }


    @Then("user clicks on the repeat option")
    public void user_clicks_on_the_repeat_option() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(us202DescriptionPage.inputRepeat));

        //BrowserUtils.sleep(2);
        us202DescriptionPage.inputRepeat.click();


    }


    @When("user write a message in Description")
    public void user_write_a_message_in_description() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(us202DescriptionPage.iframe));

        Driver.getDriver().switchTo().frame(us202DescriptionPage.iframe);

        //BrowserUtils.sleep(2);

        us202DescriptionPage.inputDescription.clear();
        us202DescriptionPage.inputDescription.sendKeys("Scrum daily meeting");


    }


    @Then("The message should be displayed")
    public void the_message_should_be_displayed() {

        String expectedText = "Scrum daily meeting";

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(us202DescriptionPage.inputDescription));

        //String actualText = Driver.getDriver().findElement(By.tagName("p")).getText();
        String actualText = us202DescriptionPage.inputDescription.getText();

        Assert.assertTrue(actualText.equals(expectedText));

        //Driver.getDriver().switchTo().defaultContent();

    }
}
