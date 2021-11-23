//Ej1ReversePolishNotation.java

import java.util.*;
public class Ej1ReversePolishNotation {
	
	public static void main(String[] args) {

		  String[] tokens = new String[] { "4", "13", "5", "/", "+" };
		  System.out.println(evaluar(tokens));
    
	}
	
	public static int evaluar(String[] tokens) {
		    //Dado un arreglo de strings, realizar las operaciones básicas de acuerdo a la notación polaca inversa utilizando colas.
        int returnValue = 0;
 
        String operators = "+-*/";
 
        Stack<String> stack = new Stack<String>();
 
        for(String t : tokens){
            if(!operators.contains(t)){
                stack.push(t);
            }
            else{
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                int index = operators.indexOf(t);
                switch(index){
                    case 0:
                        stack.push(String.valueOf(a+b));
                        break;
                    case 1:
                        stack.push(String.valueOf(b-a));
                        break;
                    case 2:
                        stack.push(String.valueOf(a*b));
                        break;
                    case 3:
                        stack.push(String.valueOf(b/a));
                        break;
                }
            }
        }
 
        returnValue = Integer.valueOf(stack.pop());
        return returnValue;
 
    }
}

//Resultado
6

