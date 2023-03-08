import javax.swing.plaf.BorderUIResource.EmptyBorderUIResource;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public double calculaSalario(){
        return salarioBase - imposto + this.ajudaDeCusto;
    }

    public double getAjudaDeCusto(){
        return this.ajudaDeCusto;

    }
    public void setAjudaDeCusto(double ajudaDeCusto){
        this.ajudaDeCusto = ajudaDeCusto;
    }
}
