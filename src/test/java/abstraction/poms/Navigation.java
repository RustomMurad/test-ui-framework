package abstraction.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Navigation {

    WebDriver driver;

    public Navigation(WebDriver webdriver) {
        this.driver=webdriver;
    }
    public void gotoLogo(){
        //driver.findElement(By.cssSelector("#root > div > div > nav > div > a > img")).click();
        driver.findElement(By.cssSelector("a.mr-auto.navbar-brand")).isDisplayed();
    }

    public void gotoHome(){
        driver.findElement(By.linkText("Home")).click();

    }

    public void gotoAboutUs(){
        driver.findElement(By.linkText("About Us")).click();

    }

    public void gotoMenu(){
        driver.findElement(By.linkText("Menu")).click();
    }

    public void gotoContactUs(){
        driver.findElement(By.linkText("Contact Us")).click();
    }
    public void gotoLogin(){
        driver.findElement(By.cssSelector("div.container button.btn.btn-outline-secondary")).click();
    }

}

