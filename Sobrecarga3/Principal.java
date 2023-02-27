public class Principal{
	public static void main(String args[]){
		
		
	Carro carro1 = new Carro(10.0);
	Carro carro2 = new Carro();
	
	System.out.println(carro1.autonomia("xxx",0.0));
	System.out.println(carro2.autonomia("xxx",0.0));
	System.out.println(carro1.autonomia("alcool",false));
	System.out.println(carro1.autonomia("alcool",true));
	
	}

}
