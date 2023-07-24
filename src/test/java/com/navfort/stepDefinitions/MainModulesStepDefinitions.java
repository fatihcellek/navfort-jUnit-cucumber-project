package com.navfort.stepDefinitions;

import com.navfort.pages.MainModulesPage;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class MainModulesStepDefinitions {

   MainModulesPage mainModulesPage = new MainModulesPage();

   @Then("user should be able to see following modules")
   public void user_should_be_able_to_see_following_modules(List<String>expectedModules) {
      BrowserUtils.sleep(3);

      List<String> actualModules = new ArrayList<>();

      for (WebElement eachModule : mainModulesPage.allModules) {

       actualModules.add(eachModule.getText());
      }

      Assert.assertEquals(expectedModules,actualModules);

   }
}


