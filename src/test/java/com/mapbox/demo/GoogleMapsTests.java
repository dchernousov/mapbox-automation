package com.mapbox.demo;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleMapsTests extends BaseTest {

    @Test
    @Description("Dummy Google Map tests")
    public void BasicTest() {
        WebElement googleLogo = driver.findElement(By.id("com.google.android.apps.maps:id/watermark_image"));
        Assertions.assertTrue(googleLogo.isDisplayed(), "Google Logo should be present on Maps Page");

    }
}
