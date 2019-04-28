package abstraction.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Footer {

    WebDriver driver;

    public Footer(WebDriver webdriver) {
        this.driver=webdriver;
    }
    public void selHome(){
        driver.findElement(By.cssSelector("#root > div > div > div.footer > div > div:nth-child(1) > div.col-4.offset-1.col-sm-2 > ul > li:nth-child(1) > a")).click();
    }

    public void selAboutUs(){
        driver.findElement(By.cssSelector("#root > div > div > div.footer > div > div:nth-child(1) > div.col-4.offset-1.col-sm-2 > ul > li:nth-child(2) > a")).click();
    }

    public void selMenu(){
        driver.findElement(By.cssSelector("#root > div > div > div.footer > div > div:nth-child(1) > div.col-4.offset-1.col-sm-2 > ul > li:nth-child(3) > a")).click();
    }

    public void selContactUs(){
        driver.findElement(By.cssSelector("#root > div > div > div.footer > div > div:nth-child(1) > div.col-4.offset-1.col-sm-2 > ul > li:nth-child(4) > a")).click();
    }
    public void selEmail(){
        driver.findElement(By.cssSelector("#root > div > div > div.footer > div > div:nth-child(1) > div.col-7.col-sm-5 > address > a")).click();
    }

}



