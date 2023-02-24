package algorithms;

import graph.IDDFSVertex;
import graph.Vertex;

public class GraphFactory
{
    // Returns the root of the graph from the picture in this package
    public static Vertex createGraph(){
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
        
        return a;
    }
    
    public static IDDFSVertex createGraphIDDFS(){
        IDDFSVertex a = new IDDFSVertex("A");
        IDDFSVertex b = new IDDFSVertex("B");
        IDDFSVertex c = new IDDFSVertex("C");
        IDDFSVertex d = new IDDFSVertex("D");
        IDDFSVertex e = new IDDFSVertex("E");
        IDDFSVertex f = new IDDFSVertex("F");
        IDDFSVertex g = new IDDFSVertex("G");
        IDDFSVertex h = new IDDFSVertex("H");
        
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
        
        return a;
    }
}
