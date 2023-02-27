public class Cliente{
    // variaveis
    private String nome;
    private String cpf;
    private Double renda;
    private Double limiteDeCredito;


    //metodos
    public void calculaLimite(){
        this.limiteDeCredito = this.renda * 2.5;
    }
    
    // getters
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public Double getRenda(){
        return this.Renda;
    }
    public Double getLimiDouble(){
        return this.limiteDeCredito;
    }

    // setters
    public void setNome(String nomeFora){
        this.nome = nomeFora;
    }
    public void setCpf(String cpfFora){
        this.cpf = cpfFora;
    }
    public void setRenda(Double rendaFora){
        this.renda = rendaFora;
    }

}