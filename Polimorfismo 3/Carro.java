public class Carro extends Veiculo {
    protected boolean cambioAutomatico;

    public Carro(int passageiros, int combustivel, double rendimento, boolean cambioAutomatic){
        super(passageiros,combustivel,rendimento);
        this.cambioAutomatico = cambioAutomatic;
    }

    public boolean getCambioAutomatico() {
        return this.cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }
    @Override
    public double autonomia(){
        double autonomia;
        if(cambioAutomatico == true){
            autonomia = (combustivel * rendimento) - (combustivel * rendimento) * 0.25;
        return autonomia;
        }else{
            autonomia = this.combustivel * this.rendimento;
            return autonomia;
        }
    }
    
}
