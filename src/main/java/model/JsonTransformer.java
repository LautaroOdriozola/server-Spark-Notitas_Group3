package model;
import spark.ResponseTransformer;

public class JsonTransformer implements ResponseTransformer {

    public String render(Estudiante alum) {
    	String aDevolver = "{ \" code\" : \"" +  alum.getLegajo() + "\"," +
                " \"first_name\":\"" + alum.getNombre() + "\"," + 
                " \"last_name\":\"" +  alum.getApellido() + "\"," +
                " \"github_user\":\"" + alum.getusuarioGithub() + "\"}" ;
    		
    		return aDevolver;
         	
    }

	@Override
	public String render(Object model)  {
	
		return null;
	}

}