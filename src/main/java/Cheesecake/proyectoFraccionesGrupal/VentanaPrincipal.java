package Cheesecake.proyectoFraccionesGrupal;


import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;


public class VentanaPrincipal extends JFrame{
	private JPanel miPanel;//contenedor de los componentes
	private JMenuBar barraMenu;
	private JMenu menuPrincipal, menuAcercaDe;
	/*items del menu Principal*/
    private JMenuItem menuItemMcd,menuItemMcm,menuItemSimplificar,menuItemSumarFracciones,menuItemRestarFracciones,menuItemMultiplicarFracciones,menuItemDividirFracciones,menuItemDescomponernumeroenprimos;
    /*items del menu Acerca De...*/
    private JMenuItem menuItemAplicacion;
    private String informacionAplicacion="";
    /*Labels*/
    private JLabel lblFija1, lblOperacion,lblFija2,lblFija3,lblFija4,lblFija5,lblOperando1,lblOperando2,lblRespuesta,lblResultado;
    private JTextArea textArea;
    
    public VentanaPrincipal() {
    	iniciarComponentes();
   		//Asigna un titulo a la barra de titulo
		setTitle("App Fracciones 1.0");
		//tamaño de la ventana
		setSize(670, 450);
		//pone la ventana en el Centro de la pantalla
		setLocationRelativeTo(null);
		/*impide que la ventana cambie de tamaño*/
		setResizable(false);
    }
    
