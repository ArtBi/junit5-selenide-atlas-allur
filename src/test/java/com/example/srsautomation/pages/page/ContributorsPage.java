package com.example.srsautomation.pages.page;

import com.example.srsautomation.pages.element.RepositoryCard;
import com.example.srsautomation.pages.layout.WithHeader;
import io.qameta.atlas.webdriver.ElementsCollection;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;

/**
 * Contributors page.
 */
public interface ContributorsPage extends WebPage, WithHeader {

    @FindBy(".//ol[contains(@class, 'contrib-data')]//li[contains(@class, 'contrib-person')]")
    ElementsCollection<RepositoryCard> hovercards();
}
