import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    // Método para ordenar os números em ordem crescente
    public List<Integer> ordenarAscendente() {
        Collections.sort(listaNumeros); // Isso usa o Comparable de Integer para ordenar
        return listaNumeros;
    }

    // Método para ordenar os números em ordem decrescente
    public List<Integer> ordenarDescendente() {
        Collections.sort(listaNumeros, Collections.reverseOrder()); // Ordena de forma reversa (decrescente)
        return listaNumeros;
    }
}
