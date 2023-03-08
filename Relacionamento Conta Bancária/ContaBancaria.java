
public class ContaBancaria {
    private Pessoa cliente;
    private int numeroDaConta;
    private double saldo;

    //Construtor
    public ContaBancaria(Pessoa cliente, int numeroDaConta, double saldo){
        this.cliente = cliente;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    //Metodos
    public boolean sacar(float saque){
        boolean teste;
        if (saque > 0){
            if (saque > this.saldo){
                teste = false;
            }else{
                this.saldo = this.saldo -saque;
                teste = true;
            }
        }else{
            teste = false;
        }
        return teste;
    }

    public boolean depositar(float deposito){
        boolean teste;
        if(deposito>0){
            this.saldo = this.saldo+deposito;
            teste = true;
        }else{
            teste = false;
        }

        return teste;
    }


}
