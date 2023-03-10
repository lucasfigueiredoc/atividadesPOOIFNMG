import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        Vendedor vendedor = new Vendedor();
        Gerente gerente = new Gerente();

        int n;

        while(true){
            Boolean x = true;
            System.out.println("Escolha uma opção");
            System.out.println("""
                    1 : Registrar
                    2 : Informações
                    10: Sair
                    """);
            n = input.nextInt();

            switch(n){
                case 1:
                System.out.println("Registrando Vendedor, adicionne nome, matricula salario  e vendas respectivamente");
                String nome = input.next();
                int matricula = input.nextInt();
                double salarioBase = input.nextDouble();
                double totalDeVendas = input.nextDouble();
            
            
                vendedor.setNome(nome);
                vendedor.setMatricula(matricula);         
                vendedor.setSalarioBase(salarioBase);
                vendedor.setTotalDeVendas(totalDeVendas);
            
            
                System.out.println("Registrando gerente, adicionne nome, matricula salario, vendas e tempo na funcao");
                nome = input.nextLine();
                matricula = input.nextInt();
                salarioBase = input.nextDouble();
                int tempoNaFuncao = input.nextInt();
            
                gerente.setNome(nome);
                gerente.setMatricula(matricula);
                gerente.setSalarioBase(salarioBase);
                gerente.setTempoNaFuncao(tempoNaFuncao);
            
                break;
                case 2:
                String printa = String.format("""
                    Vendedor
                        Nome: %s
                        Matricula: %d
                        Salário liquido: %f        
            
                    Gerente
                        Nome: %s
                        Matricula %d
                        Salario liquido: %f
            
                        """, vendedor.getNome(), vendedor.getMatricula(), vendedor.calculaSalario(),
                            gerente.getNome(), gerente.getMatricula(), gerente.getSalarioBase());
                System.out.println(printa);
            
                case 10:
                    x = false;
                break;

                default:
                    System.out.println("Valor inválido!");

                }


       }

    }


    

}
