package com.mapbox.demo.testconfigs;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.qameta.allure.Step;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Initialize  implements WebDriverProvider {

    @Override
    @CheckReturnValue
    @Nonnull
    @Step("AppiumDriver configuration")
    public WebDriver createDriver(Capabilities capabilities) {
        UiAutomator2Options options = new UiAutomator2Options();
        options.merge(capabilities);
        options.setDeviceName("Pixel 2 API 28");
        options.setPlatformName("Android");
        options.setPlatformVersion("9.0");
        options.setUdid("emulator-5554");
        options.setAppPackage("com.google.android.apps.maps");
        options.setAppActivity("com.google.android.maps.MapsActivity");
        options.setNewCommandTimeout(Duration.ofSeconds(11));
        options.setFullReset(false);

        //Create AndroidDriver instance and connect to the Appium server.
        //It will launch the GoogleMap App in Android Device using the configurations specified in Desired Capabilities

        try {
            return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
