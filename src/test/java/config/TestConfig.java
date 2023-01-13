package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import applicationContextAware.MyBean;

@Configuration
@PropertySource("classpath:application.properties")
public class TestConfig {

    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
}
