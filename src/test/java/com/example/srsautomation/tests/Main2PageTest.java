package com.example.srsautomation.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Owner;
import io.qameta.allure.TmsLink;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.hasSize;
import static ru.yandex.qatools.matchers.webdriver.TextMatcher.text;

@Execution(ExecutionMode.SAME_THREAD)
public class Main2PageTest extends BaseTest {

    @Tag("Smoke")
    @Owner("Artem Bilozor")
    @TmsLink("CT-2313212")
    @Test
    @Description("Some detailed test description")
    public void simpleWebSiteTest() {
        onSite().onMainPage().open();
        onSite().onMainPage().header().searchInput().sendKeys("Atlas");
        onSite().onMainPage().header().searchInput().submit();
        onSite().onSearchPage("Junit 5").repositories().waitUntil(hasSize(10));
    }

    @Tag("Smoke")
    @Owner("Artem Bilozor")
    @Issue("RTS-12123")
    @TmsLink("CT-2313212")
    @Test
    @Description("Some detailed test description")
    public void baseUriWebSiteTest() {
        onSite().onSearchPage("Junit 5")
                .repositories().waitUntil(hasSize(10))
                .should(everyItem(text("junit")));
    }

}
