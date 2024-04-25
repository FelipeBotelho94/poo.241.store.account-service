package espm.store.jogador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {
    @Autowired
    private JogadorService jogadorService; // Renomeado de JogadorRepository para AccountRepository

    @GetMapping
    public List<Jogador> getAllJogadores() { // Alterado o tipo de retorno para Account
        return jogadorService.findAll();
    }

    @PostMapping
    public Jogador create(@RequestBody JogadorIn jogador) { // Alterado o tipo do parâmetro e retorno para Account
        System.out.println(jogador);
        System.out.println(jogador.jogador());
        return jogadorService.create(JogadorParser.to(jogador));
    }

    // Outros métodos de CRUD (atualização e exclusão) podem ser adicionados conforme necessário
}
