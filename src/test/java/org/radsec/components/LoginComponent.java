package org.radsec.components;

import net.serenitybdd.core.pages.PageComponent;

public class LoginComponent extends PageComponent {
    public boolean isErrorMessageContainerDisplayed() {
        return $(".error-message-container").isDisplayed();
    }
}
