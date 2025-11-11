package dev.pedro.CadastroStarWars.Personagens;

import dev.pedro.CadastroStarWars.Missoes.MissoesModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonagemService {
    private PersonagemRepository personagemRepository;

    public PersonagemService(PersonagemRepository personagemRepository) {
        this.personagemRepository = personagemRepository;
    }

    // Listar todos os personagens:
    public List<PersonagemModel> listarPersonagens(){
        return personagemRepository.findAll();
    }

    // Listar personagem por ID:
    public PersonagemModel listarPersonagemPorID(Long id){
        Optional<PersonagemModel> personagemPorId = personagemRepository.findById(id);
        return personagemPorId.orElse(null);
    }

    // Criar Personagem:
    public PersonagemModel criarPersonagem(PersonagemModel personagem){
        return personagemRepository.save(personagem);
    }

    // Deletando personagem por ID: SEMPRE VOID
    public void deletarPersonagem(Long id){
        personagemRepository.deleteById(id);
    }

    // Atualizando personagem por ID:
    public PersonagemModel atualizarPersonagem(Long id, PersonagemModel personagemAtualizado){
        if(personagemRepository.existsById(id)){
            personagemAtualizado.setId(id);
            return personagemRepository.save(personagemAtualizado);
        }
        return null;
    }
}
