public class Funcionario{
    private String nome;
    private double salarioBase;
    private int tempoDeServico;

    Funcionario(String nomeFora, double salarioBaseFora, int tempoDeServico){
        this.nome = nomeFora;
        this.salarioBase = salarioBaseFora;
        this.tempoDeServico = tempoDeServico;
    }

    public double mostrarSalario(){
        double retorno;
        if(this.tempoDeServico <= 10){
             retorno = this.salarioBase * 0.12;
        }else{
            retorno = this.salarioBase * 0.17;
        }
            return retorno + this.salarioBase;
    }
    public double mostrarSalario(double totalDeVendas){
        double retorno;
        if(this.tempoDeServico<=10){
            retorno = this.salarioBase*0.05+totalDeVendas*0.015;
        }else{
            retorno = this.salarioBase*0.1+totalDeVendas*0.02;
        }
            return retorno + this.salarioBase;


    }



}