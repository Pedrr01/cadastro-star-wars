package dev.pedro.CadastroStarWars.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes/")
public class MissoesController {

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
