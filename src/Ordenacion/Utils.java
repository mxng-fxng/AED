package Ordenacion;
import es.upm.aedlib.indexedlist.*;

public class Utils {
	

	
	public static <E extends Comparable <E>> void insert (E e, IndexedList<E> l) {
		//Asumimos que la lista l está ya ordenada
		System.out.println("insert(" + e + "," + l + ")");
		int i = 0;
		boolean inserted = false;
		while (i <l.size() && !inserted) {
			E lE = l.get(i);
			System.out.println("in loop, lE =" + lE + "e =" + e + "i =" + i + "l =" + l);
			//if ("e <= le")
			if(e.compareTo (lE) <= 0){
				l.add(i,e);
				inserted = true;
			}
			i++;
		}
		if(!inserted) l.add(l.size(), e);
		
	}

	public static void main(String[] args) {
		IndexedList <Integer> l = new ArrayIndexedList <> ();
		insert(1,l);
		insert (22,l);
		insert(-4,l);
		insert(1,l);
		insert(10,l);
		System.out.println(l);

	}

}