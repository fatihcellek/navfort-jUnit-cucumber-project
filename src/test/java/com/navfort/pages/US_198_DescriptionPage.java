package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_198_DescriptionPage {
    public US_198_DescriptionPage(){
    PageFactory.initElements(Driver.getDriver(), this);
}

    @FindBy(xpath = "(//span[normalize-space(text())='Fleet'])[1]")
    public WebElement Fleet;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement Vehicles;

    @FindBy(css = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[14]/td[20]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]")
    public WebElement Dots;






}
