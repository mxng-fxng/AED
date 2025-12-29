package aed.multisets;

import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.positionlist.NodePositionList;



public class MultiSetList<E> implements MultiSet<E> {
  
  private PositionList<Pair<E,Integer>> elements;
  private int size;
  
  /**
   * Construye un multiset vacio.
   */
  public MultiSetList() { 
    this.elements = new NodePositionList<Pair<E,Integer>>();
    this.size = 0;
  }
  
  /**
   * Añade n copias de elem al multiset. Notad que elem podria ser null.
   * @throws IllegalArgumentException si n<0.
   */
  public void add(E elem, int n) {

		if(n < 0) throw new IllegalArgumentException();
		else if(n == 0) return;
		else {
			boolean encontrado = false; 
			Position<Pair<E,Integer>> cursor = elements.first();

			while(!encontrado && cursor != null) {
				Pair<E,Integer> par = cursor.element();
				E elemCurs = par.getLeft();
				Integer mult = par.getRight();

				if((elem == null && elemCurs == null) || 
						(elem != null && elem.equals(elemCurs))) {
					encontrado = true;
					par.setRight(mult+n);
				}

				else
					cursor = elements.next(cursor);
			}


			if(!encontrado) {
				Pair<E,Integer> nuevo = new Pair<E,Integer>(elem,n);
				elements.addLast(nuevo);
			}

			size += n;
		}
	} 

 
  
  /**
   * Borra n copias de elem en el multiset. Si no hay al menos n
   * copias no se borra ningun copia. Notad que elem podria ser null.
   * Devuelve true si logro borrar n copias, y false si no.
   *
   * @throws IllegalArgumentException si n<0.
   */
  public boolean remove(E elem, int n) {
		// si n < 0, lanzamos excepcion
		if(n < 0)
			throw new IllegalArgumentException();

		// indica si hemos conseguido eliminar el elemento (o NO) 
		boolean borrado = false;

		// indica si el elemento esta en la lista
		boolean encontrado = false;

		// Recorremos la lista de nodos hasta llegar a elem 
		Position<Pair<E,Integer>> cursor = elements.first();
		while(!encontrado && cursor != null) {
			Pair<E,Integer> par = cursor.element();
			E elemActual = par.getLeft();

			encontrado = (elem == null && elemActual == null) || 
					(elem != null && elem.equals(elemActual));

			if(encontrado) {
				// si lo hemos encontrado y disponemos de la cantidad necesaria, 
				// modifico la derecha del par e indico que he borrado 
				// OJO: si n = par.right() -> ELIMINO EL NODO POR COMPLETO
				// En cualquier caso, modifico el tamanio 
				int diferencia = par.getRight() - n;
				if(diferencia == 0) {
					elements.remove(cursor);
				}
				else if(diferencia > 0) {
					par.setRight(par.getRight()-n); 
				}

				if(diferencia >= 0) { 	// si se ha podido borrar, 
					size -= n;			// modifico el tamanio
					borrado = true;		// e indicamos que lo hemos podido eliminar
				}
			}

			else { // si no lo he encontrado, paso al siguiente nodo (sigo buscando)
				cursor = elements.next(cursor);
			}
		}

		return borrado || n == 0;
	}

  
  /**
   * Devuelve el numero de copias de elem en el multiset.
   * Notad que elem podria ser null.
   *
   * @throws IllegalArgumentException si n<0.
   */
  public int multiplicity(E elem) {
		int mult = 0; // representa el numero de ocurrecias de <elem>

		// Recorremos la lista de posiciones con un cursor
		Position<Pair<E,Integer>> cursor = elements.first();

		// Mientras que no lo haya encontrado y me queden nodos en la lista por recorrer:
		while(mult == 0 && cursor != null) {
			// Me quedo con el contenido del nodo que es un par: 
			Pair<E,Integer> parActual = cursor.element();

			// Me quedo con el elemento que esta a la izq del par: 
			E elemActual = parActual.getLeft();
			// Si los dos son null o son distintos de null pero iguales entre si
			if((elem == null && elemActual == null) || 
					(elem != null && elem.equals(elemActual))) {
				// Lo he encontrado, devuelvo la parte derecha del par (multiplicidad)
				mult = parActual.getRight();
			}

			else { // si no, sigo buscando, es decir,
				cursor = elements.next(cursor); // avanzo al siguiente nodo de la lista
			}
		}

		return mult;
	}

  
  /**
   * Devuelve el numero total de copias de elementos en el multiset.
   * Por ejemplo, si s = {a,b,a,b,b} entonces s.size() devuelve 5.
   */
  public int size() {
	  return size;
  }
  
  /**
   * Devuelve true si el multiconjunto es vacio, y false si no es vacio.
   */
  public boolean isEmpty(){
	  return size == 0;
  }
  
