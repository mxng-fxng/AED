package aed.almacen;

import es.upm.aedlib.indexedlist.IndexedList;
import es.upm.aedlib.indexedlist.ArrayIndexedList;


/**
 * Implementa la logica del almacen.
 */
public class Almacen implements ClienteAPI, AlmacenAPI, ProductorAPI {

  // Compras (sin ningun orden especial)
  private ArrayIndexedList<Compra> compras;
  // Productos ordenados ascendamente usando el productoId de un Product.
  private ArrayIndexedList<Producto> productos;

  // No es necesario cambiar el constructor
  /**
   * Crea un almacen.
   */
  public Almacen() {
    this.compras = new ArrayIndexedList<>();
    this.productos = new ArrayIndexedList<>();
  }

    /**
     * Devuelve un producto que esta en el almacén (o null si no esta).
     */
    public Producto getProducto(String productoId) {
    	Producto producto = null;
    	boolean hay=false; //he cambiado esto, porque de esta manera el bucle no se recorre infinitamente
  	  for (int i = 0; !hay && i<this.productos.size(); i++) { //Recorre la lista indexada
  		  Producto pr=this.productos.get(i);
  		  if(pr.getProductoId().equals(productoId)) {
  			  producto = pr;
  			  hay=true;}
  	  }
  	  return producto;
    }

    /**
     * Devuelve una compra (o null si no existe).
     */
    public Compra getCompra(Integer compraId) {
    	Compra compra = null;
    	boolean hay=false;
  	  for (int i = 0; !hay && i<this.compras.size(); i++) { //Recorre la lista indexada
  		  
  		  if(this.compras.get(i).getCompraId().equals(compraId)) {
  			  compra = this.compras.get(i);
  			  hay=true;}
  		  		
  	  }
  	  return compra;
    }

    /**
     * Todos los productos conocidos, ordenados por productoId en orden ascendente.
     * Notad que la lista devuelta tiene que ser nueva, es decir, no se puede
     * devolver la lista que contiene el atributo productos dentro la clase Almacen.
     */
    public IndexedList<Producto> getProductos(){
    	IndexedList<Producto> res=new ArrayIndexedList<Producto>();
    	int cont;
    	String contS;
    	int medio=0;
    	for(int i=0; i<productos.size(); i++) {
    		if(productos.isEmpty()) {
    			productos.add(0, productos.get(i) );
    		}
    		else{
    			cont=productos.get(i).getCantidadDisponible();
    			contS=productos.get(i).getProductoId();
    			int izquierda = 0;
    	        int derecha = res.size();
    	        
    	       	while (izquierda <= derecha) {
    	            medio = izquierda + (derecha - izquierda) / 2;
    				if (cont<=productos.get(medio).getCantidadDisponible()
    						&& contS.compareTo(productos.get(medio).getProductoId())<0) {
    	                derecha = medio - 1;
    	            } else {
    	                izquierda = medio + 1;
    	            }
    				
    	        }
    	       	res.add(medio, productos.get(i));
    			}
    		
    		} 	   
    	return res;
    }


 

    /**
     * Devuelve todas las compras (sin ningun orden en especial).
     * Notad que la lista devuelta tiene que ser nueva, es decir, no se puede
     * devolver la lista que contiene el atributo compras dentro la clase Almacen.
     */
    public IndexedList<Compra> getCompras(){
        	IndexedList<Compra> comprasNuevo = new ArrayIndexedList<Compra>();
        	for(int i=0; i<compras.size(); i++) {
        		comprasNuevo.add(i, compras.get(i));
        	}
      	  return comprasNuevo;
        }
    	
    

    /**
     * Devuelve las compras de un cliente (sin ningun orden en especial).
     */
    public IndexedList<Compra> comprasCliente(String clienteId){
    	IndexedList<Compra> comprasCliente = new ArrayIndexedList<Compra>();
  	  for(int i = 0; i<this.compras.size();i++) { //Recorre la lista indexada
  		  if(this.compras.get(i).getClienteId().equals(clienteId)) 
  			  comprasCliente.add(comprasCliente.size(), this.compras.get(i));
  	  }
  	  return comprasCliente;
    }

    /**
     * Devuelve las compras de un producto (sin ningun orden en especial).
     */
    public IndexedList<Compra> comprasProducto(String productoId){
    	IndexedList<Compra> comprasProducto = new ArrayIndexedList<Compra>();
  	  for(int i = 0; i<this.compras.size();i++) { //Recorre la lista indexada
  		  if(this.compras.get(i).getProductoId().equals(productoId))
  			  comprasProducto.add(comprasProducto.size(), this.compras.get(i));
  	  }
  	  return comprasProducto;
    }
    
    /**
     * Un cliente identificado por clienteId realiza una compra
     * de cantidad productos identificados por el productoId, si hay suficientes
     * articulos disponibles.
     * Devuelve la compraId de la compra (o null si no hay suficientes articulos disponibles).
     * Debe cambiar (reducir) el numero de productos disponibles.
     */
    
    public Integer pedir(String clienteId, String productoId, int cantidad) {
    	Compra co= new Compra( clienteId, productoId, cantidad);
    	Producto pr=getProducto(productoId);
    	if(pr!=null && pr.getCantidadDisponible()>=cantidad) {	
    		pr.setCantidadDisponible( pr.getCantidadDisponible()-cantidad);
    		compras.add(compras.size(), co);
    		return  co.getCompraId();
    	}
    	else { 
    	return null;}
    }
    
    /**
     * Llega al almacen una cantidad de un producto (identificado por productoId)
     * desde un productor.
     * El metodo debe aumentar la disponibilidad de los productos en el almacen.
     */
    
    public void reabastecerProducto(String productoId, int cantidad) {
    	if(getProducto(productoId) != null) {
    		Producto pr=getProducto(productoId);
    	pr.setCantidadDisponible(pr.getCantidadDisponible()+cantidad);}
    	else {productos.add(productos.size(), new Producto(productoId, cantidad));}
    }
   
}
