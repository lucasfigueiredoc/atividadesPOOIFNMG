public class Produto {
    //Variaveis
    private int codigo;
    private String descricao;
    private Double custo;
    private Double preco;


    //Construtor
    public Produto(int codigoFora, String descricaoFora, double custoFora){
        this.codigo = codigoFora;
        this.descricao = descricaoFora;
        this.custo = custoFora;
        calculaPreco();
    }
    //Metodo
    public double calculaPreco(){
        return custo + (custo*0.25);
    }
    
    //getters
    public int getCodigo(){
        return this.codigo;
    }
    public int getDescricao(){
        return this.descricao;
    }
    public int getCusto(){
        return this.custo;
    }
    public int getPreco(){
        return this.preco;
    }
    //seters
    public void setCodigo(int codigoFora){
        this.codigo = codigoFora;
    }
    public void setDescricao(String descricaoFora){
        this.descricao = descricaoFora;
    }
    public void setCusto(Double custoFora){
        this.custo = custoFora;
    }

}
