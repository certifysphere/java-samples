package com.certifysphere.springDemo;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment processPayment(Payment payment){
        System.out.println(payment);

        return payment;

    }
    
}
