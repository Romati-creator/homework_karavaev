package com.google.karavaevrk;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomeworkKaravaev {

    @BeforeAll
    static void beforeAll () {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
     void fillFormTest () {
        // Открываем страницу в браузере
        open("https://demoqa.com/automation-practice-form");
        // Проверка правильного заголовка
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        // Заполняем текстовое поле id = firstName
        $("#firstName").setValue("John");
        // Заполняем поле lastName
        $("#lastName").setValue("Snow");
        // Вводим почтовый адрес в поле userEmail
        $("#userEmail").setValue("Bastard@kingNnorth.com");
        // Клик радио-баттона
        $("[for='gender-radio-1']").click();
        // Ввводим номер телефона в поле userNumber
        $("#userNumber").setValue("7777777777");
        // Кликаем Date of Birth для выбора даты (id = dateOfBirthInput)
        $("#dateOfBirthInput").click();
        // Выбираем год в календаре (react-datepicker__year-select)
        $(".react-datepicker__year-select").selectOptionByValue("1990");
        // Выбираем месяц в календаре (react-datepicker__month-select)
        $(".react-datepicker__month-select").selectOptionByValue("0");
        // Кликаем дату (react-datepicker__day react-datepicker__day--020)
        $(".react-datepicker__day--020:not(.react-datapicker__day--outside-month)").click();
        // выбор значений в поле Subjects
        $("#subjectsInput").scrollIntoView(true).setValue("History").pressEnter();
        $("#subjectsInput").setValue("Arts").pressEnter();
        // Выбираем элементы из чек-бокса
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        // Выбираем файл для вложения (создав при этом каталог resources)
        $("#uploadPicture").uploadFromClasspath("KingOfNorth.jpg");
        // Вводим текущий адрес
        $("#currentAddress").setValue("You don't know anything Jon Snow!");
        // выбираем State and Sity из выпадающего списка
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Haryana")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Karnal")).click();
        $("#submit").click();
        // Проверка теста
        $(byText("Thanks for submitting the form")).shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(
                text("John Snow"), text("Bastard@kingNnorth.com"), text("Male"), text("7777777777"),
                text("20 January,1990"), text("History, Arts"), text("Reading, Music"), text("KingOfNorth.jpg"),
                text("You don't know anything Jon Snow!"),
                text("Haryana Karnal"));
    }
};
