public class Produto {
    //Variaveis
    private int codigo;
    private String descricao;
    private Double custo;
    private Double preco;

    //Metodo

    public void calculaPreco(){
        this.preco = custo + (custo*0.25);
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

}
