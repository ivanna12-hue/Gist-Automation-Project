package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscoverGistPage extends BasePage {
    public DiscoverGistPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='Header-link no-underline mr-3']")
    private WebElement signInButton;

    public void clickSignInButton(){
        signInButton.click();
    }


}
