package org.example.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class LoginActions extends UIInteractions {
    @Step
    public void enterUsername(String username) {
        $("#user-name").sendKeys(username);
    }

    @Step
    public void enterPassword(String password) {
        $("#password").sendKeys(password);
    }

    @Step
    public void clickLoginButton() {
        $("#login-button").click();
    }
}
