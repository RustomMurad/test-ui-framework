package abstraction.poms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CommentsModal  {

    private final WebDriver driver;
    private Select rating;

    public CommentsModal(WebDriver driver) {
        this.driver = driver;
        rating = new Select(this.driver.findElement(By.name("rating")));
    }

    public void addComment(String  yourrating,String yourname, String comment) {

        rating.selectByVisibleText(yourrating);
        driver.findElement(By.id("author")).sendKeys(yourname);
        driver.findElement(By.id("comment")).sendKeys(comment);
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    }


}

