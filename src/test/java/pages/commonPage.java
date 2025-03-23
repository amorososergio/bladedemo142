package pages;

import org.openqa.selenium.WebDriver;

public class commonPage {

    public WebDriver driver;

    public commonPage(WebDriver driver) {
        this.driver = driver;
    }

    public String lerNomeDaGuia() {
        return driver.getTitle();
     }	
    
}
