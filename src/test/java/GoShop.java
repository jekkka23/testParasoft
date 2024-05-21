import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class GoShop {

    @Test

void GoShop() {

open( "https://www.parasoft.com/");

        $x("//*[@id='hs-eu-confirmation-button']").click();
        Selenide.sleep(1500);
        Selenide.executeJavaScript("window.scrollBy(0,500);");
        Selenide.sleep(1500);
        Selenide.executeJavaScript("window.scrollBy(0,-500);");
        Selenide.sleep(1500);
        $x("//*[@class='nav-contact-us']").click();
        Selenide.sleep(1500);
        $x("//*[@name='email']").setValue("test@mail.com");
        Selenide.sleep(1500);
        $x("//*[@name='firstname']").setValue("Имя");
        Selenide.sleep(1500);
        $x("//*[@name='lastname']").setValue("Фамилия");
        Selenide.sleep(1500);
        $x("//*[@name='company']").setValue("ООО Компания");
        Selenide.sleep(1500);
        $x("//*[@name='jobtitle']").setValue("Должность");
        Selenide.sleep(1500);
        $x("//*[@name='phone']").setValue("+7999999999");
        Selenide.sleep(1500);
        Selenide.executeJavaScript("window.scrollBy(0,500);");
        Selenide.sleep(1500);
        $x("//*[@name='country']").selectOption("United States");
        Selenide.sleep(1500);
        $x("//*[@id='comments-7e18a454-1995-49f5-a907-ddc7be450646']").setValue("Комментарий").pressEnter();
        Selenide.sleep(1500);
        $x("//*[@class='hs-button primary large']").click();
        Selenide.sleep(1500);
        Selenide.executeJavaScript("window.scrollBy(0,-500);");
        Selenide.sleep(1500);
        $x("//*[@class='nav-try-parasoft']").click();
        Selenide.sleep(1500);
        Selenide.executeJavaScript("window.scrollBy(0,500);");
        Selenide.sleep(1500);
        $x("//*[@class='sf-field-taxonomy-solutions']").click();
        Selenide.sleep(1500);
        $x("//*[@class='sf-level-0 sf-item-274']").parent().click();
        Selenide.sleep(1500);
        $x("//*[@class='sf-field-taxonomy-industry']").click();
        Selenide.sleep(1500);
        Selenide.executeJavaScript("window.scrollBy(0,500);");
        Selenide.sleep(1500);
        $x("//*[@name='_sf_submit']").parent().click();
        Selenide.sleep(1500);
        $x("//*[@href='/products/parasoft-c-ctest/c-c-request-a-demo/']").click();
        Selenide.sleep(1500);
        $x("//*[@id='hubspot-form']").shouldHave(text("info@parasoft.com")); //поиск по тексту на странице
        Selenide.sleep(1500);


    }
}
