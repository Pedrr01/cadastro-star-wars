package dev.pedro.CadastroStarWars.Personagens;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personagem/")
public class PersonagemController {

    @GetMapping("listar")
    public String listar(){
        return "Listando todas as missões";
    }

    @PostMapping("criar")
    public String criar(){
        return "NADA";
    }

    @PutMapping("alterar")
    public String alterar(){
        return "NADA";
    }

    @DeleteMapping("deletar")
    public String deletar(){
        return "NADA";
    }
}
