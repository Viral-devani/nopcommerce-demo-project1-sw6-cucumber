package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class RegistrationComplete extends Utility {
    private static final Logger log = LogManager.getLogger(RegistrationComplete.class.getName());

    public RegistrationComplete() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompleteMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueTab;


    public String getTextFromRegisterationCompleteMessage() {
        Reporter.log("Get Registration completemessage" + registrationCompleteMessage.toString());
        return getTextFromElement(registrationCompleteMessage);
    }

    public void clickOnTheContinueButton() {
        Reporter.log("click on continue button" + continueTab.toString());
        clickOnElement(continueTab);
    }

}
