package com.wizardingworld;

import Components.TestData;
import Components.WebSteps;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class HarryPotterTrapDoorTest extends TestData {

@Test
void HPCharTest() {
    SelenideLogger.addListener("allure", new AllureSelenide());
    WebSteps steps = new WebSteps();
    steps.openMainPage();
    steps.clickSeaction2();
    steps.seachPage2();
}
}

