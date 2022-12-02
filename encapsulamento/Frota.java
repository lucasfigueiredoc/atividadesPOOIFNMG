public class Frota{
    public static void main(String args[]){

        Carro car1 = new Carro(10.01);

        //System.out.println("Testado");

        System.out.println(car1.getCombustivel());
        car1.abastecer(30.0);
        System.out.println(car1.getCombustivel());
        System.out.println(car1.getkilometragem());
        System.out.println(car1.autonomia());
        car1.percorrerDistancia(167.0);
        System.out.println(car1.getCombustivel());
        System.out.println(car1.getkilometragem());
        System.out.println(car1.autonomia());


    }

}
