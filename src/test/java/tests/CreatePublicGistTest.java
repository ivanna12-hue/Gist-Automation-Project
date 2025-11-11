package tests;

import core.BaseTest;
import core.DriverManager;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.CreatePublicGistPage;
import page.DiscoverGistPage;
import page.LoginPage;



public class CreatePublicGistTest extends BaseTest {
    @Test
    public void createPublicGistTest(){

        DiscoverGistPage discoverGistPage = new DiscoverGistPage(DriverManager.getDriver());
        discoverGistPage.clickSignInButton();

        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        CreatePublicGistPage createPublicGistPage = new CreatePublicGistPage(DriverManager.getDriver());
        Assert.assertTrue(loginPage.isUsernameOrEmailTextFieldDisplayed(),"username or email is not displayed");
        Assert.assertTrue(loginPage.isPasswordTextFieldDisplayed(),"Password is not displayed");
        Assert.assertTrue(loginPage.isSignInButton2Displayed(),"SignInButton2 is not displayed");

        loginPage.inputUsernameOrEmailTextField();
        loginPage.inputPasswordTextField();
        loginPage.clickSignInButton2();

        Assert.assertTrue(createPublicGistPage.isNewGistButtonDisplayed(),"NewGistButton is not displayed");
        createPublicGistPage.clickNewGistButton();

        createPublicGistPage.inputGistDescription("Page Object untuk halaman Discover Gist pada automation testing dengan Selenium. Berisi elemen tombol “Sign In” dan method untuk mengkliknya.");
        createPublicGistPage.inputFilename("DiscoverGistPage.java");
        createPublicGistPage.inputCode("package page;\n" +
                "import org.openqa.selenium.WebDriver;\n" +
                "import org.openqa.selenium.WebElement;\n" +
                "import org.openqa.selenium.support.FindBy;\n" +
                "public class DiscoverGistPage extends BasePage {\n" +
                "public DiscoverGistPage(WebDriver driver) {\n" +
                "super(driver);\n" +
                "}\n" +
                "@FindBy(xpath = \"//a[@class='Header-link no-underline mr-3']\")\n" +
                "private WebElement signInButton;\n" +
                "public void clickSignInButton() {\n" +
                "signInButton.click();\n" +
                "}\n" +
                "}");
        createPublicGistPage.selectCreatePublicGistOption();

        Assert.assertTrue(createPublicGistPage.isCreatePublicGistButtonDisplayed(),"CreatePublicGistButton is not displayed");
        createPublicGistPage.clickCreatePublicGistButton();


    }
}
