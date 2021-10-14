package com.modulrfinance.pages;

import com.modulrfinance.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.servlet.annotation.WebListener;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//input[@id = 'username-inp']")
    WebElement userName;
    @FindBy(xpath = "//input[@id = 'password-inp']")
    WebElement passWord;
    @FindBy(xpath = "//button[@id = 'signInSubmitButton']")
    WebElement signInButton;
    @FindBy(xpath = "//div[@class='form-group top-margin-6']/child::app-validated-input[@name='username']/child::div/child::app-error-message")
    WebElement fieldReqUserNameErrorMessage;
    @FindBy(xpath = "//body[1]/app-root[1]/app-signin[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/app-validated-input[1]/div[1]/app-error-message[1]/div[1]")
    WebElement fieldReqPassWordErrorMessage;
    @FindBy(xpath = "//div[@class = 'alert alert-danger']")
    WebElement mulErrorMessage;
    @FindBy(xpath = "//a[@id = 'forgotPasswordHref']")
    WebElement frgtPasswdLink;

    public void enterUsername(String name) {
        log.info("Entering UserName " + userName.toString());
        sendTextToElement(userName, name);
    }

    public void enterPassword(String passWrd) {
        log.info("Entering PassWord" + passWord.toString());
        sendTextToElement(passWord, passWrd);
    }

    public void clickOnSignInButton() throws InterruptedException {
        log.info("Clicking on Sign in Button" + signInButton.toString());
        Thread.sleep(3000);
        clickOnElement(signInButton);
    }

    public String genericErrorMessage() {
        log.info("Getting Error Message " + fieldReqUserNameErrorMessage.toString());
        return getTextFromElement(fieldReqUserNameErrorMessage);
    }

    public String adequateErrorMessage() {
        log.info("Getting Adequate Error Message" + fieldReqPassWordErrorMessage.toString());
        return getTextFromElement(fieldReqPassWordErrorMessage);
    }
    public String dynamicErrorMessage(){
        log.info("Getting Dynamic Message" + mulErrorMessage.toString());
        return getTextFromElement(mulErrorMessage);
    }
    public void userClickOnForgottenPasswordLink(){
        log.info("Clicking on Forgotten Password Link" +frgtPasswdLink.toString());
        clickOnElement(frgtPasswdLink);
    }
}