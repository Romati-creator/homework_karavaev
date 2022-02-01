package com.google.karavaevrk.homework.pages.components.pages.components.pages;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomeworkPage {

    RegistrationPages registrationPages = new RegistrationPages();

    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String userEmail = faker.internet().emailAddress();
    String userNumber = faker.phoneNumber().subscriberNumber(10);
    String userAdress = faker.address().fullAddress();

    @BeforeAll
    static void beforeAll () {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
     void fillFormTest () {
        registrationPages.openPage();
        registrationPages.typeFirstName(firstName);
        registrationPages.typeLastName(lastName);
        registrationPages.typeUserEmail(userEmail);
        registrationPages.clickButton();
        registrationPages.typeUserNumber(userNumber);
        registrationPages.calendarComponents.setDay("1990", "July", "20");
        registrationPages.choiceSubjectsField();
        registrationPages.choiceElements();
        registrationPages.attachFile();
        registrationPages.typeUserAdress(userAdress);
        registrationPages.stateAndCityComponents.choiceStateAndCity();

        // Проверка теста
        $(byText("Thanks for submitting the form")).shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(
                text(firstName + " " + lastName), text(userEmail), text("Male"), text(userNumber),
                text("20 July,1990"), text("History, Arts"), text("Reading, Music"), text("KingOfNorth.jpg"),
                text(userAdress),
                text("Haryana Karnal"));
    }
};
