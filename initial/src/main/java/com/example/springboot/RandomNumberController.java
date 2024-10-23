package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;

@RestController
public class RandomNumberController {

    @GetMapping("/random/{length}")
    public String random(@PathVariable int length) {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder randomNumber = new StringBuilder();
        for (int i = 0; i < length; i++) {
            randomNumber.append(secureRandom.nextInt(10));
        }
        return "Random number: " + randomNumber.toString();
    }
}
