public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    
    public Pessoa() {
        super();
    }
    
    public Pessoa(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank()) {
            throw new IllegalArgumentException("Cpf não pode ser vazio.");
        }
        this.cpf = cpf;
    }
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        if (endereco == null || endereco.isBlank()) {
            throw new IllegalArgumentException("Endereço não pode ser vazio.");
        }
        this.endereco = endereco;
    }

    //...
}
