package com.wizardingworld;


import Components.TestData;
import Components.WebSteps;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class HarryPotterMenuTest3 extends TestData {

    @Test
    void HPMenuTest() {
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.clicMenu();
        steps.seachSeaction3();
    }
}

