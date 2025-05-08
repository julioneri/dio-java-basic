import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaInteiros;

    public SomaNumeros() {
        this.listaInteiros = new ArrayList<>();
    }

    // Adiciona um número à lista de números.
    public void adicionarNumero(int numero) {
        listaInteiros.add(numero);
    }

    //Calcula a soma de todos os números na lista e retorna o resultado.
    public int calcularSoma() {
        int total = 0;
        for (int numero : listaInteiros) {
            total += numero;
        }
        return total;
    }
    
    // Encontra o maior número na lista e retorna o valor.
    public Integer encontrarMaiorNumero() {
        return !listaInteiros.isEmpty() ? Collections.max(listaInteiros) : null;
    }

    // Encontra o menor número na lista e retorna o valor.
    public Integer encontrarMenorNumero() {
        // return listaInteiros.isEmpty() ? Optional.empty() : Optional.of(Collections.min(listaInteiros));
           return !listaInteiros.isEmpty() ? Collections.min(listaInteiros) : null;
    }

    // Retorna uma lista contendo todos os números presentes na lista.
    public List<Integer> exibirNumeros() {
        return listaInteiros;
    }
}
