package com.walmart;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Scanner;

@Component
public class ProcessOrder {

    private OrderContent orderContent ;
    String line;

//    ProcessOrder (OrderContent orderContent){
//        this.orderContent = orderContent ;
//    }


    private static final Logger logger = (Logger) LoggerFactory.getLogger(ProcessOrder.class);

    public ProcessOrder() {

        try {
            File myObj = new File("C:\\Users\\siddh\\OneDrive\\Documents\\op.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                processLine(data);
                logger.info(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            logger.error("File read operation failed.");
            e.printStackTrace();
        }
    }

    OrderContent processLine(String line){
        OrderContent orderContent = new OrderContent();
        String[] stringArray = line.split(" ");

        for(int i=0 ; i<stringArray.length ; i+=2){
            if(stringArray[i]=="Books")
                orderContent.Books = Integer.valueOf(stringArray[i+1]) ;
            if(stringArray[i]=="Electronics")
                orderContent.Electronics = Integer.valueOf(stringArray[i+1]) ;
            if(stringArray[i]=="Apparel")
                orderContent.Apparel = Integer.valueOf(stringArray[i+1]);
        }

        return orderContent;
    }
    
}
