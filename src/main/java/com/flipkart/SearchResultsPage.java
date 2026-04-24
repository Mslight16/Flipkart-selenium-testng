package com.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
    WebDriver driver;
    By firstProduct = By.cssSelector("._1YokD2 ._1AtVbE:nth-child(2)");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFirstProduct() {
        driver.findElement(firstProduct).click();
    }
}