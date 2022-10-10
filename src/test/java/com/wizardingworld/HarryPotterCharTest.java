package com.wizardingworld;

import Components.TestData;
import Components.WebSteps;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

    public class HarryPotterCharTest extends TestData {

    @Test
    void HPCharTest() {
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.clickSeaction();
        steps.seachPage();
    }
}

