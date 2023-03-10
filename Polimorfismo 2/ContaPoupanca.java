public class ContaPoupanca extends ContaBancaria {
    private int diasDeRendimento;

    public int getDiasDeRendimento() {
        return this.diasDeRendimento;
    }

    public void setDiasDeRendimento(int diasDeRendimento) {
        this.diasDeRendimento = diasDeRendimento;
    }

    public double calcularaNovoSaldo(double taxa){
        double retorno;
        retorno = diasDeRendimento * (this.saldo * taxa);
        this.saldo = saldo;
        return retorno;
    }

    
}
