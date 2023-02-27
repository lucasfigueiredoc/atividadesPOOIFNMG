public class Carro{
	private double combustivel;
	
	Carro(double combustivelFora){
		this.combustivel=combustivelFora;
		}
		
	Carro(){
		this.combustivel = 0.0;
		}
		
	public double autonomia(){
		return combustivel * 12.0;
		}
		
	public double autonomia(String tipoCombustivel){
		double retorno = 0.0;
		if(tipoCombustivel == "gasolina"){
			retorno = combustivel*12.0;
		}else{
			retorno = combustivel * 8.0;
				}
		return retorno;  
		}
		
	public double autonomia(String tipoCombustivel, double abastecimento){
			String tipoDeCombustivel = tipoCombustivel;
			
			this.combustivel = this.combustivel + abastecimento;
	
		
		return this.combustivel  ;
		}
		
	public double autonomia(String tipoCombustivel, boolean carga){
		
		double retorno;
		
		
		if(tipoCombustivel == "alcool"){
		retorno = combustivel * 8.0;
		
		}else{
		retorno = this.combustivel * 12.0;	
			}
		if(carga == true){
		retorno = retorno - (retorno * 0.30);
			}
		return retorno;
	}
}
