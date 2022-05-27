package com.example.srsautomation.tests;

import com.example.srsautomation.pages.element.RepositoryCard;
import io.qameta.allure.Issue;
import io.qameta.allure.Owner;
import io.qameta.allure.TmsLink;
import io.qameta.allure.TmsLinks;
import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.ElementsCollection;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.hamcrest.Matchers.*;

@Execution(ExecutionMode.CONCURRENT)
public class Main1PageTest extends BaseTest {

    @Tag("Smoke")
    @Owner("Olha")
    @Issue("RTS-121234")
    @TmsLink("CT-2313215")
    @Test
    public void usePathWebSiteTest() {
        onSite().onProjectPage("qameta", "atlas").contributors().click();
        onSite().onContributorsPage().hovercards().waitUntil(hasSize(4));
    }

    @Tag("Smoke")
    @Owner("Iryna")
    @Issue("RTS-121234")
    @TmsLinks({@TmsLink("CT-2313216"), @TmsLink("CT-2313217")})
    @Test()
    public void shouldExtractRepositoriesInfo() {
        ElementsCollection<String> nameOfRepositories = onSite().onSearchPage("Junit 5").repositories()
                .extract(RepositoryCard::title)
                .extract(AtlasWebElement::getText);
        nameOfRepositories.should(everyItem(anyOf(containsString("junit5"),
                containsString("jupiter"))));
    }
}
