public class Vendedor extends Funcionario {
    private double totalDeVendas;


    public double getTotalDeVendas(){
        return totalDeVendas;
    }
    public void setTotalDeVendas(double totalDeVendas){
        this.totalDeVendas = totalDeVendas;
    }

    
    @Override
    public double calculaSalario(){
        double retorno;
        retorno = this.salarioBase + (totalDeVendas*0.25)-(salarioBase*0.08);
        return retorno;
    }
    
}
