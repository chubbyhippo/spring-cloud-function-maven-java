package io.github.chubbyhippo.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Function;
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

    @Bean
    public Supplier<String> firstVerse() {
        return () -> {
            log.info("Genesis 1:1");
            return """
                Genesis 1:1
                In the beginning God created the heaven and the earth.
                """;
        };
    }

    @Bean
    public Function<String, String> upperCase() {
        return value -> {
            log.info("Uppercasing {}", value);
            return value == null ? null : value.toUpperCase();
        };
    }

    @Bean
    public Consumer<String> logMessage() {
        return value -> log.info("Received message: {}", value);
    }
}
