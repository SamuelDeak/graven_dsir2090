package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.UBBHomePage;
import org.junit.Assert;

public class ChangeLanguageSteps {

    UBBHomePage homePage;

    @Step
    public void is_the_home_page() {
        homePage.open();
    }

    @Step
    public void click_romanian_flag() {
        homePage.clickRomanianLanguge();
    }

    @Step
    public void click_english_flag() {
        homePage.clickEnglishLanguage();
    }

    @Step
    public void click_hungarian_flag() {
        homePage.clickHungarianLanguage();
    }

    @Step
    public void click_deutsch_flag() {
        homePage.clickDeutschLanguage();
    }

    @Step
    public void page_title_is_in_romanian_language() {
        Assert.assertEquals("Invalid language", homePage.getPageTitle(),"Facultatea de Matematică și Informatică");
    }

    @Step
    public void page_title_is_in_english_language() {
        Assert.assertEquals("Invalid language", homePage.getPageTitle(),"Faculty of Mathematics and Computer Science");
    }


    @Step
    public void page_title_is_in_hungarian_language() {
        Assert.assertEquals("Invalid language", homePage.getPageTitle(),"Matematika és Informatika Kar");
    }


    @Step
    public void page_title_is_in_deutsch_language() {
        Assert.assertEquals("Invalid language", homePage.getPageTitle(),"Fakultät für Mathematik und Informatik");
    }
}
