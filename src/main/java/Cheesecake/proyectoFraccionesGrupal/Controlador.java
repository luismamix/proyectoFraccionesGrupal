package Cheesecake.proyectoFraccionesGrupal;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Map;
import java.util.SortedMap;

import javax.swing.JEditorPane;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {

	private VentanaPrincipal vista;

	// vincular el controlador con la vista
	public Controlador(VentanaPrincipal vista) {
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		eventosMenuPrincipal(e);

		if (e.getSource() == vista.getMenuItemAplicacion()) {
			
			JOptionPane.showMessageDialog(null, vista.getInformacionAplicacion(), "INFORMACION",
			JOptionPane.INFORMATION_MESSAGE);
			
			
		}

	}

	/**
	 * Metodos para los eventos del menu Principal
	 * 
	 * @param e
	 */
	private void eventosMenuPrincipal(ActionEvent e) {

		if (e.getSource() == vista.getMenuItemMcd()) {
			limpiar();
			try {
				// Leyre
				menuMcd();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Caracteres inválidos", "Error de Validación",
						JOptionPane.ERROR_MESSAGE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Entrada / Salida", "Error de Validación",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource() == vista.getMenuItemMcm()) {
			limpiar();
			try {
				// Leyre
				menuMcm();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Caracteres inválidos", "Error de Validación",
						JOptionPane.ERROR_MESSAGE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Entrada / Salida", "Error de Validación",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource() == vista.getMenuItemSimplificar()) {
			limpiar();
			try {
				// Javier
				menuSimplificar();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Caracteres inválidos", "Error de Validación",
						JOptionPane.ERROR_MESSAGE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Entrada / Salida", "Error de Validación",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource() == vista.getMenuItemSumarFracciones()) {
			limpiar();
			try {
				// Alex
				menuSumarFracciones();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Caracteres inválidos", "Error de Validación",
						JOptionPane.ERROR_MESSAGE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Entrada / Salida", "Error de Validación",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource() == vista.getMenuItemRestarFracciones()) {
			limpiar();
			try {
				// Alex
				menuRestarFracciones();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Caracteres inválidos", "Error de Validación",
						JOptionPane.ERROR_MESSAGE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Entrada / Salida", "Error de Validación",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource() == vista.getMenuItemMultiplicarFracciones()) {
			limpiar();
			try {
				// Javier
				menuMultiplicarFracciones();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Caracteres inválidos", "Error de Validación",
						JOptionPane.ERROR_MESSAGE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Entrada / Salida", "Error de Validación",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource() == vista.getMenuItemDividirFracciones()) {
			limpiar();
			try {
				// Javier
				menuDividirFracciones();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Caracteres inválidos", "Error de Validación",
						JOptionPane.ERROR_MESSAGE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Entrada / Salida", "Error de Validación",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource() == vista.getMenuItemDescomponernumeroenprimos()) {
			limpiar();
			try {
				//Alex
				menuDescomponerNumeroEnPrimos();

			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Caracteres inválidos", "Error de Validación",
						JOptionPane.ERROR_MESSAGE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Entrada / Salida", "Error de Validación",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}// eventos

	private void menuMcm() throws NumberFormatException, IOException {
		int a = -1;
		int b = -1;
		int resultadoEsperado;
		int respuesta = -1;
		
		vista.getLblOperacion().setText("Mínimo comun múltiplo");
		a=subMenuNumero("Introduce el primer número");
		if(a!=-1) {//Comprobamos que el primer número se ha introducido
			vista.getLblOperando1().setText(Integer.toString(a));
			b=subMenuNumero("Introduce el segundo número");
			if(b!= -1) {//Comprobamos que el segundo número se ha introducido
				vista.getLblOperando2().setText(Integer.toString(b));
				resultadoEsperado=CalculosMatematicos.mcm(a, b);
				respuesta=subMenuNumeroRespuesta();
				if(respuesta !=-1) {//Comprobamos que el resultado se ha introducido
					vista.getLblRespuesta().setText(Integer.toString(respuesta));
					if(respuesta==resultadoEsperado){//Comprobamos respuesta == resultadoEsperado
						JOptionPane.showMessageDialog(null, "La respuesta es correcta.","CORRECTO",JOptionPane.INFORMATION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "La respuesta es incorrecta.","INCORRECTO",JOptionPane.WARNING_MESSAGE);
					}
					
					vista.getLblResultado().setText(Integer.toString(resultadoEsperado));
				}
			}
		}

	}//eventos
	
	public void menuSumarFracciones() throws NumberFormatException, IOException {
		
		vista.getLblOperacion().setText("Sumar Fracciones");
		
		Fraccion f1 = subMenuFraccion ("Sumando 1");
		
		if(f1 != null) {
		  vista.getLblOperando1().setText(Integer.toString(f1.getNumerador()).concat("/").concat(Integer.toString(f1.getDenominador())));
	    
	    Fraccion f2 = subMenuFraccion ("Sumando 2");
	    
	    if(f2 != null) {
	      vista.getLblOperando2().setText(Integer.toString(f2.getNumerador()).concat("/").concat(Integer.toString(f2.getDenominador())));
	      
	      Fraccion respuesta = subMenuFraccion("Resultado");
	      
	      vista.getLblRespuesta().setText(Integer.toString(respuesta.getNumerador()).concat("/").concat(Integer.toString(respuesta.getDenominador())));
	      
	      Fraccion resultado = Fraccion.suma(f1, f2);
	      
	      vista.getLblResultado().setText(Integer.toString(resultado.getNumerador()).concat("/").concat(Integer.toString(resultado.getDenominador())));
	      
	      if (respuesta.getNumerador() == resultado.getNumerador() && respuesta.getDenominador() == resultado.getDenominador())
	        JOptionPane.showMessageDialog(null, "La respuesta es correcta", "¡Acertaste!", JOptionPane.INFORMATION_MESSAGE);
	      else 
	        JOptionPane.showMessageDialog(null, "Respuesta incorrecta", "¡Fallaste!", JOptionPane.WARNING_MESSAGE);
	    }
	      
		}
	}
	
	public void menuRestarFracciones() throws NumberFormatException, IOException{
		
	  vista.getLblOperacion().setText("Restar Fracciones");
    
    Fraccion f1 = subMenuFraccion ("Fraccion 1");
    
    if(f1 != null) {
      vista.getLblOperando1().setText(Integer.toString(f1.getNumerador()).concat("/").concat(Integer.toString(f1.getDenominador())));
      
      Fraccion f2 = subMenuFraccion ("Fraccion 2");
      
      if(f2 != null) {
        vista.getLblOperando2().setText(Integer.toString(f2.getNumerador()).concat("/").concat(Integer.toString(f2.getDenominador())));
        
        Fraccion respuesta = subMenuFraccion("Resultado");
        
        vista.getLblRespuesta().setText(Integer.toString(respuesta.getNumerador()).concat("/").concat(Integer.toString(respuesta.getDenominador())));
        
        Fraccion resultado = Fraccion.resta(f1, f2);
        
        vista.getLblResultado().setText(Integer.toString(resultado.getNumerador()).concat("/").concat(Integer.toString(resultado.getDenominador())));
        
        if (respuesta.getNumerador() == resultado.getNumerador() && respuesta.getDenominador() == resultado.getDenominador())
          JOptionPane.showMessageDialog(null, "La respuesta es correcta", "¡Acertaste!", JOptionPane.INFORMATION_MESSAGE);
        else 
          JOptionPane.showMessageDialog(null, "Respuesta incorrecta", "¡Fallaste!", JOptionPane.WARNING_MESSAGE);
      }
        
    }
	}
	
	public void menuDescomponerNumeroEnPrimos()  throws NumberFormatException, IOException {
		
		int a = -1;
		int respuesta = 1;
		String cadena="";
		SortedMap<Integer,Integer> divisores = null;

		vista.getLblOperacion().setText("Descomposición de un número en factores primos");
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero a descomponer","Entrada de Parámetros",JOptionPane.QUESTION_MESSAGE));
			
		vista.getLblOperando1().setText(String.valueOf(a));
		divisores = CalculosMatematicos.divisores(a);
		
		if(divisores!=null) {
			JOptionPane.showMessageDialog(null, "nº 180 - [Respuesta] = 2*2*5*3*3 \n Sin espacios por favor, o lo llevas claro :)","Ejemplo formato Entrada",JOptionPane.INFORMATION_MESSAGE);
			cadena = JOptionPane.showInputDialog(null, "Introduce la respuesta","Entrada de Parámetros",JOptionPane.QUESTION_MESSAGE);	
			vista.getLblOperando2().setText(String.valueOf(""));
			vista.getLblRespuesta().setText(cadena);
			String[] numeros = cadena.split("\\*");
			for(String s : numeros) {
				respuesta *= Integer.parseInt(s);
			}
			if(respuesta==a){
				JOptionPane.showMessageDialog(null, "La respuesta es correcta.","Bien!!!",JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "La respuesta es incorrecta.","Mal!!!",JOptionPane.WARNING_MESSAGE);
			}
			
			vista.getLblResultado().setText(String.valueOf(""));
			vista.gettextArea().setText(mostrarPrimos(divisores,a));
		}
	}
	
	private void menuMcd() throws NumberFormatException, IOException {
		int a = -1;
		int b = -1;
		int resultadoEsperado;
		int respuesta = -1;

		vista.getLblOperacion().setText("Máximo comun divisor");
		a = subMenuNumero("Introduce el primer número");
		if (a != -1) { //Comprobamos que el primer número se ha introducido
			vista.getLblOperando1().setText(Integer.toString(a));
			b = subMenuNumero("Introduce el segundo número");
			if (b != -1) { //Comprobamos que el segundo número se ha introducido
				vista.getLblOperando2().setText(Integer.toString(b));
				resultadoEsperado = CalculosMatematicos.mcd(a, b);
				respuesta = subMenuNumeroRespuesta();
				if (respuesta != -1) { //Comprobamos que la respuesta se ha introducido
					vista.getLblRespuesta().setText(Integer.toString(respuesta));
					if (respuesta == resultadoEsperado) { //Comprobamos respuesta == resultadoEsperado
						JOptionPane.showMessageDialog(null, "La respuesta es correcta","CORRECTO",JOptionPane.INFORMATION_MESSAGE);;
					} else {
						JOptionPane.showMessageDialog(null, "La respuesta es incorrecta.", "ERROR",
								JOptionPane.WARNING_MESSAGE);
					}
					
					vista.getLblResultado().setText(Integer.toString(resultadoEsperado));
				}
			}
		}

	}


	public int subMenuNumero(String c) throws NumberFormatException, IOException {
		int x = -1;
		x = Integer
				.parseInt(JOptionPane.showInputDialog(null, c, "Entrada de Parámetros", JOptionPane.QUESTION_MESSAGE));
		return x;
	}

	public static int subMenuNumeroRespuesta() throws NumberFormatException, IOException {
		int x = -1;
		x = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu respuesta", "Entrada de Parámetros",
				JOptionPane.QUESTION_MESSAGE));
		return x;
	}

	public static Fraccion crearFraccion(int numerador, int denominador) {
		return new Fraccion(numerador, denominador);
	}

	public static boolean numeradorEsCero(int numerador) {
		if (numerador == 0)
			return true;
		else
			return false;
	}

	public static boolean denominadorEsCero(int denominador) {
		if (denominador == 0)
			return true;
		else
			return false;
	}

	public static Fraccion subMenuFraccion(String fraccion) throws NumberFormatException, IOException {
		Fraccion f = null;
		int numerador = -1;
		int denominador = -1;
		numerador = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Introduce el numerador", fraccion, JOptionPane.QUESTION_MESSAGE));
		denominador = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Introduce el denominador", fraccion, JOptionPane.QUESTION_MESSAGE));

		// validar q no metan un ceros o caracteres no numericos
		if (denominadorEsCero(denominador) || numerador == -1 || denominador == -1)
			JOptionPane.showMessageDialog(null, "No se permiten ceros en el denominador ni caracteres no numéricos",
					"Error de Validación", JOptionPane.ERROR_MESSAGE);
		else
			f = crearFraccion(numerador, denominador);

		return f;
	}

	public void limpiar() {
		vista.getLblOperacion().setText("");
		vista.getLblOperando1().setText("");
		vista.getLblOperando2().setText("");
		vista.getLblRespuesta().setText("");
		vista.getLblResultado().setText("");
		vista.gettextArea().setText("");

	}

	public String mostrarPrimos(SortedMap<Integer, Integer> divisores, int a) {

		String cadena = "";
		for (Map.Entry<Integer, Integer> entrada : divisores.entrySet()) {
			int divisor = entrada.getKey();
			int numeroVeces = entrada.getValue();
			for (int i = 1; i <= numeroVeces; i++) {
				cadena += a + "\t|\t" + divisor + " \n";
				a = a / divisor;
			}
		}
		return cadena;
	}
	
  private Fraccion solicitarFraccion(String solicitud) {
    Fraccion f = null;
    int numerador;
    int denominador;
    numerador = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numerador",solicitud,JOptionPane.QUESTION_MESSAGE));  
    denominador = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el denominador",solicitud,JOptionPane.QUESTION_MESSAGE));
      
    //validar q no metan un ceros o caracteres no numericos
    if(denominador == 0)
      JOptionPane.showMessageDialog(null, "No se permiten ceros en el denominador", "Error de Validación",JOptionPane.ERROR_MESSAGE);
    else 
      f = new Fraccion(numerador, denominador);
      
    return f;
  }

  private void menuSimplificar() throws NumberFormatException, IOException  {
    Fraccion f;
    Fraccion respuesta;
    Fraccion resultado;
    
    vista.getLblOperacion().setText("Simplificar fraccion");
    
    f = solicitarFraccion("Introduce una fraccion");
    if(f != null) {
      vista.getLblOperando1().setText(f.toString());
      
      resultado = f.simplificar();
      
      respuesta = solicitarFraccion("Introduce la misma fraccion simplificada");
      vista.getLblRespuesta().setText(respuesta.toString());
      
      if(respuesta.getNumerador()==resultado.getNumerador() && respuesta.getDenominador()==resultado.getDenominador()){
        JOptionPane.showMessageDialog(null, "La respuesta es correcta.","Bien!!!",JOptionPane.INFORMATION_MESSAGE);
      }else {
        JOptionPane.showMessageDialog(null, "La respuesta es incorrecta.","Mal!!!",JOptionPane.WARNING_MESSAGE);
      }
      
      vista.getLblResultado().setText(resultado.toString());
    }
    

  }

  private void menuMultiplicarFracciones() throws NumberFormatException, IOException  {
    vista.getLblOperacion().setText("Multiplicar Fracciones");
    
    Fraccion f1 = subMenuFraccion ("Fraccion 1");
    
    if(f1 != null) {
      vista.getLblOperando1().setText(Integer.toString(f1.getNumerador()).concat("/").concat(Integer.toString(f1.getDenominador())));
      
      Fraccion f2 = subMenuFraccion ("Fraccion 2");
      
      if(f2 != null) {
        vista.getLblOperando2().setText(Integer.toString(f2.getNumerador()).concat("/").concat(Integer.toString(f2.getDenominador())));
        
        Fraccion respuesta = subMenuFraccion("Resultado");
        
        vista.getLblRespuesta().setText(Integer.toString(respuesta.getNumerador()).concat("/").concat(Integer.toString(respuesta.getDenominador())));
        
        Fraccion resultado = Fraccion.multiplicacion(f1, f2);
        
        vista.getLblResultado().setText(Integer.toString(resultado.getNumerador()).concat("/").concat(Integer.toString(resultado.getDenominador())));
        
        if (respuesta.getNumerador() == resultado.getNumerador() && respuesta.getDenominador() == resultado.getDenominador())
          JOptionPane.showMessageDialog(null, "La respuesta es correcta", "¡Acertaste!", JOptionPane.INFORMATION_MESSAGE);
        else 
          JOptionPane.showMessageDialog(null, "Respuesta incorrecta", "¡Fallaste!", JOptionPane.WARNING_MESSAGE);
      }
        
    }
  }

  private void menuDividirFracciones() throws NumberFormatException, IOException  {
    vista.getLblOperacion().setText("Dividir Fracciones");
    
    Fraccion f1 = subMenuFraccion ("Fraccion 1");
    
    if(f1 != null) {
      vista.getLblOperando1().setText(Integer.toString(f1.getNumerador()).concat("/").concat(Integer.toString(f1.getDenominador())));
      
      Fraccion f2 = subMenuFraccion ("Fraccion 2");
      
      if(f2 != null) {
        vista.getLblOperando2().setText(Integer.toString(f2.getNumerador()).concat("/").concat(Integer.toString(f2.getDenominador())));
        
        Fraccion respuesta = subMenuFraccion("Resultado");
        
        vista.getLblRespuesta().setText(Integer.toString(respuesta.getNumerador()).concat("/").concat(Integer.toString(respuesta.getDenominador())));
        
        Fraccion resultado = Fraccion.division(f1, f2);
        
        vista.getLblResultado().setText(Integer.toString(resultado.getNumerador()).concat("/").concat(Integer.toString(resultado.getDenominador())));
        
        if (respuesta.getNumerador() == resultado.getNumerador() && respuesta.getDenominador() == resultado.getDenominador())
          JOptionPane.showMessageDialog(null, "La respuesta es correcta", "¡Acertaste!", JOptionPane.INFORMATION_MESSAGE);
        else 
          JOptionPane.showMessageDialog(null, "Respuesta incorrecta", "¡Fallaste!", JOptionPane.WARNING_MESSAGE);
      }
        
    }
  }

}// clase
