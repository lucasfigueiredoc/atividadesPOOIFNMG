public class Fornecedor extends Pessoa {
    private double credito;
    private double divida;

    public double obterSaldo(){
        return this.credito - this.divida;

    }

    public double getCredito() {
        return this.credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getDivida() {
        return this.divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

}
