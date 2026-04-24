package com.flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlipkartTest {
    WebDriver driver;
    HomePage homePage;
    SearchResultsPage searchResultsPage;
    ProductPage productPage;
    CartPage cartPage;

    @BeforeClass
public void setUp() {
    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com");

   
    try {
        WebElement closePopup = new WebDriverWait(driver, Duration.ofSeconds(5))
            .until(ExpectedConditions.elementToBeClickable(By.cssSelector("button._2KpZ6l._2doB4z")));
        closePopup.click();
    } catch (Exception e) {
        System.out.println("Login popup not displayed.");
    }

    // Initialize page objects
    homePage = new HomePage(driver);
    searchResultsPage = new SearchResultsPage(driver);
    productPage = new ProductPage(driver);
    cartPage = new CartPage(driver);
   
}


   @Test(priority = 1)
public void testSearchAndAddToCart() {
    homePage.searchProduct("iPhone 15");

    // Scroll to load products
    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");

    searchResultsPage.clickFirstProduct();
    productPage.addToCart();

    Assert.assertTrue(cartPage.isPlaceOrderVisible(), "Place Order button should be visible");
}

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
