package com.wizardingworld.tests;

import com.wizardingworld.pageObject.WebSteps;
import org.junit.jupiter.api.Test;

public class HarryPotterTests extends TestBase {

    @Test
    void hpCharTest() {
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.clickSeaction();
        steps.seachPage();
    }

    @Test
    void hpMenuTest1() {
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.clicMenu();
        steps.seachSeaction();
    }

    @Test
    void hpMenuTest2() {
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.clicMenu();
        steps.seachSeaction2();
    }

    @Test
    void hpMenuTest3() {
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.clicMenu();
        steps.seachSeaction3();
    }

    @Test
    void hpTrapDoorTeste() {
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.clickSeaction2();
        steps.seachPage2();
    }
}

