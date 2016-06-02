package org.infiniteloopers.regression;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = {"org.infiniteloopers.regression.stepdefinitions"}
)
public class RunRegressionTest {
}
