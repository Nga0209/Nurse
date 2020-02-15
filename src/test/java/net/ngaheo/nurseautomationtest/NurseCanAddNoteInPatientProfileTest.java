package net.ngaheo.nurseautomationtest;


import io.github.bonigarcia.wdm.WebDriverManager;
import net.ngaheo.nurseautomationtest.pages.PatientListPage;
import net.ngaheo.nurseautomationtest.pages.SideMenu;
import net.ngaheo.nurseautomationtest.pages.SignInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class NurseCanAddNoteInPatientProfileTest extends BaseTest {

    @Test
    public void addNoteInListPage() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage
                .setUsername("nurse.vievie.1")
                .setPassword("vievie2017")
                .clickLogin();
        SideMenu.create(driver)
                .clickPatientProfile()
                .clickPatientList();

        PatientListPage patientListPage= new PatientListPage(driver);
        patientListPage
                .houverMouse();
        patientListPage
                .viewButton();
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
