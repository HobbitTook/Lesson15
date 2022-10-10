package Components;

import Components.AllureAttach;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

    public class TestData {


        @BeforeAll
        static void configure() {
            SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

            DesiredCapabilities capabilities = new DesiredCapabilities();
            if (System.getProperty("selenide.remote") != null) {
                Configuration.remote = System.getProperty("selenide.remote");
                capabilities.setCapability("enableVNC", true);
                capabilities.setCapability("enableVideo", true);
            }

            Configuration.browserCapabilities = capabilities;
            Configuration.baseUrl = "https://www.jetbrains.com/ru-ru/";
            Configuration.timeout = 10_000;

            Configuration.browser = System.getProperty("browser_name", "chrome");
            Configuration.browserVersion = System.getProperty("browser_version", "100.0");
            Configuration.browserSize = System.getProperty("browser_size", "1920x1080");
        }

        @AfterEach
        void addAttachments() {
            AllureAttach.screenshotAs("Last screenshot");
            AllureAttach.pageSource();
            if (Configuration.browser.equals("chrome")) {
                AllureAttach.browserConsoleLogs();
            }
            if (System.getProperty("selenide.remote") != null) {
                AllureAttach.addVideo();
            }
        }

    }