    private void iniciarComponentes() {
    	
    	/*Inicializamos el Mensaje del menu Acerca de...*/
		informacionAplicacion="Aplicacion para operar con Fracciones. \n";
		informacionAplicacion+="Autores: Alex, Javi, Leyre, Luis.\n\n\n";
		
		/*Inicia instancias de los componentes*/
		miPanel = new JPanel();
		miPanel.setLayout(null);
		barraMenu = new JMenuBar();
        menuPrincipal = new JMenu();
        menuAcercaDe = new JMenu();
  
        menuItemMcd = new JMenuItem();
        menuItemMcm = new JMenuItem();
        menuItemSimplificar = new JMenuItem();
        menuItemSumarFracciones = new JMenuItem();
        menuItemRestarFracciones = new JMenuItem();
        menuItemMultiplicarFracciones = new JMenuItem();
        menuItemDividirFracciones = new JMenuItem();
        menuItemDescomponernumeroenprimos = new JMenuItem();
        menuItemAplicacion = new JMenuItem();
        
        lblFija1 = new JLabel();
		lblOperacion = new JLabel();
		lblFija2 = new JLabel();
		lblFija3 = new JLabel();
		lblFija4 = new JLabel();
		lblFija5 = new JLabel();
		lblOperando1 = new JLabel();
		lblOperando2 = new JLabel();
		lblRespuesta = new JLabel();
		lblResultado = new JLabel();
		textArea = new JTextArea();
		
		lblFija1.setBounds(10, 58, 85, 24);
		lblFija1.setFont(new Font("Consolas", Font.BOLD, 16));
		lblFija1.setText("Operacion");
		
		lblOperacion.setFont(new Font("Consolas", Font.PLAIN, 16));
		lblOperacion.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblOperacion.setBounds(10, 92, 623, 24);
		
		lblFija2.setFont(new Font("Consolas", Font.BOLD, 16));
		lblFija2.setBounds(10, 182, 96, 24);
		lblFija2.setText("Operando 1");
		
		lblFija3.setFont(new Font("Consolas", Font.BOLD, 16));
		lblFija3.setBounds(148, 182, 96, 24);
		lblFija3.setText("Operando 2");
		
		lblFija4.setFont(new Font("Consolas", Font.BOLD, 16));
		lblFija4.setBounds(287, 182, 85, 24);
		lblFija4.setText("Respuesta");
		
		lblFija5.setFont(new Font("Consolas", Font.BOLD, 16));
		lblFija5.setBounds(482, 182, 96, 24);
		lblFija5.setText("Resultado");
		
		lblOperando1.setFont(new Font("Consolas", Font.PLAIN, 16));
		lblOperando1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblOperando1.setBounds(10, 216, 96, 24);
		
		lblOperando2.setFont(new Font("Consolas", Font.PLAIN, 16));
		lblOperando2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblOperando2.setBounds(148, 216, 96, 24);
		
		lblRespuesta.setFont(new Font("Consolas", Font.PLAIN, 16));
		lblRespuesta.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblRespuesta.setBounds(287, 216, 151, 24);
		
		lblResultado.setFont(new Font("Consolas", Font.PLAIN, 16));
		lblResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResultado.setBounds(482, 216, 151, 24);
		
		textArea.setBounds(10, 260, 636, 142);
		textArea.setBackground(UIManager.getColor("Label.background"));
		
        /*Crea los items del menu Principal*/ 
        
        menuItemMcd.setText("Máximo comun divisor");
        menuPrincipal.add(menuItemMcd);
        menuPrincipal.addSeparator();
        
        menuItemMcm.setText("Mínimo comun múltiplo");
        menuPrincipal.add(menuItemMcm);
        menuPrincipal.addSeparator();
                       
        menuItemSimplificar.setText("Simplificar fraccion");
        menuPrincipal.add(menuItemSimplificar);
        menuPrincipal.addSeparator();
        
        menuItemSumarFracciones.setText("Sumar fracciones");
        menuPrincipal.add(menuItemSumarFracciones);
        menuPrincipal.addSeparator();
        
        menuItemRestarFracciones.setText("Restar fracciones");
        menuPrincipal.add(menuItemRestarFracciones);
        menuPrincipal.addSeparator();
        
        menuItemMultiplicarFracciones.setText("Multiplicar fracciones");
        menuPrincipal.add(menuItemMultiplicarFracciones);
        menuPrincipal.addSeparator();
        
        menuItemDividirFracciones.setText("Dividir fracciones");
        menuPrincipal.add(menuItemDividirFracciones);
        menuPrincipal.addSeparator();
        
        menuItemDescomponernumeroenprimos.setText("Descomponer un número en factores primos");
        menuPrincipal.add(menuItemDescomponernumeroenprimos);
        
      
        /*Crea los items del menu Acerca De...*/
        menuItemAplicacion.setText("Aplicación");
        menuAcercaDe.add(menuItemAplicacion);
        
        /*Agrega los Menus a la barra de Menu*/
        menuPrincipal.setText("Menu Principal");
        barraMenu.add(menuPrincipal);
       
        menuAcercaDe.setText("Acerca de...");
        barraMenu.add(menuAcercaDe);
        
        setJMenuBar(barraMenu);
        //test
        //miPanel.add(barraMenu);
        miPanel.add(lblFija1);
        miPanel.add(lblOperacion);
        miPanel.add(lblFija2);
        miPanel.add(lblFija3);
        miPanel.add(lblFija4);
        miPanel.add(lblFija5);
        miPanel.add(lblOperando1);
        miPanel.add(lblOperando2);
        miPanel.add(lblRespuesta);
        miPanel.add(lblResultado);
        miPanel.add(textArea);
       
        add(miPanel);
    }
   
    public void vincularconControlador(Controller c) {
    	//btnAdd.addActionListener(c);
       // btnAdd.setActionCommand("INSERTAR");
        
        menuItemMcd.addActionListener(c);
        menuItemMcm.addActionListener(c);              
        menuItemSimplificar.addActionListener(c); 
        menuItemSumarFracciones.addActionListener(c);
        menuItemMultiplicarFracciones.addActionListener(c);
        menuItemRestarFracciones.addActionListener(c);
        menuItemDividirFracciones.addActionListener(c);
        menuItemDescomponernumeroenprimos.addActionListener(c); 
        menuItemAplicacion.addActionListener(c);
    }

	/**
	 * @return the menuItemMcd
	 */
	public JMenuItem getMenuItemMcd() {
		return menuItemMcd;
	}

	/**
	 * @return the menuItemMcm
	 */
	public JMenuItem getMenuItemMcm() {
		return menuItemMcm;
	}

	/**
	 * @return the menuItemSimplificar
	 */
	public JMenuItem getMenuItemSimplificar() {
		return menuItemSimplificar;
	}

	/**
	 * @return the menuItemSumarFracciones
	 */
	public JMenuItem getMenuItemSumarFracciones() {
		return menuItemSumarFracciones;
	}

	/**
	 * @return the menuItemRestarFracciones
	 */
	public JMenuItem getMenuItemRestarFracciones() {
		return menuItemRestarFracciones;
	}

