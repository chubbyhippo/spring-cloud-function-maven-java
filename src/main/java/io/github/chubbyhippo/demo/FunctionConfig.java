package io.github.chubbyhippo.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class FunctionConfig {
    private static final Logger log = LoggerFactory.getLogger(FunctionConfig.class);

    @Bean
    public Supplier<String> hello() {
        return () -> {
            log.info("hello, function!");
            return "hello, function!";
        };
    }
}
