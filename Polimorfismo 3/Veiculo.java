public class Veiculo {
    protected int passageiros;
    protected int combustivel;
    protected double rendimento;

    public Veiculo(int passageiros, int combustivel,double rendimento){
        this.passageiros = passageiros;
        this.combustivel = combustivel;
        this.rendimento = rendimento;
    }

    public int getPassageiros() {
        return this.passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public int getCombustivel() {
        return this.combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public double getRendimento() {
        return this.rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public double autonomia(){
        double autonomiaa;
        autonomiaa = this.combustivel * this.rendimento;
        return autonomiaa;
    }
    
}
