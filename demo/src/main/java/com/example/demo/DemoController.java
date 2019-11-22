package com.example.demo;

import com.example.demo.service.DemoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    DemoService demoService = new DemoService();

    @GetMapping("/demo")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void demo() {
        demoService.demoSupplier();
    }
}
