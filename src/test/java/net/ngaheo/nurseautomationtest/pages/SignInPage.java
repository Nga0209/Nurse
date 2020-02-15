package net.ngaheo.nurseautomationtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
    private static final String USERNAME_XPATH = "//input[@name='username']";
    private static final String PASSWORRD_XPATH = "//input[@name='password']";
    private static final String LOGIN_XPATH = "//button[@class='login-section__signin-btn']";

    private WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }


    /**
     * Return itself to make a fluent api pattern
     *
     * @return
     */
    public SignInPage setUsername(String username) {
        WebElement usernameEle = driver.findElement(By.xpath(USERNAME_XPATH));
        usernameEle.sendKeys(username);
        return this;
    }

    public SignInPage setPassword(String password) {
        // Set password
        WebElement passwordEle = driver.findElement(By.xpath(PASSWORRD_XPATH));
        passwordEle.sendKeys(password);
        return this;
    }

    public SignInPage clickLogin() {
        // Login
        WebElement loginEle = driver.findElement(By.xpath(LOGIN_XPATH));
        loginEle.click();
        return this;
    }
}
