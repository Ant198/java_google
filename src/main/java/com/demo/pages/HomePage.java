package com.demo.pages;

import com.demo.core.base.PageTools;
import org.openqa.selenium.By;

public class HomePage extends PageTools {
    private final By searchField = By.xpath("//textarea[@class='gLFyf']");
    private final By searchButton = By.xpath("//input");

    public void search(String searchObject) {
        typeWithoutWipe(searchObject, searchField);
        click(searchButton);
    }

    public void waitForSearchForm() {
        waitForElementVisibility(searchField);
    }

}
