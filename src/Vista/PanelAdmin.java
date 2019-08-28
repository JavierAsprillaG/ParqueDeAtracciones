package Vista;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.*;

import Control.ControlEstandar;

public class PanelAdmin extends JPanel {
	JMenu bArchivo, bAyuda, bPyC;
	JMenuBar BarraH;
	JLabel saludo;

	public PanelAdmin() {
		bArchivo = new JMenu("Archivo");
		bPyC = new JMenu("Procesos y consultas");
		bAyuda = new JMenu("Ayuda");
		BarraH = new JMenuBar();
		saludo = new JLabel("Bienvenido Administrador Haga clic en procesos y consultas para seleccionar lo que desea");


		this.setLayout(new BorderLayout());
		BarraH.add(bArchivo);
		BarraH.add(bPyC);
		BarraH.add(bAyuda);
		add(BarraH, BorderLayout.NORTH);
		add(saludo, BorderLayout.CENTER);
		
	}
}