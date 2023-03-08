public class Loja {
    public static void main(String[] args){
        
        Cliente c1 = new Cliente("Lucas", "1233424",50000.0);
        Produto p1 = new Produto(1,"Monitor full hd", 2000.0);
        System.out.println(p1.getPreco());

        Venda v1 = new Venda(
            1,c1,p1,5
        );
        
        System.out.println(v1.imprimir());

    }
}
