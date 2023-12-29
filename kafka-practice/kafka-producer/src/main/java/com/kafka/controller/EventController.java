package com.kafka.controller;


import com.kafka.dto.Customer;
import com.kafka.service.KafkaMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer-app")
public class EventController {

    @Autowired
    private KafkaMessagePublisher publisher;




//    @GetMapping("/publish/{message}")
//    public ResponseEntity<?> publishMessage(@PathVariable String message)
//    {
//
//        try {
//
//            for (int i = 0; i < 10000; i++) {
//                publisher.sendMessageToTopic(message +" : " +  i );
//            }
//
//            return ResponseEntity.ok("message publised succesfully");
//        } catch (Exception e)
//        {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }


    @PostMapping("/publish")
    public ResponseEntity<?> publishObject(@RequestBody Customer customer)
    {

        try {

                publisher.sendEvents(customer );


            return ResponseEntity.ok("message publised succesfully");
        } catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}

