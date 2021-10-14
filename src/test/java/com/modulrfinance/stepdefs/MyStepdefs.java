package com.modulrfinance.stepdefs;

import com.modulrfinance.pages.LoginPage;
import com.modulrfinance.pages.ResetAcessPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^user is on login in page$")
    public void userIsOnLoginInPage() {
    }

    @When("^user enters valid \"([^\"]*)\" in the username field$")
    public void userEntersValidInTheUsernameField(String userName) {
        new LoginPage().enterUsername(userName);

    }

    @And("^user enters valid \"([^\"]*)\" in the password field$")
    public void userEntersValidInThePasswordField(String passWord) {
        new LoginPage().enterPassword(passWord);

    }


    @Then("^user should be able to login securely$")
    public void userShouldBeAbleToLoginSecurely() throws InterruptedException {

        new LoginPage().clickOnSignInButton();
    }

    @And("^user should see \"([^\"]*)\" if valid credentials not entered or missing$")
    public void userShouldSeeIfValidCredentialsNotEnteredOrMissing(String errorMsg) {

        errorMsg = "This field is required";
        Assert.assertEquals("This field is required",new LoginPage().genericErrorMessage());
        Assert.assertEquals("This field is required",new LoginPage().adequateErrorMessage(),errorMsg);
        Assert.assertEquals("The username or password is incorrect.", new LoginPage().dynamicErrorMessage());

    }

    @When("^user is clicks on Forgotten Password link$")
    public void userIsClicksOnForgottenPasswordLink() {
        new LoginPage().userClickOnForgottenPasswordLink();
    }

    @Then("^user should be able to reset password via Reset access page$")
    public void userShouldBeAbleToResetPasswordViaResetAccessPage() {
        Assert.assertEquals("Reset access", new ResetAcessPage().verifyTextOnResetAccessPage());
    }


}
