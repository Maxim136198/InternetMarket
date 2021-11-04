package by.itstep.internetMarket.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "by.itstep.internetMarket")
@Import({DatabaseConfiguration.class})
public class AppConfiguration {

}

