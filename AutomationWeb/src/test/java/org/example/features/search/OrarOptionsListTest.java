package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.example.steps.serenity.OrarOptionsSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/files/orarOptions.csv")
public class OrarOptionsListTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public OrarOptionsSteps orarOptionsSteps;

    private String option;
    private Boolean status;

    @Issue("#UBB-Orar")
    @Test
    public void orar_multiple_view_options(){
        orarOptionsSteps.is_the_home_page();
        orarOptionsSteps.click_orar_link();
        ArrayList<String> tabs = new ArrayList<String> (webdriver.getWindowHandles());
        webdriver.switchTo().window(tabs.get(1));
        orarOptionsSteps.should_see_orar_option(option,status);
        if(status)
        {
            orarOptionsSteps.click_orar_option_from_view_table(option);
            orarOptionsSteps.should_see_page_title(option);
        }
    }
}
