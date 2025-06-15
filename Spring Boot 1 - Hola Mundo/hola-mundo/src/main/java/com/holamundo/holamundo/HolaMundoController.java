package com.holamundo.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/hola")
    public String hola() {
        return "Hola Mundo desde Spring Boot con Laura Peñaloza!";
    }
}