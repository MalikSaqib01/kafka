package com.kafka.service;

import com.kafka.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;


@Service
public class KafkaMessagePublisher {

    @Autowired
    private KafkaTemplate<String, Object> template;

//    public void sendMessageToTopic(String message){
//        CompletableFuture<SendResult<String, Object>> future = template.send("NewTopic", message);
//        future.whenComplete((result , ex) ->{
//            if (ex == null) {
//                System.out.println("Sent Message is[: " + message + " and offset number is:" + result.getRecordMetadata().offset() + " ]" );
//            } else {
//                System.out.println("Error: " + ex.getMessage());
//            }
//
//                });
//    }
//


    public void sendEvents(Customer customer){

        try {
            CompletableFuture<SendResult<String, Object>> future = template.send("NewTopic", customer);
            future.whenComplete((result , ex) ->{
                if (ex == null) {
                    System.out.println("Sent Message is[: " + customer + " and offset number is:" + result.getRecordMetadata().offset() + " ]" );
                } else {
                    System.out.println("Error: " + ex.getMessage());
                }

            });
        } catch (Exception e) {
            throw new RuntimeException("ERROR" + e.getMessage());
        }

    }


}
