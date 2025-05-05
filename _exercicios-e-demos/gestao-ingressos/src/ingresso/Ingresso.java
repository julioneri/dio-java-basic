package ingresso;

public sealed abstract class Ingresso permits IngressoMeia, IngressoFamilia {

    protected double valorReal;
    protected String nomeFilme;
    protected TipoAudio tipoAudio;
    protected TipoLegenda tipoLegenda;

    public Ingresso(double valor, String nomeFilme, TipoAudio tipoAudio, TipoLegenda tipoLegenda) {
        this.valorReal = valor;
        this.nomeFilme = nomeFilme;
        this.tipoAudio = tipoAudio;
        this.tipoLegenda = tipoLegenda;
    }

    // public void exibirInfo() {
    //     System.out.println("======= Ingresso =======");
    //     System.out.printf("Valor: R$ %.2f\n", getValorFinal());
    //     System.out.println("Nome do filme: " + getNomeFilme());
    //     System.out.println("Tipo de áudio: " + getTipoAudio());
    //     System.out.println("Tipo de legenda: " + getTipoLegenda());
    // }

    public double getValorReal() {
        return valorReal;
    }

    public void setValorReal(double valor) {
        this.valorReal = valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public TipoAudio getTipoAudio() {
        return tipoAudio;
    }

    public TipoLegenda getTipoLegenda() {
        return tipoLegenda;
    }

    public abstract double getValorFinal();

}
