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


    @FindBy(xpath = "//tr[9]/td[20]/div/div/a")
    public WebElement Dots;




   @FindBy(xpath = "//tr[9]/td[20]/div/div//li//a")
    public WebElement ViewIcon;

//    @FindBy(xpath = "((//a[@class='dropdown-toggle'])[9]/li[1]")
//    public WebElement ViewIcon;




    @FindBy(xpath = "//tr[9]/td[20]/li[2]/a")
    public WebElement EditIcon;

    @FindBy(xpath = "//tr[9]/td[20]/li[3]/a")
    public WebElement DeleteIcon;







}
