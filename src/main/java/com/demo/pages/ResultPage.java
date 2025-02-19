package com.demo.pages;

import com.demo.core.base.PageTools;
import org.openqa.selenium.By;
import java.util.List;

public class ResultPage extends PageTools {
    private final By headers = By.xpath("//div[@class='yuRUbf']//a//h3");

   public boolean checkForResult(String text) {
        boolean hasWord = true;
        for (String header : getElementsText(headers)) {
            if (!header.contains(text)) {
               hasWord = false;
               break;
            }
        }
        return hasWord;
     }

    public void waitForResult() {
        waitForElementVisibility(headers);
    }

}
