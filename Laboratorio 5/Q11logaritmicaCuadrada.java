//Q11logaritmicaCuadrada.java

public class Q11logaritmicaCuadrada {

	public static void main(String[] args) {	
    //Dado un número, se recorren dos ciclos separados que calculan el doble del anterior valor hasta antes de dicho número.
    //El segundo ciclo recorre hasta antes de la cantidad de veces que recorre el primer ciclo.
		int n = 10;
		int p = 0;
		for(int i = 1; i < n; i = i * 2) {		//O(log2(n))	-->  O(log2(n)) + O(log2(n)) = O(2log2(n)) --> O(log2(n^2))
			p++;
			System.out.println(i);
			System.out.println("p "+p);

		}                                      //  +     

		System.out.println(); 
		
		for(int j = 1; j < p; j = j * 2) {		//O(log2(n))	
			System.out.println(j);
		}
	}
	
}
