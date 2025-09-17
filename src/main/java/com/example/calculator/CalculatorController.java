package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/ntsterror/v1/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(a + b);
    }

    @GetMapping("/ntsterror/v1/subtarct")
    public String subtract(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(a - b);
    }

    @GetMapping("/ntsterror/v1/multiply")
    public String multiply(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(a * b);
    }

    @GetMapping("/ntsterror/v1/division")
    public String divide(@RequestParam int a, @RequestParam int b) {
        if (b == 0) {
            return "Division by zero is not allowed";
        }
        return String.valueOf((double) a / b);
    }
}