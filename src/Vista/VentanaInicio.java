package Vista;

import javax.swing.*;

import Control.ControlEstandar;

import java.awt.*;
public class VentanaInicio extends JFrame implements InterfazVista{
	Container cont = getContentPane();
	JPanel p1,p2,p3,p4,p5,p6;
	JLabel l1,l2,l3,l4;
	JButton bfoto,b2,b3,b4;
	JTextArea textarea;
	public VentanaInicio(){
		super("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cont.setLayout(new GridLayout(1,2));
		JTextField t1 = new JTextField(); JTextField t2 = new JTextField();
		l1 = new JLabel("Benvenuti!");l2 = new JLabel("Ingrese su código de usuario y su clave!",SwingConstants.CENTER);
		l3 = new JLabel("Usuario: ",SwingConstants.CENTER); l4 = new JLabel("Contraseña: ",SwingConstants.CENTER);
		p1 = new JPanel();p2 = new JPanel();p3 = new JPanel();
		p4 = new JPanel();p5 = new JPanel();p6 = new JPanel();
		b2 = new JButton("Administrador"); b3 = new JButton("UsuarioComun");b4 = new JButton("Salir");
		
		p1.setLayout(new BorderLayout());p4.setLayout(new BorderLayout(0,0));
		p2.setLayout(new BorderLayout());p5.setLayout(new BorderLayout(0,0));
		p6.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0; // El boton empieza b2 la columna cero.
		constraints.gridy = 0; // El área de boton b2 empieza en la fila cero
		constraints.gridwidth = 1; // El área de texto ocupa una columnas.
		constraints.gridheight = 1; // El área de texto ocupa una filas.
		constraints.weighty = 1.0;
		constraints.weightx = 1.0;
		constraints.fill = GridBagConstraints.BOTH;
		p6.add(b2,constraints);
		constraints.gridx = 1; // El boton empieza b2 la columna cero.
		constraints.gridy = 0; // El área de boton b2 empieza en la fila cero
		constraints.gridwidth = 1; // El área de texto ocupa una columnas.
		constraints.gridheight = 1; // El área de texto ocupa una filas.
		p6.add(b3,constraints);
		constraints.gridx = 0; // El boton empieza b2 la columna cero.
		constraints.gridy = 1; // El área de boton b2 empieza en la fila cero
		constraints.gridwidth = 2; // El área de texto ocupa una columnas.
		constraints.gridheight = 1; // El área de texto ocupa una filas.
		constraints.fill = GridBagConstraints.HORIZONTAL;

		p6.add(l2,constraints);
		constraints.gridx = 0; // El boton empieza b2 la columna cero.
		constraints.gridy = 2; // El área de boton b2 empieza en la fila cero
		constraints.gridwidth = 1; // El área de texto ocupa una columnas.
		constraints.gridheight = 1; // El área de texto ocupa una filas.
		
		p6.add(l3,constraints);
		constraints.gridx = 1; // El boton empieza b2 la columna cero.
		constraints.gridy = 2; // El área de boton b2 empieza en la fila cero
		constraints.gridwidth = 1; // El área de texto ocupa una columnas.
		constraints.gridheight = 1; // El área de texto ocupa una filas.
		p6.add(t1,constraints);
		constraints.gridx = 0; // El boton empieza b2 la columna cero.
		constraints.gridy = 3; // El área de boton b2 empieza en la fila cero
		constraints.gridwidth = 1; // El área de texto ocupa una columnas.
		constraints.gridheight = 1; // El área de texto ocupa una filas.
		p6.add(l4,constraints);
		constraints.gridx = 1; // El boton empieza b2 la columna cero.
		constraints.gridy = 3; // El área de boton b2 empieza en la fila cero
		constraints.gridwidth = 1; // El área de texto ocupa una columnas.
		constraints.gridheight = 1; // El área de texto ocupa una filas.
		p6.add(t2,constraints);
		constraints.gridx = 0; // El boton empieza b2 la columna cero.
		constraints.gridy = 4; // El área de boton b2 empieza en la fila cero
		constraints.gridwidth = 2; // El área de texto ocupa una columnas.
		constraints.gridheight = 1; // El área de texto ocupa una filas.
		constraints.fill = GridBagConstraints.BOTH;
		p6.add(b4,constraints);
		
		l1.setFont(new Font("Courier New", Font.ITALIC, 75));
		textarea = new JTextArea("Esta aplicacion tiene como fin ayudar\na la administracion de un parque "
				+ "de diversiones\ncon diferentes tipos de locales y trabajadores."
				+ "\nPara ingresar como administrador dé clic\n en Administrador y luego llene los campos usuario y contraseña"
				+ "\ny dé clic en Administrador Complete y Nuevamente Clic"
				+ "\nPara entrar como otro tipo de usuario dé clic\n en UsuarioComun y luego llene los campos usuario y contraseña"
				+ "\ny dé clic en Usuario Complete y Nuevamente Clic");
		textarea.setFont(new Font("Arial", Font.PLAIN, 16));
		textarea.setEditable(false);
		JScrollPane scrollArea = new JScrollPane();
		scrollArea.setViewportView(textarea);
		
		bfoto = new JButton("Haga clic "
				+ "para ver fotos de los autores del sistema");
		b2 = new JButton("Administrador");
		b3 = new JButton("UsuarioComun");
		p4.add(bfoto);
		p5.add(scrollArea);
		p1.add(p3,  BorderLayout.NORTH);p1.add(p4,BorderLayout.CENTER);
		p2.add(p5,BorderLayout.NORTH);p2.add(p6,BorderLayout.CENTER);
		cont.add(p1);
		cont.add(p2);
		this.setPreferredSize(new Dimension(900, 700));
	}
	
//	public static void main(String[] args) {
//		VentanaInicio v = new VentanaInicio();
//		v.setVisible(true);
//	}

	@Override
	public void setControlador(ControlEstandar c) {
		// TODO Auto-generated method stub
		
	}

	public void arranca() {
		pack();// coloca los componentes
		setLocationRelativeTo(null);// centra la ventana en la pantalla
		setVisible(true);// visualiza la ventana
	}
	
}
