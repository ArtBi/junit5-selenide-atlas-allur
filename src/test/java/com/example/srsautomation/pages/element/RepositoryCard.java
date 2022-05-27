package com.example.srsautomation.pages.element;

import io.qameta.allure.Description;
import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

/**
 * Repository card.
 */
public interface RepositoryCard extends AtlasWebElement<RepositoryCard> {
    @Description("Title {{value}}")
    @FindBy(".//h3")
    AtlasWebElement title();

}
