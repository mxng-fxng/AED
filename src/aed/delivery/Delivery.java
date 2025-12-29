package aed.delivery;

import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.graph.DirectedGraph;
import es.upm.aedlib.graph.DirectedAdjacencyListGraph;
import es.upm.aedlib.graph.Vertex;

public class Delivery<V> {
	
	private DirectedGraph<V,Integer> grafo;
	private V[] places;
	private Integer[][] gmat;
	private Vertex<V>[] vertices; 
	
  // Construct a graph out of a series of vertices and an adjacency matrix.
  // There are 'len' vertices. A null means no connection. A non-negative
  // number represents distance between nodes.
	public Delivery(V[] places, Integer[][] gmat) {
		this.places = places;
		this.gmat = gmat;
		this.grafo = new DirectedAdjacencyListGraph<>();
		this.vertices = (Vertex<V>[]) new Vertex[places.length];

		 for(int i = 0; i < places.length; i++) {
	          if(places[i] != null) {
	              vertices[i] = grafo.insertVertex(places[i]);  // ← GUARDAR
	          }
	      }
	      

	      for(int i = 0; i < places.length; i++) {
	          for(int j = 0; j < gmat[i].length; j++) {
	              if(gmat[i][j] != null) {
	                  grafo.insertDirectedEdge(vertices[i], vertices[j], gmat[i][j]);
	              }
	          }
	      }
	}
  // Just return the graph that was constructed
  public DirectedGraph<V, Integer> getGraph() {
    return grafo;
  }

  // Return a Hamiltonian path for the stored graph, or null if there is none.
  // The list containts a series of vertices, with no repetitions (even if the path
  // can be expanded to a cycle).
  public PositionList<Vertex<V>> tour() {

	    for (int i = 0; i < places.length; i++) { //recorre la lista de vertices
	        PositionList<Vertex<V>> camino = new NodePositionList<>();
	        boolean[] visitado = new boolean[places.length];
	        
	        if (tourAux(i, camino, visitado, 1)) {
	            return camino; //Hay camino
	        }
	    }
	    
	    return null; // No hay camino Hamiltoniano
	}

	private boolean tourAux(int actual, PositionList<Vertex<V>> camino, boolean[] visitado, int visitados) {
	    Vertex<V> v = vertices[actual];
	    camino.addLast(v);
	    visitado[actual] = true;
	    
	    //Se han visitado todos los vértices
	    if (visitados == places.length) {
	        return true;
	    }
	    
	    // Probar con todos los vecinos
	    for (int j = 0; j < gmat[actual].length; j++) {
	        if (gmat[actual][j] != null && !visitado[j]) {
	            if (tourAux(j, camino, visitado, visitados + 1)) {
	                return true;
	            }
	        }
	    }
	    
	    // Si no, vuelve hacia atrás
	    camino.remove(camino.last());
	    visitado[actual] = false;
	    
	    return false;
	}


	public int length(PositionList<Vertex<V>> path) {
	    if (path == null) {
	        return 0;
	    }

	    int longitud = 0;
	    Position<Vertex<V>> p = path.first();
	    
	    while (p != path.last()) {
	        Vertex<V> origen = p.element();
	        Position<Vertex<V>> siguiente = path.next(p);
	        Vertex<V> destino = siguiente.element();
	        
	        //i del origen
	        int i = -1;
	        for (int k = 0; k < vertices.length; k++) {
	            if (vertices[k] != null && vertices[k].element().equals(origen.element())) {
	                i = k;
	                break;
	            }
	        }
	        
	        // j destino
	        int j = -1;
	        for (int k = 0; k < vertices.length; k++) {
	            if (vertices[k] != null && vertices[k].element().equals(destino.element())) {
	                j = k;
	                break;
	            }
	        }
	        
	        // Sumar peso desde la matriz de adyacencia
	        if (i != -1 && j != -1 && gmat[i][j] != null) {
	        	longitud += gmat[i][j];
	        }
	        
	        p = siguiente;
	    }
	    
	    return longitud;
	}

  public String toString() {
    return "Delivery";
  }
}