public class Main {
    public static void main(String[] args) throws Exception {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(4);

        System.out.println("Lista: " + somaNumeros.exibirNumeros());

        System.out.println("Soma total: " + somaNumeros.calcularSoma());

        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());

    }
}
