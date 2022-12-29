package com.example.purse.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstControllers {

    @GetMapping
    public String helloFriend() {
        return "Приложение запущено";
    }

    @GetMapping("/path/to/info")
    public String info() {
        return "1. Сутягин А.В.; \n2. Первый проект; \n3. Создан 29.12.2022; \n4. Пилотный проект, созданный преимущественно при помощи русского мата.";
    }

}
