package Cheesecake.proyectoFraccionesGrupal;

import java.awt.Toolkit;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear un objeto de la clase VentanaPrincipal
       VentanaPrincipal vista  = new VentanaPrincipal();
       vista.setVisible(true);
       //Cambiar icono Marco
       vista.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Cheesecake/proyectoFraccionesGrupal/favGrupo.png")));
        //Crear un objeto de la clase Controller
       Controlador controlador  = new Controlador(vista);
        //Vincular la vista y el controlador
        vista.vincularconControlador(controlador);
        
	}

}
