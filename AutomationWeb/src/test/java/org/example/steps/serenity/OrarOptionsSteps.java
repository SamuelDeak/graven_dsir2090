package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.UBBHomePage;
import org.example.pages.UBBOrarOptionsViewPage;
import org.junit.Assert;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class OrarOptionsSteps {

    UBBHomePage homePage;
    UBBOrarOptionsViewPage orarOptionsPage;

    @Step
    public void is_the_home_page() {
        homePage.open();
    }

    @Step
    public void click_orar_link(){
        homePage.clickOrarLink();
    }

    @Step
    public void should_see_orar_option(String option,Boolean status){
        Assert.assertEquals("Orar option is missing",orarOptionsPage.isOptionInOptionsList(option),status);
    }

    @Step
    public void click_orar_option_from_view_table(String option){
        orarOptionsPage.clickOrarViewOption(option);
    }

    @Step
    public void should_see_page_title(String option){
        Assert.assertEquals("Page title is invalid",option,orarOptionsPage.getSpecificOptionPageTitle());
    }
}