	/**
	 * @return the menuItemMultiplicarFracciones
	 */
	public JMenuItem getMenuItemMultiplicarFracciones() {
		return menuItemMultiplicarFracciones;
	}

	/**
	 * @return the menuItemDividirFracciones
	 */
	public JMenuItem getMenuItemDividirFracciones() {
		return menuItemDividirFracciones;
	}

	/**
	 * @return the menuItemDescomponernumeroenprimos
	 */
	public JMenuItem getMenuItemDescomponernumeroenprimos() {
		return menuItemDescomponernumeroenprimos;
	}

	/**
	 * @return the menuItemAplicacion
	 */
	public JMenuItem getMenuItemAplicacion() {
		return menuItemAplicacion;
	}

	/**
	 * @return the informacionAplicacion
	 */
	public String getInformacionAplicacion() {
		return informacionAplicacion;
	}

	/**
	 * @return the lblFija1
	 */
	public JLabel getLblFija1() {
		return lblFija1;
	}

	/**
	 * @param lblFija1 the lblFija1 to set
	 */
	public void setLblFija1(JLabel lblFija1) {
		this.lblFija1 = lblFija1;
	}

	/**
	 * @return the lblOperacion
	 */
	public JLabel getLblOperacion() {
		return lblOperacion;
	}

	/**
	 * @param lblOperacion the lblOperacion to set
	 */
	public void setLblOperacion(JLabel lblOperacion) {
		this.lblOperacion = lblOperacion;
	}

	/**
	 * @return the lblFija2
	 */
	public JLabel getLblFija2() {
		return lblFija2;
	}

	/**
	 * @param lblFija2 the lblFija2 to set
	 */
	public void setLblFija2(JLabel lblFija2) {
		this.lblFija2 = lblFija2;
	}

	/**
	 * @return the lblFija3
	 */
	public JLabel getLblFija3() {
		return lblFija3;
	}

	/**
	 * @param lblFija3 the lblFija3 to set
	 */
	public void setLblFija3(JLabel lblFija3) {
		this.lblFija3 = lblFija3;
	}

	/**
	 * @return the lblFija4
	 */
	public JLabel getLblFija4() {
		return lblFija4;
	}

	/**
	 * @param lblFija4 the lblFija4 to set
	 */
	public void setLblFija4(JLabel lblFija4) {
		this.lblFija4 = lblFija4;
	}

	/**
	 * @return the lblFija5
	 */
	public JLabel getLblFija5() {
		return lblFija5;
	}

	/**
	 * @param lblFija5 the lblFija5 to set
	 */
	public void setLblFija5(JLabel lblFija5) {
		this.lblFija5 = lblFija5;
	}

	/**
	 * @return the lblOperando1
	 */
	public JLabel getLblOperando1() {
		return lblOperando1;
	}

	/**
	 * @param lblOperando1 the lblOperando1 to set
	 */
	public void setLblOperando1(JLabel lblOperando1) {
		this.lblOperando1 = lblOperando1;
	}

	/**
	 * @return the lblOperando2
	 */
	public JLabel getLblOperando2() {
		return lblOperando2;
	}

	/**
	 * @param lblOperando2 the lblOperando2 to set
	 */
	public void setLblOperando2(JLabel lblOperando2) {
		this.lblOperando2 = lblOperando2;
	}

	/**
	 * @return the lblRespuesta
	 */
	public JLabel getLblRespuesta() {
		return lblRespuesta;
	}

	/**
	 * @param lblRespuesta the lblRespuesta to set
	 */
	public void setLblRespuesta(JLabel lblRespuesta) {
		this.lblRespuesta = lblRespuesta;
	}

	/**
	 * @return the lblResultado
	 */
	public JLabel getLblResultado() {
		return lblResultado;
	}

	/**
	 * @param lblResultado the lblResultado to set
	 */
	public void setLblResultado(JLabel lblResultado) {
		this.lblResultado = lblResultado;
	}

	/**
	 * @return the textArea
	 */
	public JTextArea gettextArea() {
		return this.textArea;
	}

	/**
	 * @param textArea the textArea to set
	 */
	public void settextArea(JTextArea textArea) {
		this.textArea = textArea;
	}
    
    
    
}//class
