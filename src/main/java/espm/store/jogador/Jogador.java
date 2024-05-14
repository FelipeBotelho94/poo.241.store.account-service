package espm.store.jogador;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter @Setter @ToString
@Builder @Accessors(chain = true, fluent = true)
@NoArgsConstructor @AllArgsConstructor
public final class Jogador {

    private String id;
    private String jogador;  // Alterado de 'name' para 'nome'
    private String nacionalidade;  // Alterado de 'email' para 'nacionalidade'
    private String posicao;  // Alterado de 'password' para 'posicao'
    private String equipe;  // Adicionado campo 'equipe'
    private Integer idade;  // Alterado de 'id' para 'idade' e ajustado o tipo para 'String'
    private String nascimento;  // Adicionado campo 'nascimento'
    private List<Indice> indices;

}
