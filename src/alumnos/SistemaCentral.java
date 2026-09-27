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
			
			System.out.println(listaNombreAlumnos());
			System.out.println(contarAlumnos());
			System.out.println(alumnosConAdaptacion());
			System.out.println(tieneAdaptaciones("Pedro"));
			
			cambiarApellidos("Pedro", "Núñez Alonso");
			System.out.println(devolverAlumno("Pedro"));
			
			eliminarAlumno(1234567);
			System.out.println(alumnos);
			
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
			return null;
		}
		
		
		public static ArrayList<String> listaNombreAlumnos() {
			ArrayList<String> listaNombreAlumnos= new ArrayList<>();
			//for(TIPO elemento: lista)
			for(Alumno alumno : alumnos){
				listaNombreAlumnos.add(alumno.nombre+" "+alumno.apellidos);
			}
			return listaNombreAlumnos;
		}
		
		public static int contarAlumnos(){
			int contador=0;
			for(Alumno alumno : alumnos) {
				contador ++;
			}
			return contador;
		}
		
		public static ArrayList<String> alumnosConAdaptacion() {
			ArrayList<String> listaAdaptaciones =new ArrayList<>();
			for(Alumno alumno:alumnos){
				if(alumno.adaptaciones.size() >0) {
					listaAdaptaciones.add(alumno.nombre+alumno.adaptaciones);
				}
			}
			return listaAdaptaciones;
		}
		

		//dado un alumno, dime si tiene adaptaciones
		public static boolean tieneAdaptaciones(String nombreAlumno) {
			
			for(Alumno alumno:alumnos) {
				if(alumno.nombre.equalsIgnoreCase(nombreAlumno)) {
					if(alumno.adaptaciones.size()>0) {
						return true;
					}
				}
			} return false;
		}
		
		
		public static int devuelveMatricula(String nombreAlumno){
			
			for (Alumno alumno:alumnos) {
				if(nombreAlumno.equalsIgnoreCase(alumno.nombre)) {
					return alumno.matricula;
				}
			}
			return -1;
		}
		
		
		
		public static void cambiarApellidos(String nombre, String apellidosNuevos) {
			for(Alumno alumno:alumnos) {
				if(alumno.nombre.equalsIgnoreCase(nombre)) {
					alumno.apellidos=apellidosNuevos;
				}
			}
		}
		
		
		public static void eliminarAlumno(int matricula) {
			Alumno alumnoEncontrado=null;
			for(Alumno alumno:alumnos) {
				if(alumno.matricula==matricula) {
					alumnoEncontrado=alumno;
					break;
				}
				
			} alumnos.remove(alumnoEncontrado);
		}
		
	}


