public class ContaCorrente{
	private String cliente;
	private int numero;
	private int senha = 0;
	private double saldo;
	
	ContaCorrente(String nomeCliente, int numeroConta, int senhaFora){
		this.cliente = nomeCliente;
		this.numero = numeroConta;
		this.senha = senhaFora;
		saldo = 0.0;
			}
	
	public boolean cadastrarSenha(int senhaFora){
		if(this.senha == 0){
			this.senha = senhaFora;
			return true;
			}else{
				return false;
				}
			}
		
	public boolean alterarSenha(int senhaFora, int novaSenha){
		if (senhaFora == this.senha){
			this.senha = novaSenha;
			return true;
			}else{
				return false;
				}
			}
	public boolean debitar(int senhaFora, double valor){
		if(this.senha == senhaFora){
			this.saldo += valor;
			return true;
			}else{
				return false;
				}
			}
	public boolean creditar(int senhaFora, double valor){
		if(this.senha == senhaFora){
			this.saldo -= valor;
			return true;
			}else{
				return false;
				}
			}

	public String consultarSaldo(int senhaFora){
		String retornoFalso = "Senha Invalida";
		if (this.senha == senhaFora){
			return this.saldo+"";
			}else{
				return retornoFalso;
			}
		}
}
