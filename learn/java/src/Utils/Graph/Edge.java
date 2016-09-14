package Utils.Graph;

/**
 * Created by apoorvadubey on 8/9/16.
 */
public class Edge{
    private Vertex one;
    private Vertex two;
    private int weight;

    public Edge(Vertex one, Vertex two, int weight) {
        this.one = one;
        this.two = two;
        this.weight = weight;
    }

    public Edge(Vertex one, Vertex two) {
        this(one, two, 1);
    }

    //Getter and Setter
    public Vertex getOne() {
        return one;
    }

    public Vertex getTwo() {
        return two;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean equals(Edge other){
        if(!(other instanceof Edge)){return false;}
        return this.getOne().equals(other.getOne()) && this.getTwo().equals(other.getTwo());
    }

    public int compareTo(Edge other){
        return this.getWeight() - other.getWeight();
    }

    public String toString(){
        return getOne() + " --> " + getTwo() + " Weight: " + getWeight();
    }
}