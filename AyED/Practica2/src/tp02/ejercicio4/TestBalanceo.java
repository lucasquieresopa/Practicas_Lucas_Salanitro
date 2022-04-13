package tp02.ejercicio4;
import java.util.Scanner;
//import tp02.ejercicio2.*;
import tp02.ejercicio3.*;
public class TestBalanceo {

		
	
	public static boolean estaBalanceado(String cadena) {
		

		PilaGenerica<Character> pila_cadena = new PilaGenerica<Character>();
		
		//abrir == ( [ {
		//cerrar == ) ] }

		int i=0;
		//Character caracter_cerrado;
		Character caracter_abierto;
		
		//  [{()}],   [({)}], ({[])}
		
		if(cadena.isEmpty())
			return false;
		
		while (i < cadena.length()) {
			
			
			/// "[{(".contains(cadena.charAt(i))
			if(cadena.charAt(i) == '['
				|| cadena.charAt(i) == '(' 
				|| cadena.charAt(i) == '{') { // si es "abrir" -> apilar
				pila_cadena.apilar(cadena.charAt(i));
				//System.out.println(cadena.charAt(i));
				//apilar aca
			}
			else { //si es "cerrar" -> desapilar hasta char abrir
				
				//caracter_cerrado = cadena.charAt(i);
				if(cadena.charAt(i)==(')')) {
					
					//System.out.println(cadena.charAt(i));
					caracter_abierto = pila_cadena.desapilar();
					if (caracter_abierto!=('(')){
						return false;
					}
				}
				if(cadena.charAt(i)==(']')) {
					
					//System.out.println(cadena.charAt(i));
					caracter_abierto =(Character) pila_cadena.desapilar();
					if (caracter_abierto!=('[')){
						return false;
					}
				}
				if(cadena.charAt(i)==('}')) {
					
					//System.out.println(cadena.charAt(i));
					caracter_abierto = pila_cadena.desapilar();
					if (caracter_abierto!=('{')){
						return false;
					}
				}
			}

			i++;
		}
		
		return true;
	}
	
	
	
	
	
	public static void main (String [] args) {
		Scanner ss = new Scanner(System.in);
		
		System.out.println("Ingrese '()', '{}', '[]': ");
		String cadena1 = "";
		String cadena2 = "[{()}]";
		String cadena3 = "[({)}]";
		String cadena4 = "({[])}";
		

		System.out.println(TestBalanceo.estaBalanceado(cadena1));
		System.out.println(TestBalanceo.estaBalanceado(cadena2));
		System.out.println(TestBalanceo.estaBalanceado(cadena3));
		System.out.println(TestBalanceo.estaBalanceado(cadena4));

	}
}
