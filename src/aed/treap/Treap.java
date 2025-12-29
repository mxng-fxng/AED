package aed.treap;

import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.tree.*;
import java.util.Iterator;
import java.util.Random;

public class Treap<E extends Comparable<E>> implements Iterable<E> {
  private LinkedBinaryTree<Pair<E,Integer>> treap;
  private Random rand;

  public Treap() {
    this.treap = new LinkedBinaryTree<Pair<E,Integer>>();
    this.rand = new Random();
  }
  
  public int size() { //Número de nodos que tiene
	  int contador = 0;
	  Iterator <Pair<E,Integer>> t = treap.iterator();
	  while(t.hasNext()) {
		  contador ++;
		  t.next();
	  }
	  return contador;
  }

  public boolean isEmpty() {
    return this.size()==0;
  }

  public boolean add(E e) { //Añade un nodo
	  if(e==null) { //Si el elemento es null
		  throw new IllegalArgumentException();
		  }
	 
	  //Si no es null, crea el nuevo par
	  Pair<E, Integer> nuevo = new Pair<>(e, rand.nextInt()); //Par nuevo del nodo que queremos poner
	  
	    // Si el árbol está vacío, insertar como raíz
	    if (treap.isEmpty()) {
	        treap.addRoot(nuevo);
	        return true;
	    }
	  
	    //Posición donde está e o debería estar
	  Position <Pair<E,Integer>> p = search(e,treap.root()); //Posición donde debería ir o está
	  
	  if(p.element().getLeft().equals(e)) { //Si está el elemento
		  return false;
	  }
	  
	  //SI no está el elemento
	  //Primero insertar según la clave, comparamos la calve del padre de la posición donde debería ir
	  if(p.element().getLeft().compareTo(e) > 0) { //Si la calve del padre es menor
		  p = treap.insertLeft(p, nuevo); //Se actualiza la posición p (a la derecha)
	  }

	  else{ //Si el padre es mayor o igual
		  p = treap.insertRight(p, nuevo); //Se actualiza la posición p (a la izquierda)
	  }
	  
	  //Reordenar según la prioridad
	  //Mientras p no sea la posición de root y la prioridad del padre sea menor que la de p
	  while(!treap.isRoot(p) && p.element().getRight().compareTo(treap.parent(p).element().getRight()) < 0) {
		 treap.rotate(p);
	  }
	  return true;
	  
  }

  public boolean remove(E e) {
	  if(e==null) {throw new IllegalArgumentException();}
	  
	  if(treap.isEmpty()) {return false;}

	  Position<Pair<E,Integer>> aux= search(e, treap.root());
	  
	 if(aux.element().getLeft().compareTo(e) == 0){
	  while(treap.isInternal(aux)) { 
			Position<Pair<E,Integer>> cont;
			if(!treap.hasLeft(aux)) {
				cont = treap.right(aux);
			}
			else if(!treap.hasRight(aux)) {
				cont = treap.left(aux);
			}
			else {
				if(treap.left(aux).element().getRight().compareTo(
						treap.right(aux).element().getRight()) < 0) {
					cont = treap.left(aux);
				}
				else {
					cont = treap.right(aux);
				}
			}
			treap.rotate(cont);
		}
		treap.remove(aux);
		return true;
	 }
	 return false;
  }
	

  private Position<Pair<E,Integer>> search(E e, Position<Pair<E,Integer>> nodo){
	  if(isEmpty()) {return null;} //SI está vacío
	  
	  //Position<Pair<E,Integer>> res= null;
	  
	  E elem = nodo.element().getLeft(); //Elemento del nodo
	  
	  if(elem.equals(e)) {return nodo;} //Si es la misma clave
	  
	  if(elem.compareTo(e)>0) {//Si la calve del nodo es mayor que e
		  if(treap.hasLeft(nodo)) {return search (e, treap.left(nodo));}
		  return nodo;
	  }
	  
	  if(treap.hasRight(nodo)) 	{return search(e, treap.right(nodo));}
	  return nodo;
  }

  public boolean contains(E e){ //si contiene un elemento
	  if(e==null) {throw new IllegalArgumentException();}
	  for ( Pair<E,Integer> par : treap){ //Recorre el treap
		  if(par.getLeft().equals(e)) { //Si lo encuentra
			  return true;
		  }
	  }
	  return false; //Para el resto de casos
  }

  public Iterator<E> iterator(){  
	PositionList<E> res = new NodePositionList<E>(); 
	ordenar(res,treap.root());
	return res.iterator();
}

private void ordenar(PositionList<E> lista, Position<Pair<E,Integer>> pos) {
	if(pos != null) {
		ordenar(lista, treap.left(pos));
		lista.addLast(pos.element().getLeft());
		ordenar(lista,treap.right(pos));
	}
}
  
  @Override
  public String toString() {
    return treap.toString();
  }
  
}
