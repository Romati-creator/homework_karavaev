package com.google.karavaevrk.homework.pages;

import com.codeborne.selenide.SelenideElement;
import com.google.karavaevrk.homework.pages.components.CalendarComponents;
import com.google.karavaevrk.homework.pages.components.StateAndCityComponents;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPages {

    public CalendarComponents calendarComponents = new CalendarComponents();
    public StateAndCityComponents stateAndCityComponents = new StateAndCityComponents();

    SelenideElement firstNameInput = $("#firstName"),
                    lastNameInput = $("#lastName"),
                    userEmailInput = $("#userEmail"),
                    radioButton = $("[for='gender-radio-1']"),
                    userNumberInput = $("#userNumber"),
                    userAdressInput = $("#currentAddress");

    public RegistrationPages openPage(){
        // Открываем страницу в браузере
        open("https://demoqa.com/automation-practice-form");
        // Проверка правильного заголовка
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));

        return this;
    }

    public RegistrationPages typeFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }
    public RegistrationPages typeLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPages typeUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public RegistrationPages clickButton() {
        radioButton.click();

        return this;
    }

    public RegistrationPages typeUserNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public RegistrationPages choiceSubjectsField(String value) {
        // выбор значений в поле Subjects
        $("#subjectsInput").scrollIntoView(true).setValue(value).pressEnter();

        return this;
    }

    public RegistrationPages choiceElements(String value) {
        // Выбираем элементы из чек-бокса
        $("#hobbiesWrapper").$(byText(value)).click();

        return this;
    }

    public RegistrationPages attachFile() {
        // Выбираем файл для вложения (создав при этом каталог resources)
        $("#uploadPicture").uploadFromClasspath("KingOfNorth.jpg");

        return this;
    }

    public RegistrationPages typeUserAdress(String value) {
        userAdressInput.setValue(value);

        return this;
    }

    public RegistrationPages checkingTest() {
        // Проверка теста
        $(byText("Thanks for submitting the form")).shouldHave(text("Thanks for submitting the form"));

        return this;
    }
    public RegistrationPages checkingTestResult(String value) {
        $(".table-responsive").shouldHave(text(value));

        return this;
    }
}
