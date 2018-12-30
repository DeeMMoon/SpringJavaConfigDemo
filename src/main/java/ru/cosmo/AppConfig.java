package ru.cosmo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ru.cosmo")
public class AppConfig {
    @Bean
    public MessageRenderer renderer(){
        return new MessageRendererErr(message());
    }
    @Bean
    public Message message(){
        return new HelloMessage("hello");
    }
}
