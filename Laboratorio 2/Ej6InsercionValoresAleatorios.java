import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		int arreglo [] = arregloAleatorio(10);
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
	public static int [] arregloAleatorio(int n) {
		Random ran = new Random();
		int arreglo[] = new int [n];
		for (int i=0;i<arreglo.length;i++) {
			arreglo[i] = ran.nextInt(n)+1;
		}
		return arreglo;
	}
	public static void imprimir(int arreglo[]) {
		for (int i=1;i<=arreglo.length;i++) {
			System.out.print(arreglo[i-1]+ " ");
		}
		System.out.println();
	}	
}

//Resultado de la ejecución
//Valores generados aleatoriamente desde el 1 hasta el 10
4 8 10 5 8 5 4 6 6 10 
//Arreglo de enteros ordenados
4 4 5 5 6 6 8 8 10 10 
