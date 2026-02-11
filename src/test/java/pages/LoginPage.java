package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    final SelenideElement userInput = $x("//*[@name='user_auth[email]']");
    final SelenideElement passwordInput = $x("//*[@name='user_auth[password]']");
    final SelenideElement signInBtn = $x("//*[@type='submit']");

    public void openPage() {
        open("login");
    }

    public void login() {
        userInput.setValue("gimranov.tagir@bk.ru");
        passwordInput.sendKeys("000DthP@$$");
        signInBtn.click();
    }
}