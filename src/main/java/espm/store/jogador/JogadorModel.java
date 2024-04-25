package espm.store.jogador;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * Representa a tabela de contas de usuários
 */
@Entity
@Getter @Setter
@Table(name = "jogador")
@AllArgsConstructor @NoArgsConstructor
public class JogadorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_jogador")
    private String id;

    @Column(name = "jogador")
    private String jogador;

    @Column(name = "nacionalidade")
    private String nacionalidade;

    @Column(name = "posicao")
    private String posicao;

    @Column(name = "equipe")
    private String equipe;

    @Column(name = "idade")
    private Integer idade;

    @Column(name = "nascimento")
    private String nascimento;

    @Column(name = "jogos_disputados")
    private Integer jogosDisputados;

    @Column(name = "inicios")
    private Integer inicios;

    @Column(name = "minutos")
    private Integer minutos;

    @Column(name = "noventa_min")
    private Integer noventaMin;

    @Column(name = "gols")
    private Integer gols;

    @Column(name = "assistencias")
    private Integer assistencias;

    @Column(name = "gols_assistencias")
    private Integer golsAssistencias;

    @Column(name = "gols_penal")
    private Integer golsPenal;

    @Column(name = "penaltis_batidos")
    private Integer penaltisBatidos;

    @Column(name = "passes_tentados")
    private Integer passesTentados;

    @Column(name = "cartoes_amarelos")
    private Integer cartoesAmarelos;

    @Column(name = "cartoes_vermelhos")
    private Integer cartoesVermelhos;

    @Column(name = "xg")
    private Double xG;

    @Column(name = "npxg")
    private Double npxG;

    @Column(name = "xag")
    private Double xAG;

    @Column(name = "goleassis")
    private Double npxG_xAG;

    @Column(name = "progressao_carregada")
    private Integer progressaoCarregada;

    @Column(name = "progressao_passada")
    private Integer progressaoPassada;

    @Column(name = "progressao_recebid")
    private Integer progressaoRecebida;

    public JogadorModel(Jogador account) {
        this.id = account.id();
        this.jogador = account.jogador();
        this.nacionalidade = account.nacionalidade();
        this.posicao = account.posicao();
        this.equipe = account.equipe();
        this.idade = account.idade();
        this.nascimento = account.nascimento();
        this.jogosDisputados = account.jogosDisputados();
        this.inicios = account.inicios();
        this.minutos = account.minutos();
        this.noventaMin = account.noventaMin();
        this.gols = account.gols();
        this.assistencias = account.assistencias();
        this.golsAssistencias = account.golsAssistencias();
        this.golsPenal = account.golsPenal();
        this.penaltisBatidos = account.penaltisBatidos();
        this.passesTentados = account.passesTentados();
        this.cartoesAmarelos = account.cartoesAmarelos();
        this.cartoesVermelhos = account.cartoesVermelhos();
        this.xG = account.xG();
        this.npxG = account.npxG();
        this.xAG = account.xAG();
        this.npxG_xAG = account.goleassis();
        this.progressaoCarregada = account.progressaoCarregada();
        this.progressaoPassada = account.progressaoPassada();
        this.progressaoRecebida = account.progressaoRecebida();
    }

    public Jogador to() {
        return new Jogador()
            .id(id)
            .jogador(jogador)
            .nacionalidade(nacionalidade)
            .posicao(posicao)
            .equipe(equipe)
            .idade(idade)
            .nascimento(nascimento)
            .jogosDisputados(jogosDisputados)
            .inicios(inicios)
            .minutos(minutos)
            .noventaMin(noventaMin)
            .gols(gols)
            .assistencias(assistencias)
            .golsAssistencias(golsAssistencias)
            .golsPenal(golsPenal)
            .penaltisBatidos(penaltisBatidos)
            .passesTentados(passesTentados)
            .cartoesAmarelos(cartoesAmarelos)
            .cartoesVermelhos(cartoesVermelhos)
            .xG(xG)
            .npxG(npxG)
            .xAG(xAG)
            .goleassis(npxG_xAG)
            .progressaoCarregada(progressaoCarregada)
            .progressaoPassada(progressaoPassada)
            .progressaoRecebida(progressaoRecebida);
    }
}
