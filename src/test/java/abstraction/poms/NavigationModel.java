package abstraction.poms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NavigationModel {
    @FindBy(css = "a.mr-auto.navbar-brand")
    @CacheLookup
    public WebElement logoItem;

    @FindBy(linkText = "Home")
    @CacheLookup
    public WebElement navBarHomeItem;


    public boolean isLogoDisplayed() {
        if(logoItem.isDisplayed()) return true;
        return false;
    }

    public void goToHome(){
        navBarHomeItem.click();
    }

}
