package repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Asignacion;
import model.Estudiante;
import model.Usuario;

public class RepoUsuarios {

	private static RepoUsuarios instance;
	private HashMap<String,Usuario> mapaUsuarios = new HashMap<>();

	private RepoUsuarios() {

	}
	
	public HashMap<String,Usuario> todo(){
		return mapaUsuarios;
	}
	
	public static RepoUsuarios getInstance() {
		if (instance == null) instance = new RepoUsuarios();
		return instance;
	}
	
	public void nuevoUser(String token, Usuario user) {
		mapaUsuarios.put(token, user);
		
	}
	
	public Usuario devolverUser(String token) {
		return mapaUsuarios.get(token);
	}
	
	public String devolverToken(Usuario user) {
		
		String nuevoUser = user.getUser();
		String nuevaPW = user.getPassword();
		String tokenADevolver = "";

		for(Map.Entry<String, Usuario> entry : mapaUsuarios.entrySet()) {
			
		    String token = entry.getKey();
		    Usuario userDeMap = entry.getValue();
		    
		    if(nuevoUser.equalsIgnoreCase(userDeMap.getUser())) {
		    	tokenADevolver = token;
		    } 		    
		}
		
		return tokenADevolver;
	}
	
	
}
