public class Fatura{
    int numero;
    String descricao;
    int quantidade;
    double preco;
    
    Fatura(int numeroF, String descricaoF,
            int quantidadeF, double precoF){
            numero = numeroF;
            descricao = descricaoF;
            if(quantidadeF < 0 ){
                quantidade=0;
            }else{quantidade=quantidadeF;}
            if(precoF < 0.0){
                preco = 0.0;
            }else{preco=precoF;}

    }

    double getValorFatura(){
        double retorno;
        retorno = quantidade*preco;
        return retorno;
    }

}