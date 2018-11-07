package server;

import model.Fixture;
import spark.Spark;

public class Server {
	public static void main(String[] args) {
		
		Fixture.initialize();
		
		Spark.port(9000);
		Router.configure();
	}
}