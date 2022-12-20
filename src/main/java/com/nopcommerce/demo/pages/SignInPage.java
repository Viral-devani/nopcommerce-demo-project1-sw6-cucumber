package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement signInPageWelcomeMessage;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerTab;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkOutAsGuest;


    public String getTextFromWelcomeMessage() {
        Reporter.log("Get text from welcome message" + signInPageWelcomeMessage.toString());
        return getTextFromElement(signInPageWelcomeMessage);
    }

    public void clickOnRegisterTab() {
        Reporter.log("click on RegisterTab" + registerTab.toString());
        clickOnElement(registerTab);
    }

    public void clickOnCheckOutAsAGuestTab() {
        Reporter.log("Click on check out as a guesttab" + checkOutAsGuest.toString());
        clickOnElement(checkOutAsGuest);
    }

}
