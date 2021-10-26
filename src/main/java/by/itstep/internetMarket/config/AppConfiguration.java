package by.itstep.internetMarket.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:database.properties")
@ComponentScan("by.itstep.internetMarket")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {
        "by.itstep.internetMarket.dao.entity"
})


public class AppConfiguration {

    @Value("${connection.driver_class}")
    private String driverClass;

    @Value("${connection.url}")
    private String url;

    @Value("${dialect}")
    private String dialect;

    @Value("${connection.username}")
    private String userName;

    @Value("&{connection.password")
    private String password;
}
