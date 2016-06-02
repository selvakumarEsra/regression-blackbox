package org.infiniteloopers.regression.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources(
        {
                @PropertySource(value = "classpath:/application.properties")
        }
)
public class PropertiesConfiguration {

    @Autowired
    Environment environment;
}
