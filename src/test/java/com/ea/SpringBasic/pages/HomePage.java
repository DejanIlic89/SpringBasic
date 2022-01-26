package com.ea.SpringBasic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HomePage extends BasePage {

    @FindBy(how = How.LINK_TEXT, using = "Login")
    private WebElement lnkLogin;
    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    private WebElement lnkEmployeeList;
    @FindBy(how = How.LINK_TEXT, using = "Employee Details")
    private WebElement lnkEmployeeDetails;

    public void clickLogin() {
        lnkLogin.click();
    }

    public void clickEmployeeList() {
        lnkEmployeeList.click();
    }

    public boolean isEmployeeDetailsExist() {
        return lnkEmployeeDetails.isDisplayed();
    }

}
