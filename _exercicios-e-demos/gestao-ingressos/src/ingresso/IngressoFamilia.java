package ingresso;
public non-sealed class IngressoFamilia extends Ingresso {
    private int qtdePessoas;
    
    public IngressoFamilia(int qtdePessoas, double valor, String nomeFilme, TipoAudio tipoAudio, TipoLegenda tipoLegenda) {
        super(valor, nomeFilme, tipoAudio, tipoLegenda);
        this.qtdePessoas = qtdePessoas;
    }

    @Override
    public double getValorFinal() {
        double totalInteira = this.valorReal * qtdePessoas;
        return  qtdePessoas > 3 ?
                totalInteira - totalInteira * 0.05:
                totalInteira;
    }

    public int getQtdePessoas() {
        return qtdePessoas;
    }
}
