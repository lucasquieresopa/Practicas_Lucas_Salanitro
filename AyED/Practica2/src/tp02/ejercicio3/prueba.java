package tp02.ejercicio3;

public class prueba {
	public static void main(String[]args){
		
		PilaGenerica<Integer> pila = new PilaGenerica<Integer>();
		
		pila.apilar(8);
		pila.apilar(4);
		
		pila.desapilar();
		System.out.println(pila.tope());
		
		ColaGenerica<Integer> cola = new ColaGenerica<Integer>();
		cola.encolar(7);
		cola.encolar(5);
		
		cola.desencolar();
		System.out.println(cola.tope());
	}
}
