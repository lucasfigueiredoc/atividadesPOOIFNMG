public class Venda {
    // Variaves

    private int numero;
    private Cliente comprador;
    private Produto produto;
    private int quantidade;

    private String situacao;
    private Double valorTotal;
   // valorTotal = quantidade * Produto.getPreco();

    //Construtor

    public Venda(int numeroFora, Cliente compradorFora, Produto produtoFora, int quantidadeFora) {
        this.numero = numeroFora;
        this.comprador = compradorFora;
        this.produto = produtoFora;
        this.quantidade = quantidadeFora;
    }
    // metodo que testa limite do crédido
    public teste(){
        if(valorTotal < comprador.getlimiteDeCredito()){
            return "Crédito disponível.";
        }else{
            return "Crédito indisponível.";
        }
    }


    //Metodo

    public String imprimir(){
        situacao = venda.test();
        return "\nNome : "+ Cliente.getNome()+
               "\nDescricao: "+ Produto.getDescricao()+
               "\nQuantidade: "+ Venda.quantidade()+
               "\nValor Total: "+ valorTotal+
               "\nSituação: "+ situacao+
               "\n....";
    }

    // getter
    public int getNumero(){
        return this.numero;
    }
    public Cliente getCliente(){
        return this.comprador;
    }
    public Produto getProduto(){
        return this.produto;
    }
    private int getQuantidade(){
        return this.quantidade;
    }

    // setter

    public void setNumero(int numeroFora){
        this.numero = numeroFora;
    }
    public void setComprador(Cliente clienteFora){
        this.comprador = clienteFora;
    }
    public void setProduto(Produto produtoFora){
        this.produto = produtoFora;
    }
    public void setQuantidade (int quantidadeFora){
        this.quantidade = quantidadeFora;
    }




}
