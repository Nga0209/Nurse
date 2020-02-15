package net.ngaheo.nurseautomationtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestionPoolPage {
    private static final String SEARCHTEXT_XPATH="//input[@name='search_criteria']";
    private static final String SEARCHBUTTON_XPATH="//a[@class='dashboard-nav__search-button']";

    private WebDriver drive;
    public QuestionPoolPage(WebDriver drive){
        this.drive=drive;
    }
    public static QuestionPoolPage create (WebDriver drive){
        return new QuestionPoolPage(drive);
    }
public QuestionPoolPage setIdCaseInSearch(String idcase){
    WebElement idCaseSearchEle= drive.findElement(By.xpath(SEARCHTEXT_XPATH));
    idCaseSearchEle.sendKeys(idcase);
    return this;
}
public QuestionPoolPage clickOnSearchButton(){
        WebElement searchButtonEle= drive.findElement(By.xpath(SEARCHBUTTON_XPATH));
        searchButtonEle.click();
    return this;
}
}
