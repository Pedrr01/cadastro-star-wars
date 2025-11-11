package dev.pedro.CadastroStarWars.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes/")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    // Listar todas as missões:
    @GetMapping("listar")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
    }
    // Listar missão por ID:

    // Criar missão:
    @PostMapping("criar")
    public String criar(){
        return "NADA";
    }

    // Alterar missão:
    @PutMapping("alterar")
    public String alterar(){
        return "NADA";
    }

    // Deletar missão:
    @DeleteMapping("deletar")
    public String deletar(){
        return "NADA";
    }
}
