package com.example.paymentservice.controller;

import com.example.paymentservice.model.Payment;
import com.example.paymentservice.repository.PaymentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentRepository repository;

    public PaymentController(PaymentRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Payment makePayment(@RequestBody Payment payment) {
        payment.setStatus("SUCCESS");
        return repository.save(payment);
    }

    @GetMapping
    public List<Payment> getPayments() {
        return repository.findAll();
    }
}