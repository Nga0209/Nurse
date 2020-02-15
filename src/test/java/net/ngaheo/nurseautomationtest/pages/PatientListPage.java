package net.ngaheo.nurseautomationtest.pages;

import org.omg.CORBA.StringHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PatientListPage {
    private static final String VIEWFIRSTPATIENTPROFILE_XPATH="(//figure/p[@class='avatar-text'])[1]";
    private static final String HOUVERMOUSE_XPATH="//tbody/tr/td/descendant::*";
    private static final String CLICKVIEWBUTTON_XPATH="(//tr/td/div/button[@class='button button--view'][contains(text(),'View')])[1]";


    private WebDriver driver;

    public PatientListPage(WebDriver driver){
        this.driver= (WebDriver) driver;
    }
    public PatientListPage waitForVisible(){
        //
        return this;
    }
    public  PatientListPage viewFirstPatientProfile(){
        WebElement viewProfileEle= driver.findElement(By.xpath(VIEWFIRSTPATIENTPROFILE_XPATH));
        viewProfileEle.click();
        return this;
    }
    public PatientListPage houverMouse(){
        WebElement houverMouse= driver.findElement(By.xpath(HOUVERMOUSE_XPATH));
        houverMouse.click();
        return this;
    }
    public PatientListPage viewButton(){
        WebElement viewButtonEle= driver.findElement(By.xpath(CLICKVIEWBUTTON_XPATH));
        viewButtonEle.click();
        return this;
    }

}
