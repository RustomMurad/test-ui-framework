package abstraction.poms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.security.auth.spi.LoginModule;


public class LoginModal {
    private final WebDriver driver;

    public LoginModal(WebDriver driver) {
        this.driver = driver;
    }




    public void loginAs(String username, String password) {

        //driver.findElement(By.cssSelector("div.container button.btn.btn-outline-secondary")).click();
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys( password);
        driver.findElement(By.name("remember")).click();
        driver.findElement(By.cssSelector("div.modal-body button.btn.btn-primary")).submit();

    }


}
