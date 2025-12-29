package Iteradores;
import java.util.Iterator;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.indexedlist.*;

public class Utils {
	
	public static <E> boolean iguales (Iterable <E> l1, Iterable <E> l2) {
		boolean sonIguales = true;
		Iterator<E> it1 = l1.iterator();
		Iterator<E> it2 = l2.iterator();
		while(it1.hasNext() && it2.hasNext() && sonIguales) {
			E e1 = it1.next();
			E e2 = it2.next();
			sonIguales = e1.equals(e2);
		}
		return !it1.hasNext() && !it2.hasNext() && sonIguales;
	}
	//Un iterable no tiene size()

	public static boolean estaOrdenada(Iterable<Integer> l) {
		Iterator <Integer> cursor = l.iterator();
		boolean estaOrdenada = true;
		Integer elementoPrevio = null;
		while (cursor.hasNext() && estaOrdenada) {
			Integer lE = cursor.next();
			if(elementoPrevio != null) {
				estaOrdenada = elementoPrevio <= lE;
			}
			elementoPrevio = lE;
		}
		return estaOrdenada;
	}	
	
	/**public static <E> boolean member(E e, Iterable<E>l){
		Iterator <E> cursor = l.iterator();
		boolean encontrado = false;
		while(cursor.hasNext() && !encontrado) {
			E lE = cursor.next();
			encontrado = e.equals(lE);
		}
		return encontrado;
	}
	*/
	
	public static <E> boolean member(E e, Iterable<E>l){
		for (E lE : l) {
			if (e.equals(lE)) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		PositionList<Integer> lp = new NodePositionList<>(new Integer [] {1,2,3,2,5});
		IndexedList<String> li = new ArrayIndexedList<>(new String[] {"Hola","hi","hello"});
		System.out.println(lp+"¿Contiene 5? "+member(5,lp));
		System.out.println(lp+"¿Contiene 10? "+member(10,lp));
		System.out.println(li+"¿Contiene hello? "+member("hello",li));
		System.out.println(li+"¿Contiene clase? "+member("clase",li));
		System.out.println(lp+"¿Está ordenada? "+estaOrdenada(lp));
		System.out.println(lp+ " y " + lp + " ¿Están iguales? " + iguales(lp,lp));
	}

}
