public class Principal{
	public static void main(String args[]){
		Aluno aluno1 = new Aluno();
		boolean result;
		
		aluno1.nome="Lucas";
		aluno1.nota1=5.0;
		aluno1.nota2=5.0;
		
		result = aluno1.resultado();
		if(result==true ) {System.out.println("Aprovado");}
					else{System.out.println("Reprovado!");}
		}

}
