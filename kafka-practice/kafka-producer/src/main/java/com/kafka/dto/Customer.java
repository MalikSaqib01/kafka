package com.kafka.dto;


import lombok.Data;
import org.apache.kafka.common.protocol.types.Field;

@Data
public class Customer {
    private int Id;
    private String name;
    private String email;
    private String contactNo;
}
