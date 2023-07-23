package com.navfort.pages;


import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_202_DescriptionPage {

    public US_202_DescriptionPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "(//span[normalize-space(text())='Activities'])[1]")
    public WebElement activitiesModule;

    @FindBy(xpath = "//span[.='Calendar Events']")
    public WebElement calendarEvent;

    @FindBy(xpath = "//a[@class='btn main-group btn-primary pull-right ']")
    public WebElement createCalendarEvent;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement inputRepeat;


    @FindBy(tagName = "iframe")
    public WebElement iframe;

    @FindBy(tagName = "p")
    public WebElement inputDescription;
    //iframe



}
