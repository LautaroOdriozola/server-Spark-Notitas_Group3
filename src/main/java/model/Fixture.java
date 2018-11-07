package model;

import java.util.ArrayList;
import java.util.List;

import repositories.RepoEstudiantes;

public class Fixture {

	public static void initialize() {
		
		Estudiante naylaWinter = new Estudiante();
		naylaWinter.setNombre("Nayla");
		naylaWinter.setApellido("Winter");
		naylaWinter.setLegajo(1591915);
		naylaWinter.setusuarioGithub("naylawinter");
		
		Estudiante lautaroOdriozola = new Estudiante();
		lautaroOdriozola.setNombre("Lautaro");
		lautaroOdriozola.setApellido("Odriozola");
		lautaroOdriozola.setLegajo(1566076);
		lautaroOdriozola.setusuarioGithub("lautaroOdriozola");
		
		Asignacion tpArena = new Asignacion();
		tpArena.setNombre("TP ARENA");
		//tpArena.setCalifNumerica(false);
		tpArena.crearLista();
		tpArena.agregarNota("B");
		tpArena.agregarNota("R");
		Asignacion operativos = new Asignacion();
		operativos.setNombre("Sistemas operativos");
		//operativos.setCalifNumerica(true);
		operativos.crearLista();
		operativos.agregarNota("8");
		operativos.agregarNota("9");
		Asignacion matsuperior = new Asignacion();
		matsuperior.setNombre("MATEMATICA SUPERIOR");
		//matsuperior.setCalifNumerica(true);
		matsuperior.crearLista();
		matsuperior.agregarNota("6");
		matsuperior.agregarNota("10");
		
		
		List<Asignacion> asigNayla = new ArrayList<Asignacion>();
		asigNayla.add(tpArena);
		asigNayla.add(matsuperior);
		
		List<Asignacion> asigLauti = new ArrayList<Asignacion>();
		asigLauti.add(tpArena);
		asigLauti.add(operativos);
		
		naylaWinter.crearListaAsignaciones();
		naylaWinter.setAsignaciones(asigNayla);
		lautaroOdriozola.crearListaAsignaciones();
		lautaroOdriozola.setAsignaciones(asigLauti);	
	
		
		RepoEstudiantes.getInstance().nuevoEstudiante(naylaWinter, "AA");
		RepoEstudiantes.getInstance().nuevoEstudiante(lautaroOdriozola, "aaaa");
		
		//RepoEstudiantes.getInstance().setEstudianteSeleccionado(naylaWinter);
		
	}
	
	
}
