package com.ea.SpringBasic.steps;

import com.ea.SpringBasic.models.TestUserDetails;
import com.ea.SpringBasic.models.UserDetails;
import com.ea.SpringBasic.pages.HomePage;
import com.ea.SpringBasic.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

public class LoginSteps {

    @Autowired
    private HomePage homePage;

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private TestUserDetails testUserDetails;

    @Given("I click login in Home Page")
    public void iClickLoginInHomePage() {
        homePage.clickLogin();
        testUserDetails.setUserDetails(new UserDetails("admin", "password"));
    }

    @Given("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        Assert.assertTrue(homePage.isEmployeeDetailsExist(), "Its not displayed");
    }

    @Then("I click logout link")
    public void iClickLogoutLink() {
        loginPage.clickLogout();
    }
}
