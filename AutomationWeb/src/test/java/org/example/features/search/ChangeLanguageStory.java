package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.example.steps.serenity.ChangeLanguageSteps;
import org.example.steps.serenity.OrarOptionsSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

@RunWith(SerenityRunner.class)
public class ChangeLanguageStory {


    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public ChangeLanguageSteps changeLanguage;

    @Issue("#UBB-Language")
    @Test
    public void change_lange_to_all_available_options() {
        changeLanguage.is_the_home_page();

        changeLanguage.click_deutsch_flag();
        changeLanguage.page_title_is_in_deutsch_language();

        changeLanguage.click_hungarian_flag();
        changeLanguage.page_title_is_in_hungarian_language();

        changeLanguage.click_english_flag();
        changeLanguage.page_title_is_in_english_language();

        changeLanguage.click_romanian_flag();
        changeLanguage.page_title_is_in_romanian_language();

    }
}
