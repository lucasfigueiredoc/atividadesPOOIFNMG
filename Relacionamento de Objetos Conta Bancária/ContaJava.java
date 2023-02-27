import java.util.Scanner;

public class ContaJava {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Pessoa p1 = new Pessoa();

        System.out.println("Entre com o nome");
        String nome = input.nextLine();

        System.out.println("Entre com CPF");
        String cpf = input.nextLine();

        System.out.println("Entre com Endereço");
        String endereco = input.nextLine();

        System.out.println("Informe Telefone:");
        String telefone= input.nextLine();

        System.out.println("Informe Renda:");
        Double renda = input.nextDouble();


        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setEndereco(endereco);
        cliente.setTelefone(telefone);
        cliente.setRenda(renda);


        
    }
    
}
