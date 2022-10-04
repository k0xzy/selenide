package ru.netology;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.conditions.Visible;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RegistrationTest {

    @Test
    void test() {
//        Configuration.holdBrowserOpen = true;
        open("http://localhost:9999");
        $x("//input[@placeholder=\"Город\"]").setValue("Москва");
        $("[name=\"name\"]").setValue("Иванов Иван");
        $("[name=\"phone\"]").setValue("+79999991111");
        $x("//*[@class=\"checkbox__box\"]").click();
        $x("//*[@class=\"button__text\"]").click();
        $x("//*[contains(text(),\"Встреча успешно забронирована на\")]").should(visible, Duration.ofSeconds(15));


    }
}