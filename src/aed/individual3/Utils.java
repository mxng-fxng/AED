package aed.individual3;

import java.util.Iterator;

public class Utils {
  public static boolean isArithmeticSequence(Iterable<Integer> l) {
	  Iterator<Integer> iterador = l.iterator(); //Puntero que recorre l

      // Lista vacía
      if (!iterador.hasNext()) { //Porque hasNext devuelve true si hay más elementos
          return true;
      }

      else {
	      //Como la lista no es vacía se puede asignar al menos un entero
	      Integer op = iterador.next(); //op = Elem 1, apunta iterador a Elem2
	
	      // Comprueba si hay más de un elemento
	      if (!iterador.hasNext()) {
	          return true; // Solo hay un elemento 
	      }
	      
	      Integer opSig = iterador.next(); //opSig = Elem2, apunta iterador a Elem3
	      Integer diferencia = opSig - op; // Calcular la diferencia general, Elem1 - Elem2
	      op = opSig; //op = Elem2
	      
	      while (opSig == null && iterador.hasNext()) { //Para cuando pueda haber un elemento null
	    	  opSig = iterador.next(); //opSig = Elem3, iterador pasa a Elem4
		      if (opSig == null) { // Si el siguiente elemento es null, por ejemplo Elem
		    	  opSig = iterador.next(); //
		      }
	      }	
	      // Recorrer el resto de elementos no null
	      while (iterador.hasNext()) {
	          opSig = iterador.next(); //opSig = Elem3, iterador pasa a Elem4

	          if (opSig != null) { //Cuando el operador siguiente no es null
	              Integer difAct = opSig - op; //Calcula la diferencia actual 	              
	              if (!diferencia.equals(difAct)) {
	                  return false;
	              }
	              op = opSig;
	          }
	      }
      }
      return true;
  }
}
