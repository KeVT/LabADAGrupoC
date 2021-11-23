//Ej2MinimumAddtoMakeParenthesesValid.java

import java.util.*;

public class Ej2MinimumAddtoMakeParenthesesValid {
	public static void main(String[] args) {	
		String s = "(()((()";	
		System.out.println(validacion(s));
	
	}
	 
	public static int validacion(String cadena) {
    //Dado un string, evaluar cada caracter de la cadena y juntar una coincidencia de parentesis abierto y cerrado
    //finalmente contabilizar los parentesis restantes o desemparejados
	    Stack <Character> stack = new Stack();
	    for (int i = 0; i < cadena.length(); i++) {
	        char c = cadena.charAt(i);
	        if (stack.isEmpty()) {
	            stack.push(c);
	            continue;
	        }        
	        if (c == ')' && stack.peek() == '(')
	            stack.pop();
	        else 
	            stack.push(c);
	    }
	    return stack.size();
	}
	
}

//Resultado
3
