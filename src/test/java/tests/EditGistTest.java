package tests;

import core.BaseTest;
import org.testng.annotations.Test;
import page.EditGistPage;

import static core.DriverManager.getDriver;

public class EditGistTest extends BaseTest {

    @Test
    public void testEditGist() {
        EditGistPage editGistPage = new EditGistPage(getDriver());
        String newTitle = "DiscoverGistPageNeww.java";
        editGistPage.updateGistTitle(newTitle);
        System.out.println("Gist berhasil diupdate dengan title baru: " + newTitle);
    }
}
