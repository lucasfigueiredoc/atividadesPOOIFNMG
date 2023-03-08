public class Fornecedor extends Pessoa {
    private double credito;
    private double divida;

    public Fornecedor(String nome, String endereco, String telefone, double credito, double divida){
        super(nome,endereco,telefone);
        this.credito = credito;
        this.divida = divida;
    }

    public double obterSaldo(){
        double retorno = this.divida - this.credito;

        return retorno;
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
