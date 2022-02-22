package juste.spring.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome(){
        return "Bem-vindo à minha API Web Spring Boot";
    }

    @GetMapping("/users")
    @PreAuthorize("hasAnyRole('MANAGERS', 'USERS')") // no users, o user e o manager tem acesso a rota de user
    public String users(){
        return "Usuário autorizado!";
    }

    @GetMapping("/managers")
    @PreAuthorize("hasRole('MANAGERS')") // no manager, somente manager tem acesso a rota de manager
    public String managers(){
        return "Gerente autorizado!";
    }

}
