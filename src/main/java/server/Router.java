package server;
import controllers.ControllerEstudiantes;
import model.JsonTransformer;
import spark.Spark;

public class Router {

	public static void configure() {
		Spark.put("/alumno", ControllerEstudiantes::nuevoAlumno);	
		Spark.get("/alumno", ControllerEstudiantes::obtenerAlumno,new JsonTransformer());	
		Spark.get("/alumno/notas", ControllerEstudiantes::obtenerNotasAlumno,new JsonTransformer());	
	}

}