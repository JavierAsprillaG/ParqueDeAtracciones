package Control;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import Modelo.ErroresAplicacion.Exception_Informacion_Usuario;
import Vista.*;
import Vista.VentanaInicio;
import Modelo.Main.Main;
import Modelo.Personas.*;
import Modelo.baseDatos.Datos;

public class ControlLogeo extends ControlEstandar{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String selectedOpc = e.getActionCommand();
		if(selectedOpc.equals("Administrador")) {
			VentanaInicio.b2.setText("Administrador Complete y Nuevamente Clic");
			VentanaInicio.b3.setText("UsuarioComun");
			VentanaInicio.t1.setEnabled(true);
			VentanaInicio.t2.setEnabled(true);
			VentanaInicio.t1.setVisible(true);
			VentanaInicio.t2.setVisible(true);
			VentanaInicio.l3.setVisible(true);
			VentanaInicio.l4.setVisible(true);
			VentanaInicio.l2.setVisible(true);
		}
		else if(selectedOpc.equals("Salir")) {
			Datos.guardarDatos();
			Main.v.dispose();
			System.exit(0);
		}
		else if(selectedOpc.equals("UsuarioComun")){
			VentanaInicio.b2.setText("Administrador");
			VentanaInicio.b3.setText("Usuario Complete y Nuevamente Clic");
			VentanaInicio.t1.setEnabled(true);
			VentanaInicio.t2.setEnabled(true);
			VentanaInicio.t1.setVisible(true);
			VentanaInicio.t2.setVisible(true);
			VentanaInicio.l3.setVisible(true);
			VentanaInicio.l4.setVisible(true);
			VentanaInicio.l2.setVisible(true);
		}
		else if(selectedOpc.equals("Administrador Complete y Nuevamente Clic")){
			String username=Main.v.t1.getText();
			String passw=Main.v.t2.getText();
			if(Usuario.login(username, passw)) {//Try
				Main.v.cont.removeAll();
				Main.v.cont.add(new PanelAdmin());
				Main.v.pack();
			}else {
				JOptionPane.showMessageDialog(null, "Informacion ingresada no es correcta", "Datos Incorrectos", JOptionPane.WARNING_MESSAGE);			
			}
			
		}
		
		else if(selectedOpc.equals("Usuario Complete y Nuevamente Clic")){
			String username=Main.v.t1.getText();
			String passw=Main.v.t2.getText();
			if(Usuario.login(username, passw)) {//Try
				Main.v.cont.removeAll();
				Main.v.cont.add(new PanelAdmin());
				Main.v.pack();
			}else {
				JOptionPane.showMessageDialog(null, "Informacion ingresada no es correcta", "Datos Incorrectos", JOptionPane.WARNING_MESSAGE);			
			}
			
		}

//			try {
				if(selectedOpc.equals("Usuario Complete y Nuevamente Clic")){
					VentanaInicio.t2.getText();
				}
//			}
//			catch(Exception_Informacion_Usuario R){
//				JOptionPane.showMessageDialog(null, "                 Informacion No ingresada "
//						+ "\n Por favor llene todos los campos para continuar ", "Error faltan datos ", JOptionPane.WARNING_MESSAGE);
//			}
			
				if(selectedOpc.equals("Usuario Complete y Nuevamente Clic")){
					System.out.println("#s");
					VentanaInicio.l2.setText("Informacion ingresada es incorrecta ");
					Main.v.cont.removeAll();
					Main.v.cont.add(new PanelVendedor());
					Main.v.pack();
					JOptionPane.showMessageDialog(null, "                 Informacion No ingresada "
							+ "\n Por favor llene todos los campos para continuar ", "Error faltan datos ", JOptionPane.WARNING_MESSAGE);
					//Si se le da click por segunda vez se debe comprobar que los datos se encuentren ingresados de 
					//manera correcta con manejo de errores para el usuario comun
				}
		}
			
	

}
