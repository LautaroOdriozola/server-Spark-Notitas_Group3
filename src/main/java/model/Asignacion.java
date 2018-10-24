package model;

import java.util.ArrayList;
import java.util.List;

public class Asignacion{
	String nombre;
	String ultimaNota;
	String estado;
	
	boolean califNumerica;
	List<String> notas;// = new ArrayList<String>();
	
	public Asignacion(String _nombre, boolean _califNum){
		nombre = _nombre;
		califNumerica = _califNum;
	}
	
	public void setUltimaNota(String nota) {
		this.ultimaNota = nota;
	}
	
	public String getUltimaCalificacion() {
		return notas.get(notas.size()-1);
	}
	
	public String getUltimaNota() {
		return this.getUltimaCalificacion();
	}
	
	public void crearLista() {
		notas = new ArrayList<String>();
	}
		
	public void agregarNota(String n) {
		notas.add(n);
		//add agrega al final
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String revisarEstado() {
		boolean aprobado;
		if(califNumerica) {
			aprobado = Integer.valueOf(this.getUltimaNota()) >= 6;
			
		}else {
			aprobado = this.getUltimaNota().startsWith("B");
		}
		
		if(aprobado) {
			return "Aprobado";
		}else {
			return "Reprobado";
		}
	}
	
	public String getEstado() {
		return this.revisarEstado();
	}
	
}