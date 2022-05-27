package com.example.srsautomation.pages.layout;

import com.example.srsautomation.pages.element.Header;
import io.qameta.atlas.webdriver.extension.FindBy;


/**
 * Using header, when need it.
 */
public interface WithHeader {

    @FindBy("//header[contains(@class,'Header')]")
    Header header();

}
