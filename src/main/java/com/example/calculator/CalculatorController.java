package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/ntsterror/v1/add")
    public String add(@RequestParam double a, @RequestParam double b) {
        return String.valueOf(a + b);
    }

    @GetMapping("/ntsterror/v1/subtarct")
    public String subtract(@RequestParam double a, @RequestParam double b) {
        return String.valueOf(a - b);
    }

    @GetMapping("/ntsterror/v1/multiply")
    public String multiply(@RequestParam double a, @RequestParam double b) {
        return String.valueOf(a * b);
    }

    @GetMapping("/ntsterror/v1/division")
    public String divide(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            return "Error: Division by zero";
        }
        return String.valueOf(a / b);
    }
}