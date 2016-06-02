package org.infiniteloopers.regression.stepdefinitions;


import cucumber.api.java.Before;
import org.infiniteloopers.regression.configuration.AppConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = AppConfiguration.class)
public class ApplicationGlue {

    Logger  logger = LoggerFactory.getLogger(ApplicationGlue.class);

    @Before
    public void beforeScenario(){
        logger.info("Started the blackbox testing for application...");
    }
}
