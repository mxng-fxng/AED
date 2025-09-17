//17 septiembre 2025
package Clases;

import es.upm.aedlib.indexedlist.IndexedList;
import es.upm.aedlib.indexedlist.ArrayIndexedList;

Public class Utils {

	//Busca e dentro de la lista l, l no esta ordenada
	public static boolean member (IndexedList<Integer> l, Integer e){
		int index = 0;
		boolean encontrado = false;
		while(!encontrado && index <l.size()){
			Integer lE = l.get(index);
			encontrado = e.equals(lE);
			index++:
		}

		return encontrado;
	}

	//si i1 == null entonces i2 == null o i1.equals(i2)
	static boolean eqNull (Integer i1, Integer i2){
		if (i1 == null) return i2 == null;
		else return i1.equals(i2);
	}

	public static void main (String[]args){
		ArrayIndexedList<Integer> l = new ArrayIndexedList<>(new Integer[] {1,2,3,4,5,2,-1});
		System.out.println(l + "¿Tiene 3?" + member (l,3));
		System.out.println(l +"¿Tiene -1?" + member (l,-1));
		System.out.println(l +"¿Tiene 22?" + member (l,22));
	
		ArrayIndexedList<Integer> l2 = new ArrayIndexedList<>(new Integer[] {1,2,3,4,5,null,2,-1});
		System.out.println(l + "¿Tiene 3?" + member (l,3));
		System.out.println(l +"¿Tiene -1?" + member (l,-1));
		System.out.println(l +"¿Tiene 22?" + member (l,22));
		System.out.println(l +"¿Tiene null?" + member (l,null));
	}
}