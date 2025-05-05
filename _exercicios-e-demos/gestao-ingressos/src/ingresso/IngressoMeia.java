package ingresso;
public non-sealed class IngressoMeia extends Ingresso {

    public IngressoMeia(double valor, String nomeFilme, TipoAudio tipoAudio, TipoLegenda tipoLegenda) {
        super(valor, nomeFilme, tipoAudio, tipoLegenda);
    }

    @Override
    public double getValorFinal() {
        return this.valorReal / 2;
    }
}
