package espm.store.jogador;

import java.util.Map;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder @Accessors(fluent=true, chain=true)
public record JogadorOut (
    String id,
    String jogador,
    String nacionalidade,
    String posicao,
    String equipe,
    Integer idade,
    String nascimento,
    Map<String, Object> indices
) { }
