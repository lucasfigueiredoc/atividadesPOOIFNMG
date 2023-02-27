public class Principal{
	public static void main(String args[]){
	Pessoa pessoa1 = new Pessoa("Marcos");
	Pessoa pessoa2 = new Pessoa("Lucas","M",2,1996);
	
	
	System.out.println(pessoa1.mostraIdade());
	System.out.println(pessoa2.mostrarIdade(02,2023));
	}
	
}
