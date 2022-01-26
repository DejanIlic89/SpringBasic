package com.ea.SpringBasic.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(name = "env", havingValue = "qa")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MainPage extends BasePage {

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private HomePage homePage;

    public void performLogin() {
        homePage.clickLogin();
        loginPage.login("admin", "password");
        loginPage.clickLogin();
    }

}
