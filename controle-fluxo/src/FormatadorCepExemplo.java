public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatato = formatarCep("1234567");
            System.out.println(cepFormatato);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP deve conter exatamente 8 dígitos numéricos.");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
            throw new CepInvalidoException();

        // Simulando um cep formatado
        return "13.795-057";
    }
}
