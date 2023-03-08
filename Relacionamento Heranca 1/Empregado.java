public class Empregado extends Pessoa {
    protected int codigoSetor;
    protected double salarioBase;
    protected double imposto;

    public Empregado(String nome, String endereco, String telefone,int codigoSetor, double salarioBase, double imposto){
        super(nome,endereco,telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;

    }
    public double calculaSalario(){
        double retorno = this.salarioBase - imposto;
        return retorno;
    }
    

    public int getCodigoSetor() {
        return this.codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return this.imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}