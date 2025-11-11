package tests;

import core.BaseTest;
import core.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.DeleteGistPage;


public class DeleteGistTest extends BaseTest {
    @Test
    public void deleteGistTest(){
        DeleteGistPage deleteGistPage = new DeleteGistPage(DriverManager.getDriver());

        Assert.assertTrue(deleteGistPage.isDeleteGistButtonDisplayed(),"Button Delete is not displayed");
        deleteGistPage.clickDeleteGistButton();
        deleteGistPage.confirmDeletePopup();

    }

}
