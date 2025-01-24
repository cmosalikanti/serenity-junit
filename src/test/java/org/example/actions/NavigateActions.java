package org.example.actions;

import net.serenitybdd.core.steps.UIInteractions;

public class NavigateActions extends UIInteractions {
    public void openLoginPage() {
        openUrl("https://www.saucedemo.com/");
    }
}
