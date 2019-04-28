package abstraction.poms;
//import com.sun.org.apache.xpath.internal.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ContactUs {
    private final WebDriver driver;
    private Select contactType;




    public ContactUs(WebDriver driver) {
        this.driver = driver;
        contactType = new Select(this.driver.findElement(By.name("contactType")));
    }


    public void sendFeedback(String fname, String lname, String telnum, String email, String message) throws InterruptedException {
        driver.findElement(By.id("firstname")).sendKeys(fname);
        driver.findElement(By.id("lastname")).sendKeys(lname);
        driver.findElement(By.id("telnum")).sendKeys(telnum);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.cssSelector("input.form-check-input")).click();
        contactType.selectByVisibleText("Email");
        //driver.findElement(By.cssSelector("#root > div > div > div:nth-child(3) > div > div:nth-child(3) > div.col-12.col-md-9 > form > div:nth-child(5) > div.col-md-6.offset-md-2 > div > label > input")).click();
        //driver.findElement(By.xpath("/html/body/div[@id='root']/div[@class='App']/div/div[2]/div[@class='container']/div[@class='row row-content'][2]/div[@class='col-12 col-md-9']/form/div[@class='form-group row'][5]/div[@class='col-md-3 offset-md-1']/select[@class='form-control']"));
        driver.findElement(By.id("message")).sendKeys(message);
        //driver.findElement(By.cssSelector("#root > div > div > div:nth-child(3) > div > div:nth-child(3) > div.col-12.col-md-9 > form > div:nth-child(7) > div > button")).submit();
        Thread.sleep(5000);
        WebElement submitButton = driver.findElement(By.cssSelector("button.btn.btn-primary"));
        submitButton.submit();

    }


}
