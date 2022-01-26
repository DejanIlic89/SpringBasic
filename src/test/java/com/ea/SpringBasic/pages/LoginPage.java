package com.ea.SpringBasic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class LoginPage extends BasePage {

    @FindBy(how = How.NAME, using = "UserName")
    private WebElement txtUserName;
    @FindBy(how = How.NAME, using = "Password")
    private WebElement txtPassword;
    @FindBy(how = How.CSS, using = ".btn-default")
    private WebElement btnLogin;
    @FindBy(how = How.LINK_TEXT, using = "Log off")
    private WebElement btnLogout;

    public void login(String userName, String password) {
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public void clickLogout() {
        btnLogout.click();
    }

}
