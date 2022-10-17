package com.mapbox.demo;

import com.mapbox.demo.pageobjects.GoogleMapScreen;
import com.mapbox.demo.testconfigs.BaseTest;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleMapsTests extends BaseTest {

    @Test
    @Description("Dummy Google Map tests")
    public void GoogleMapsTest() {

        Assertions.assertTrue(GoogleMapScreen.isGoogleLogoPresent(), "Google Logo should be present on Maps Page");

    }
}
