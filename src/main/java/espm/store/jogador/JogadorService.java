package espm.store.jogador;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

/* 
 * Aqui eh a camada de regra de negocio.
 */
@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    public Jogador create(Jogador jogador) {
        return jogadorRepository.save(new JogadorModel(jogador)).to();
    }

    public void delete(@NonNull String id) {
        jogadorRepository.deleteById(id);
    }

    public List<Jogador> findAll() {
        return jogadorRepository.findAll().stream().map(JogadorModel::to).collect(Collectors.toList());
    }

    public Jogador find(@NonNull String id) {
        return jogadorRepository.findById(id).map(JogadorModel::to).orElse(null);
    }
}
