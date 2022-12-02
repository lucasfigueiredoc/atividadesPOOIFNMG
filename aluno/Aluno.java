public class Aluno{
	
	String nome;
	double nota1;
	double nota2;
	
	double media(){
		
		double resultado = (nota1+nota2)/2;
		return resultado;
		}
	
	boolean resultado() {
		
		boolean result =  false;
		if (media() >= 6) {
			
			result = true;
		}else {
			
			result=false;
		}
		return result;
		
	}


}

