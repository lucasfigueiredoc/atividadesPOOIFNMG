public class Carro{

    private double combustivel;
    private double kilometragem;

    public Carro(double combustivelF){
        this.combustivel = combustivelF;
        this.kilometragem = 0.0;
    }
    public boolean percorrerDistancia(double distanciaP){  
        
        if(autonomia() > distanciaP){
            this.kilometragem += distanciaP;
            this.combustivel -= distanciaP /12 ;
            return true;
        }else{
            return false;
        }
    }
    public void abastecer(double combustivelA){
        this.combustivel += combustivelA; 
    }
    public double autonomia(){
        // autonomia: quantidade de litros no tanque * media do km por litro
        double autonomia;
        autonomia = this.combustivel*12.0;
        return autonomia; 
    }
    public double getCombustivel(){
        return combustivel;
    }
    public void setCombustivel(double combustivel){
        this.combustivel = combustivel;
    }
    public double getkilometragem(){
        return kilometragem;
    }
    public void setQuilmetragem(double kilometragem){
        this.kilometragem = kilometragem;
    }
}