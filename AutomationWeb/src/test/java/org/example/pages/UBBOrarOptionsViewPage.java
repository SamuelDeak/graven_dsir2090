package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class UBBOrarOptionsViewPage extends PageObject {


    @FindBy(xpath = "//table")
    private WebElementFacade optionsTable;

    public List<String> getOrarOptionsList(){
        return optionsTable.findElements(By.xpath("//tbody//a")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }

    public boolean isOptionInOptionsList(String option){
        return getOrarOptionsList().contains(option);
    }

    public void clickOrarViewOption(String option){
        optionsTable.findElement(By.xpath("//a/font[contains(text(),'" + option + "')]")).click();
    }

    public String getSpecificOptionPageTitle(){
        return optionsTable.findElement(By.xpath("//h1")).getText();
    }
}
