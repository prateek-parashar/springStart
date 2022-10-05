package com.springbook.SpringBootStart.controllers;

import com.springbook.SpringBootStart.models.PaymentInfo;
import com.springbook.SpringBootStart.services.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentController {

    private final Logger logger = Logger.getLogger(PaymentController.class.getName());

    private PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentInfo> makePayment(
            @RequestHeader String requestId,
            @RequestBody PaymentInfo paymentInfo
    ) {
        logger.info("Request received with body " + paymentInfo);
        paymentInfo.setId(UUID.randomUUID().toString());

        return ResponseEntity
                .status(HttpStatus.OK)
                .header("requestId", requestId)
                .body(paymentInfo);
    }

}
