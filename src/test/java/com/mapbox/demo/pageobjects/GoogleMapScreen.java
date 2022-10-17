package com.mapbox.demo.pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GoogleMapScreen {

/*    private static void skipWelcomeScreen(){

        $(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button")).click();

    }*/

    @Step("Verify Google Logo on Main Map screen")
    public static boolean isGoogleLogoPresent(){

        return $(By.id("com.google.android.apps.maps:id/watermark_image")).isDisplayed();

    }
}
