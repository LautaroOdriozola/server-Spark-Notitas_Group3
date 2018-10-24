package server;
import controllers.ControllerEstudiantes;
import spark.Spark;

public class Router {

	public static void configure() {
		Spark.get("/", ControllerEstudiantes::nuevoToken);
		Spark.put("/alumno/new", ControllerEstudiantes::nuevoAlumno);	
		Spark.get("/alumno", ControllerEstudiantes::obtenerAlumno);	
		Spark.get("/alumno/notas", ControllerEstudiantes::obtenerNotasAlumno);	
	}

}