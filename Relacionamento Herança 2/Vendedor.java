public class Vendedor extends Empregado {
    private double totalDeVendas;
    private double comissao;

    public double calculaSalario(){
        return ((salarioBse-impostos)+totalDeVendas*comissao);
    }
    
}
