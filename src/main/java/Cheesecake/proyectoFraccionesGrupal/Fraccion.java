package Cheesecake.proyectoFraccionesGrupal;




public class Fraccion {
	private int numerador;
	private int denominador;

	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
/*
 * 	Añadir las siguientes operaciones a Fracción
 * 
 * 
 * 
	public static Fraccion simplifica(Fraccion entrada) {
	}
	
	public static Fraccion suma(Fraccion sumando1, Fraccion sumando2) {
	}
	public static Fraccion multiplicacion(Fraccion sumando1, Fraccion sumando2) {
	}
	public static Fraccion division(Fraccion sumando1, Fraccion sumando2) {
	}
	
*/	
	
	
	
	public Fraccion simplificar() {
		int mcd = CalculosMatematicos.mcd(numerador, denominador);
		this.numerador = numerador/mcd;
		this.denominador = denominador/mcd;
		return this;
	}
	
	public static Fraccion suma(Fraccion f1, Fraccion f2) {
		//Test
		Fraccion auxSuma; 
		int denominador = f1.denominador*f2.denominador;
		int numerador = f1.numerador*f2.denominador + f1.denominador*f2.numerador;
		auxSuma = new Fraccion (numerador,denominador);	
		//auxSuma.simplificar();
		return auxSuma;

	}
	
	public static Fraccion multiplicacion(Fraccion f1, Fraccion f2) {
		//Para Testear
		
		Fraccion resultado = new Fraccion(f1.numerador*f2.numerador, f1.denominador*f2.denominador);
		
		return resultado.simplificar();
	}
	
	public static Fraccion division(Fraccion f1, Fraccion f2) {
		//Test
		Fraccion auxDivision;
		int numerador = f1.numerador*f2.denominador;
		int denominador = f1.denominador*f2.numerador;
		auxDivision = new Fraccion (numerador,denominador);
		//auxDivision.simplificar();
		return auxDivision;

	}
	
	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}


	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(numerador).append(" / ").append(denominador);
		return sb.toString();
	}

}
