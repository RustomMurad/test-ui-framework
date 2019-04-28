package abstraction.poms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;


public class DropDown {
    private final WebDriver driver;

    public DropDown(WebDriver driver) {
        this.driver = driver;
    }
    public void accessDropDown (String contactType) throws InterruptedException {
        Select drpContactType = new Select (driver.findElement(By.name("contactType")));
        drpContactType.selectByVisibleText(contactType);

        Thread.sleep(1000);
    }
}


