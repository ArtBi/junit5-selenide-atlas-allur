package com.example.srsautomation.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.example.srsautomation.helpers.AllureLogger;
import com.example.srsautomation.pages.site.GitHubSite;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    protected Atlas atlas;

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        Configuration.savePageSource = false;
        Configuration.screenshots = false;
//        Configuration.headless = true;
    }

    @BeforeEach
    public void setUp() {
        open();
        atlas = new Atlas(
                new WebDriverConfiguration(
                        WebDriverRunner.getWebDriver(),
                        "https://github.com")).listener(new AllureLogger());
    }

    protected GitHubSite onSite() {
        return atlas.create(WebDriverRunner.getWebDriver(), GitHubSite.class);
    }

}
