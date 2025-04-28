public class SistemaIbge {
    public static void main(String[] args) throws Exception {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        } 

        EstadoBrasileiro estado = EstadoBrasileiro.SAO_PAULO;

        System.out.println(estado.getNome());
        System.out.println(estado.getSigla());
        System.out.println(estado.getNomeMaiusculo());
        System.out.println(estado.getIbge());
    }
}
