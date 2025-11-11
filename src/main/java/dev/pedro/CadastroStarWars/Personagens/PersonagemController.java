package dev.pedro.CadastroStarWars.Personagens;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personagem/")
public class PersonagemController {

    private PersonagemService personagemService;

    public PersonagemController(PersonagemService personagemService) {
        this.personagemService = personagemService;
    }

    // Listar todos os personagens:
    @GetMapping("listar")
    public List<PersonagemModel> listarPersonagens(){
        return personagemService.listarPersonagens();
    }

    // Listar personagen por ID:
    @GetMapping("listar/{id}")
    public PersonagemModel listarPersonagensPorId(@PathVariable Long id){
        return personagemService.listarPersonagemPorID(id);
    }

    @PostMapping("criar")
    public PersonagemModel criarPersonagem(@RequestBody PersonagemModel personagem){
        return personagemService.criarPersonagem(personagem);
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
