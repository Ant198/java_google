package com.demo.pages;

import com.demo.core.base.PageTools;
import org.openqa.selenium.By;
import java.util.List;

public class ResultPage extends PageTools {
    private final By headers = By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']");

    public List<String> getTexts() {
        return getElementsText(headers);
    }

     public boolean checkForResult(String text) {
        boolean hasWord = true;
        for (String header : getTexts()) {
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
