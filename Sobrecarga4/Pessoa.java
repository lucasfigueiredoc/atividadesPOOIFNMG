public class Pessoa{
	private String nome;
	private String sexo;
	private int mesDeNascimento;
	private int anoDeNascimento;
	
	Pessoa(String nome){
		this.nome = nome;
		this.sexo = "'Não definido pelo usuário'";
		this.mesDeNascimento = 1;
		this.anoDeNascimento = 2000;
		}
		
	Pessoa(String nome, String sexo, int mesDeNascimento, int anoDeNascimento){
		this.nome = nome;
		this.sexo = sexo;
		this.mesDeNascimento = mesDeNascimento;
		this.anoDeNascimento = anoDeNascimento;
		}
		
	public String mostraIdade(){
		String retorno;
		int idadeCalculada =  2022 - this.anoDeNascimento ;
		retorno = "Nome: " + this.nome + "\n"+
				  "Sexo: " + this.sexo + "\n"+
				  "Idade: "+ idadeCalculada+".";
		return retorno;
		}
		
	public String mostrarIdade(int mes, int ano){
		String retorno;
		int idadeCalculada = ano - this.anoDeNascimento ;
		retorno = "Nome: " + this.nome + "\n"+
				  "Sexo: " + this.sexo + "\n"+
				  "Idade: "+ idadeCalculada+".";
		return retorno;
		}
	
}
