package aed.huffman;

import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.map.*;
import es.upm.aedlib.tree.*;
import es.upm.aedlib.priorityqueue.*;


public class Huffman {

  public static Map<Character,Integer> frequencies(String texto) { 
	  Map<Character,Integer> freq = new HashTableMap<>();
	  for(int i  = 0; i < texto.length() ; i++) {
		  Character car = texto.charAt(i);
		  if(freq.containsKey(car) == false) { //Si no está se hace una entrada nueva
			  freq.put(car, 1); //Crea una entrada nueva con el caracter y la frecuencia a 1
		  }
		  else {//Si ya está pues se aumenta en 1 la frecuencia
			   freq.put(car, freq.get(car) + 1);//Nueva entrada actualizada, incrementa en 1 la frecuencia
		  }
	  }
    return freq;
  }

   
  public static BinaryTree<Character> constructHuffmanTree(Map<Character,Integer> charCounts) { //Yo
	  if(charCounts.isEmpty())throw new IllegalArgumentException();
	  
	  PriorityQueue<Integer,BinaryTree<Character>> Q = new  SortedListPriorityQueue<>();
	  //Para todos los caracteres c dentro de charCounts
	  for (Character c : charCounts.keys()) {
		  BinaryTree<Character> t = new LinkedBinaryTree<>(); //Crea un arbol binario T
		  t.addRoot(c); //Con un solo nodo con c como elemento
		  Q.enqueue(charCounts.get(c), t); //Inserta una entrada en q con la frecuencia de c como clave y t como valor
	  } 
	//Tras ya tener la lista de prioridad
	  while (Q.size() > 1) {
		  //Coge del final de la cola los menores
		  Entry <Integer, BinaryTree<Character>> l = Q.dequeue();
		  Entry <Integer, BinaryTree<Character>> r = Q.dequeue();
		  
		  //Crea un nuevo árbol con las entradas izquierda y derecha
		  LinkedBinaryTree <Character> T = new LinkedBinaryTree<>();
		  Position <Character> p = T.addRoot(' ');
		  
		  copiarArbol(l.getValue(), l.getValue().root(), T, p, true);
		  copiarArbol(r.getValue(), r.getValue().root(), T, p, false);
		  
		  Integer freqSum = l.getKey()+r.getKey();
		  
		  Q.enqueue(freqSum, T);
	  }
	  return Q.dequeue().getValue();
  }

	private static void copiarArbol(BinaryTree<Character> origen, Position<Character> posOrigen, LinkedBinaryTree<Character> destino, Position<Character> posDestino, boolean Izquierdo) {
	    // Insertar el nodo actual
	    Position<Character> P;
	    if (Izquierdo) {
	        P = destino.insertLeft(posDestino, posOrigen.element());
	    } else {
	        P = destino.insertRight(posDestino, posOrigen.element());
	    }
	    
	    // Si tiene hijos --> copiarlos
	    if (!origen.isExternal(posOrigen)) {
	        if (origen.left(posOrigen) != null) {
	            copiarArbol(origen, origen.left(posOrigen), destino, P, true);
	        }
	        if (origen.right(posOrigen) != null) {
	            copiarArbol(origen, origen.right(posOrigen), destino, P, false);
	        }
	    }
	}

	public static <E> BinaryTree<E> joinTrees(E e,
			BinaryTree<E> leftTree,
			BinaryTree<E> rightTree) {
		BinaryTree<E>pino=new LinkedBinaryTree<>();
		pino.addRoot(e);
		añadir(pino, pino.root(), leftTree, leftTree.root(), "izq");
		añadir(pino,pino.root(), rightTree, rightTree.root(), "der");
		return pino;
	}
	private static <E> void añadir(BinaryTree<E> chopo,Position<E>n,
			BinaryTree<E> t2,Position<E>n2,String pos){
		if(n2!=null) {
			if(pos.equals("izq")) {n = chopo.insertLeft(n, n2.element());}
			else {n = chopo.insertRight(n, n2.element());}
			añadir(chopo, n, t2, t2.left(n2), "izq");
			añadir(chopo, n, t2, t2.right(n2), "der");
		}
	}

	public static Map<Character,String> characterCodes(BinaryTree<Character> tree) {
		Map<Character,String>res=new HashTableMap<>();
		String cod="";
		codesAux(tree,tree.root(),res,cod);
		return res;
	}
	private static void codesAux(BinaryTree<Character> arce,Position<Character>n,
			Map<Character,String> res,String cod) {
		if(n!=null) {
			if(!arce.isRoot(n)) {
				if(arce.left(arce.parent(n)) == n) {cod += "0";}
				else if(arce.right(arce.parent(n)) == n) {cod += "1";}
			}
			if(!arce.isInternal(n)) {res.put(n.element(), cod);}
			else {
				codesAux(arce, arce.left(n),res,cod);
				codesAux(arce, arce.right(n),res,cod);
			}
		}
	}
  public static String encode(String text, Map<Character,String> map) {
		String res="";
		char[] cad=text.toCharArray();
		for(int i=0; i<text.length();i++) {
			if(map.containsKey(cad[i])) {
				res+=map.get(cad[i]);
			}
		}
		return res;
	}

  public static String decode(String encodedText, BinaryTree<Character> huffmanTree) {
	  String decod = "";
	  Position <Character> p = huffmanTree.root(); //Recorre el arbol
	for(int i = 0; i < encodedText.length(); i++) { //Recorre caracter a caracter el String
		char c = encodedText.charAt(i);
		if(c == '0') { //Izquierda
			p = huffmanTree.left(p);
		}
		else if(c == '1') {//Derecha
			p = huffmanTree.right(p);
		}
		if(huffmanTree.isExternal(p)) { //Si es hoja
			decod = decod + p.element();
			p = huffmanTree.root(); //Hay que volver a iniciar el cursor
		}
	}
    return decod;
  }

  
}
