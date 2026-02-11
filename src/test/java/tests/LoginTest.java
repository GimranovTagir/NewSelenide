package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void checkPAgeOpen() {
        loginPage.openPage();
        loginPage.login();
        projectsPage.pageOpen();
        projectsPage.checkBtnColor();
    }
}