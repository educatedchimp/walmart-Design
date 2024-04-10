package com.walmart;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

import ch.qos.logback.classic.Logger;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class App {
    static int ch ;

    private static final Logger logger = (Logger) LoggerFactory.getLogger(App.class);
    public static void main(String[] args) throws IOException {
        SpringApplication.run(App.class, args);
    }

}


