package net.ngaheo.nurseautomationtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SideMenu {
    private static final String  PATIENTPROFILE_XPATH="//span[contains(text(),'Patient profiles')]";
    private  static final String PATIENTLIS_XPATH="//span[contains(text(),'Patient List')]";

    private WebDriver driver;

    public SideMenu(WebDriver driver) {
        this.driver = driver;
    }

    public static SideMenu create(WebDriver driver) {
        return new SideMenu(driver);
    }

    public SideMenu clickPatientProfile(){
        WebElement patientProfileEls= driver.findElement(By.xpath(PATIENTPROFILE_XPATH));
        patientProfileEls.click();
        return this;
    }
    public SideMenu clickPatientList(){
        WebElement patientListEle= driver.findElement(By.xpath(PATIENTLIS_XPATH));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        patientListEle.click();
        return this;
    }

}
