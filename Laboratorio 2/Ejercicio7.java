import java.util.*;
public class Ejercicio7 {

	public static void main(String[] args) {
		int arreglo [] = arregloAleatorio(10);
		imprimir(arreglo);
		//medir el tiempo de ejecución del algoritmo
		long TInicio, TFin, tiempo;
		TInicio = System.nanoTime();
		insercion(arreglo);
		TFin = System.nanoTime();
		tiempo = TFin - TInicio;
		imprimir(arreglo);
		System.out.println("Tiempo de ejecución en nanosegundos: " + tiempo);
		System.out.println("Tiempo de ejecución en segundos: " + tiempo*(Math.pow(10, -9)));
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
