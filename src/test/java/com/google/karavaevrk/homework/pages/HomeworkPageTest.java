package com.google.karavaevrk.homework.pages;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HomeworkPageTest {

    RegistrationPages registrationPages = new RegistrationPages();

    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String userEmail = faker.internet().emailAddress();
    String userNumber = faker.phoneNumber().subscriberNumber(10);
    String userAdress = faker.address().fullAddress();

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
     void fillFormTest() {

        registrationPages
                .openPage()
                .typeFirstName(firstName)
                .typeLastName(lastName)
                .typeUserEmail(userEmail)
                .clickButton()
                .typeUserNumber(userNumber)
                .calendarComponents.setDay("1990", "July", "20");

        registrationPages
                .choiceSubjectsField("History")
                .choiceSubjectsField("Arts")
                .choiceElements("Reading")
                .choiceElements("Music")
                .attachFile()
                .typeUserAdress(userAdress)
                .stateAndCityComponents.choiceStateAndCity();

        registrationPages.checkingTest()
                .checkingTestResult(firstName + " " + lastName)
                .checkingTestResult(userEmail)
                .checkingTestResult("Male")
                .checkingTestResult(userNumber)
                .checkingTestResult("20 July,1990")
                .checkingTestResult("History, Arts")
                .checkingTestResult("Reading, Music")
                .checkingTestResult("KingOfNorth.jpg")
                .checkingTestResult(userAdress)
                .checkingTestResult("Haryana Karnal");
    }
}

