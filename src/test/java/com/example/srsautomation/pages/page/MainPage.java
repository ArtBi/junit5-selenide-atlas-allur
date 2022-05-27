package com.example.srsautomation.pages.page;

import com.example.srsautomation.pages.layout.WithHeader;
import io.qameta.allure.Description;
import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;

/**
 * Main page of site.
 */
public interface MainPage extends WebPage, WithHeader {

    @Description("Link with text {{value}}")
    @FindBy("//a[contains(text(), 'Or start a free trial of Enterprise Server')]")
    AtlasWebElement trial();

}
