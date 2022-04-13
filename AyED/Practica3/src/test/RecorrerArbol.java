package test;
import ejercicio1.ArbolBinario;
public class RecorrerArbol {

	//Recorre arbol en preOrden [raiz-hi-hd] y agrega a una lista generica los datos pares
	
		private void ParesPreRec(ArbolBinario<Integer>, ListaGenerica<Integer> lista){
			
			if(a.getDato()%2 == 0)
				lista.agregarFinal(a.getDato());
			
			if(a.tieneHijoIzquiero())
				ParesPreRec(a.getHijoIzquierdo, lista);
			
			if(a.tieneHijoDerecho())
				ParesPreRec(a.getHijoDerecho(), lista)
				
		}
		
		public ListaGenerica<Integer> ParesPre(ArbolBinario<Integer> a){
			
			ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>;
			
			if(!(a.esVacio()))
				ParesPreRec(a, lista);
			
		}
}
