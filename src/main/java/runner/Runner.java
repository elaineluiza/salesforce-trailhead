package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:cucumber/report.html"},
        features = {"features"},
        monochrome = true,
        tags = "",
        glue = {"steps"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
class Runner {




}
