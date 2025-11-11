package dev.pedro.CadastroStarWars.Personagens;

import dev.pedro.CadastroStarWars.Missoes.MissoesModel;
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

    // Listar personagem por ID:
    @GetMapping("listar/{id}")
    public PersonagemModel listarPersonagensPorId(@PathVariable Long id){
        return personagemService.listarPersonagemPorID(id);
    }

    // Criando personagem:
    @PostMapping("criar")
    public PersonagemModel criarPersonagem(@RequestBody PersonagemModel personagem){
        return personagemService.criarPersonagem(personagem);
    }

    // Deletando personagem por ID: SEMPRE VOID
    @DeleteMapping("deletar/{id}")
    public void deletarPersonagem(@PathVariable Long id){
        personagemService.deletarPersonagem(id);
    }

    // Atualizando personagem por ID:
    @PutMapping("atualizar/{id}")
    public PersonagemModel atualizarPersonagem(@PathVariable Long id, @RequestBody PersonagemModel personagemAtualizado){
        return personagemService.atualizarPersonagem(id,personagemAtualizado);
    }
}
