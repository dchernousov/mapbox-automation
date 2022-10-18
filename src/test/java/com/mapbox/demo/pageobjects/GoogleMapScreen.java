package com.mapbox.demo.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GoogleMapScreen {

    @Step("Verify Google Logo on Main Map screen")
    public static boolean isGoogleLogoPresent(){

        return $(By.id("com.google.android.apps.maps:id/watermark_image")).isDisplayed();

    }
}
