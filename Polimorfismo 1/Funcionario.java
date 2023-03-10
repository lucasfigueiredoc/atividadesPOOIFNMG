public class Funcionario {
    protected String nome;
    protected int matricula;
    protected double salarioBase;


    //getters

    public String getNome(){
        return this.nome;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public double getSalarioBase(){
        return this.salarioBase;
    }

    //setters

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public double calculaSalario(){
        double retorno;
        retorno = this.salarioBase-(this.salarioBase * 0.08);
        return retorno;
    }


}
