package org.example.acceptancetests;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.example.actions.LoginActions;
import org.example.actions.NavigateActions;
import org.example.components.Inventory;
import org.example.components.LoginComponent;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenTryingToLogin {
    NavigateActions navigate;
    LoginActions login;
    Inventory inventory;
    LoginComponent loginComponent;

    @Test
    void shouldBeAbleToLogin() {
        navigate.openLoginPage();
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLoginButton();

        Serenity.reportThat("Should be able to login.",
                () ->  assertThat(inventory.isInventoryListDisplayed()).isTrue());
    }

    @Test
    void shouldNotBeAbleToLogin() {
        navigate.openLoginPage();
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauc");
        login.clickLoginButton();

        Serenity.reportThat("Should not be able to login for incorrect credentials.",
                () ->  assertThat(loginComponent.isErrorMessageContainerDisplayed()).isTrue());
    }

}
