package Cheesecake.proyectoFraccionesGrupal;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear un objeto de la clase VentanaPrincipal
       VentanaPrincipal vista  = new VentanaPrincipal();
       vista.setVisible(true);
        //Crear un objeto de la clase Controller
       Controlador controlador  = new Controlador(vista);
        //Vincular la vista y el controlador
        vista.vincularconControlador(controlador);
	}

}
