package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleModelPage {

    public VehicleModelPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][1]")
    public WebElement fleetModule;

    @FindBy(xpath = "//span[text()='Vehicles Model']")
    public WebElement vehicleModel;

    @FindBy(xpath = "//a[@class='grid-header-cell__link']")
    public WebElement columnNames;

    @FindBy(xpath = "//div[text()='You do not have permission to perform this action.']")
    public WebElement errorMsg;

  //  @FindBy(xpath = "//button[@class='close']")
  //  public WebElement closeBtn;


}
