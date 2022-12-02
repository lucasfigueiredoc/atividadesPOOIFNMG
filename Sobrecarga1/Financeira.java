
public class Financeira{
    public static void main(String args[]){
       // Arraylist <Emprestimo> emp = new Arraylist<>();
    
       // Emprestimo E[0] = new Emprestimo();

       Emprestimo emp1 = new Emprestimo("Lucas",100.0);

       System.out.println(emp1.calcularEmprestimo());
       System.out.println(emp1.calcularEmprestimo(3));
       System.out.println(emp1.calcularEmprestimo(2.1));


    }
}