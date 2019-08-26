package baseDatos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.io.File;

import gestorAplicacion.*;
import gestorAplicacion.Infraestructuras.*;
import gestorAplicacion.Personas.*;

public class Datos {
	public static HashMap<String, Usuario> usuarios = new HashMap<String, Usuario>();
	public static HashMap<String, Usuario> admins = new HashMap<String, Usuario>();
	public static HashMap<String, Usuario> vendedors = new HashMap<String, Usuario>();
	public static HashMap<String, Usuario> operarios = new HashMap<String, Usuario>();
	public static HashMap<String, String> operations = new HashMap<String, String>();
	public static HashMap<String, Atraccion> atracciones = new HashMap<String, Atraccion>();
	public static HashMap<String, Registro> registro = new HashMap<String, Registro>();
	public static HashMap<String, Tienda> tiendas = new HashMap<String, Tienda>();
	public static HashMap<String,Producto> listaProductos = new HashMap<String,Producto>();
	
	public static void cargarDatos() {
		crearArchivYDirects();
		String ruta = System.getProperty("user.dir")+"\\src\\temp\\";
		cargarProductos(ruta);
		cargarUsuarios(ruta);
		cargarAdmins(ruta);
		cargarEmp(ruta);
		cargarAtracciones(ruta);
		cargarRegistros(ruta);
		cargarTiendas(ruta);
	}
	
	private static void cargarAdmins(String ruta) {
		try{
            FileReader fr = new FileReader(ruta+"adminUsers.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
            	if (!line.isEmpty()) {
            		String [] user = line.split(";");
            		String username = user[0];
            		String pass = user[1];
            		String email = user[2];
            		String name = user[3];
            		String ced = user[4];
            		String tel = user[5];
            		int suel = Integer.parseInt((user[7]));
            		String lug = user[8];
            		new Administrador(name, tel, ced, username,email,pass, suel,lug);
            	}
            }
            br.close();
        }catch(Exception e){
        	//Error al leer
        }
	}
	
	private static void cargarEmp(String ruta) {
		try{
            FileReader fr = new FileReader(ruta+"empleados.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
            	if (!line.isEmpty()) {
            		String [] user = line.split(";");
            		String username = user[0];
            		String pass = user[1];
            		String email = user[2];
            		String name = user[3];
            		String ced = user[4];
            		String tel = user[5];
            		int suel = Integer.parseInt((user[7]));
            		String lug = user[8];
            		new Empleado(name, tel, ced,username,email,pass, suel,lug);
            	}
            }
            br.close();
        }catch(Exception e){
        	//Error al leer
        }
	}
	
	private static void cargarUsuarios(String ruta) {
		try{
            FileReader fr = new FileReader(ruta+"usuarios.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
            	if (!line.isEmpty()) {
            		String [] user = line.split(";");
            		String username = user[0];
            		String pass = user[1];
            		String email = user[2];
            		String name = user[3];
            		String ced = user[4];
            		String tel = user[5];
            		new Usuario(name,ced,tel, username, email, pass);
            	}
            }
            br.close();
        }catch(Exception e){
            //Error al leer
        }
	}
	
	
	public static void guardarDatos() {
		crearArchivYDirects();
		String ruta = System.getProperty("user.dir")+"\\src\\temp\\";
		guardarProductos(ruta);
		guardarUsuarios(ruta);
		guardarAtracciones(ruta);
		guardarRegistro(ruta);
		guardarTiendas(ruta);
	}
	
	private static void guardarAtracciones(String ruta) {
		try {
			FileWriter fw = new FileWriter(ruta+"atracciones.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			for (Map.Entry<String, Atraccion> aa : atracciones.entrySet()) {
				Atraccion at = aa.getValue();
				String line = at.getNombre()+";";
				//line += at.getGanancias()+";";
				line += at.getID()+";";
				line += at.getCapacidad()+";";
				line += at.getEstado()+";";
				pw.println(line);
			}
			pw.close();
		}
		
		catch(Exception e){
			
		}
	}
	
	private static void cargarAtracciones(String ruta) {
		try{
            FileReader fr = new FileReader(ruta+"usuarios.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
            	if (!line.isEmpty()) {
            		String [] regis = line.split(";");
            		String nombre = regis[0];
            		String id = regis[1];
            		int gastos = Integer.parseInt(regis[2]);
            		int ingresos = Integer.parseInt(regis[3]);
            		int cap = Integer.parseInt(regis[4]);
            		boolean est = Boolean.parseBoolean(regis[5]);
            		int ganancias = ingresos - gastos;
            		new Atraccion(id, nombre, ganancias, cap, est);
            		}
            }
            br.close();
        }catch(Exception e){
            //Error al leer
        }
	}
	
	private static void guardarProductos(String ruta) {
		try {
			FileWriter fw = new FileWriter(ruta+"productos.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			for (Map.Entry<String, Producto> r : listaProductos.entrySet()) {
				Producto pro = r.getValue();
				String line = pro.getCodigo()+";";
				line += pro.getNombre()+";";
				line += pro.getPrecio()+";";
				pw.println(line);
			}
			pw.close();
		}
		
		catch(Exception e){
			
		}
	}
	
