package Act1;
import tp02.ejercicio1.*;
public class Ejer1_6 {

	public ListaDeEnterosEnlazada calcularSucesion (int n) {
		
			ListaDeEnterosEnlazada lista_sucesion;
			if (n == 1) {
				
				System.out.println(n);
				lista_sucesion = new ListaDeEnterosEnlazada();
				lista_sucesion.agregarFinal(n);
				
			}
			else if ((n % 2)==0) {
				
				System.out.println(n);
				lista_sucesion = new ListaDeEnterosEnlazada();
				lista_sucesion.agregarFinal(n);
				//lista_sucesion.proximo();
				lista_sucesion = calcularSucesion(n = n/2);

			}
			else {
				
				System.out.println(n);
				lista_sucesion = new ListaDeEnterosEnlazada();
				lista_sucesion.agregarFinal(n);
				//lista_sucesion.proximo();
				lista_sucesion = calcularSucesion((3*n)+1);
			}
			
			return lista_sucesion;
			
		}
}
