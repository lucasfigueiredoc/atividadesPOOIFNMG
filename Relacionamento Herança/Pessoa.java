public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String endereco;

    public Pessoa(String nome, String cpf, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;


    }

        // getters
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getEndereco(){
        return this.endereco;
    }

        //setters
    public void setNome(String nomeFora){
        this.nome = nomefora;
    }
    public void setCpf(String cpfFora){
        this.cpf = cpfFora;
    }
    public void setEndereco(String enderecoFora){
        this.endereco = enderecoFora;
    }

}
