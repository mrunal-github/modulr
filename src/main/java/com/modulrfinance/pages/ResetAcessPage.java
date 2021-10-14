package com.modulrfinance.pages;

import com.modulrfinance.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResetAcessPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResetAcessPage.class.getName());


    @FindBy(xpath = "//p[@id = 'signInHeading']")
    WebElement resetAccess;


    public String verifyTextOnResetAccessPage(){
        log.info("Verifying Page Message" + resetAccess.toString());
        return getTextFromElement(resetAccess);

    }
}
