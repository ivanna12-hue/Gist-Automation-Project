package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='login_field']")
    private WebElement usernameOrEmailTextField;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement passwordTextField;

    @FindBy(xpath = "/html/body/div[1]/div[3]/main/div/div[2]/form/div[3]/input")
    private WebElement signInButton2;

    public void inputUsernameOrEmailTextField(){
        usernameOrEmailTextField.sendKeys("adrynivannatoban@gmail.com");
    }
    public boolean isUsernameOrEmailTextFieldDisplayed() {
        waitForVisibility(usernameOrEmailTextField);
        return usernameOrEmailTextField.isDisplayed();
    }

    public void inputPasswordTextField(){
        passwordTextField.sendKeys("23Ra1966");
    }
    public boolean isPasswordTextFieldDisplayed() {
        return passwordTextField.isDisplayed();
    }

    public void clickSignInButton2(){
        signInButton2.click();
    }
    public boolean isSignInButton2Displayed() {
        return signInButton2.isDisplayed();
    }


}
