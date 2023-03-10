
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Pessoa[] pessoa = new Pessoa[4];
        for(int i = 0; i <= 3;i++){
            pessoa[i] = new Pessoa();
        }
        pessoa[0].setNome("Lucas");
        pessoa[1].setNome("Cindy");
        pessoa[2].setNome("Seixas");

        ContaBancaria cb = new ContaBancaria();
        ContaEspecial ce = new ContaEspecial();
        ContaPoupanca cp = new ContaPoupanca();

        cb.setCliente(pessoa[0]);
        cb.setNumeroDaConta(1);
        cb.setSaldo(1000.0);

        ce.setCliente(pessoa[1]);
        ce.setNumeroDaConta(2);
        ce.setSaldo(10000.0);
        ce.setLimite(1000);

        cp.setCliente(pessoa[2]);
        cp.setNumeroDaConta(3);
        cp.setSaldo(10000.0);
        cp.setDiasDeRendimento(40);


        String print;
        print = String.format("""
                Conta 1 --
                Cliente : %s
                Saldo : %f

                Conta 2 --
                Cliente : %s
                Saldo : %f
                
                Conta 3 --
                Cliente : %s
                Saldo : %f
                """, pessoa[0].getNome(),cb.getSaldo(),pessoa[1].getNome(), ce.getSaldo(),pessoa[2].getNome(), cp.getSaldo());
        System.out.println(print);

        cb.depositar(1000.0);
        cb.sacar(199);
        System.out.println(cb.getSaldo());

        ce.sacar(2000.0);
        System.out.println(ce.getSaldo());
        cp.depositar(1000.0);
        System.out.println(cp.getSaldo());
        System.out.println(cp.calcularaNovoSaldo(0.02));
        System.out.println(cp.getSaldo());
    }

    
}
