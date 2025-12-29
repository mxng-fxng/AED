package PositionList;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.Position;

public class Utils {

	//Comprobación, dada una lista (1/10)
	public static <E extends Comparable<E>> boolean estaOrdenada (PositionList<E> l) {
		Position <E> cursor = l.first();
		boolean estaOrdenada = true;
		
		while(cursor != null && estaOrdenada) {
			E e = cursor.element();
			Position <E> nextPosition = l.next(cursor);
			if (nextPosition != null) {
				E nextE = nextPosition.element();
				estaOrdenada = e.compareTo(nextE) <= 0;
			}
			cursor = l.next(cursor);
		}
		return estaOrdenada;
	}
	
	//invertir, dada una lista (3/10)
	public static <E> PositionList <E> invertir (PositionList<E> l){
		NodePositionList<E> resultado = new NodePositionList<>();//No hace falta especificar el tipo en el new
		
		Position<E> cursor = l.first(); //No importa si empiezas por el primero o el último
		while (cursor != null) {
			E e = cursor.element();
			resultado.addFirst(e);
			cursor = l.next(cursor);
		}
		
		
		return resultado;
	}
	
	/*Otra implementación desde el utimo elemento
	public static <E> PositionList <E> invertir (PositionList<E> l){
		NodePositionList<E> resultado = new NodePositionList<>();//No hace falta especificar el tipo en el new
		
		Position<E> cursor = l.last(); //No importa si empiezas por el primero o el último
		while (cursor != null) {
			E e = cursor.element();
			resultado.addFirst(e);
			cursor = l.prev(cursor);
		}
		
		
		return resultado;
	}
	*/
	
	public static <E> void deleteAllInPlace (E e, PositionList<E> l){
		Position<E> cursor = l.first();
		while (cursor !=null) {
			E lE = cursor.element();
			Position<E> next = l.next(cursor);
			if (e.equals(lE)) {
				l.remove((cursor));
			}
			cursor = next;	
		}
	}
	
	public static <E> PositionList <E> deleteDuplicates (PositionList<E> l) {
		NodePositionList<E> resultado = new NodePositionList<>();
		Position <E> cursor = l.first();
		while(cursor != null) {
			E e = cursor.element();
			Position <E>nuevoCursor = resultado.first();
			boolean encontrado = false;
			while(nuevoCursor != null && !encontrado) {
				E nE = nuevoCursor.element();
				encontrado = e.equals(nE);
				nuevoCursor = resultado.next(nuevoCursor);
			}
			if(!encontrado) {
				resultado.addLast(e);
			}
			cursor = l.next(cursor);
			}
		return resultado;
	}
	
/*	Alternativa con metodo auxiliar (completar)
	public static <E> PositionList <E> deleteDuplicates (PositionList<E> l) {
		NodePositionList<E> resultado = new NodePositionList<>();
		Position <E> cursor = l.first();
		while(cursor != null) {
			E e = cursor.element();
			if (!pertenece(e,resultado)) {
				resultado.addLast(e);
			}
			cursor = l.next(cursor);
		}
		return resultado;
	}
	
	public static <E> boolean pertenece (E e, PositionList<E> l) {
		Position <E> cursor = l.first();
			boolean encontrado = false;
			while(cursor != null && !encontrado) {
				E nE = cursor.element();
				encontrado = e.equals(nE);
				cursor = l.next(cursor);
			}
			if(!encontrado) {
				l.addLast(e);
			}
			cursor = l.next(cursor);
			return encontrado;
	}
	*/	
	
	
	
	public static void main(String[] args) {
		PositionList<Integer> l = new NodePositionList<>(new Integer [] {1,2,3,4,5,1,3,5,2});
		System.out.println("la lista " + l + " ¿Está ordenada? "+ "\n" + estaOrdenada(l));
		System.out.println("la lista " + l + " invertida es "+ "\n" + invertir(l));	
		System.out.println("la lista " + l + " sin duplicados "+ "\n" + deleteDuplicates(l));
		System.out.println("la lista " + l + " antes de borrar 1");
		deleteAllInPlace(1,l);
		System.out.println("la lista " + l + " despues de borrar 1");
	
	}
}