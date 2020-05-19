package Cheesecake.proyectoFraccionesGrupal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Map;
import java.util.SortedMap;

import javax.swing.JOptionPane;

public class Controller implements ActionListener {
	
	private VentanaPrincipal vista;
	
	//vincular el controlador con la vista
	public Controller (VentanaPrincipal vista) {
		this.vista=vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		eventosMenuPrincipal(e);
		
		if (e.getSource()==vista.getMenuItemAplicacion()) {
			JOptionPane.showMessageDialog(null, vista.getInformacionAplicacion(),"INFORMACION",JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	
	/**
	 * Metodos para los eventos del menu Principal
	 * @param e
	 */
	private void eventosMenuPrincipal(ActionEvent e) {

		if (e.getSource()==vista.getMenuItemMcd()) {
			limpiar();
			try {
				menuMcd();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Caracteres inválidos", "Error de Validación",JOptionPane.ERROR_MESSAGE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Entrada / Salida", "Error de Validación",JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource()==vista.getMenuItemMcm()) {
			limpiar();
			try {
				menuMcm();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Caracteres inválidos", "Error de Validación",JOptionPane.ERROR_MESSAGE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Entrada / Salida", "Error de Validación",JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource()==vista.getMenuItemSimplificar()) {
			limpiar();
			try {
				menuSimplificar();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Caracteres inválidos", "Error de Validación",JOptionPane.ERROR_MESSAGE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Entrada / Salida", "Error de Validación",JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource()==vista.getMenuItemSumarFracciones()) {
			limpiar();
			try {
				menuSumarFracciones();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Caracteres inválidos", "Error de Validación",JOptionPane.ERROR_MESSAGE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Entrada / Salida", "Error de Validación",JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource()==vista.getMenuItemRestarFracciones()) {
			limpiar();
			try {
				menuRestarFracciones();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Caracteres inválidos", "Error de Validación",JOptionPane.ERROR_MESSAGE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Entrada / Salida", "Error de Validación",JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource()==vista.getMenuItemMultiplicarFracciones()) {
			limpiar();
			try {
				menuMultiplicarFracciones();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Caracteres inválidos", "Error de Validación",JOptionPane.ERROR_MESSAGE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Entrada / Salida", "Error de Validación",JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource()==vista.getMenuItemDividirFracciones()) {
			limpiar();
			try {
				menuDividirFracciones();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Caracteres inválidos", "Error de Validación",JOptionPane.ERROR_MESSAGE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Entrada / Salida", "Error de Validación",JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource()==vista.getMenuItemDescomponernumeroenprimos()) {
			limpiar();
			try {
				menuDescomponernumeroenprimos();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Caracteres inválidos", "Error de Validación",JOptionPane.ERROR_MESSAGE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Entrada / Salida", "Error de Validación",JOptionPane.ERROR_MESSAGE);
			}
		}
	}//eventos
	
	public void menuMcd() throws NumberFormatException, IOException {
		int a = -1;
		int b = -1;
		int resultado;
		int respuesta = -1;
		
		vista.getLblOperacion().setText("Máximo comun divisor");
		a=subMenuNumero("Introduce el primer número");
		if(a!=-1) {
			vista.getLblOperando1().setText(String.valueOf(a));
			b=subMenuNumero("Introduce el segundo número");
			if(b!= -1) {
				vista.getLblOperando2().setText(String.valueOf(b));
				resultado=CalculosMatematicos.mcd(a, b);
				respuesta=subMenuNumeroRespuesta();
				if(respuesta !=-1) {
					vista.getLblRespuesta().setText(String.valueOf(respuesta));
					if(respuesta==resultado){
						JOptionPane.showMessageDialog(null, "La respuesta es correcta.","Bien!!!",JOptionPane.INFORMATION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "La respuesta es incorrecta.","Mal!!!",JOptionPane.WARNING_MESSAGE);
					}
					//opcional mostrar resultado
					//System.out.println("[Resultado] = "+ resultado);
					vista.getLblResultado().setText(String.valueOf(resultado));
				}//3
			}//2
		}//1	
	}//fin metodo
	
	public void menuMcm() throws NumberFormatException, IOException {
		int a = -1;
		int b = -1;
		int resultado;
		int respuesta = -1;
		
		vista.getLblOperacion().setText("Mínimo comun múltiplo");
		a=subMenuNumero("Introduce el primer número");
		if(a!=-1) {
			vista.getLblOperando1().setText(String.valueOf(a));
			b=subMenuNumero("Introduce el segundo número");
			if(b!= -1) {
				vista.getLblOperando2().setText(String.valueOf(b));
				resultado=CalculosMatematicos.mcm(a, b);
				respuesta=subMenuNumeroRespuesta();
				if(respuesta !=-1) {
					vista.getLblRespuesta().setText(String.valueOf(respuesta));
					if(respuesta==resultado){
						JOptionPane.showMessageDialog(null, "La respuesta es correcta.","Bien!!!",JOptionPane.INFORMATION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "La respuesta es incorrecta.","Mal!!!",JOptionPane.WARNING_MESSAGE);
					}
					//opcional mostrar resultado
					vista.getLblResultado().setText(String.valueOf(resultado));
				}//3
			}//2
		}//1	
	}//fin metodo
	
	public int subMenuNumero(String c) throws NumberFormatException, IOException {
		int x = -1;
		x= Integer.parseInt(JOptionPane.showInputDialog(null, c,"Entrada de Parámetros",JOptionPane.QUESTION_MESSAGE));
		return x;
	}
	
	public static int subMenuNumeroRespuesta() throws NumberFormatException, IOException {
		int x = -1;
		x= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu respuesta","Entrada de Parámetros",JOptionPane.QUESTION_MESSAGE));
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
	
	public static Fraccion subMenuFraccion(String fraccion) throws NumberFormatException, IOException {
		Fraccion f= null;
		int numerador = -1;
		int denominador= -1;
		numerador = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numerador",fraccion,JOptionPane.QUESTION_MESSAGE));	
		denominador = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el denominador",fraccion,JOptionPane.QUESTION_MESSAGE));
			
		//validar q no metan un ceros o caracteres no numericos
		if(denominadorEsCero(denominador) || numerador == -1 || denominador == -1)
			JOptionPane.showMessageDialog(null, "No se permiten ceros en el denominador ni caracteres no numéricos", "Error de Validación",JOptionPane.ERROR_MESSAGE);
		else 
			f = crearFraccion(numerador,denominador);
			
		return f;
	}
	
	public void limpiar() {
		vista.getLblOperacion().setText("");
		vista.getLblOperando1().setText("");
		vista.getLblOperando2().setText("");
		vista.getLblRespuesta().setText("");
		vista.getLblResultado().setText("");
		vista.getLblResultado2().setText("");
	}
	
	public void menuSimplificar() throws NumberFormatException, IOException {
		Fraccion f1=null;
		Fraccion resultado=null;
		Fraccion respuesta=null;
		
		//fraccion1
		vista.getLblOperacion().setText("Simplificar fraccion");
		f1=subMenuFraccion("Fracción 1");
		if(f1!=null) {
			vista.getLblOperando1().setText(String.valueOf(f1.getNumerador())+"/"+String.valueOf(f1.getDenominador()));
			//simplificar fracciones
			resultado=f1.simplificar();
			if(resultado!=null) {
				//respuesta
				respuesta=subMenuFraccion("Respuesta");
				if(respuesta!=null) {
					vista.getLblOperando2().setText("");
					vista.getLblRespuesta().setText(String.valueOf(respuesta.getNumerador())+"/"+String.valueOf(respuesta.getDenominador()));
					//comprobar si la respuesta es correcta.
					if(respuesta==resultado){
						JOptionPane.showMessageDialog(null, "La respuesta es correcta.","Bien!!!",JOptionPane.INFORMATION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "La respuesta es incorrecta.","Mal!!!",JOptionPane.WARNING_MESSAGE);
					}
					//mostrar resultado
					vista.getLblResultado().setText(String.valueOf(resultado.getNumerador())+"/"+String.valueOf(resultado.getDenominador()));
				}//3
			}//2		
		}//1
	}//metodo
	
	public void menuSumarFracciones() throws NumberFormatException, IOException {
		
		Fraccion f1=null;
		Fraccion f2=null;
		Fraccion resultado=null;
		Fraccion respuesta=null;
		
		//fraccion1
		vista.getLblOperacion().setText("Sumar fracciones");
		f1=subMenuFraccion("Fracción 1");
		if(f1!=null) {
			vista.getLblOperando1().setText(String.valueOf(f1.getNumerador())+"/"+String.valueOf(f1.getDenominador()));
			//fraccion2
			f2=subMenuFraccion("Fracción 2");
			if(f2!=null) {
				vista.getLblOperando2().setText(String.valueOf(f2.getNumerador())+"/"+String.valueOf(f2.getDenominador()));
				//sumar
				resultado=Fraccion.suma(f1, f2);
				if(resultado!=null) {
					//respuesta
					respuesta=subMenuFraccion("Respuesta");
					if(respuesta!=null) {
						vista.getLblRespuesta().setText(String.valueOf(respuesta.getNumerador())+"/"+String.valueOf(respuesta.getDenominador()));
						//comprobar si la respuesta es correcta.
						if(respuesta==resultado){
							JOptionPane.showMessageDialog(null, "La respuesta es correcta.","Bien!!!",JOptionPane.INFORMATION_MESSAGE);
						}else {
							JOptionPane.showMessageDialog(null, "La respuesta es incorrecta.","Mal!!!",JOptionPane.WARNING_MESSAGE);
						}
						//mostrar resultado
						vista.getLblResultado().setText(String.valueOf(resultado.getNumerador())+"/"+String.valueOf(resultado.getDenominador()));
					}//4
				}//3		
			}//2
		}//1
	}//fin metodo
	
	public void menuRestarFracciones() throws NumberFormatException, IOException {
		
		Fraccion f1=null;
		Fraccion f2=null;
		Fraccion resultado=null;
		Fraccion respuesta=null;
		
		//fraccion1
		vista.getLblOperacion().setText("Restar fracciones");
		f1=subMenuFraccion("Fracción 1");
		if(f1!=null) {
			vista.getLblOperando1().setText(String.valueOf(f1.getNumerador())+"/"+String.valueOf(f1.getDenominador()));
			//fraccion2
			f2=subMenuFraccion("Fracción 2");
			if(f2!=null) {
				vista.getLblOperando2().setText(String.valueOf(f2.getNumerador())+"/"+String.valueOf(f2.getDenominador()));
				//restar
				resultado=Fraccion.suma(f1, f2);
				if(resultado!=null) {
					//respuesta
					respuesta=subMenuFraccion("Respuesta");
					if(respuesta!=null) {
						vista.getLblRespuesta().setText(String.valueOf(respuesta.getNumerador())+"/"+String.valueOf(respuesta.getDenominador()));
						//comprobar si la respuesta es correcta.
						if(respuesta==resultado){
							JOptionPane.showMessageDialog(null, "La respuesta es correcta.","Bien!!!",JOptionPane.INFORMATION_MESSAGE);
						}else {
							JOptionPane.showMessageDialog(null, "La respuesta es incorrecta.","Mal!!!",JOptionPane.WARNING_MESSAGE);
						}
						//mostrar resultado
						vista.getLblResultado().setText(String.valueOf(resultado.getNumerador())+"/"+String.valueOf(resultado.getDenominador()));
					}//4
				}//3		
			}//2
		}//1
	}//fin metodo
	
	public void menuMultiplicarFracciones() throws NumberFormatException, IOException {
		
		Fraccion f1=null;
		Fraccion f2=null;
		Fraccion resultado=null;
		Fraccion respuesta=null;
		
		//fraccion1
		vista.getLblOperacion().setText("Multiplicar fracciones");
		f1=subMenuFraccion("Fracción 1");
		if(f1!=null) {
			vista.getLblOperando1().setText(String.valueOf(f1.getNumerador())+"/"+String.valueOf(f1.getDenominador()));
			//fraccion2
			f2=subMenuFraccion("Fracción 2");
			if(f2!=null) {
				vista.getLblOperando2().setText(String.valueOf(f2.getNumerador())+"/"+String.valueOf(f2.getDenominador()));
				//multiplicar
				resultado=Fraccion.multiplicacion(f1, f2);
				if(resultado!=null) {
					//respuesta
					respuesta=subMenuFraccion("Respuesta");
					if(respuesta!=null) {
						vista.getLblRespuesta().setText(String.valueOf(respuesta.getNumerador())+"/"+String.valueOf(respuesta.getDenominador()));
						//comprobar si la respuesta es correcta.
						if(respuesta==resultado){
							JOptionPane.showMessageDialog(null, "La respuesta es correcta.","Bien!!!",JOptionPane.INFORMATION_MESSAGE);
						}else {
							JOptionPane.showMessageDialog(null, "La respuesta es incorrecta.","Mal!!!",JOptionPane.WARNING_MESSAGE);
						}
						//mostrar resultado
						vista.getLblResultado().setText(String.valueOf(resultado.getNumerador())+"/"+String.valueOf(resultado.getDenominador()));
					}//4
				}//3		
			}//2
		}//1
	}//fin metodo
	
	public void menuDividirFracciones() throws NumberFormatException, IOException {
		
		Fraccion f1=null;
		Fraccion f2=null;
		Fraccion resultado=null;
		Fraccion respuesta=null;
		
		//fraccion1
		vista.getLblOperacion().setText("Dividir fracciones");
		f1=subMenuFraccion("Fracción 1");
		if(f1!=null) {
			vista.getLblOperando1().setText(String.valueOf(f1.getNumerador())+"/"+String.valueOf(f1.getDenominador()));
			//fraccion2
			f2=subMenuFraccion("Fracción 2");
			if(f2!=null) {
				vista.getLblOperando2().setText(String.valueOf(f2.getNumerador())+"/"+String.valueOf(f2.getDenominador()));
				//dividir
				resultado=Fraccion.division(f1, f2);
				if(resultado!=null) {
					//respuesta
					respuesta=subMenuFraccion("Respuesta");
					if(respuesta!=null) {
						vista.getLblRespuesta().setText(String.valueOf(respuesta.getNumerador())+"/"+String.valueOf(respuesta.getDenominador()));
						//comprobar si la respuesta es correcta.
						if(respuesta==resultado){
							JOptionPane.showMessageDialog(null, "La respuesta es correcta.","Bien!!!",JOptionPane.INFORMATION_MESSAGE);
						}else {
							JOptionPane.showMessageDialog(null, "La respuesta es incorrecta.","Mal!!!",JOptionPane.WARNING_MESSAGE);
						}
						//mostrar resultado
						vista.getLblResultado().setText(String.valueOf(resultado.getNumerador())+"/"+String.valueOf(resultado.getDenominador()));
					}//4
				}//3		
			}//2
		}//1
	}//fin metodo
	
	public String mostrarPrimos(SortedMap<Integer,Integer> divisores, int a) {
		String cadena = "";
		for(Map.Entry<Integer, Integer> entrada: divisores.entrySet()) {
			int divisor=entrada.getKey();
			int numeroVeces=entrada.getValue();
			for(int i=1;i<=numeroVeces;i++) {
			cadena +=a + "\t|\t" + divisor+" \n";
			a=a/divisor;
			}
		}
		return cadena;
	}
	
	public void menuDescomponernumeroenprimos() throws NumberFormatException, IOException {
		int a = -1;
		int respuesta = 1;
		String cadena="";
		SortedMap<Integer,Integer> divisores = null;

		vista.getLblOperacion().setText("Descomposición de un número en factores primos");
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero a descomponer","Entrada de Parámetros",JOptionPane.QUESTION_MESSAGE));
			
		//validar si han metido caracteres no numericos
		if(a==-1) {
			JOptionPane.showMessageDialog(null, "No se permiten caracteres no numéricos", "Error de Validación",JOptionPane.ERROR_MESSAGE);
		}else{
			vista.getLblOperando1().setText(String.valueOf(a));
			divisores = CalculosMatematicos.divisores(a);
		}
		//si pasa validacion y el mapa devuelto no esta vacio
		if(divisores!=null) {
			//capturar la secuencia de caracteres.
			JOptionPane.showMessageDialog(null, "nº 180 - [Respuesta] = 2*2*5*3*3 \n Sin espacios por favor, o lo llevas claro :)","Ejemplo formato Entrada",JOptionPane.INFORMATION_MESSAGE);
			cadena = JOptionPane.showInputDialog(null, "Introduce la respuesta","Entrada de Parámetros",JOptionPane.QUESTION_MESSAGE);	
			vista.getLblOperando2().setText(String.valueOf(""));
			vista.getLblRespuesta().setText(cadena);
			//convertir la secuencia de caracteres en numeros y recomponer los primos al numero original.
			String[] numeros = cadena.split("\\*");
			for(String s : numeros) {
				respuesta *= Integer.parseInt(s);
			}
			//comprobar si la respuesta es correcta.
			if(respuesta==a){
				JOptionPane.showMessageDialog(null, "La respuesta es correcta.","Bien!!!",JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "La respuesta es incorrecta.","Mal!!!",JOptionPane.WARNING_MESSAGE);
			}
			
			//mostrar resultado por consola 
			vista.getLblResultado().setText(String.valueOf(""));
			vista.getLblResultado2().setText(mostrarPrimos(divisores,a));
		}//1
	}
	
}//clase
