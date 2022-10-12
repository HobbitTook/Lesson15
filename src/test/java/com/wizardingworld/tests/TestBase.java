package com.wizardingworld.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.wizardingworld.helpers.AllureAttach;
import config.DriverConfiguration;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {


        @BeforeAll
        static void settings() {
            SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
            DriverConfiguration.configure();
        }

        @AfterEach
        void addAttachments() {
            AllureAttach.screenshotAs("Screenshot");
            AllureAttach.pageSource();
            AllureAttach.browserConsoleLogs();
            if ((System.getProperty("selenide.remote") != null)) {
                AllureAttach.addVideo();
            }
        }
    }
