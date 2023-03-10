public class Motocicleta extends Veiculo {

    private int cilindrada;

    public Motocicleta(int passageiros, int combustivel, double rendimento, int cilindrada){
        super(passageiros,combustivel,rendimento);
        this.cilindrada = cilindrada;

    }

    public int getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double autonomia(){
        double autonomiaa;
        autonomiaa = this.combustivel * this.rendimento;
        autonomiaa = autonomiaa/passageiros;
        return autonomiaa;
    }

    
}
