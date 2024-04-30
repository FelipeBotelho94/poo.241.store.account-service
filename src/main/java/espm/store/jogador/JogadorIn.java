package espm.store.jogador;

import java.util.Map;

public record JogadorIn (
    String jogador,
    String nacionalidade,
    String posicao,
    String equipe,
    Integer idade,
    String nascimento,
    Map<String, Object> indices
) { }
