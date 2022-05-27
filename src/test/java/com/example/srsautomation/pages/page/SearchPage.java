package com.example.srsautomation.pages.page;

import com.example.srsautomation.pages.element.RepositoryCard;
import com.example.srsautomation.pages.layout.WithHeader;
import io.qameta.allure.Description;
import io.qameta.atlas.webdriver.ElementsCollection;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;

/**
 * Search page.
 */
public interface SearchPage extends WebPage, WithHeader {
    @Description("Repositories {{value}}")
    @FindBy(".//ul[contains(@class, 'repo-list')]//li[contains(@class, 'repo-list-item')]")
    ElementsCollection<RepositoryCard> repositories();

}
