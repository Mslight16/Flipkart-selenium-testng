package com.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    By placeOrderBtn = By.xpath("//span[text()='Place Order']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPlaceOrderVisible() {
        return driver.findElement(placeOrderBtn).isDisplayed();
    }
}
