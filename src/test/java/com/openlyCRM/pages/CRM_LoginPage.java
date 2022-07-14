package com.openlyCRM.pages;

import com.openlyCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM_LoginPage {

    public CRM_LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "USER_LOGIN")
    private WebElement username;

    @FindBy(name = "USER_PASSWORD")
    private WebElement password;

    @FindBy(xpath = "//input[@class='login-btn']")
    private WebElement loginButton;

   public void login(){
       Driver.getDriver().get("https://qa.openlycrm.com/");
        this.username.sendKeys("hr1@cybertekschool.com");
        this.password.sendKeys("UserUser");
        this.loginButton.click();
    }


}
