package com.christian.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}

/*
this is what will be used to create a customer object that will be used as a body for a POST call
see Customer Controller
 */
