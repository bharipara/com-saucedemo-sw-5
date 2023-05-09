package com.saucedemo.pages;

import com.aventstack.extentreports.Status;
import com.saucedemo.customlistners.CustomListeners;
import com.saucedemo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {


    @CacheLookup
    @FindBy(id = "user-name")
    WebElement userName;

    @CacheLookup
    @FindBy(id="password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "login-button")
    WebElement clickOnLogin;


        public void sendTextToUserNameField() {
            CustomListeners.test.log(Status.PASS,"Send Text to UserName Field");
            Reporter.log("Send Text to UserName Field" +userName.toString());
            sendTextToElement(userName, "standard_user");
        }

        public void sendTextToPasswordField() {
            CustomListeners.test.log(Status.PASS,"Send Text to Password Field");
            Reporter.log("Send Text to Password Field" + password.toString());
            sendTextToElement(password, "secret_sauce");
        }

        public void clickOnLoginButton() {
            CustomListeners.test.log(Status.PASS,"Click On Login button");
            Reporter.log("Click On Login button" + clickOnLogin.toString());
            clickOnElement(clickOnLogin);
        }
    }

