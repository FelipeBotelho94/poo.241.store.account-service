package espm.store.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {
    @Autowired
    private JogadorRepository accountRepository; // Renomeado de JogadorRepository para AccountRepository

    @GetMapping
    public Iterable<AccountModel> getAllJogadores() { // Alterado o tipo de retorno para Account
        return accountRepository.findAll();
    }

    @PostMapping
    public Account createJogador(@RequestBody Account jogador) { // Alterado o tipo do parâmetro e retorno para Account
        return accountRepository.save(jogador);
    }

    // Outros métodos de CRUD (atualização e exclusão) podem ser adicionados conforme necessário
}
