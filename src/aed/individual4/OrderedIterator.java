package aed.individual4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.PositionList;

public class OrderedIterator implements Iterator<Integer> {

	private PositionList<Integer> lista; //Lista 
    private Position<Integer> cursor; //cursor que recorre la lista
    private Integer ultimoDevuelto; //Ultimo entero devuelto
    
    public OrderedIterator(PositionList<Integer> list) {
        lista = list;
        cursor = list.first();
        ultimoDevuelto = null;
    }
    
    public boolean hasNext() {
        if (cursor == null) { //lista vacía
            return false;
        }
        
        // Si aún no hemos devuelto ninguno, el primero siempre se devuelve
        if (ultimoDevuelto == null) {
            return true;
        }
        
        // Buscar el siguiente elemento >= ultimoDevuelto
        Position<Integer> aux = cursor;
        while (aux != null) { //mientras no se acabe la lista
            if (aux.element().compareTo(ultimoDevuelto) >= 0) { //Si el siguiente es mayor igual
                return true;
            }
            aux = lista.next(aux); //avanza puntero
        }
        
        return false;
    }
    
    public Integer next() {
        if (!hasNext()) throw new NoSuchElementException();
        
        // Si la lista solo tiene un elemento, devolverlo directamente
        if (ultimoDevuelto == null) { 
            ultimoDevuelto = cursor.element();
            cursor = lista.next(cursor); //Hay que dejar avanzado el puntero
            return ultimoDevuelto;
        }
        
        // Buscar el siguiente elemento >= ultimoDevuelto
        while (cursor != null) { //Mientras haya lista
            if (cursor.element().compareTo(ultimoDevuelto) >= 0) {//Si el actual es mayor igual que el ultimoa
                ultimoDevuelto = cursor.element(); //Se actualiza el elemento a devolver
                cursor = lista.next(cursor); //Avanza el cursor
                return ultimoDevuelto;
            }
            cursor = lista.next(cursor); //avanza el cursor si no
        }
        
        throw new NoSuchElementException();
    }
  
}
  
