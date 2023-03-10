public class Hatch extends Carro {
    private int bagageiro;

    public Hatch(int passageiros, int combustivel, double rendimento, boolean cambioAutomatic, int bagageiro){
        super(passageiros,combustivel,rendimento, cambioAutomatic);
        this.bagageiro = bagageiro;
    }

    public int getBagageiro() {
        return this.bagageiro;
    }

    public void setBagageiro(int bagageiro) {
        this.bagageiro = bagageiro;
    }

    public double calculaVolume(int passageiros){
        double volumeBagageiro;

            if (passageiros<3){
                volumeBagageiro = bagageiro + (bagageiro * 1.0);
            }
            else if(passageiros==3){
                volumeBagageiro = bagageiro + (bagageiro * 0.5);
            }
            else if(passageiros>3){
                volumeBagageiro = bagageiro;
            }else{
                volumeBagageiro = bagageiro; 
            }


        return volumeBagageiro;
    }
    
}
