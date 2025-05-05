import ingresso.Ingresso;
import ingresso.IngressoFamilia;
import ingresso.IngressoMeia;
import ingresso.TipoAudio;
import ingresso.TipoLegenda;

public class App {
    public static void main(String[] args) throws Exception {
        Ingresso ingressoMeia = new IngressoMeia(10, "O jovem programador: O início", TipoAudio.DUBLADO,
                TipoLegenda.NENHUMA);

        Ingresso ingressoFamilia1 = new IngressoFamilia(3, 30, "O jovem programador: O retorno", TipoAudio.ORIGINAL,
                TipoLegenda.TRADUCAO);

        Ingresso ingressoFamilia2 = new IngressoFamilia(4, 30, "O jovem programador: A ascenção", TipoAudio.ORIGINAL,
                TipoLegenda.NENHUMA);

        exibirInfo(ingressoMeia);
        exibirInfo(ingressoFamilia1);
        exibirInfo(ingressoFamilia2);
    }

    public static void exibirInfo(Ingresso ingresso) {

        switch (ingresso) {
            case IngressoMeia ingressoMeia -> System.out.println("======  Ingresso Meia Entrada  ======");

            case IngressoFamilia ingressoFamilia -> System.out.println("========  Ingresso  Familia  ========");

            default -> System.out.println("======= Ingresso Comum =======");
        }
        System.out.printf("Valor:      R$ %.2f\n", ingresso.getValorFinal());
        System.out.println("Filme:      " + ingresso.getNomeFilme());
        System.out.println("Áudio:      " + ingresso.getTipoAudio());
        System.out.println("Legenda:    " + ingresso.getTipoLegenda());
        System.out.println("=====================================");

    }
}
