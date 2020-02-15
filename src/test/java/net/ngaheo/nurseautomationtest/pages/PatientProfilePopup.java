package net.ngaheo.nurseautomationtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PatientProfilePopup {
    private static final String EDITPATIENTPROFILEBUTTON_XPATH="//button[contains(text(),'Edit')]";
    private static final String NNOTEPATIENTPROFILE_XPATH="";

    private WebDriver driver;

    public PatientProfilePopup(WebDriver driver) {
        this.driver = driver;
    }
    public PatientProfilePopup clickEditPatientProfileButton(){
        WebElement editButton= driver.findElement(By.xpath(EDITPATIENTPROFILEBUTTON_XPATH));
        editButton.click();
        return this;
    }

}

