package co.com.choucair.certification.exitoweb.tasks;

import co.com.choucair.certification.exitoweb.userinterface.SidebarCategoriesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class EntersCategory  implements Task {

    private SidebarCategoriesPage sidebarCategoriesPage;

    public static Performable theCategory() {
        return Tasks.instrumented(EntersCategory.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SidebarCategoriesPage.THREE_LINE_BUTTON),
                Click.on(SidebarCategoriesPage.CELLPHONE_AND_ACCESORIES_BUTTON),
                Click.on(SidebarCategoriesPage.SAMSUNG_BUTTON),
                Click.on(SidebarCategoriesPage.PRODUCTS));
    }

}
