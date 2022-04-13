package ejercicio1;
public class Prueba {
	
	public static void main (String[]args) {
		
		//crear nodo
		Integer dato = 6;
		
		//crear arbol por constructor vacio
		//ArbolBinario<Object> arbol_sin_dato = new ArbolBinario<Object>();
		
		//crear arbol con dato
		ArbolBinario<Integer> arbol = new ArbolBinario<Integer>(dato);
		
		//ver si es vacio
		System.out.println(arbol.esVacio());
		
		//ver dato
		System.out.println(arbol.getDato());
		
		//ver si es vacio
		arbol.setDato(null);
		System.out.println(arbol.esVacio());
		
		//dar dato 
		arbol.setDato(9);
		
		//agregar hijos
		ArbolBinario<Integer> hijo = new ArbolBinario<Integer>(18);
		arbol.agregarHijoIzquierdo(hijo);
		hijo = new ArbolBinario<Integer>(22);
		arbol.agregarHijoDerecho(hijo);
		
		System.out.println(arbol.getDato());
		System.out.println(arbol.getHijoDerecho());
		System.out.println(arbol.getHijoIzquierdo());
		
		hijo = new ArbolBinario<Integer>(66);
		ArbolBinario<Integer> recorrido = arbol.getHijoDerecho();
		recorrido.agregarHijoDerecho(hijo);
		
		System.out.println(arbol.getHijoDerecho());
		recorrido = arbol.getHijoDerecho();
		System.out.println(recorrido.getHijoDerecho());
		System.out.println(recorrido.getHijoIzquierdo());
		
		recorrido.eliminarHijoDerecho();
		System.out.println(recorrido.getHijoDerecho());
		
		System.out.println(recorrido.esHoja());
	}
}
