package com.kafka.dto;


import lombok.Data;

@Data
public class Customer {
    private int Id;
    private String name;
    private String email;
    private String contactNo;
}
