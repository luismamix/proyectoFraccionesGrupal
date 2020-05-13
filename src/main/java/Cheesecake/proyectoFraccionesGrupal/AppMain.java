package Cheesecake.proyectoFraccionesGrupal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AppMain {
	//variables globales
	static BufferedReader leer; 
	
	public static void menuPrincipal() {
		System.out.println("\n");
		System.out.println("  ////////////////////////");
		System.out.println(" // App Fracciones 1.0 //");
		System.out.println("////////////////////////");
		System.out.println("\n");
		System.out.println("1. Maximo comun divisor");
		System.out.println("2. Minimo comun multiplo");
		System.out.println("3. Simplificar fracciones");
		System.out.println("4. Sumar fracciones");
		System.out.println("5. Restar fracciones");
		System.out.println("6. Multiplicar fracciones");
		System.out.println("7. Dividir fracciones");
		System.out.println("8. Descomponer un numero en factores primos");
		System.out.println("9. Salir");
		System.out.print("Introduce una opcion: ");
	}
	
	public static void menuMcd() {
		int a = -1;
		int b = -1;
		int resultado;
		int respuesta = -1;
		
		System.out.println("\n");
		a=subMenuNumero();
		if(a!=-1) {
			System.out.println("\n");
			b=subMenuNumero();
			if(b!= -1) {
				resultado=CalculosMatematicos.mcd(a, b);
				System.out.println("\n");
				respuesta=subMenuNumeroRespuesta();
				if(respuesta !=-1) {
					if(respuesta==resultado){
						System.out.println("  *****************************************");
						System.out.println(" ** Bien ** - La respuesta es correcta. **");
						System.out.println("***************************************** ");
						System.out.println("\n");
					}else {
						System.out.println("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println(" @@ Mal @@ - La respuesta es incorrecta. @@");
						System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("\n");
					}
					//opcional mostrar resultado
					System.out.println("[Resultado] = "+ resultado);
				}//3
			}//2
		}//1	
	}//fin metodo
	
	public static void menuMcm() {
		int a = -1;
		int b = -1;
		int resultado;
		int respuesta = -1;
		
		System.out.println("\n");
		a=subMenuNumero();
		if(a!=-1) {
			System.out.println("\n");
			b=subMenuNumero();
			if(b!= -1) {
				resultado=CalculosMatematicos.mcm(a, b);
				System.out.println("\n");
				respuesta=subMenuNumeroRespuesta();
				if(respuesta !=-1) {
					if(respuesta==resultado){
						System.out.println("  *****************************************");
						System.out.println(" ** Bien ** - La respuesta es correcta. **");
						System.out.println("***************************************** ");
						System.out.println("\n");
					}else {
						System.out.println("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println(" @@ Mal @@ - La respuesta es incorrecta. @@");
						System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("\n");
					}
						
					//opcional mostrar resultado
					System.out.println("[Resultado] = "+ resultado);
				}//3
			}//2
		}//1	
	}//fin metodo
	
	public static int subMenuNumero() {
		int x = -1;
		System.out.println("Introduce el numero: ");
			try {
				x = Integer.parseInt(leer.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("//Err// - Caracteres invalidos // \n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("//Err// - Entrada / Salida // \n");
			}
		return x;
	}
	
	public static int subMenuNumeroRespuesta() {
		int x = -1;
		System.out.println("Introduce tu respuesta: ");
			try {
				x = Integer.parseInt(leer.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("//Err// - Caracteres invalidos // \n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("//Err// - Entrada / Salida // \n");
			}
		return x;
	}
	
	public static Fraccion crearFraccion (int numerador, int denominador ) {
		return new Fraccion(numerador,denominador);
	}
	
	public static boolean numeradorEsCero(int numerador){
		if (numerador==0)
			return true;
		else
			return false;
	}
	
	public static boolean denominadorEsCero(int denominador){
		if (denominador==0)
			return true;
		else
			return false;
	}
	
	public static Fraccion subMenuFraccion() {
		Fraccion f= null;
		int numerador = -1;
		int denominador= -1;
		System.out.println("\n");
		System.out.println("Introduce el numerador");
			try {
				numerador = Integer.parseInt(leer.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("//Err// - Caracteres invalidos // \n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("//Err// - Entrada / Salida // \n");
			}
		System.out.println("Introduce el denominador");
			try {
				denominador = Integer.parseInt(leer.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("//Err// - Caracteres invalidos // \n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("//Err// - Entrada / Salida // \n");
			}
		//validar q no metan un ceros o caracteres no numericos
			if(numeradorEsCero(numerador) || denominadorEsCero(denominador) || numerador == -1 || denominador == -1)
				System.out.println("//Err. Validacion// No se permiten ceros ni caracteres no numericos // \n");
			else 
				 f = crearFraccion(numerador,denominador);
			
		return f;
	}
	
	public static void menuSimplificar() {
		Fraccion f1=null;
		Fraccion resultado=null;
		Fraccion respuesta=null;
		
		//fraccion1
		System.out.println("\n");
		f1=subMenuFraccion();
		if(f1!=null) {
			//simplificar fracciones
			resultado=f1.simplificar();
			if(resultado!=null) {
				//respuesta
				System.out.println("\n");
				System.out.println("Introduce tu respuesta:");
				respuesta=subMenuFraccion();
				if(respuesta!=null) {
					//comprobar si la respuesta es correcta.
					if(respuesta.getNumerador() == resultado.getNumerador() && respuesta.getDenominador() == resultado.getDenominador()) {
						System.out.println("  *****************************************");
						System.out.println(" ** Bien ** - La respuesta es correcta. **");
						System.out.println("***************************************** ");
						System.out.println("\n");
					}else {
						System.out.println("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println(" @@ Mal @@ - La respuesta es incorrecta. @@");
						System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
						System.out.println("\n");
					}
					//mostrar resultado
					System.out.println("[Resultado] = "+ resultado.getNumerador()+"/"+resultado.getDenominador());	
				}//3
			}//2		
		}//1
	}//metodo
	
	public static void menuSumarFracciones() {
		
		Fraccion f1=null;
		Fraccion f2=null;
		Fraccion resultado=null;
		Fraccion respuesta=null;
		
		//fraccion1
		System.out.println("\n");
		System.out.println("Primera Fraccion:");
		f1=subMenuFraccion();
		if(f1!=null) {
			//fraccion2
			System.out.println("\n");
			System.out.println("Segunda Fraccion:");
			f2=subMenuFraccion();
			if(f2!=null) {
				//sumar
				resultado=Fraccion.suma(f1, f2);
				if(resultado!=null) {
					//respuesta
					System.out.println("\n");
					System.out.println("Introduce tu respuesta:");
					respuesta=subMenuFraccion();
					if(respuesta!=null) {
						//comprobar si la respuesta es correcta.
						if(respuesta.getNumerador() == resultado.getNumerador() && respuesta.getDenominador() == resultado.getDenominador()) {
							System.out.println("  *****************************************");
							System.out.println(" ** Bien ** - La respuesta es correcta. **");
							System.out.println("***************************************** ");
							System.out.println("\n");
						}else {
							System.out.println("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
							System.out.println(" @@ Mal @@ - La respuesta es incorrecta. @@");
							System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
							System.out.println("\n");
						}
						//mostrar resultado
						System.out.println("[Resultado] = "+ resultado.getNumerador()+"/"+resultado.getDenominador());	
					}//4
				}//3		
			}//2
		}//1
	}//fin metodo
	
	public static void menuRestarFracciones() {
		
		Fraccion f1=null;
		Fraccion f2=null;
		Fraccion resultado=null;
		Fraccion respuesta=null;
		
		//fraccion1
		System.out.println("\n");
		System.out.println("Primera Fraccion:");
		f1=subMenuFraccion();
		if(f1!=null) {
			//fraccion2
			System.out.println("\n");
			System.out.println("Segunda Fraccion:");
			f2=subMenuFraccion();
			if(f2!=null) {
				//cambiar de signo el numerador, para reutilizar la suma como resta
				f2.setNumerador(f2.getNumerador()*-1);
				//restar
				resultado=Fraccion.suma(f1, f2);
				if(resultado!=null) {
					//respuesta
					System.out.println("\n");
					System.out.println("Introduce tu respuesta:");
					respuesta=subMenuFraccion();
					if(respuesta!=null) {
						//comprobar si la respuesta es correcta.
						if(respuesta.getNumerador() == resultado.getNumerador() && respuesta.getDenominador() == resultado.getDenominador()) {
							System.out.println("  *****************************************");
							System.out.println(" ** Bien ** - La respuesta es correcta. **");
							System.out.println("***************************************** ");
							System.out.println("\n");
						}else {
							System.out.println("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
							System.out.println(" @@ Mal @@ - La respuesta es incorrecta. @@");
							System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
							System.out.println("\n");
						}
						//mostrar resultado
						System.out.println("[Resultado] = "+ resultado.getNumerador()+"/"+resultado.getDenominador());	
					}//4
				}//3		
			}//2
		}//1
	}//fin metodo
	
	public static void menuMultiplicarFracciones() {
		
		Fraccion f1=null;
		Fraccion f2=null;
		Fraccion resultado=null;
		Fraccion respuesta=null;
		
		//fraccion1
		System.out.println("\n");
		System.out.println("Primera Fraccion:");
		f1=subMenuFraccion();
		if(f1!=null) {
			//fraccion2
			System.out.println("\n");
			System.out.println("Segunda Fraccion:");
			f2=subMenuFraccion();
			if(f2!=null) {
				//multiplicar
				resultado=Fraccion.multiplicacion(f1, f2);
				if(resultado!=null) {
					//respuesta
					System.out.println("\n");
					System.out.println("Introduce tu respuesta:");
					respuesta=subMenuFraccion();
					if(respuesta!=null) {
						//comprobar si la respuesta es correcta.
						if(respuesta.getNumerador() == resultado.getNumerador() && respuesta.getDenominador() == resultado.getDenominador()) {
							System.out.println("  *****************************************");
							System.out.println(" ** Bien ** - La respuesta es correcta. **");
							System.out.println("***************************************** ");
							System.out.println("\n");
						}else {
							System.out.println("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
							System.out.println(" @@ Mal @@ - La respuesta es incorrecta. @@");
							System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
							System.out.println("\n");
						}
						//mostrar resultado
						System.out.println("[Resultado] = "+ resultado.getNumerador()+"/"+resultado.getDenominador());	
					}//4
				}//3		
			}//2
		}//1
	}//fin metodo
	
	public static void menuDividirFracciones() {
		
		Fraccion f1=null;
		Fraccion f2=null;
		Fraccion resultado=null;
		Fraccion respuesta=null;
		
		//fraccion1
		System.out.println("\n");
		System.out.println("Primera Fraccion:");
		f1=subMenuFraccion();
		if(f1!=null) {
			//fraccion2
			System.out.println("\n");
			System.out.println("Segunda Fraccion:");
			f2=subMenuFraccion();
			if(f2!=null) {
				//dividir
				resultado=Fraccion.division(f1, f2);
				if(resultado!=null) {
					//respuesta
					System.out.println("\n");
					System.out.println("Introduce tu respuesta:");
					respuesta=subMenuFraccion();
					if(respuesta!=null) {
						//comprobar si la respuesta es correcta.
						if(respuesta.getNumerador() == resultado.getNumerador() && respuesta.getDenominador() == resultado.getDenominador()) {
							System.out.println("  *****************************************");
							System.out.println(" ** Bien ** - La respuesta es correcta. **");
							System.out.println("***************************************** ");
							System.out.println("\n");
						}else {
							System.out.println("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
							System.out.println(" @@ Mal @@ - La respuesta es incorrecta. @@");
							System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
							System.out.println("\n");
						}
						//mostrar resultado
						System.out.println("[Resultado] = "+ resultado.getNumerador()+"/"+resultado.getDenominador());	
					}//4
				}//3		
			}//2
		}//1
	}//fin metodo
	
	public static void mostrarPrimos(SortedMap<Integer,Integer> divisores, int a) {
		System.out.println("\n");
		for(Map.Entry<Integer, Integer> entrada: divisores.entrySet()) {
			int divisor=entrada.getKey();
			int numeroVeces=entrada.getValue();
			for(int i=1;i<=numeroVeces;i++) {
			System.out.println(a + "\t|\t" + divisor);
			a=a/divisor;
			}
		}
	}
	
	public static void subMenuDescomponernumeroenprimos() {
		System.out.println("\n");
		System.out.println("  ????????????????????");
		System.out.println(" ??  Ejemplo: 180  ??");
		System.out.println("????????????????????");
		System.out.println("");
		System.out.println("[Resultado] = "+"2*2*5*3*3");
		System.out.println("\n");
		System.out.println("  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println(" !!  Sin espacios por favor, o lo llevas claro :) !!");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("\n");
		System.out.println("Introduce tu respuesta:");
	}
	
	public static void menuDescomponernumeroenprimos() {
		int a = -1;
		int respuesta = 1;
		String cadena="";
		SortedMap<Integer,Integer> divisores = null;
		
		System.out.println("\n");
		System.out.println("Introduce el numero a descomponer:");
			try {
				a = Integer.parseInt(leer.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("//Err// - Caracteres invalidos // \n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("//Err// - Entrada / Salida // \n");
			}
		//validar si han metido un cero o caracteres no numericos
		if(a==-1 || a==0) {
			System.out.println("//Err. Validacion// No se permiten ceros ni caracteres no numericos // \n");
		}else{
			divisores = CalculosMatematicos.divisores(a);
		}
		//si pasa validacion y el mapa devuelto no esta vacio
		if(divisores!=null) {
			//submenu para capturar la secuencia de caracteres.
			subMenuDescomponernumeroenprimos();
				try {
					cadena = leer.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("//Err// - Entrada / Salida // \n");
				}
			//convertir la secuencia de caracteres en numeros y recomponer los primos al numero original.
			String[] numeros = cadena.split("\\*");
			for(String s : numeros) {
				try {
					respuesta *= Integer.parseInt(s);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					System.out.println("//Err// - Caracteres invalidos // \n");
				}
			}
			System.out.println("\n");
			//comprobar si la respuesta es correcta.
			if(respuesta==a) {
				System.out.println("  *****************************************");
				System.out.println(" ** Bien ** - La respuesta es correcta. **");
				System.out.println("***************************************** ");
				System.out.println("\n");
			}else {
				System.out.println("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println(" @@ Mal @@ - La respuesta es incorrecta. @@");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("\n");
			}
			
			//mostrar resultado por consola 
			System.out.println("[Descomposicion del numero "+ a + " en factores primos] = ");	
			mostrarPrimos(divisores,a);
		}//1
	}

	public static void main(String[] args) {
		leer = new BufferedReader(new InputStreamReader(System.in));
		int opcion=0;
		
		while(opcion!=9) {
			menuPrincipal();
				try {
					opcion= Integer.parseInt(leer.readLine());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					System.out.println("//Err// - Caracteres invalidos // \n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("//Err// - Entrada / Salida // \n");
				}
			switch (opcion) {
			case 1 : 
				menuMcd();
				break;
			case 2 : 
				menuMcm();
				break;
			case 3 : 
				menuSimplificar();
				break;
			case 4 : 
				menuSumarFracciones();
				break;
			case 5 : 
				menuRestarFracciones();
				break;
			case 6 : 
				menuMultiplicarFracciones();
				break;
			case 7 : 
				menuDividirFracciones();
				break;
			case 8 : 
				menuDescomponernumeroenprimos();
				break;
			case 9 : 
				System.out.println("\n");
				System.out.println("Exit................");
				break;
			default :
				System.out.println("Opcion Erronea");
				break;	
			}//switch
		}//while
	
	}

}
