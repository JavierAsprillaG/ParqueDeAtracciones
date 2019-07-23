package baseDatos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.io.File;

import com.sun.java.util.jar.pack.Package.File;

import gestorAplicacion.Usuario;
import uiMain.menuconsola.MenuDeConsola;
public class Datos {
	public static HashMap<String, Usuario> usuarios = new HashMap<String, Usuario>();
	
	public static void cargarDatos() {
		createFilesAndDirs();
		String ruta = System.getProperty("user.dir")+"\\src\\temp\\";
		cargarUsuarios(ruta);
		cargarAdmins(ruta);
		cargarMenus(ruta);
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
            		String name = user[1];
            		String email = user[2];
            		String password = user[3];
            		new AdminUser(name, username, email, password);
            	}
            }
            br.close();
        }catch(Exception e){
        	//Error al leer
        }
	}
	
	private static void cargarMenus(String ruta) {
		try{
            FileReader fr = new FileReader(ruta+"usersMenus.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
            	if (!line.isEmpty()) {
            		String [] menu = line.split(";");
            		Usuario user = Usuario.getUsuarioPorUsername(menu[0]);
            		//slice de arrays
            		String[] operations = Arrays.copyOfRange(menu, 1, menu.length);
            		MenuDeConsola.newMenu(user, operations);
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
            		String name = user[1];
            		String email = user[2];
            		String password = user[3];
            		new Usuario(name, username, email, password);
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
		guardarUsuarios(ruta);
		guardarMenus(ruta);
	}
	
	private static void guardarUsuarios(String ruta){
		try {
            FileWriter fw = new FileWriter(ruta+"users.txt");
            FileWriter fwAdmin = new FileWriter(ruta+"adminUsers.txt");
            PrintWriter pw = new PrintWriter(fw);
            PrintWriter pwAdmin = new PrintWriter(fwAdmin);
    		for (Map.Entry<String, Usuario> user : usuarios.entrySet()) {
    			Usuario userObj = user.getValue();
    			String line = userObj.getUsername()+";";
    			line += userObj.getName()+";";
    			line += userObj.getEmail()+";";
    			line += userObj.getPassword();
    			if(userObj instanceof AdminUser) {
    				pwAdmin.println(line);
					
				}else {
					pw.println(line);
    			}
    		}
            pw.close();
            pwAdmin.close();
            
        } catch (IOException ioObj) {
        	//Ocurrio algo al guardar en txt los datos
        }
	}
	
	private static void guardarMenus(String ruta){
		try {
            FileWriter fw = new FileWriter(ruta+"usersMenus.txt");
            PrintWriter pw = new PrintWriter(fw);
    		for (Map.Entry<String, MenuDeConsola> menu : menus.entrySet()) {
    			MenuDeConsola menuObj = menu.getValue();
    			String line = menuObj.getUser().getUsername()+";";
    			for (String  opt : menuObj.getOperations()) {
    				line += opt+";";
				}
    			//Correccion por el ; extra
    			pw.println(line.substring(0,(line.length()-1)));
    		}
            pw.close();
            
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
		usersRegisteredFile.createNewFile();
		adminUsersFile.createNewFile();
		}
		catch(IOException e){
			//Ocurrio algo al crear las carpetas y los archivos
		}
	}
}
