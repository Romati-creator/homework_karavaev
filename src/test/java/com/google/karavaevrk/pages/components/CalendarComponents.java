package com.google.karavaevrk.pages.components;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.format;

public class CalendarComponents {

    public void setDay(String year, String month, String day){
        // Кликаем Date of Birth для выбора даты (id = dateOfBirthInput)
        $("#dateOfBirthInput").click();
        // Выбираем год в календаре (react-datepicker__year-select)
        $(".react-datepicker__year-select").selectOption(year);
        // Выбираем месяц в календаре (react-datepicker__month-select)
        $(".react-datepicker__month-select").selectOption(month);
        // Кликаем дату (react-datepicker__day react-datepicker__day--020)
        String dayLocator = format(".react-datepicker__day--0%s:not(.react-datepicker__day--outside-month)", day);
        $(dayLocator).click();
    }

}
