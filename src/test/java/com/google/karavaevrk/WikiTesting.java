package com.google.karavaevrk;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WikiTesting {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void wikiTest() {
        // Открываем страницу гитхаба
        open("https://github.com/selenide/selenide");
        // Кликаем раздел Вики
        $("#wiki-tab").click();
        // В разделе pages в строку поиска вводим SoftAssertions
        $("#wiki-pages-filter").setValue("SoftAssertions");
        // Ищем в поиске текст SoftAssertions и кликаем
        $(byText("SoftAssertions")).click();
        // Проверка что в тексте есть JUnit5
        $(".markdown-body").shouldHave(text("JUnit5"));
    }

    @Test
    void dragAndDropTest() {
        // Открываем страницу
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // перетянуть а на б
        $("#column-a").dragAndDropTo($("#column-b"));
        // Проверка
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}
