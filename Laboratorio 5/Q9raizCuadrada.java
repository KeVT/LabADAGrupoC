//Q9raizCuadrada.java

public class Q9raizCuadrada {

	public static void main(String[] args) {	
		//Dado un número, se recorre el ciclo imprimiendo cuadrados consecutivos hasta antes de dicho número.
		int n = 20;
		for(int i = 0; i * i < n; i++) {		//O(raíz(n))	
			System.out.println(i*i);
		}		
	}
	
}
