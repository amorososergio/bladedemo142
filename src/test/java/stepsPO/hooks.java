package stepsPO;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.base;

public class hooks {
    base base;

    public hooks(base base) {
        this.base = base;
    }

    @Before
    public void inciarPO() {
        WebDriverManager.chromedriver().setup();
        base.driver = new ChromeDriver();
        base.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
        base.driver.manage().window().maximize();
    }
    
    @After
    public void finalizarPO() {
        base.driver.quit();
    }
}
