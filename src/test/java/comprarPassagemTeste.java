import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class comprarPassagemTeste {

  private WebDriver driver;
  JavascriptExecutor js;

  @BeforeEach
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;

  }
  
  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void teste1() {
    driver.get("https://www.blazedemo.com/");
    driver.manage().window().setSize(new Dimension(974, 1032));
    driver.findElement(By.cssSelector(".btn-primary")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) .btn")).click();
    driver.findElement(By.id("inputName")).click();
    driver.findElement(By.id("inputName")).sendKeys("Sergio");
    driver.findElement(By.id("address")).sendKeys("Rua X");
    driver.findElement(By.id("city")).sendKeys("Goiania");
    driver.findElement(By.id("state")).sendKeys("Goiás");
    driver.findElement(By.id("zipCode")).sendKeys("74000");
    driver.findElement(By.id("creditCardNumber")).click();
    driver.findElement(By.id("creditCardNumber")).sendKeys("12312313131");
    driver.findElement(By.cssSelector(".control-group:nth-child(8) > .control-label")).click();
    driver.findElement(By.id("creditCardMonth")).click();
    driver.findElement(By.id("creditCardMonth")).click();

    {
      WebElement element = driver.findElement(By.id("creditCardMonth"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }

    driver.findElement(By.id("nameOnCard")).click();
    driver.findElement(By.id("nameOnCard")).sendKeys("3123131");
    driver.findElement(By.cssSelector(".btn-primary")).click();
  }
}
