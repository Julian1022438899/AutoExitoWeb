package co.com.choucair.certification.exitoweb.stepdefinitions;

import co.com.choucair.certification.exitoweb.tasks.EntersCategory;
import co.com.choucair.certification.exitoweb.tasks.OpenUp;
import co.com.choucair.certification.exitoweb.userinterface.SidebarCategoriesPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;

public class ExitoWebStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("Julian entered the exito platform")
    public void julianEnteredTheExitoPlatform() {
        OnStage.theActorCalled("Julian").wasAbleTo(OpenUp.thePage());
    }

    @When("I enter the category of cell phones and accessories and choose the products")
    public void iEnterTheCategoryOfCellPhonesAndAccessoriesAndChooseTheProducts() {
        OnStage.theActorInTheSpotlight().attemptsTo(EntersCategory.theCategory());
        String julian = String.valueOf(Actor.named("Julian"));
        String randomProduct = SidebarCategoriesPage.PRODUCTS.resolveAllFor(julian).ra
    }

    @Then("the name is verified the total prices the quantities and the number of products")
    public void theNameIsVerifiedTheTotalPricesTheQuantitiesAndTheNumberOfProducts() {

    }

}
