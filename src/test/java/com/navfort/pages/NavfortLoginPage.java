package com.navfort.pages;

import com.navfort.utilities.ConfigurationReader;
import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavfortLoginPage {

    public NavfortLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement userName;

    @FindBy(id = "prependedInput2")
    public WebElement passWord;

    @FindBy(id = "_submit")
    public WebElement loginBtn;


    public void login(String username,String password){
         userName.sendKeys(username);
         passWord.sendKeys(password);
         loginBtn.click();

    }

    public void loginDynamic(String userType){

        userType = userType.replace(" ","_");

        String username= ConfigurationReader.getProperty(userType + "_username");
        String password= ConfigurationReader.getProperty(userType + "_password");

        login(username,password);


    }


}
