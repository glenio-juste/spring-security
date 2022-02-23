package juste.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome(){
        return "Bem-vindo à minha API Web Spring Boot";
    }

    @GetMapping("/users")
    public String users(){
        return "Usuário autorizado!";
    }

    @GetMapping("/managers")
    public String managers(){
        return "Gerente autorizado!";
    }

}
