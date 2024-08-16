package Test;

import Utils.Graph.*;

/**
 * Created by apoorvadubey on 8/9/16.
 */
public class GraphTest {

    public static void main (String args[]){
        Vertex [] vertices = new Vertex[5];
        for(int i = 0 ; i < 5 ; i ++){
            Vertex v = new Vertex(i);
            vertices[i] = v;
        }

        Graph g = new Graph(vertices);
        System.out.println(g.toString());
    }
}
