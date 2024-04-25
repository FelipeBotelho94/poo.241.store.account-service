package espm.store.jogador;

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
    Integer jogosDisputados,
    Integer inicios,
    Integer minutos,
    Integer noventaMin,
    Integer gols,
    Integer assistencias,
    Integer golsAssistencias,
    Integer golsPenal,
    Integer penaltisBatidos,
    Integer passesTentados,
    Integer cartoesAmarelos,
    Integer cartoesVermelhos,
    Double xG,
    Double npxG,
    Double xAG,
    Double goleassis,
    Integer progressaoCarregada,
    Integer progressaoPassada,
    Integer progressaoRecebida
) { }
