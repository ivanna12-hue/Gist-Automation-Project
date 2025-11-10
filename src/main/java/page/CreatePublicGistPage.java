package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatePublicGistPage extends BasePage {
    public CreatePublicGistPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='gists-header-new-gist']")
    private WebElement newGistButton;

    @FindBy(name = "gist[description]")
    private WebElement gistDescriptionTextField;

    @FindBy(xpath = "/html/body/div[1]/div[6]/div/main/div[2]/div/form/div/div[1]/div[2]/file-attachment/blob-editor/div[1]/div[1]/div[1]/input[2]")
    private WebElement filenameTextField;

    @FindBy(xpath = "//*[@id='code-editor']/div/pre/span/span")
    private WebElement codeTextArea;

    @FindBy(xpath = "//*[@id='new_gist']/div/div[2]/div/details/summary")
    private WebElement visibilityDropdown;

    @FindBy(xpath = "/html/body/div[1]/div[6]/div/main/div[2]/div/form/div/div[2]/div/details/details-menu/label[2]/div/span[1]")
    private WebElement createPublicGistOption;

    @FindBy(xpath = "/html/body/div[1]/div[6]/div/main/div[2]/div/form/div/div[2]/div/button")
    private WebElement createPublicGistButton;

    //ACTION METHODS

    public void clickNewGistButton() {
        waitForVisibility(newGistButton);
        newGistButton.click();
    }

    public void inputGistDescription(String description) {
        waitForVisibility(gistDescriptionTextField);
        gistDescriptionTextField.clear();
        gistDescriptionTextField.sendKeys(description);
    }

    public void inputFilename(String filename) {
        waitForVisibility(filenameTextField);
        filenameTextField.clear();
        filenameTextField.sendKeys(filename);
    }

    public void inputCode(String code) {
        waitForVisibility(codeTextArea);
        codeTextArea.sendKeys(code);
    }

    public void selectCreatePublicGistOption() {
        waitForVisibility(visibilityDropdown);
        visibilityDropdown.click();
        waitForVisibility(createPublicGistOption);
        createPublicGistOption.click();
    }

    public void clickCreatePublicGistButton() {
        waitForVisibility(createPublicGistButton);
        createPublicGistButton.click();
    }

    public boolean isCreatePublicGistButtonDisplayed() {
        waitForVisibility(createPublicGistButton);
        return createPublicGistButton.isDisplayed();
    }

    public boolean isNewGistButtonDisplayed() {
        waitForVisibility(newGistButton);
        return newGistButton.isDisplayed();
    }
}
