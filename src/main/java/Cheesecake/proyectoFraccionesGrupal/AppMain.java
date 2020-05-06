package Cheesecake.proyectoFraccionesGrupal;

import java.util.*;

public class AppMain {

	public static void main(String[] args) {
		/*
		 * Ejemplo de uso del mÃ©todo CalculosMatematicos.divisores
		 * Este mÃ©todo descompone un nÃºmero en factores primos
		 * Retornando un mapa con los factores primos
		 */
		int num = 180;
		SortedMap<Integer,Integer> divisores = new TreeMap<>();
		divisores=CalculosMatematicos.divisores(num);
		for(Map.Entry<Integer, Integer> entrada: divisores.entrySet()) {
			int divisor=entrada.getKey();
			int numeroVeces=entrada.getValue();
			for(int i=1;i<=numeroVeces;i++) {
			System.out.println(num+"\t|\t"+divisor);
			num=num/divisor;
			}
		}
				
		Fraccion ejempoFraccion = new Fraccion(3, 100);		
		System.out.println("\n\nPara ver como funciona toString en Fraccion:\t"+ejempoFraccion);
	}

}
