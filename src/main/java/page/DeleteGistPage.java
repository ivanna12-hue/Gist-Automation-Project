package page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteGistPage extends BasePage {
    public DeleteGistPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='Button-label'][normalize-space()='Delete']")
    private WebElement deleteGistButton;

    public void clickDeleteGistButton(){
        deleteGistButton.click();
    }

    public void confirmDeletePopup() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
            System.out.println("OK");
        } catch (Exception e) {
            System.out.println("CANCEL");
        }
    }

    public boolean isDeleteGistButtonDisplayed() {
        waitForVisibility(deleteGistButton);
        return deleteGistButton.isDisplayed();
    }
}
