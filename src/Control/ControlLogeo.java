package Control;

import java.awt.event.ActionEvent;

import ErroresAplicacion.Exception_Informacion_Usuario;
import Vista.InterfazVendedor;
import Vista.PanelVendedor;
import Vista.VentanaInicio;
import baseDatos.Datos;
import uiMain.Main.Main;

public class ControlLogeo extends ControlEstandar{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("#HOLLA");
		String selectedOpc = e.getActionCommand();
		//VentanaInicio.cont.removeAll();
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
			System.out.println("#s");
			//Si se le da click por segunda vez se debe comprobar que los datos se encuentren ingresados de 
			//manera correcta con manejo de errores para el administrador
		}
		
			if(selectedOpc.equals("Usuario Complete y Nuevamente Clic")){
				System.out.println("#s");
				VentanaInicio.l2.setText("Informacion ingresada es incorrecta ");
				Main.v.cont.removeAll();
				Main.v.cont.add(new PanelVendedor());
				Main.v.pack();
				//InterfazVendedor c = new InterfazVendedor();
				//Si se le da click por segunda vez se debe comprobar que los datos se encuentren ingresados de 
				//manera correcta con manejo de errores para el usuario comun
			}

		
		}
			
	

}
