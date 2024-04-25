package espm.store.jogador;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter
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
    private Integer jogosDisputados;  // Alterado de 'name' para 'MP' e ajustado o tipo para 'String'
    private Integer inicios;  // Adicionado campo 'inicios' e ajustado o tipo para 'String'
    private Integer minutos;  // Alterado de 'email' para 'minutos' e ajustado o tipo para 'String'
    private Integer noventaMin;  // Adicionado campo 'noventaMin' e ajustado o tipo para 'String'
    private Integer gols;  // Adicionado campo 'gols' e ajustado o tipo para 'String'
    private Integer assistencias;  // Adicionado campo 'assistencias' e ajustado o tipo para 'String'
    private Integer golsAssistencias;  // Adicionado campo 'golsAssistencias' e ajustado o tipo para 'String'
    private Integer golsPenal;  // Adicionado campo 'golsPenal' e ajustado o tipo para 'String'
    private Integer penaltisBatidos;  // Adicionado campo 'penaltisBatidos' e ajustado o tipo para 'String'
    private Integer passesTentados;  // Adicionado campo 'passesTentados' e ajustado o tipo para 'String'
    private Integer cartoesAmarelos;  // Adicionado campo 'cartoesAmarelos' e ajustado o tipo para 'String'
    private Integer cartoesVermelhos;  // Adicionado campo 'cartoesVermelhos' e ajustado o tipo para 'String'
    private Double xG;  // Adicionado campo 'xG' e ajustado o tipo para 'String'
    private Double npxG;  // Adicionado campo 'npxG' e ajustado o tipo para 'String'
    private Double xAG;  // Adicionado campo 'xAG' e ajustado o tipo para 'String'
    private Double goleassis;  // Adicionado campo 'npxG_xAG' e ajustado o tipo para 'String'
    private Integer progressaoCarregada;  // Adicionado campo 'progressaoCarregada' e ajustado o tipo para 'String'
    private Integer progressaoPassada;  // Adicionado campo 'progressaoPassada' e ajustado o tipo para 'String'
    private Integer progressaoRecebida;  // Adicionado campo 'progressaoRecebida' e ajustado o tipo para 'int'

}
