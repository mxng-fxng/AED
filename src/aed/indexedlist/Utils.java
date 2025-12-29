package aed.indexedlist;
import es.upm.aedlib.indexedlist.*;

public class Utils {
    public static <E> IndexedList<E> deleteRepeated(IndexedList<E> l) {
    	IndexedList<E> sinRepeticion = new ArrayIndexedList<E>();
        if (l == null) throw new IllegalArgumentException();  //la lista no puede ser null             
        if (l.size() == 0) return sinRepeticion; //lista vacía
        
        // Recorree la lista indexada l
        for (int i = 0; i < l.size(); i++) {
            E elemento = l.get(i); //Guarda el elemento actual en una variable aparte para poder compararlo
            
            // Comprueba si el elemento está repetido en la lista indexada
            boolean repetido = false;
            for (int j = 0; j < sinRepeticion.size() && repetido == false; j++) {
                if (sinRepeticion.get(j).equals(elemento)) {
                    repetido = true;
                }
            }
            
            // Si no está repetido,se añade al final, para seguir el orden
            if (repetido == false) {
                sinRepeticion.add(sinRepeticion.size(), elemento);
            }
        }
        
        return sinRepeticion;
    }
}