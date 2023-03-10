public class Pessoa {
    protected String nome;
    protected int cpf;
    protected String endereco;
    protected String rg;

    // getters
    public String getNome(){
        return this.nome;
    }
    public int getCpf(){
        return this.cpf;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public String getRg(){
        return this.rg;
    }

    // setters

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setRg(String rg){
        this.rg = rg;
    }
}