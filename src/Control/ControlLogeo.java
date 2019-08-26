package Control;

import java.awt.event.ActionEvent;

import Vista.VentanaInicio;
import baseDatos.Datos;

public class ControlLogeo extends ControlEstandar{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("#HOLLA");
		String selectedOpc = e.getActionCommand();
		//VentanaInicio.cont.removeAll();
		if(selectedOpc.equals("Administrador")) {
			VentanaInicio.b2.setText("Administrador Complete y Nuevamente Clic");
			VentanaInicio.t1.setEnabled(true);
			VentanaInicio.t2.setEnabled(true);
		}
		else if(selectedOpc.equals("Salir")) {
			Datos.guardarDatos();
			
		}
		else if(selectedOpc.equals("UsuarioComun")){
			
		}
	}

}
