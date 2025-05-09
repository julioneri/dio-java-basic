public class Main {
    public static void main(String[] args) throws Exception {
        OrdenacaoNumeros ordernadorNumeros = new OrdenacaoNumeros();

        ordernadorNumeros.adicionarNumero(3);
        ordernadorNumeros.adicionarNumero(1);
        ordernadorNumeros.adicionarNumero(5);
        ordernadorNumeros.adicionarNumero(2);
        ordernadorNumeros.adicionarNumero(4);

        System.out.println("Ordem ascendente:       " + ordernadorNumeros.ordenarAscendente());
        System.out.println("=======================================");
        System.out.println("Ordem descendente:      " + ordernadorNumeros.ordenarDescendente());
    }
}
