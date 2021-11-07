//P3MenorElementoArrayDesplazado.java

public class P3MenorElementoArrayDesplazado {

	public static void main(String[] args) {
		int arreglo1 [] = { 2 ,3, 6, 7 ,9 ,15, 19};
		int arreglo2 [] = { 6, 7 ,9 ,15, 19, 2, 3};

		System.out.println("El menor elemento es " + busquedaBinaria(arreglo2));
	}

	public static int busquedaBinaria (int [] lista) {
    //Dado un conjunto de números ordenados rotados de enteros,
    //la función determina el menor elemento de dicho conjunto de números.
		int L, R, mid, aux = 0;
		L = 0;
		R = lista.length - 1;
		while(L <= R) {
			mid = L + (R - L) / 2;	
			if(lista[mid] > lista[R])
				L = mid + 1;
			else {
				aux = mid;
				R = mid - 1;
			}
		}
		return lista[aux];		
	}
}


//Resolución
El menor elemento es 2

