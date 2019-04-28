package abstraction.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Jumbotron {

    WebDriver driver;

    public Jumbotron(WebDriver webdriver) {
        this.driver=webdriver;
    }
    public String getTitle(){
        String title;
        title=driver.findElement(By.cssSelector("div.jumbotron h1")).getText();
        return title;
    }
    public String getOverview(){
        String overview;
        overview=driver.findElement(By.cssSelector("div.jumbotron p")).getText();
        return overview;
    }

}

