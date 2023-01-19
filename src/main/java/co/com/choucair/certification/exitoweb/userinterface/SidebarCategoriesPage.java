package co.com.choucair.certification.exitoweb.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SidebarCategoriesPage extends PageObject {

    public static final Target THREE_LINE_BUTTON = Target.the("button that show the subcategories of the page of exito")
            .located(By.id("category-menu"));
    public static final Target CELLPHONE_AND_ACCESORIES_BUTTON = Target.the("button that show the Category cellphone and accesories")
            .located(By.id("undefined-nivel2-Celulares y accesorios"));
    public static final Target SAMSUNG_BUTTON = Target.the("button that show the subcategory Samsung")
            .located(By.xpath("((//section[@class='exito-category-menu-3-x-contentSideMenu']//div)[8]//a)[2]/p"));
    public static final Target PRODUCTS = Target.the("button that show the subcategories of the page of exito")
            .located(By.xpath("#gallery-layout-container div.vtex-search-result-3-x-galleryItem"));


}
