package server;
import controllers.ControllerEstudiantes;

import model.JsonTransformer;
import spark.Spark;

public class Router {

	public static void configure() {
		Spark.put("/alumno",  ControllerEstudiantes::nuevoAlumno);	
		Spark.get("/token", ControllerEstudiantes::obtenerToken);
		Spark.get("/alumno", "application/json", ControllerEstudiantes::obtenerAlumno,new JsonTransformer());	
		Spark.get("/alumno/notas", "application/json",ControllerEstudiantes::obtenerNotasAlumno,new JsonTransformer());	
		
	}

}