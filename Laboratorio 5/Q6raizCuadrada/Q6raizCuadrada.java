//Q6raizCuadrada.java

public class Q6raizCuadrada {

	public static void main(String[] args) {	
		//Dado un número, se suma un número inicial en 0 con la cantidad de veces que va recorriendo el ciclo
    //hasta ser menor o igual a dicho número.
		int n = 10;
		int p = 0;
		for(int i = 1; p <= n; i++) {		//O(raíz(n))	
			p = p + i;
			System.out.println(p);
		}		
	}
	
}

//Resolución
1
3
6
10
15
