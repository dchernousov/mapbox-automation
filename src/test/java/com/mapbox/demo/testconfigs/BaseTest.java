package com.mapbox.demo.testconfigs;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import javax.annotation.ParametersAreNonnullByDefault;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

@ParametersAreNonnullByDefault
public class BaseTest {

    @BeforeEach
    @Step("Initial setup")
    void setUp() {
        closeWebDriver();
        Configuration.browserSize = null;
        Configuration.browser = Initialize.class.getName();
        open();
    }

    @AfterEach
    @Step("Finish testing")
    public void teardown() {

    }
}
