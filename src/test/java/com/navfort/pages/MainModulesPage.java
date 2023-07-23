package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainModulesPage {

    public MainModulesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public List<WebElement>allModules;


}
