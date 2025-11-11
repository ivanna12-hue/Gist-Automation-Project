package core;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void setUp() {
        // Ambil browser dari System property Gradle (-Dbrowser=firefox)
        String browser = System.getProperty("browser", "chrome");
        DriverManager.initDriver(browser);
    }

    @AfterTest
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
