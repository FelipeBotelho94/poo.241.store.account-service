package espm.store.jogador;

public final class JogadorParser {
    
    public static Jogador to(JogadorIn in) {
        return null == in ? null : Jogador.builder()
            .jogador(in.jogador())
            .nacionalidade(in.nacionalidade())
            .posicao(in.posicao())
            .equipe(in.equipe())
            .idade(in.idade())
            .nascimento(in.nascimento())
            .jogosDisputados(in.jogosDisputados())
            .inicios(in.inicios())
            .minutos(in.minutos())
            .noventaMin(in.noventaMin())
            .gols(in.gols())
            .assistencias(in.assistencias())
            .golsAssistencias(in.golsAssistencias())
            .golsPenal(in.golsPenal())
            .penaltisBatidos(in.penaltisBatidos())
            .passesTentados(in.passesTentados())
            .cartoesAmarelos(in.cartoesAmarelos())
            .cartoesVermelhos(in.cartoesVermelhos())
            .xG(in.xG())
            .npxG(in.npxG())
            .xAG(in.xAG())
            .goleassis(in.goleassis())
            .progressaoCarregada(in.progressaoCarregada())
            .progressaoPassada(in.progressaoPassada())
            .progressaoRecebida(in.progressaoRecebida())
            .build();
    }

    public static JogadorOut to(Jogador account) {
        return null == account ? null : new JogadorOut(
            account.id(),
            account.jogador(),
            account.nacionalidade(),
            account.posicao(),
            account.equipe(),
            account.idade(),
            account.nascimento(),
            account.jogosDisputados(),
            account.inicios(),
            account.minutos(),
            account.noventaMin(),
            account.gols(),
            account.assistencias(),
            account.golsAssistencias(),
            account.golsPenal(),
            account.penaltisBatidos(),
            account.passesTentados(),
            account.cartoesAmarelos(),
            account.cartoesVermelhos(),
            account.xG(),
            account.npxG(),
            account.xAG(),
            account.goleassis(),
            account.progressaoCarregada(),
            account.progressaoPassada(),
            account.progressaoRecebida()
        );
    }
}
