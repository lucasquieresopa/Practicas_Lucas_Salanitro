package Act2;
import tp02.ejercicio2.*;
import java.util.Scanner;

public class TestListaEnlazadaGenerica {
	
		
		
		public static void main (String[]args) {
			
			Scanner ss = new Scanner(System.in);
			String nombre;
			String apellido;
			String comision;
			String email;
			String direccion;
			
			ListaEnlazadaGenerica<Estudiante> l_e_g = new ListaEnlazadaGenerica<Estudiante>();
			
			for(int i=0; i < 4; i++) {
				
				nombre = ss.nextLine();
				apellido = ss.nextLine();
				comision = ss.nextLine();
				email = ss.nextLine();
				direccion = ss.nextLine();
				
				Estudiante est = new Estudiante();
				est.setNombre(nombre);
				est.setApellido(apellido);
				est.setComision(comision);
				est.setEmail(email);
				est.setDireccion(direccion);
				
				l_e_g.agregarFinal(est);
				System.out.println("1");
			}
			
			
			l_e_g.comenzar();
			for (int i = 0; i < 4; i++) {
				Estudiante ee = new Estudiante();
				ee = l_e_g.proximo();
				System.out.println(ee.tusDatos());
			}
			l_e_g.agregar(null);

		}
}
