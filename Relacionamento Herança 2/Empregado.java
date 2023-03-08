public class Empregado extends Pessoa {
    protected int codigoSetor;
    protected double salarioBase;
    protected double imposto;

    public double calculaSlario(){
        return salarioBase - imposto;
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
