package com.christian.customer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}

// this is the Customer model
// with lombok @Data creates the getters and setters and the string() method override
