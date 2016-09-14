package Utils.Graph;

import java.util.HashSet;

/**
 * Created by apoorvadubey on 8/9/16.
 */
public class Vertex <T> {
    private T id;
    private HashSet<Edge> neighbors;

    public Vertex(T value) {
        this.id = value;
        this.neighbors = new HashSet<Edge>();
    }

    public T getId() {
        return id;
    }

    public HashSet<Edge> getNeighbors() {
        return neighbors;
    }

    public boolean addNeighbor(Edge edge) {
        if(this.neighbors.contains(edge)){
            return false;
        }
        else
            this.neighbors.add(edge);
        return true;
    }
    public boolean containsNeighbor(Edge edge){
        return this.neighbors.contains(edge);
    }
    public boolean removeNeighbor(Edge e){
        if(!(e instanceof Edge)){return false;}
        if(e.getOne()!= getId() || e.getTwo() != getId()){return false;}
        else {this.neighbors.remove(e);}
        return true;
    }

    public int hashCode(){
        return getId().hashCode();
    }

    @Override
    public String toString(){
        return "Vertex : " + getId();
    }

    public boolean equals(Vertex other){
        if(!(other instanceof Vertex)){return false;}
        return this.getId().equals(other.getId());
    }
}
