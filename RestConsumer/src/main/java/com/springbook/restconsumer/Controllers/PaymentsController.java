package com.springbook.restconsumer.Controllers;


import com.springbook.restconsumer.RestConsumer.PaymentProxy;
import com.springbook.restconsumer.models.PaymentInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentsController {
    private final PaymentProxy paymentsProxy;

    public PaymentsController(PaymentProxy paymentsProxy) {
        this.paymentsProxy = paymentsProxy;
    }

    @PostMapping("/payment")
    public PaymentInfo createPayment(
            @RequestBody PaymentInfo payment
    ) {
        String requestId = UUID.randomUUID().toString();
        return paymentsProxy.makePayment(requestId, payment);
    }
}
