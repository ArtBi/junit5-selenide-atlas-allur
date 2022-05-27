package com.example.srsautomation.pages.site;

import com.example.srsautomation.pages.page.ContributorsPage;
import com.example.srsautomation.pages.page.MainPage;
import com.example.srsautomation.pages.page.ProjectPage;
import com.example.srsautomation.pages.page.SearchPage;
import io.qameta.allure.Description;
import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;
import io.qameta.atlas.webdriver.extension.Path;
import io.qameta.atlas.webdriver.extension.Query;

/**
 * Point of testing WebSite.
 */
public interface GitHubSite extends WebSite {

    @Page()
    @Description("Main Page")
    MainPage onMainPage();

    @Page(url = "search")
    @Description("Search Page")
    SearchPage onSearchPage(@Query("q") String value);

    @Page(url = "{profile}/{project}/tree/master/")
    @Description("Project Page")
    ProjectPage onProjectPage(@Path("profile") String profile, @Path("project") String project);

    @Page
    @Description("Contributors Page")
    ContributorsPage onContributorsPage();

}
