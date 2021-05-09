package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("http://www.cs.ubbcluj.ro")
public class UBBHomePage extends PageObject {

    @FindBy(xpath = "//a[contains(@href,'files/orar')]")
    private WebElementFacade orarLink;

    //    @FindBy(id="menu-item-8324-ro")
    @FindBy(xpath = "//li/a[@lang='ro-RO']")
    private WebElementFacade romanianFlagLanguage;

    //    @FindBy(id="menu-item-8325-en")
    @FindBy(xpath = "//li/a[@lang='en-US']")
    private WebElementFacade englishFlagLanguage;

    //    @FindBy(id="menu-item-8325-hu")
    @FindBy(xpath = "//li/a[@lang='hu-HU']")
    private WebElementFacade hungarianFlagLanguage;

    //    @FindBy(id="menu-item-8325-de")
    @FindBy(xpath = "//li/a[@lang='de-DE']")
    private WebElementFacade deutschFlagLanguage;

    @FindBy(xpath = "//div[@class='logo']//img")
    private WebElementFacade pageLogo;

    public void clickOrarLink() {
        orarLink.click();
    }

    public void clickRomanianLanguge() {
        romanianFlagLanguage.click();
    }

    public void clickEnglishLanguage() {
        englishFlagLanguage.click();
    }

    public void clickHungarianLanguage() {
        hungarianFlagLanguage.click();
    }

    public void clickDeutschLanguage() {
        deutschFlagLanguage.click();
    }

    public String getPageTitle() {
        return pageLogo.getAttribute("title");
    }

}
