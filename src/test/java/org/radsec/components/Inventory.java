package org.radsec.components;

import net.serenitybdd.core.pages.PageComponent;

public class Inventory extends PageComponent {
    public boolean isInventoryListDisplayed() {
        return $(".inventory_list").isDisplayed();
    }
}
