package alumnos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno {
	
	protected int matricula;
	protected String nombre;
	protected String apellidos;
	protected LocalDate fechaNacimiento;
	
	protected ArrayList<Adaptacion> adaptaciones;
	
	//constructor
	public Alumno(String nombre, String apellidos, LocalDate fechaNacimiento, int matricula) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechaNacimiento=fechaNacimiento;
		this.matricula=matricula;
		
		//cuando nace el alumno, creamos su lista vacía
		this.adaptaciones=new ArrayList<Adaptacion>();
	}
	
	public void añadirAdaptacion(Adaptacion adaptacion) {
		adaptaciones.add(adaptacion);
	}
	
	public String toString() {
		return nombre+" "+apellidos+", "+fechaNacimiento+", "+matricula+" "+adaptaciones;
	}

}
