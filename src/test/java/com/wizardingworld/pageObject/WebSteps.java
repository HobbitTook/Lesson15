package com.wizardingworld.pageObject;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {
    @Step("Открыть главную страницу")
    public void openMainPage() {
        open("https://www.startingharrypotter.com");
    }


    @Step("Кликнуть стрелке меню")
    public void clicMenu() {
        $(".scrollArrow-woms8P").click();
    }

    @Step("Кликнуть на раздел Meet the Characters")
    public void clickSeaction() {
        $(".tile-rectangle2-label").shouldHave(text("Meet the Characters")).click();
    }

    @Step("Кликнуть на раздел Trap Door Trials")
    public void clickSeaction2() {
        $(".tile-rectangle1").shouldHave(text("Trap Door Trials")).click();

    }

    @Step("Кликнуть на игру")
    public void clickPlay() {
        $(".tracking-link").shouldHave(text("Create Your Crest")).click();
    }

    @Step("Найти раздел Play Remembrall Rush")
    public void seachSeaction() {
        $(".storyteller-wrapper").shouldHave(text("Play Remembrall Rush")).click();
    }

    @Step("Найти раздел Who said it?")
    public void seachSeaction2() {
        $(".storyteller-wrapper").shouldHave(text("Who said it?")).click();
    }


    @Step("Найти раздел The Pets Quiz?")
    public void seachSeaction3() {
        $(".storyteller-wrapper").shouldHave(text("The Pets Quiz")).click();
    }

    @Step("Увидеть страницу Meet the Characters")
    public void seachPage() {
        $(".storyteller-header").shouldHave(text("Character Snippets"));
    }

    @Step("Увидеть страницу Trap Door Trials")
    public void seachPage2() {
        $(".trap-door-trials-container").shouldHave(text("Trap Door Trials"));
    }


}