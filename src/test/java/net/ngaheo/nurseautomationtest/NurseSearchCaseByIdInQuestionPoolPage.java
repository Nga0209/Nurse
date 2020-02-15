package net.ngaheo.nurseautomationtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.ngaheo.nurseautomationtest.pages.QuestionPoolPage;
import net.ngaheo.nurseautomationtest.pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class NurseSearchCaseByIdInQuestionPoolPage extends BaseTest {
    @Test
    public void searchById(){
        SignInPage signInPage= new SignInPage(driver);
            signInPage
                    .setUsername("nurse.vievie.1")
                    .setPassword("vievie2017")
                    .clickLogin();

        QuestionPoolPage questionPoolPage = new QuestionPoolPage(driver);
            questionPoolPage
                    .setIdCaseInSearch("16758")
                    .clickOnSearchButton();
    }
}
