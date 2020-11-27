import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;


public class lesson3 {
    // Arrange
    // Act
    // Assert

    @Test
    void test2() {
        open("https://alfabank.ru/make-money/");
        $("body").shouldHave(text("Накопительные продукты"));

        $$("button").findBy(text("Депозиты")).click();
        $("body").shouldHave(text("Вклады"));

        $$("button").findBy(text("Архивные счета и депозиты")).click();
        $("body").shouldHave(text("Архивные счета и депозиты"));

        $$("button").findBy(text("Депозиты")).click();
        $$("[data-widget-name='CatalogCard']").shouldHave(size(5));
    }

    @Test
    void test3() {
        open("https://alfabank.ru/make-money/");
        $("[data-test-id=tabs-list-tabTitle-0]").sibling(0).click();

        // preceding
        //$("[data-test-id=tabs-list-tabTitle-2]").preceding(0).click();

        // parent
        //$$("span").findBy(text("Страхование вкладов")).parent().click();

        // closest
        //$$("span").findBy(text("Страхование вкладов")).closest("button").click();

        $$(".a1Etq03").shouldHave(size(4));
    }
}
