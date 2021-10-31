//Q10lineal.java

public class Q10lineal {

	public static void main(String[] args) {	
		//Dado un número, se recorren dos ciclos separados 
    //y cada ciclo muestra valores consecutivos hasta antes de dicho número.
		int n = 10;
		for(int i = 0; i < n; i++) {		//O((n))	 --> 	O(n) + O(n) = O(2n) --> O(n)
			System.out.println(i);
		}                               //  +
		System.out.println(); 
		for(int j = 0; j < n; j++) {		//O((n))	
			System.out.println(j);
		}		
	}
	
}

//Resolución
0
1
2
3
4
5
6
7
8
9

0
1
2
3
4
5
6
7
8
9
