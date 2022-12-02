import javax.sound.sampled.FloatControl;

public class Empresa{
    public static void main(String args[]){
        Funcionario vendedor1 = new Funcionario("Marcos",1000.0,9);
        Funcionario vendedor2 = new Funcionario("Joao",1000.1,12); 
        Funcionario gerente1 = new Funcionario("Pedro",2000.1,9);
        Funcionario gerente2 = new Funcionario("Sara",5000.0,15);

        System.out.println(vendedor1.mostrarSalario(1222.0));
        System.out.println(vendedor2.mostrarSalario(15000.0));
        System.out.println(gerente1.mostrarSalario());
        System.out.println(gerente2.mostrarSalario());

    }

}