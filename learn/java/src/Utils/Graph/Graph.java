package Utils.Graph;

import java.util.HashMap;

/**
 * Created by apoorvadubey on 8/9/16.
 */
public class Graph<T> {
    HashMap<T,Vertex> vertices;
    HashMap<Integer,Edge> edges;

    public Graph(Vertex[] vertices) {
        //Insert all vertices value
        for(Vertex v : vertices){
            this.vertices.put((T) v.getId(),v);
        }
        this.edges = new HashMap<Integer, Edge>();
    }

    public Graph() {
        this.vertices = new HashMap<T, Vertex>();
        this.edges = new HashMap<Integer, Edge>();
    }

    public boolean addEdge (Vertex one, Vertex two){
        return addEdge(one, two, 1);
    }

    private boolean addEdge(Vertex one, Vertex two, int i) {
        if(two.equals(one)){return false;}
        if(!this.vertices.containsKey(one)){this.vertices.put((T) one.getId(),one);}
        if(!this.vertices.containsKey(two)){this.vertices.put((T) two.getId(),two);}

        Edge e = new Edge(one,two,i);
        this.vertices.get(one).addNeighbor(e);
        this.vertices.get(two).addNeighbor(e);
        this.edges.put(e.hashCode(),e);
        return true;
    }

    public boolean addVertex(Vertex v, boolean overwriteFlag){
        if(this.vertices.containsKey(v.getId())){
            return false;
        }
        else this.vertices.put((T) v.getId(),v);
        return true;
    }

    public boolean containsVertex(){return true;}
    public boolean containsEdge(){return true;}
    public boolean removeEdge(){return true;}
    public boolean removeVertex(){return true;}

    @Override
    public String toString(){
        return null;
    }
}