  /**
   * Devuelve una lista con los elementos que tiene una multiplicidad > 0
   * dentro el multiconjunto.
   * El orden de los elementos en el resultado no importa.
   * Por ejemplo, si s = {a,b,a,b,b} entonces devuelve la lista [a,b].
   */
	public PositionList<E> elements() {
		// Creamos la lista resultado vacia:
		PositionList<E> res = new NodePositionList<E>();

		// Recorremos por completo la lista de pares con el cursor:
		Position<Pair<E,Integer>> cursor = elements.first();

		// Mientras que me queden nodos en la lista 
		while(cursor != null) {
			// anado la parte izq del cursor (nodo) a la lista resultado
			Pair<E,Integer> par = cursor.element();
			E elem = par.getLeft();
			res.addLast(elem);

			// avanzo al siguiente nodo de la lista 
			cursor = elements.next(cursor);
		}

		return res;
	}
  
  /**
   * Devuelve un multiset nuevo que es la suma de this y s.
   * Por ejemplo, si this={a,b,b} y s={a,a,c} entonces devuelve el multiconjunto
   * {a,a,a,b,b,c}.
   */
	public MultiSet<E> sum(MultiSet<E> s) {
		MultiSet<E> res = new MultiSetList<E>();
		Position<Pair<E,Integer>> cursor = elements.first();
		PositionList<E> op = s.elements();
		Position<E> cursorOp = op.first();
		
		while(cursor != null) {
			Pair <E,Integer> par = cursor.element();
			
			res.add(par.getLeft(), par.getRight());
			cursor = elements.next(cursor);
		}

		while(cursorOp != null) {
			E elemOp = cursorOp.element();
			res.add(elemOp,s.multiplicity(elemOp));
			cursorOp = op.next(cursorOp);
		}

		return res;
	}
  
  /**
   * Devuelve un multiset nuevo que es "this resta s".
   * Por ejemplo, si this={a,a,b,b} y s={a,c} entonces devuelve el multiconjunto
   * {a,b,b}.
   */
	public MultiSet<E> minus(MultiSet<E> s) {
		// Creamos el nuevo multiconjunto a devolver:
		MultiSet<E> res = new MultiSetList<E>();

		// Recorro TODA la lista de elements del multiconjunto this:
		Position<Pair<E,Integer>> cursor = elements.first();
		while(cursor != null) {
			// Obtengo el par:
			Pair<E,Integer> par = cursor.element();

			// Me quedo con el elemento del par:
			E elem = par.getLeft();

			// Miro la nueva cantidad a meter en la lista resultado: 
			int n = par.getRight() - s.multiplicity(elem);
			if(n > 0)  // si es positiva, le anado a la lista resultado
				res.add(elem, n);

			// en cualquier caso, paso al siguiente elemento de la lista 
			cursor = elements.next(cursor);
		}

		return res;
	}
  
  /**
   * Devuelve un multiset nuevo que es la interseccion de this y s.
   * Por ejemplo, si s={a,a,b,b} y this={a,c} entonces devuelve el multiconjunto {a}.
   */
	public MultiSet<E> intersection(MultiSet<E> s) {

		MultiSet<E> resultado = new MultiSetList<E>();
		Position<Pair<E,Integer>> cursor = elements.first();
		
		while(cursor != null) {
			
			Pair<E,Integer> par = cursor.element();
			E elem = par.getLeft();
			int multip = par.getRight();
			
			if(s.multiplicity(elem) < multip) {
				multip = s.multiplicity(elem);
			}
			if(multip > 0) {
				resultado.add(elem, multip);
			}
			cursor = this.elements.next(cursor);
		}

		return resultado;
	}

  
  /**
   * Devuelve true si this es un submultiset de s, y false si no.
   * Por ejemplo, si s={a,b} y this={a} devuelve true,
   * si s={a} y this={a} devuelve true,
   * si s={a} y this={a,b} devuelve false,
   * y si s={a} y this={a,a} devuelve false,
   */
	public boolean subsetEqual(MultiSet<E> s) {
		// Creamos la booleana que indique si this esta contenido en la lista s
		boolean contenido = true; 	// por defecto esta contenido, en cuanto una posicion sea menor
									// en el multiconjunto s (o no este), PARAMOS y devolvemos FALSE 
		
		// Recorremos la lista this:
		Position<Pair<E,Integer>> cursor = elements.first();
		while(contenido && cursor != null) {
			// Me quedo con el elemento:
			Pair<E,Integer> par = cursor.element();
			E elem = par.getLeft();
			
			// compruebo si esta contenido en la lista s: 
			contenido = par.getRight() <= s.multiplicity(elem);
			
			// avanzo al siguiente nodo de la lista 
			cursor = elements.next(cursor);
		}
		
		return contenido;
	}
  
  
}


//49 errores