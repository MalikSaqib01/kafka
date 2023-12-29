package com.kafka.service;


import com.kafka.dto.Customer;
import org.slf4j.*;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service

public class KafkaMessageListener
{

    Logger log =  LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "NewTopic" , groupId = "k-g-2")
    public void  consume(Customer customer)
    {
        log.info("Consumer1 recieve the message : " + customer.toString());
    }
//
//    @KafkaListener(topics = "NewTopicDemo" , groupId = "k-g-2")
//    public void  consume1(Customer message)
//    {
//        log.info("Consumer2 recieve the message : " , message.toString());
//    }
//
//    @KafkaListener(topics = "NewTopicDemo" , groupId = "k-g-2")
//    public void  consume2(Customer message)
//    {
//        log.info("Consumer3 recieve the message : " , message.toString());
//    }
//
//    @KafkaListener(topics = "NewTopicDemo" , groupId = "k-g-2")
//    public void  consume3(Customer message)
//    {
//        log.info("Consumer4 recieve the message : " , message.toString());
//    }


}
