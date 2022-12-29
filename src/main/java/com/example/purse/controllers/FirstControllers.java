package com.example.purse.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstControllers {

    @GetMapping

    public String HelloFriend(){
        return "Приложение запущено";
    }

    @GetMapping("/path/to/page")

    public String Page(){
        return Info();
    }

    public String Info(){
        return "1. Сутягин А.В.; \n2. Первый проект; \n3. Создан 29.12.2022; \n4. Пилотный проект, созданный преимущественно при помощи русского мата.";
    }
}
