package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {

    public WebTablePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//thead[@class='grid-header'])//input[@type='checkbox']")
    public WebElement firstCheckBox;

    @FindBy(xpath = "(//tbody[@class='grid-body'])/tr[5]/td//input")
    public WebElement anyBox;
}
