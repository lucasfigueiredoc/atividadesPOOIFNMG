public class Estoque {

    Produto[] produtos = new Produtos[10];

    public void adicionaProduto(Produto produto){
        for(int i=0;i<produtos.length;i++){
            if(produtos[i]==null){
                produtos[i]=produto;
                break;
            }
        }
    }

    public void excluiProduto(Produto produto){
        for(int i = 0; i<produtos.length; i++){
            if(produto.getCodigo()==produtos[i].getCodigo()){
                produtos[i] = null;
            }
        }
    }
    
    public Produto buscaProduto(int codigo){
        for(Produto p : produtos){
            if(p != null){
                if(p.getCodigo()==codigo){
                    return p;
                }
            }
        }
        return null;
    }

    public Produto buscaProduto(String descricao){
        for(Produto p: produtos){
            if(p != null){
                if(p.getDescricao().equals(descricao)){
                    return p;
                }
            }
        }
        return null;
    }
    

}