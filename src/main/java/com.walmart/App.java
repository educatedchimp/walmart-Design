package com.walmart;

import org.apache.logging.log4j.LogManager;
import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileReader;
import java.io.IOException;
//import java.util.logging.Logger;

import ch.qos.logback.classic.Logger;

import java.util.logging.Level;

@SpringBootApplication
public class App {
    static int ch ;

//    static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private static final Logger logger = (Logger) LoggerFactory.getLogger(App.class);
    public static void main(String[] args) throws IOException {
        SpringApplication.run(App.class, args);
        logger.info( "lets go : {}"  );


        FileReader fs = new FileReader("C:\\Users\\siddh\\OneDrive\\Documents\\op.txt");
        while ((ch=fs.read())!=-1)
            logger.info( String.valueOf((char)ch));
    }

}


