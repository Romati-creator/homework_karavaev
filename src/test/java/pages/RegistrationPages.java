package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponents;
import pages.components.StateAndCityComponents;

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

    public void openPage(){
        // Открываем страницу в браузере
        open("https://demoqa.com/automation-practice-form");
        // Проверка правильного заголовка
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
    }

    public void typeFirstName(String value) {
        firstNameInput.setValue(value);
    }
    public void typeLastName(String value) {
        lastNameInput.setValue(value);
    }

    public void typeUserEmail(String value) {
        userEmailInput.setValue(value);
    }

    public void clickButton() {
        radioButton.click();
    }

    public void typeUserNumber(String value) {
        userNumberInput.setValue(value);
    }

    public void choiceSubjectsField() {
        // выбор значений в поле Subjects
        $("#subjectsInput").scrollIntoView(true).setValue("History").pressEnter();
        $("#subjectsInput").setValue("Arts").pressEnter();
    }
    public void choiceElements() {
        // Выбираем элементы из чек-бокса
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
    }

    public void attachFile() {
        // Выбираем файл для вложения (создав при этом каталог resources)
        $("#uploadPicture").uploadFromClasspath("KingOfNorth.jpg");
    }

    public void typeUserAdress(String value) {
        userAdressInput.setValue(value);
    }
}
