package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[normalize-space(text())='Fleet'])[1]")
    public WebElement Fleet;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement Vehicles;




}
