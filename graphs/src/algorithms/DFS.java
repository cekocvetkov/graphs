package algorithms;

import graph.Vertex;

import java.util.Stack;

public class DFS
{
    
    public void traverse(Vertex root){
        Stack<Vertex> stack = new Stack<>();
        
        root.setVisited( true );
        stack.push( root );
        while(!stack.isEmpty()){
            Vertex nextVertex = stack.pop();
            System.out.println(nextVertex);
            for(Vertex v: nextVertex.getAdjecencyList()){
                if(!v.isVisited()){
                    v.setVisited( true );
                    stack.push( v );
                }
            }
        }
    }
    
    public static void main (String [] args){
        DFS dfs = new DFS();
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");
        
        a.addNeighbour( b );
        a.addNeighbour( f );
        a.addNeighbour( g );
        
        b.addNeighbour( a );
        b.addNeighbour( c );
        b.addNeighbour( d );
        
        c.addNeighbour( b );
        
        d.addNeighbour( b );
        d.addNeighbour( e );
        
        f.addNeighbour( a );
        
        g.addNeighbour( a );
        g.addNeighbour( h );
        
        h.addNeighbour( g );
        
        dfs.traverse( a );
    }
}
