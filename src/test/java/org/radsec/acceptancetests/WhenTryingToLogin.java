package org.radsec.acceptancetests;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.radsec.actions.LoginActions;
import org.radsec.actions.NavigateActions;
import org.radsec.components.Inventory;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenTryingToLogin {
    NavigateActions navigate;
    LoginActions login;
    Inventory inventory;

    @Test
    void shouldBeAbleToLogin() {
        navigate.openLoginPage();
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLoginButton();

        Serenity.reportThat("Should be able to login.",
                () ->  assertThat(inventory.isInventoryListDisplayed()).isTrue());
    }
}
