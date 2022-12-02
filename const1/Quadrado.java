public class Quadrado{
	double lado;
	Quadrado(double ladoFora){
		lado = ladoFora;
		}
	double calculaArea(){
		double area;
		area = lado*lado;
		return area;
		}
	double calculaPerimetro(){
		double perimetro;
		perimetro = lado*4;
		return perimetro;
		}
	}
