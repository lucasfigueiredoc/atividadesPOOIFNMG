public class Endereco {
    private String logradouro;
    private String cidade;
    private String estado;
    

    // getters

    public String getLogradouro(){
        return this.logradouro;
    }
    public String getCidade(){
        return this.cidade;
    }
    public String getEstado(){
        return this.estado;
    }

    // setter

    public void setLogradouro(String setLogradouro){
        this.logradouro = setLogradouro;
    }
    public void setCidade(String setCidade){
        this.cidade = setCidade;
    }
    public void setEstado(String setEstado){
        this.estado = setEstado;
    }
}
