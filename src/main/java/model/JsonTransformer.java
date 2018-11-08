package model;
import java.util.List;

import com.google.gson.Gson;

import spark.ResponseTransformer;

public class JsonTransformer implements ResponseTransformer {

	private Gson gson = new Gson();
	
    /*public String renderEstudiante(Estudiante alum) {
    	String aDevolver = "{ \" code\" : \"" +  alum.getLegajo() + "\"," +
                " \"first_name\":\"" + alum.getNombre() + "\"," + 
                " \"last_name\":\"" +  alum.getApellido() + "\"," +
                " \"github_user\":\"" + alum.getusuarioGithub() + "\"}" ;
    		
    		return aDevolver;
         	
    }*/
    
    /*public String renderCalificaciones(List<Asignacion> asignaciones) {
    	
    	
    	String aDevolver = "{ \" code\" : \"" +  alum.getLegajo() + "\"," +
                " \"first_name\":\"" + alum.getNombre() + "\"," + 
                " \"last_name\":\"" +  alum.getApellido() + "\"," +
                " \"github_user\":\"" + alum.getusuarioGithub() + "\"}" ;
    	
    	
    	// La idea es que el json devuelva una lista de materias y que cada materia tenga una lista de notas.
    	
    	return "";
    }*/

	@Override
	public String render(Object model)  {
		return gson.toJson(model);
	}

}