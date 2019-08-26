package Vista;

import javax.swing.*;

import Control.ControlEstandar;

import java.awt.*;
public class VentanaInicio extends JFrame implements InterfazVista{
	Container cont = getContentPane();
	JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
	JLabel l1,l2,l3,l4;
	JButton bfoto,b2,b3,b4;
	JTextArea textarea;
	public VentanaInicio(){
		super("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cont.setLayout(new GridLayout(1,2));
		

		JTextField t1 = new JTextField(50); JTextField t2 = new JTextField(50);
		l1 = new JLabel("Bienvenido!");l2 = new JLabel("Ingrese su código de usuario y su clave!");
		l3 = new JLabel("Usuario: "); l4 = new JLabel("Contraseña: ");
		p1 = new JPanel();p2 = new JPanel();p3 = new JPanel();
		p4 = new JPanel();p5 = new JPanel();p6 = new JPanel();
		b2 = new JButton("Administrador"); b3 = new JButton("UsuarioComun");b4 = new JButton("Salir");
		
		p1.setLayout(new BorderLayout());p4.setLayout(new BorderLayout(0,0));
		p2.setLayout(new BorderLayout());p5.setLayout(new BorderLayout(0,0));
		p6.setLayout(new GridLayout(8,1,5,5));
		p7 = new JPanel();p8 = new JPanel();p9 = new JPanel();
		p10 = new JPanel();
		p7.add(b2);p7.add(b3);
		p8.add(l2);
		p9.setLayout(new GridLayout(2,2,5,5));
		p9.add(l3);p9.add(t1);
		p9.add(l4);p9.add(t2);
		p10.add(b4);
		p3.add(l1);
		p6.add(p7);p6.add(p8);p6.add(p9);p6.add(p10);
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
		this.setSize(900, 700);
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
