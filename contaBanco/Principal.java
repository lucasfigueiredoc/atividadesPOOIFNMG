public class Principal{
	public static void main(String args[]){
			boolean testador;
			ContaCorrente conta1 = new ContaCorrente("Joao", 1, 0);



			testador = conta1.cadastrarSenha(12345);
			if(testador){
				System.out.println("Senha cadastrada com sucesso");
				}else{
					System.out.println("Senha já cadastrada");
				}
			conta1.alterarSenha(12345,1234);
			conta1.debitar(1234,1000.0);
			conta1.creditar(1234,100.0);
			conta1.consultarSaldo(1234);
		 
		}
	}
