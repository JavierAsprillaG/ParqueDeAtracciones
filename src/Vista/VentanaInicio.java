package Vista;

import javax.swing.*;
import javax.swing.border.Border;
import Control.*;

import java.awt.*;
public class VentanaInicio extends JFrame implements InterfazVista{
	public static Container cont;
	JPanel p1,p2,p3,p4,p5,p6;
	JLabel l1,l2,l3,l4;
	public static JTextField t1,t2;
	public static JButton bfoto,b2,b3,b4;
	JTextArea textarea;
	Border blackline, raisedetched, loweredetched,
    raisedbevel, loweredbevel, empty;
	Border compound;
	Border redline = BorderFactory.createLineBorder(Color.red);

	public VentanaInicio(){
		super("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cont = this.getContentPane();
		cont.setLayout(new GridLayout(1,2));
		t1 = new JTextField(); t2 = new JTextField();
		t1.setEnabled(false); t2.setEnabled(false);
		l1 = new JLabel("Bienvenido!",SwingConstants.CENTER);l2 = new JLabel("Ingrese su c�digo de usuario y su clave!",SwingConstants.CENTER);
		l3 = new JLabel("Usuario: ",SwingConstants.CENTER); l4 = new JLabel("Contrase�a: ",SwingConstants.CENTER);
		p1 = new JPanel();p2 = new JPanel();p3 = new JPanel();
		p4 = new JPanel();p5 = new JPanel();p6 = new JPanel();
		b2 = new JButton("Administrador"); b3 = new JButton("UsuarioComun");b4 = new JButton("Salir");
		p1.setLayout(new BorderLayout());p4.setLayout(new BorderLayout(0,0));
		p2.setLayout(new BorderLayout());p5.setLayout(new BorderLayout(0,0));
		p6.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		
		constraints.gridx = 0; // El boton empieza b2 la columna cero.
		constraints.gridy = 0; // El �rea de boton b2 empieza en la fila cero
		constraints.gridwidth = 1; // El �rea de texto ocupa una columnas.
		constraints.gridheight = 1; // El �rea de texto ocupa una filas.
		constraints.weighty = 1.0;
		constraints.weightx = 1.0;
		constraints.fill = GridBagConstraints.NONE;
		p6.add(b2,constraints);
		constraints.gridx = 1; // El boton empieza b2 la columna cero.
		constraints.gridy = 0; // El �rea de boton b2 empieza en la fila cero
		constraints.gridwidth = 1; // El �rea de texto ocupa una columnas.
		constraints.gridheight = 1; // El �rea de texto ocupa una filas.
		p6.add(b3,constraints);
		constraints.gridx = 0; // El boton empieza b2 la columna cero.
		constraints.gridy = 1; // El �rea de boton b2 empieza en la fila cero
		constraints.gridwidth = 2; // El �rea de texto ocupa una columnas.
		constraints.gridheight = 1; // El �rea de texto ocupa una filas.
		constraints.fill = GridBagConstraints.HORIZONTAL;
		p6.add(l2,constraints);
		constraints.gridx = 0; // El boton empieza b2 la columna cero.
		constraints.gridy = 2; // El �rea de boton b2 empieza en la fila cero
		constraints.gridwidth = 1; // El �rea de texto ocupa una columnas.
		constraints.gridheight = 1; // El �rea de texto ocupa una filas.	
		p6.add(l3,constraints);
		constraints.gridx = 1; // El boton empieza b2 la columna cero.
		constraints.gridy = 2; // El �rea de boton b2 empieza en la fila cero
		constraints.gridwidth = 1; // El �rea de texto ocupa una columnas.
		constraints.gridheight = 1; // El �rea de texto ocupa una filas.
		p6.add(t1,constraints);
		constraints.gridx = 0; // El boton empieza b2 la columna cero.
		constraints.gridy = 3; // El �rea de boton b2 empieza en la fila cero
		constraints.gridwidth = 1; // El �rea de texto ocupa una columnas.
		constraints.gridheight = 1; // El �rea de texto ocupa una filas.
		p6.add(l4,constraints);
		constraints.gridx = 1; // El boton empieza b2 la columna cero.
		constraints.gridy = 3; // El �rea de boton b2 empieza en la fila cero
		constraints.gridwidth = 1; // El �rea de texto ocupa una columnas.
		constraints.gridheight = 1; // El �rea de texto ocupa una filas.
		p6.add(t2,constraints);
		constraints.gridx = 0; // El boton empieza b2 la columna cero.
		constraints.gridy = 4; // El �rea de boton b2 empieza en la fila cero
		constraints.gridwidth = 2; // El �rea de texto ocupa una columnas.
		constraints.gridheight = 1; // El �rea de texto ocupa una filas.
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.CENTER;
		p6.add(b4,constraints);	
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		empty = BorderFactory.createEmptyBorder(15,15,15,15);
		compound = BorderFactory.createCompoundBorder(
                raisedbevel, loweredbevel);
		compound = BorderFactory.createCompoundBorder(
                redline, compound);
		compound = BorderFactory.createCompoundBorder(
                empty, compound);
		p6.setBorder(compound);
		p5.setBorder(compound);
		p2.setBorder(compound);
		p3.setBorder(compound);
		p4.setBorder(compound);
		p1.setBorder(compound);
		l1.setFont(new Font("Courier New", Font.ITALIC, 55));
		textarea = new JTextArea("Esta aplicacion tiene como fin ayudar\na la administracion de un parque "
				+ "de diversiones\ncon diferentes tipos de locales y trabajadores."
				+ "\nPara ingresar como administrador d� clic\n en Administrador y luego llene los campos usuario y contrase�a"
				+ "\ny d� clic en Administrador Complete y Nuevamente Clic"
				+ "\nPara entrar como otro tipo de usuario d� clic\n en UsuarioComun y luego llene los campos usuario y contrase�a"
				+ "\ny d� clic en Usuario Complete y Nuevamente Clic");
		textarea.setFont(new Font("Arial", Font.PLAIN, 16));
		textarea.setEditable(false);
		JScrollPane scrollArea = new JScrollPane();
		scrollArea.setViewportView(textarea);		
		bfoto = new JButton("Haga clic "
				+ "para ver fotos de los autores del sistema");
		b2 = new JButton("Administrador");
		b2.addActionListener(new ControlLogeo());
		b3 = new JButton("UsuarioComun");
		b3.addActionListener(new ControlLogeo());
		p4.add(bfoto);
		p5.add(scrollArea);
		p3.add(l1);
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
	public void salir() {
		setVisible(false);
		dispose();
	}
	
}
