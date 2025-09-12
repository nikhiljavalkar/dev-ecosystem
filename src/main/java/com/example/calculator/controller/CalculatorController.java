package com.example.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/v1/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(a + b);
    }

    @GetMapping("/v1/subtarct")
    public String subtract(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(a - b);
    }

    @GetMapping("/v1/multiply")
    public String multiply(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(a * b);
    }

    @GetMapping("/v1/division")
    public String divide(@RequestParam int a, @RequestParam int b) {
        if (b == 0) {
            return "Cannot divide by zero";
        }
        return String.valueOf(a / b);
    }
}