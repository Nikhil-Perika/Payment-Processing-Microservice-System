
package com.example.paymentservice.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private List<String> payments = new ArrayList<>();

    @PostMapping
    public String makePayment(@RequestBody String payment){
        payments.add(payment);
        return "Payment Successful: " + payment;
    }

    @GetMapping
    public List<String> getPayments(){
        return payments;
    }
}
