
public class ContaBancaria {

    protected Pessoa cliente;
    protected int numeroDaConta;
    protected double saldo;


    public Pessoa getCliente() {
        return this.cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public int getNumeroDaConta() {
        return this.numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public boolean sacar(double valor){
        boolean boleano=false;
        try{
            if(valor>= this.saldo || valor >= 0){
                this.saldo = this.saldo - valor;
                boleano = true;
            }else{
                 System.out.println("Valor inválido");
                 boleano = false;
            }
        } 
        catch(Exception e){
             System.out.println("Erro na exec");
             boleano = false;
        }
        return boleano;
    }

    public boolean depositar(double valor){
        boolean boleano=false;
        try{
            if(valor > 0){
                this.saldo = this.saldo + valor;
                boleano = true;
            }

        }
        catch(Exception e){
            System.out.println("Erro na exec");
            boleano = false;
        }

        return boleano;
    }
    
}
