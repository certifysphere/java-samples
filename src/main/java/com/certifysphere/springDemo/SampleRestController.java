package com.certifysphere.springDemo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleRestController {

    private PaymentService paymentService;
    
    public SampleRestController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping(path = "/")
    public String sayHello(){
        return "Hello!!";
    }

    @GetMapping(path = "/sayBye/{name}")
    public String sayByeToMe(@PathVariable String name){
        return "Bye " + name;
    }

    @PostMapping(path = "/payment", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Payment takePayment(@RequestBody Payment payment){
        return paymentService.processPayment(payment);
    }


}
