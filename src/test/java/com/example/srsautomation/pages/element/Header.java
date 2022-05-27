package com.example.srsautomation.pages.element;


import io.qameta.allure.Description;
import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

/**
 * Header of web page.
 */
public interface Header extends AtlasWebElement {

    @Description("Input field {{value}}")
    @FindBy(".//input[contains(@class,'header-search-input')]")
    AtlasWebElement searchInput();

}
