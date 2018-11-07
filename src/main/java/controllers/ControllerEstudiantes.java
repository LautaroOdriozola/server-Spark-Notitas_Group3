package controllers;

import repositories.RepoEstudiantes;

import java.util.List;

import model.Asignacion;
import model.Estudiante;
import spark.Request;
import spark.Response;

public class ControllerEstudiantes {

	public static int nuevoAlumno(Request req, Response res) {
		String token = req.headers("TOKEN");
		
		
		String estudianteEnString = req.body();
		//Este body viene en JSON-> hay que desjsonearlo y mandarselo al repo
		//RepoEstudiantes.getInstance().nuevoEstudiante(nuevoEstudiante(token, estudiante);
		 return 1;
			
	}

	public static Estudiante obtenerAlumno(Request req, Response res) {
		String token = req.headers("TOKEN");

		return RepoEstudiantes.getInstance().devolverEstudiante(token);

	}

	public static List<Asignacion> obtenerNotasAlumno(Request req, Response res) {
		String token = req.headers("TOKEN");
		
		return RepoEstudiantes.getInstance().devolverNotasEstudiante(token);
		
	}
	
}