package aed.recursion;


import java.util.Comparator;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.map.*;

public class Utils {

	public static boolean isBalanced(String s) {
	    return isBalancedAux(s, "");//Se inicializa el string nuevo vacío
	}

	private static boolean isBalancedAux(String s, String nuevo) { //Tenemos s el String original y uno nuevo
	    if (s.isEmpty()) {
	        return nuevo.isEmpty(); // Si el String s es vacío el nuevo también
	    }
	    
	    char actual = s.charAt(0); //Recorre el String original s
	    String resto = s.substring(1);//Resto del String sin recorrer, (se prescinde del char actual)
	    
	    if (opens(actual)) {// Si el actual es simbolo de apertura
	        return isBalancedAux(resto, actual + nuevo);//se añade al inicio del nuevo string
	    }
	    else if (closes(actual)){//Si es de cierre 
	        if (nuevo.isEmpty()) { //Si el nuevo string está vacio
	            return false; // Cierre sin apertura
	        }
	        char ultap = nuevo.charAt(0); //si tiene una apertura en el nuevo String
	        if (!matches(ultap, actual)) { //Si no coinciden los símbolos de apertura y cierre
	            return false; // No coinciden
	        }
	        // Si coincide se quita el último símbolo añadido al nuevo string, porque ya se ha empearejado
	        return isBalancedAux(resto, nuevo.substring(1));
	    }
	    else {
	        // Si es cualquier otro caracter se salta
	        return isBalancedAux(resto, nuevo);
	    }
	}


  private static boolean opens (char c) {
	  return c == '(' || c == '{' || c =='['; //devuelve true si c es ’(’, ’{’, o ’[’ 
  }
  
   private static boolean closes (char c) {
	  return c == ')' || c == '}' || c ==']';//devuelve true si c es ’)’, ’}’, o ’]’
  }
  
   private static boolean matches (char c1, char c2) {//devuelve true si las caracteres c1 y c2 abren y cierran correctamente
	  if(opens(c1) && closes(c2)) { //Si los caracteres al menos son de apertura y cierre
		  if(c1 == '(' && c2 == ')') {
			  return true;
		  }
		  else if(c1 == '{' && c2 == '}') {
			  return true;
		  }
		  else if(c1 == '[' && c2 == ']') {
			  return true;
		  }
		  else { //Si no coinciden en tipo devuelve false
			  return false;
		  }
	  }
		  return false;
  }
  
   static public int findPeak(Integer[] arr) {
		int i=arr.length/2;
		int inicio=0;
		int fin=arr.length-1;
		Integer resB=busqueda(arr,i,inicio,fin);
		return resB;
	}
	
	private static Integer busqueda(Integer[]arr, int i, int inicio, int fin) {
		if(arr.length<=1) {return 0;}
		if(i==0 &&arr[i]>=arr[i+1]){return i;}
		else if(i==0 &&arr[i]<=arr[i+1]){return i+1;}
		else if(arr[i]>=arr[i-1] && i==arr.length-1) {return i;}
		else if(arr[i]<=arr[i-1] && i==arr.length-1) {return i-1;}
		else if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){return i;}
		
		if (arr[i] < arr[i+1]) {
		    inicio = i + 1;
		    i = (inicio + fin) / 2; 
		} else if (arr[i] < arr[i-1]) { 

		    fin = i-1;  
		    i = (inicio + fin) / 2;  
		}
		
		return busqueda(arr,i, inicio,fin);
	}

  
	public static <E> PositionList<E> merge(PositionList<E> l1, PositionList<E> l2, Comparator<E> cmp) {
	    PositionList<E> nuevaL = new NodePositionList<>();
	    return mergeAux(nuevaL, l1.first(), l2.first(), l1, l2, cmp);
	}

	private static <E> PositionList<E> mergeAux(PositionList<E> res, Position<E> l1c, Position<E> l2c, PositionList<E> l1, PositionList<E> l2, Comparator<E> cmp) {
	    
	    //Ambos cursores son vacíos
	    if (l1c == null && l2c == null) {
	        return res; //La lista será vacía
	    }
	    
	    //Solo l1 tiene elemento
	    if (l1c != null && l2c == null) {
	        res.addLast(l1c.element()); //Añade el elemento de l1
	        return mergeAux(res, l1.next(l1c), null, l1, l2, cmp); //Avanza el cursor de l1
	    }
	    
	    //Solo l2 tiene elementos
	    if (l1c == null && l2c != null) {
	        res.addLast(l2c.element()); //Añade el elemento de l2
	        return mergeAux(res, null, l2.next(l2c), l1, l2, cmp); //Avanza el cursor de l2
	    }
	    
	    //Ambos tienen elementos
	    
	    if (cmp.compare(l1c.element(), l2c.element()) <= 0) { //si l1 < l2 ó l1 = l2
	        res.addLast(l1c.element());
	        return mergeAux(res, l1.next(l1c), l2c, l1, l2, cmp);
	    } else { //Si l1 > l2
	        res.addLast(l2c.element());
	        return mergeAux(res, l1c, l2.next(l2c), l1, l2, cmp);
	    }
	}


	public static boolean calculate(PropTerm t, Map<String,Boolean> env) {
		boolean aux = false;
		
		if(t.isVar()) {
			String elem = t.getVar();
			Boolean res = env.get(elem);
			if(res == null) {throw new IllegalArgumentException();}
			return res;
		}
		
		
		if(t.isNeg()) {return !calculate(t.getOperand(), env);}
		
		else {
			Pair<PropTerm, PropTerm> operandos = t.getOperands();
			PropTerm izq = operandos.getLeft();
			PropTerm der = operandos.getRight();
			
			boolean val = calculate(izq, env);
			boolean val2 = calculate(der, env);
			
			
			if(t.isAnd()) {
				aux =  val && val2;
				return aux;
				}
			
			
			if(t.isOr()) {
				aux = val || val2;
				return aux;
				}
			aux = !val || val2;
			
			return aux;
		}
	}
}
