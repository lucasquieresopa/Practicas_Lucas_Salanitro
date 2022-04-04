package Act1;
import java.util.Scanner;
import tp02.ejercicio1.*;
public class Ejer1_6_main {

	
	//Consultar errores
	
	public static void main(String[]args) {
		
		@SuppressWarnings("resource")
		Scanner ss = new Scanner(System.in);
		
		int nro = ss.nextInt();
		
		Ejer1_6 jj = new Ejer1_6();
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		
		//NodoEntero pri = new NodoEntero();
		lista.comenzar();
		lista = jj.calcularSucesion(nro);
		
		System.out.println(lista.elemento(0));
		System.out.println(lista.elemento(1));
		System.out.println(lista.elemento(2));
		/*while(lista.proximo() =! null) {
			System.out.println(lista.proximo());
		}*/
	}
}
