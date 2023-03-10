public class Gerente extends Funcionario {
    private int tempoNaFuncao;



    public int getTempoNaFuncao(){
        return this.tempoNaFuncao;
    }
    public void setTempoNaFuncao(int tempoNaFuncao){
        this.tempoNaFuncao = tempoNaFuncao;
    }

    @Override
    public double calculaSalario(){
        double retorno;
        retorno = this.salarioBase+(this.salarioBase*0.02)-(this.salarioBase*0.08);
        return retorno;
    }
}
