package com.springbook.restconsumer.RestConsumer;

import com.springbook.restconsumer.models.PaymentInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "payments",
            url = "${name.service.url}")
public interface PaymentProxy {
    @PostMapping("payment")
    PaymentInfo makePayment(
            @RequestHeader String requestId,
            @RequestBody PaymentInfo paymentInfo
    );
}
