package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ProjectsPage {
    final SelenideElement pageTitle = $(byText("> Чек-листы"));
    final SelenideElement pageTitleBtn = $x("//*[text()=' > Чек-листы']");


    public void pageOpen() {
        pageTitle.should(exist).shouldBe(visible, Duration.ofSeconds(10));
        //pageTitle.shouldHave(text(" > Чек-листы"));
    }

    public void checkBtnColor() {
        pageTitleBtn.shouldHave(Condition.cssValue("color", "rgba(102, 102, 102, 1)"));
    }
}