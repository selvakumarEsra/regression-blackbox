package org.infiniteloopers.regression.configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(
        {
                DatabaseConfiguration.class,
                PropertiesConfiguration.class
        }
)
public class AppConfiguration {

}
