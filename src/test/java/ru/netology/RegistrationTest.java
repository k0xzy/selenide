package ru.netology;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


class RegistrationTest {

    @Test
    void test() {
        open("http://localhost:9999");
        $x("//input[@placeholder=\"Город\"]").setValue("Москва");
        $("[name=\"name\"]").setValue("Иванов Иван");
        $("[name=\"phone\"]").setValue("+79999991111");
        $x("//*[@class=\"checkbox__box\"]").click();
        $x("//*[@class=\"button__text\"]").click();
        $x("//*[contains(text(),\"Встреча успешно забронирована на\")]").should(visible, Duration.ofSeconds(15));
    }
}