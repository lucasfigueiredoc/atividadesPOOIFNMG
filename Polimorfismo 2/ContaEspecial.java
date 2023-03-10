public class ContaEspecial extends ContaBancaria {
    private double limite;

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite *(-1);
    }

    @Override
    public boolean sacar(double valor){
        boolean boleano=false;
        try{
            boolean retorno;
            if(saldo >= limite){
                saldo = saldo - valor;
                boleano = true;
            }else{
                System.out.println("Limite alcanc");
                boleano = false;
            }
        }
        catch(Exception e){
            System.out.println("Erro");
        }
        return boleano;
    }
}

