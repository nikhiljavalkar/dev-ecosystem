package com.example.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/ntsterror/v1/add")
    public double add(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    @GetMapping("/ntsterror/v1/subtarct")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    @GetMapping("/ntsterror/v1/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    @GetMapping("/ntsterror/v1/division")
    public double divide(@RequestParam double a, @RequestParam double b) {
        if (b == 0) throw new IllegalArgumentException("Division by zero is not allowed");
        return a / b;
    }
}
