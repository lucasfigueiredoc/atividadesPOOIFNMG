public class Operario extends Empregado {
    private double valorDeProducao;
    private double comissao;

    public double calculaSalario(){
        return ((salarioBase-impostos)+valorDeProducao*comissao);
    }

}
