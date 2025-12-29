package aed.cache;

import es.upm.aedlib.Entry;
import es.upm.aedlib.Position;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.InvalidKeyException;


public class Cache<Key,Value> {
  

  // Tamano de la cache
  private int maxCacheSize;

  // NO MODIFICA ESTOS ATTRIBUTOS, NI CAMBIA SUS NOMBRES: mainMemory, cacheContents, keyListLRU

  // Para acceder a la memoria M
  private Storage<Key,Value> mainMemory;
  // Un 'map' que asocia una clave con un ``CacheCell''
  private Map<Key,CacheCell<Key,Value>> cacheContents;
  // Una PositionList que guarda las claves en orden de
  // uso -- la clave mas recientemente usado sera el keyListLRU.first()
  private PositionList<Key> keyListLRU;
  


  // Constructor de la cache. Especifica el tamano maximo 
  // y la memoria que se va a utilizar
  public Cache(int maxCacheSize, Storage<Key,Value> mainMemory) {
    this.maxCacheSize = maxCacheSize;

    // NO CAMBIA
    this.mainMemory = mainMemory;
    this.cacheContents = new HashTableMap<Key,CacheCell<Key,Value>>();
    this.keyListLRU = new NodePositionList<Key>();
  }
  


  // Devuelve el valor que corresponde a una clave "Key"
	public Value get(Key key) {
		Value valor = null;

		if(cacheContents.containsKey(key)) { //si está key en cache
			CacheCell<Key, Value> celda = cacheContents.get(key);
			valor = actualizarCache(key, celda.getValue(), celda.getDirty());
		}
		else if(mainMemory.table.containsKey(key)) { //si está en memoria
			valor = actualizarCache(key, mainMemory.read(key),false);
		}
		return valor;
		
	}
		
		private Value actualizarCache(Key key, Value value, boolean dirty) {
			CacheCell<Key, Value> celda = null;

			Position<Key> pos = posicionActual(key);
			if(pos != null) { // si está en cache
				keyListLRU.remove(pos);
			}
			keyListLRU.addFirst(key);		// se añade la primera

			celda = cacheContents.get(key); //Celda de la key en cache
			if(cacheContents.containsKey(key)) { //Si la clave estaba en cache, se tiene solo que actualizar valores
				celda.setPos(keyListLRU.first()); //Se pone la primera
				celda.setValue(value); //se le asigna el nuevo valor
				celda.setDirty(dirty);
			}

			// si no estaba la celda antes, la creo y la añado al principio
			else {
				celda = new CacheCell<Key, Value>(value,dirty,keyListLRU.first());
				cacheContents.put(key, celda);
			}

			actualizarMP(); //Hay que actualizar la MP
			
			return celda.getValue();
		}

		private Position<Key> posicionActual(Key key) {
			Position<Key> posicion = null;
			Position<Key> cursor = keyListLRU.first(); //cursor que recorre la lista
			while(posicion == null && cursor != null) {
				if(cursor.element().equals(key)) { //Si el elemento del cursor coincide con la clave, hemos llegado a la posición en la que está la key
					posicion = cursor;
				}
				else { 
					cursor = keyListLRU.next(cursor); // Avanza
				}
			}
			return posicion;
		}
	
		 private void actualizarMP() {
				if(maxCacheSize < keyListLRU.size()) { //Si se alcanza la capacidad máxima de la cache, hay que borrar el último elemento de la cache y la memoria
					Key ultimo = keyListLRU.last().element();
					keyListLRU.remove(keyListLRU.last());

					if(cacheContents.get(ultimo).getDirty()) { //si está dirty, hay que modificar el contenido en la memoria
						mainMemory.write(ultimo, cacheContents.get(ultimo).getValue());
					}
					
					cacheContents.remove(ultimo);
				}
			}
  
	public void put(Key key, Value value) {
		actualizarCache(key,value,true);
	}



  // NO CAMBIA
  public String toString() {
    return "cache";
  }
}


