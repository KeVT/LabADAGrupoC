public class Ejercicio5 {

	public static void main(String[] args) {
		int [] arreglo = {8, 5, 11, 3, 1, 15};
		imprimir(arreglo);
		insercion(arreglo);
		imprimir(arreglo);
	}
	
	public static void insercion(int arreglo[]) {
		int clave, i;
		for (int j=1;j<arreglo.length;j++) {
			clave = arreglo[j];
			i = j-1;
			while (i>-1 && arreglo[i]>clave) {
				arreglo[i+1] = arreglo[i];
				i--;
			}
			arreglo[i+1] = clave;
		}
	}
	public static void imprimir(int arreglo[]) {
		for (int i=1;i<=arreglo.length;i++) {
			System.out.print(arreglo[i-1]+ " ");
		}
		System.out.println();
	}	
}

//Resultado de la ejecución
//Muestra el arreglo inicial
8 5 11 3 1 15 
//Arreglo ordenado
1 3 5 8 11 15 
