public class Pickup extends Carro {
    private int capacidadeDeCarga;
    private int pesoCarga;

    public Pickup(int passageiros, int combustivel, double rendimento, boolean cambioAutomatic, int capacidadeDeCarga,int pesoCarga){
        super(passageiros,combustivel,rendimento, cambioAutomatic);
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.pesoCarga = pesoCarga;
    }

    public int getCapacidadeDeCarga() {
        return this.capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public int getPesoCarga() {
        return this.pesoCarga;
    }

    public void setPesoCarga(int pesoCarga) {
        if(pesoCarga<=capacidadeDeCarga){
            this.pesoCarga = pesoCarga;
        }else{
            this.pesoCarga=0;
            }
        }
    
    
    @Override
    public double autonomia(){
        doulbe autonomia;
        if(pesoCarga == capacidadeDeCarga){
            autonomia = (this.combustivel * this.rendimento) / 2; 
        } else if(pesoCarga < capacidadeDeCarga){
            autonomia =((this.combustivel * this.rendimento)) + (this.combustivel * this.rendimento) *0.25; 
        
        }else{
            autonomia = ((this.combustivel * this.rendimento));
        }
        return autonomia;
    }
}
