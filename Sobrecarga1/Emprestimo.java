public class Emprestimo{
    private String nomeCliente;
    private double renda;

    Emprestimo(String nomeClienteFora, double rendaFora){
        this.nomeCliente = nomeClienteFora;
        this.renda = rendaFora;
    }

    public double calcularEmprestimo(){
        return renda*4;
    }
    public double calcularEmprestimo(int fator){
        return renda*fator;
    }
    public double calcularEmprestimo(double taxa){
        return (renda*5)-taxa;
    }

}