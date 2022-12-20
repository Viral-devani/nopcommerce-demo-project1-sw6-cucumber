package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class PaymentMethodPage extends Utility {
    private static final Logger log = LogManager.getLogger(PaymentMethodPage.class.getName());
    public PaymentMethodPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(id="paymentmethod_1")
    WebElement creditCardRadioButton;

    @CacheLookup
    @FindBy(id="//button[@name='save' and @class='button-1 payment-method-next-step-button']")
    WebElement continueButton;



    public void clickOnCreditCardRadioButton(){
        Reporter.log("Click on credit card radio button"+creditCardRadioButton.toString());
        clickOnElement(creditCardRadioButton);
    }

    public void clickOnContinueButton(){
        Reporter.log("Click on contine button"+continueButton.toString());
        clickOnElement(continueButton);
    }
}