	private static void cargarTiendas(String ruta) {
		try{
            FileReader fr = new FileReader(ruta+"productos.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
            	if (!line.isEmpty()) {
            		String [] tienda = line.split(";");
            		String id = tienda[0];
            		String nombre = tienda[1];
            		double ganancias = Double.parseDouble(tienda[3]);
            		new Producto(id,nombre,ganancias);
            	}
            }
            br.close();
        }catch(Exception e){
            //Error al leer
        }
	}
	
	private static void guardarTiendas(String ruta) {
		try {
			FileWriter fw = new FileWriter(ruta+"tiendas.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			for (Map.Entry<String, Tienda> r : tiendas.entrySet()) {
				Tienda pro = r.getValue();
				String line = pro.getID()+";";
				line += pro.getNombre()+";";
				line += pro.getGanancias()+";";
				pw.println(line);
			}
			pw.close();
		}
		
		catch(Exception e){
			
		}
	}
	
	private static void cargarProductos(String ruta) {
		try{
            FileReader fr = new FileReader(ruta+"productos.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
            	if (!line.isEmpty()) {
            		String [] prod = line.split(";");
            		String nombre = prod[1];
            		String codigo = prod[0];
            		double valor = Double.parseDouble(prod[2]);
            		new Producto(codigo,nombre,valor);
            	}
            }
            br.close();
        }catch(Exception e){
            //Error al leer
        }
	}
	
	private static void guardarRegistro(String ruta) {
		try {
			FileWriter fw = new FileWriter(ruta+"registro.txt");
			PrintWriter pw = new PrintWriter(fw);
			boolean b = true;
			for (Map.Entry<String, Registro> r : registro.entrySet()) {
				if(b) {
					Registro at = r.getValue();
					String line = at.getIngresos()+";";
					line += at.getGastos()+";";
					line += at.getIdGeneral()+";";
					b=false;
					pw.println(line);
				}
				else {
					Registro at = r.getValue();
					String line = at.getidRegistro()+";";
					line += at.getValor()+";";
					line += at.getIdDetalle()+";";
					pw.println(line);
				}
			}
			pw.close();
		}
		
		catch(Exception e){
			
		}
	}
	
	
	private static void cargarRegistros(String ruta) {
		try{
            FileReader fr = new FileReader(ruta+"registro.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            boolean b = true;
            while((line = br.readLine()) != null){
            	if (!line.isEmpty()) {
            		if(b) {
            			String [] regstro = line.split(";");
            			double gastos = Double.parseDouble(regstro[0]);
            			double ingres = Double.parseDouble(regstro[1]);
            			int idGen = Integer.parseInt(regstro[2]);
            			Registro r = new Registro();
            			r.setGastos(gastos);
            			r.setIngresos(ingres);
            			r.setIdGeneral(idGen);
            			b = false;
            		}
            		else{
            			String [] regstro = line.split(";");
            			int idRegis = Integer.parseInt(regstro[0]);
            			double val = Double.parseDouble(regstro[1]);
            			String idDetall = regstro[2];
            			new Registro(idRegis,val,idDetall);
            		}
            	}
            }
            br.close();
        }catch(Exception e){
            //Error al leer
        }
	}
	
	private static void guardarUsuarios(String ruta){
		try {
			FileWriter fwEmp = new FileWriter(ruta+"empleados.txt");
            PrintWriter pwEmp = new PrintWriter(fwEmp);
            FileWriter fw = new FileWriter(ruta+"usuarios.txt");
            FileWriter fwAdmin = new FileWriter(ruta+"adminUsers.txt");
            PrintWriter pw = new PrintWriter(fw);
            PrintWriter pwAdmin = new PrintWriter(fwAdmin);
    		for (Map.Entry<String, Usuario> user : usuarios.entrySet()) {
    			Usuario userObj = user.getValue();
    			String line = userObj.getUsername()+";";
    			line += userObj.getContrasena()+";";
    			line += userObj.getEmail()+";";
    			line += userObj.getNombre()+";";
				line += userObj.getCedula()+";";
				line += userObj.getTelefono()+";";
				

    			if(userObj instanceof Empleado) {
					line += ((Empleado) userObj).getSueldo()+";";
					line += ((Empleado) userObj).getLugar()+";";
    				if(userObj instanceof Administrador){
    					pwAdmin.println(line);
    				}else {
    					pwEmp.println(line);
    				}
				}else {
					pw.println(line);
    			}
    		}
            pw.close();
            pwAdmin.close();
            pwEmp.close();
            
        } catch (IOException ioObj) {
        	//Ocurrio algo al guardar en txt los datos
        }
	}
	
	private static void crearArchivYDirects() {
		try {
		String ruta = System.getProperty("user.dir")+"\\src\\temp\\";
		File directory = new File(ruta);
	    if (! directory.exists()){
	        directory.mkdir();
	    }
		File usersRegisteredFile = new File(ruta+"users.txt");
		File adminUsersFile = new File(ruta+"adminUsers.txt");
		File usersMenus = new File(ruta+"usersMenus.txt");
		File atracc = new File(ruta+"atracciones.txt");
		File products = new File(ruta+"productos.txt");
		File register = new File(ruta+"registro.txt");
		File tien = new File(ruta+"tiendas.txt");
		usersRegisteredFile.createNewFile();
		adminUsersFile.createNewFile();
		usersMenus.createNewFile();
		register.createNewFile();
		products.createNewFile();
		atracc.createNewFile();
		tien.createNewFile();
		}
		catch(IOException e){
			//Ocurrio algo al crear las carpetas y los archivos
		}
	}
}
