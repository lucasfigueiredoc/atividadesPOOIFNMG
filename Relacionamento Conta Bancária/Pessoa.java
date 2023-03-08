public class Pessoa{
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private Double renda;

    //construtor
    public Pessoa(String nome, String cpf, String endereco, String telefone, Double renda){
         this.nome = nome;
         this.cpf = cpf;
         this.endereco = endereco;
         this.telefone = endereco;
         this.renda = renda;
    }

    // metodos
    public String informacoes(){
        String contatenacao = "Informações do cliente --\n "+
                            "Nome: "+ this.nome +"\n"+
                            "Endereço: "+ this.endereco +"\n"+
                            "Telefone: "+ this.telefone + "\n"+
                            "Renda : "+ this.renda + "\n"+
                            "CPF: "+ this.cpf+".";
        return contatenacao;
    }

    // setter

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setRenda(double renda){
        this.renda = renda;
    }

    // getter

    public String getNome(){
        return nome ;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getTelefone(){
        return telefone;
    }
    public double getRenda(){
        return renda;
    }






}