package confusion;

import abstraction.poms.*;
import javafx.application.Platform;
import org.languagetool.AnalyzedSentence;
import org.languagetool.JLanguageTool;
//import org.languagetool.language.AmericanEnglish;
import org.languagetool.markup.AnnotatedText;
import org.languagetool.rules.Rule;
import org.languagetool.rules.RuleMatch;
import org.languagetool.rules.spelling.CachingWordListLoader;
import org.languagetool.rules.spelling.SpellingCheckRule;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import javax.jnlp.FileContents;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomePageTests {


    WebDriver driver = null;
    private String baseURL = "";
    private String newURL = "";

    @BeforeTest()
    @Parameters({"drivertype", "baseURL"})
    public void setUpDriver(String drivertype, String baseURL) {
        this.baseURL = baseURL;
        switch (drivertype) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
                driver = new ChromeDriver();
                break;
            case "safari":
                System.setProperty("webdriver.safari.driver", "/System/Library/CoreServices/SafariSupport.bundle/Contents/MacOS/safaridriver");
                driver = new SafariDriver();
                break;
        }

    }

    @Test(priority = 1)
    public void testGettingHomePage() throws InterruptedException {
        String actualTitle = "Ristorante Con Fusion";


        driver.get(baseURL);
        //Thread.sleep(5000);  // Let the user actually see something!
        //WebElement searchBox = driver.findElement(By.name("q"));
        //searchBox.sendKeys("ChromeDriver");
        //searchBox.submit();
        Thread.sleep(10000);  // Let the user actually see something!
        Assert.assertEquals(driver.getTitle(), (actualTitle));
        //driver.quit();
    }


    @Test(priority = 2, enabled = true)

    public void testGettingAboutUs() throws InterruptedException {
        driver.get(baseURL);
        WebElement aboutUsNavButton = driver.findElement(By.linkText("About Us"));
        aboutUsNavButton.click();
        Thread.sleep(5000);
        this.newURL = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), "http://127.0.0.1:3000/aboutus");

    }

    @Test(priority = 3, enabled = true)
    public void testGettingMenu() throws InterruptedException {
        driver.get(baseURL);
        WebElement aboutUsNavButton = driver.findElement(By.linkText("Menu"));
        aboutUsNavButton.click();
        Thread.sleep(5000);
        this.newURL = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), "http://127.0.0.1:3000/menu");

    }

    @Test(priority = 4, enabled = true)
    public void testGettingContactUs() throws InterruptedException {
        driver.get(baseURL);
        WebElement aboutUsNavButton = driver.findElement(By.linkText("Contact Us"));
        aboutUsNavButton.click();
        Thread.sleep(5000);
        this.newURL = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), "http://127.0.0.1:3000/contactus");

    }

    @Test(priority = 5, enabled = true)
    public void testGettingBack() throws InterruptedException {
        driver.navigate().back();
        Assert.assertEquals(driver.getCurrentUrl(), "http://127.0.0.1:3000/home");
    }

    @Test(priority = 6, enabled = true)
    public void testJumbotronContent() throws IOException, InterruptedException {
        driver.get(baseURL);
        Jumbotron jumbotron = new Jumbotron(driver);
        System.out.println("Title - " + jumbotron.getTitle());
        //System.out.println("Overview - " + jumbotron.getOverview());
        //String testString = jumbotron.getOverview();

        //String correctString = testString.replace("lipsmacking", "lip smacking");
        //String testTitle = jumbotron.getTitle();

        // JLanguageTool langTool = new JLanguageTool(new AmericanEnglish());
        // comment in to use statistical ngram data:
        //langTool.activateLanguageModelRules(new File("/data/google-ngram-data"));
        //List<RuleMatch> matches = langTool.check(testString);
        // for (RuleMatch match : matches) {
        //   System.out.println("Potential error at characters " +
        //            match.getFromPos() + "-" + match.getToPos() + ": " +
        //           match.getMessage());
        //    System.out.println("Suggested correction(s): " +
        //           match.getSuggestedReplacements());
        //Assert.assertEquals(testString, correctString);
        //JLanguageTool lt = new JLanguageTool(new AmericanEnglish());
        //for (Rule rule : lt.getAllActiveRules()) {
        //    if (rule instanceof SpellingCheckRule) {
         //       ((SpellingCheckRule) rule).acceptPhrases(Arrays.asList("Ristorante", "con"));
         //   } else {
         //       lt.disableRule(rule.getId());
         //   }
        }
        //Thread.sleep(5000);

    //}

    @Test(priority = 7, enabled = true)
    public void testJumbotronContent2() throws IOException, InterruptedException {
        driver.get(baseURL);
        Jumbotron jumbotron = new Jumbotron(driver);
        System.out.println(jumbotron.getTitle());
        System.out.println(jumbotron.getOverview());

        //JLanguageTool langTool = new JLanguageTool(new AmericanEnglish());
        // comment in to use statistical ngram data:
        //langTool.activateLanguageModelRules(new File("/data/google-ngram-data"));
        //List<RuleMatch> matches = langTool.check(jumbotron.getOverview());
        //for (RuleMatch match : matches) {
        //    System.out.println("Potential error at characters " + match.getFromPos() + "-" + match.getToPos() + ": " + match.getMessage());
        //    System.out.println("Suggested correction(s): " + match.getSuggestedReplacements());
        //    Assert.assertTrue(match.getMessage() == null, "Suggestion  " + match.getSuggestedReplacements().toString());
        }

        //Thread.sleep(5000);

   // }

    @Test(priority = 8, enabled = true)
    public void testLogin() throws InterruptedException {
        driver.get(baseURL);
        Navigation clickLogin = new Navigation(driver);
        clickLogin.gotoLogin();
        LoginModal login = new LoginModal(driver);
        login.loginAs("user", "pass");
        Alert alert = driver.switchTo().alert();
        alert.getText();

        System.out.println("Alert :" + alert.getText());

        Thread.sleep(5000);
        driver.switchTo().alert().accept();

    }
    @Test (priority = 9, enabled = true)
    public void testContactUs() throws InterruptedException {
        driver.get(baseURL);
        WebElement menuNavButton = driver.findElement(By.linkText("Contact Us"));
        //String telErrorMessage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/div[3]/div/div/span")).getText();
        //String emailErrorMessage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/div[3]/div/div/span")).getText();
        menuNavButton.click();
        ContactUs contact = new ContactUs(driver);
        contact.sendFeedback("Elvis", "Presley", "6502158887", "user@gmail.com", "Test feedback");

        Thread.sleep(5000);

        //Assert.assertEquals(telErrorMessage, "Must be number");
        //Assert.assertEquals(emailErrorMessage,"Ivalid Email Address" );
        Alert alert = driver.switchTo().alert();
        alert.getText();

        System.out.println("Alert :" + alert.getText());
        driver.switchTo().alert().accept();

    }

    @Test (priority = 10, enabled=true)
    public void testComments() throws InterruptedException {
        driver.get(baseURL);
        WebElement menuNavButton = driver.findElement(By.linkText("Menu"));
        menuNavButton.click();
        Thread.sleep(5000);
        WebElement menuItem = driver.findElement(By.cssSelector("#root > div > div > div:nth-child(3) > div > div:nth-child(3) > div:nth-child(1) > div > a > div"));
        menuItem.click();
        Thread.sleep(5000);
        List<WebElement> submitButtons = driver.findElements(By.cssSelector("button.btn.btn-outline-secondary"));
        submitButtons.get(1).click();
        Thread.sleep(5000);
        CommentsModal comment  = new CommentsModal(driver);
        comment.addComment("3","Elvis", "Test Comment");
        Thread.sleep(5000);


    }

    @Test(priority = 11, enabled = true)//verification if logo exists
    public void testLogo() throws InterruptedException {
        driver.get(baseURL);
        Navigation checkLogo = new Navigation(driver);
        checkLogo.gotoLogo();
        Thread.sleep(5000);
    }

    @Test(priority = 12)
    public void testNavigationPom() {
        NavigationModel navigationPom = PageFactory.initElements(driver,NavigationModel.class);
        navigationPom.isLogoDisplayed();
        Assert.assertTrue(navigationPom.isLogoDisplayed());

    }

    @AfterTest()
    private void shutDownSelenium() {
        driver.quit();
    }



}


