package com.demo;

import com.demo.core.base.BaseTest;
import com.demo.pages.Pages;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Test Epic")
@Feature("Test feature")
@Owner("QA Fedorov Anton")
public class AllHeadersWordCheckTest extends BaseTest {

    @Test(description = "FirstTest")
    public void firstTest() {
        String searchWord = System.getProperty("myArg", "Java");
        logInfo("searchWord is " + searchWord);

        Pages.homePage().waitForSearchForm();
        Pages.homePage().search(searchWord);
        Pages.resultPage().waitForResult();

        Assert.assertTrue(Pages.resultPage().checkForResult(searchWord), "not all headers contain searched word");
    }
}