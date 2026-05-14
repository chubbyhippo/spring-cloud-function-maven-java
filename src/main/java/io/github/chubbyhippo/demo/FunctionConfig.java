package io.github.chubbyhippo.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class FunctionConfig {

    @Bean
    public Supplier<String> helloWorld() {
        return () -> "Hello, World!";
    }
}
