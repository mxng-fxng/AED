package aed.individual6;

import java.util.Comparator;
import es.upm.aedlib.tree.*;
import es.upm.aedlib.Position;

public class BinaryTreeUtils {

  public static <E extends Comparable<E>> boolean isBinarySearchTree(BinaryTree<E> t) {
	  if (t.isEmpty()) { // Si el árbol está vacío
		  return true;
	  }
	  
	  return isBinarySearchTree(t, t.root(), null, null); 
  }
  private static <E extends Comparable<E>> boolean isBinarySearchTree(BinaryTree<E> t, Position<E> v, E min, E max) {
	    if (v == null) return true;
	    
	    E elem = v.element();
	    
	    if (min != null && elem.compareTo(min) <= 0) return false;
	    if (max != null && elem.compareTo(max) >= 0) return false;
	    
	    if (!isBinarySearchTree(t, t.left(v), min, elem)) return false;
	    if (!isBinarySearchTree(t, t.right(v), elem, max)) return false;
	    
	    return true;
	}
  

  public static <E extends Comparable<E>> void fillMaxTree(BinaryTree<E> t) {
	  
	  if (t.isEmpty()) {
		  return;
	  }
	  
	  fillMaxTreeR(t, t.root());
  }
  
  private static <E extends Comparable<E>> E fillMaxTreeR(BinaryTree<E> t, Position<E> nodo) {
	  if (nodo == null) {
		  return null;
	  }
	  
	  if (t.isExternal(nodo)) {
		  return nodo.element();
	  }

	  E iMax = fillMaxTreeR(t, t.left(nodo));
	  E rMax = fillMaxTreeR(t, t.right(nodo));
	  
	  E max = null;
	  
	  if (iMax != null && rMax != null) {
		  if (iMax.compareTo(rMax) > 0) {
			    max = iMax;
			} 
		  else {
			    max = rMax;
			}
	  } 
	  else if (iMax != null) {
		  max = iMax;
	  } 
	  else if (rMax != null) {
		  max = rMax;
	  }
	
	  if (max != null) {
		  t.set(nodo, max);
	  }
	  
	  return max;
	  
  }

}