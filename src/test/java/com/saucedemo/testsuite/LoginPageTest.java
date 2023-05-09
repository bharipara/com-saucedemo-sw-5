package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity","regression"})

    public void userShouldLoginSuccessfullyWithValid() {
        loginPage.sendTextToUserNameField();
        loginPage.sendTextToPasswordField();
        loginPage.clickOnLoginButton();

        String expectedMessage = "Products";
        String actualMessage = getTextFromElement(By.xpath("//span[@class = 'title']"));
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test(groups = {"smoke","regression"})
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.sendTextToUserNameField();
        loginPage.sendTextToPasswordField();
        loginPage.clickOnLoginButton();
        String expectedMessage = "Products";
    }
}
