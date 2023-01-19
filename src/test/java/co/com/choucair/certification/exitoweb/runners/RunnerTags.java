package co.com.choucair.certification.exitoweb.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/exitoweb.feature",
        glue = "co.com.choucair.certification.exitoweb.stepdefinitions",
        tags = "@Scenario1",
        snippets = CucumberOptions.SnippetType.CAMELCASE )
public class RunnerTags {
}
