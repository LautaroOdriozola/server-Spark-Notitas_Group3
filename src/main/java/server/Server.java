package server;

import java.util.HashMap;

import model.Fixture;
import model.Usuario;
import repositories.RepoUsuarios;
import spark.Spark;

public class Server {
	public static void main(String[] args) {
		
		Fixture.initialize();
		
		//HashMap<String,Usuario> mapaUsuarios = RepoUsuarios.getInstance().todo();
		
		//mapaUsuarios.forEach((k,v) -> System.out.println("Key: " + k + " " + "User: " + v.getUser()+ " " + "Password: " + v.getPassword()));
		
		Spark.port(8080);
		Router.configure();
	}
}