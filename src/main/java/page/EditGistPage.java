package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditGistPage extends BasePage {

    public EditGistPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[1]/div[6]/div/main/div[1]/div/div[1]/ul[2]/li[1]/a/span")
    private WebElement editButton;

    @FindBy(xpath = "/html/body/div[1]/div[6]/div/main/div[2]/div/form[1]/div/div[1]/div[2]/file-attachment/blob-editor/div[1]/div[1]/div[1]/input[2]")
    private WebElement titleDescriptionField;

    @FindBy(xpath = "/html/body/div[1]/div[6]/div/main/div[2]/div/form[1]/div/div[2]/button")
    private WebElement updatePublicGistButton;


    public void clickEditButton() {
        waitForVisibility(editButton);
        editButton.click();
    }

    public void InputTitleDescriptionField(String newTitle) {
        waitForVisibility(titleDescriptionField);
        titleDescriptionField.clear();
        titleDescriptionField.sendKeys(newTitle);
    }

    public void clickUpdatePublicGistButton() {
        waitForVisibility(updatePublicGistButton);
        updatePublicGistButton.click();
    }

    public void updateGistTitle(String newTitle) {
        clickEditButton();
        InputTitleDescriptionField(newTitle);
        clickUpdatePublicGistButton();
    }
}
