package controllers;

import repositories.RepoEstudiantes;
import repositories.RepoUsuarios;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import model.Asignacion;
import model.Estudiante;
import model.Usuario;
import spark.Request;
import spark.Response;

public class ControllerEstudiantes {

	public static int nuevoAlumno(Request req, Response res) throws Exception {
		String token = req.headers("Authorization");
		
		String estudianteEnJSON = req.body();
		
		System.out.println("Me llego el body = " + estudianteEnJSON);
		
		Estudiante nuevo = parsearEstudiante(estudianteEnJSON);
		
		RepoEstudiantes.getInstance().nuevoEstudiante(nuevo, token);
		
		return 1;			
	}

	
	public static Estudiante parsearEstudiante(String jsonEstudiante) throws Exception {
		
		Gson gson = new Gson();
		Estudiante estudianteParseado = new Estudiante();		
		estudianteParseado = gson.fromJson(jsonEstudiante, Estudiante.class);
		
		return estudianteParseado;		// Devuelvo un nuevo estudiante en un objeto.
	}

	public static Estudiante obtenerAlumno(Request req, Response res) {	
		String token = req.headers("Authorization");

		return RepoEstudiantes.getInstance().devolverEstudiante(token);
	}
	
	public static String obtenerToken(Request req, Response res) {
		String user = req.headers("User");
		String password = req.headers("Password");		
		
		Usuario nuevo = new Usuario();
		nuevo.setUser(user);
		nuevo.setPassword(password);
		
		System.out.println("ME LLEGO EL USER = " + user);		
		System.out.println("ME LLEGO LA PW = " + password);		
		String token = RepoUsuarios.getInstance().devolverToken(nuevo);
		System.out.println("EL TOKEN ENCONTRADO ES = " + token);
		
		return token;		
		
	}

	public static List<Asignacion> obtenerNotasAlumno(Request req, Response res) {
		String token = req.headers("Authorization");
		
		return RepoEstudiantes.getInstance().devolverNotasEstudiante(token);
		
	}	
	
}