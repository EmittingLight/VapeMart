package com.yaga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/vape-mart")
    public String vapeMart() {
        return "vape-mart"; // это имя HTML-шаблона, который будет содержать ваш React-код
    }
}
