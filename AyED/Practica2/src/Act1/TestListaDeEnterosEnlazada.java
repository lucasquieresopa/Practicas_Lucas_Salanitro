package Act1;
import tp02.ejercicio1.*;
public class TestListaDeEnterosEnlazada {

	public static void main(String []args) {
		
		ListaDeEnteros l_e = new ListaDeEnterosEnlazada();
		
		for (int i = 0; i < args.length; i++) {
			
			l_e.agregarFinal(Integer.parseInt(args[i]));
		
		}
		
		for (int i = 0; i < args.length; i++) {
			
			//System.out.println(l_e.elemento(i+1));
		}

	
		l_e.impresionInversa(l_e, args.length);
	}
}
