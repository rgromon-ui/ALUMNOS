package alumnos;
import java.time.LocalDate;
import java.util.ArrayList;

public class SistemaCentral {
	
	protected static ArrayList<Alumno> alumnos = new ArrayList<>();
	
	public static void main(String[] args) {
		Alumno alumno1=new Alumno("Pedro", "González Pérez", LocalDate.of(2009,8,23), 1234567);
		SistemaCentral.añadirAlumno(alumno1);
		Alumno alumno2=new Alumno("Jorge","Martín",LocalDate.of(2010, 3,14), 1234568);
		SistemaCentral.añadirAlumno(alumno2);
	
		System.out.println(alumno1.nombre+" "+alumno1.apellidos);
		Adaptacion adaptacion1=new Adaptacion(Adaptacion.MotivoAdaptacion.TDAH,Adaptacion.TipoAdaptacion.TIEMPO_EXTRA);
		alumno1.añadirAdaptacion(adaptacion1);
		System.out.println(alumno1.nombre+" "+alumno1.apellidos+ adaptacion1);
		System.out.println(alumno1);
		System.out.println(alumnos);
		System.out.println(mostrarAlumnos());
		
		Alumno alumno3=new Alumno("María","López Rodríguez",LocalDate.of(2008,2, 13), 1234569);
		SistemaCentral.añadirAlumno(alumno3);
		
		System.out.println(alumno2.nombre);
		
		
		System.out.println(mostrarAlumnos());
		System.out.println(alumno1);
	}

	public static void añadirAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}
	public static ArrayList<Alumno> mostrarAlumnos() {
		return alumnos;
	}

	
	public static Alumno devolverAlumno(String nombreAlumno) {
		for(Alumno alumno:alumnos) {
			if(nombreAlumno.equals(alumno.nombre)) {
				return alumno;
			}
		}
		return;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int devuelveMatricula(String nombreAlumno){
		
		for (Alumno alumno:alumnos) {
			if(nombreAlumno.equals(alumno.nombre)) {
				return alumno.matricula;
			}
		}
		return -1;
	}
}
