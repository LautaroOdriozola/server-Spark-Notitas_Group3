package repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.List;

import model.Asignacion;
import model.Estudiante;

public class RepoEstudiantes {

	private static RepoEstudiantes instance;
	private HashMap<String,Estudiante> mapaEstudiantes = new HashMap<>();

	private RepoEstudiantes() {

	}
	
	public static RepoEstudiantes getInstance() {
		if (instance == null) instance = new RepoEstudiantes();
		return instance;
	}
	
	public void nuevoEstudiante(Estudiante nuevoEstudiante, String token) {
		mapaEstudiantes.put(token, nuevoEstudiante);
		
	}
	
	public Estudiante devolverEstudiante(String token) {
		return mapaEstudiantes.get(token);
	}
	
	public List<Asignacion> devolverNotasEstudiante(String token) {
		return mapaEstudiantes.get(token).getAsignaciones();
	}
	
	

	
	
}