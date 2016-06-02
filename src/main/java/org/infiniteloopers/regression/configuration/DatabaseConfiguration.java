package org.infiniteloopers.regression.configuration;

import org.infiniteloopers.regression.dao.RegressionDao;
import org.infiniteloopers.regression.dao.RegressionDaoImpl;
import org.infiniteloopers.regression.service.DBService;
import org.infiniteloopers.regression.service.DBServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration {

    @Bean
    RegressionDao regressionDao(){
        return new RegressionDaoImpl();
    }

    @Bean
    @Autowired
    DBService dbService(RegressionDao regressionDao){
        return new DBServiceImpl(regressionDao);
    }
}
