package algorithms;

import graph.DijkstraNode;
import graph.IDDFSVertex;
import graph.Vertex;

import java.util.List;

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
    
    public static List<DijkstraNode> createDijkstraGraph(){
        DijkstraNode a = new DijkstraNode("A");
        DijkstraNode b = new DijkstraNode("B");
        DijkstraNode c = new DijkstraNode("C");
        DijkstraNode d = new DijkstraNode("D");
        DijkstraNode e = new DijkstraNode("E");
        DijkstraNode f = new DijkstraNode("F");
        
        a.addNeighbour( b, 2 );
        a.addNeighbour( c, 4 );
        
        b.addNeighbour( c, 3 );
        b.addNeighbour( e, 5 );
        b.addNeighbour( d, 1 );
        
        c.addNeighbour( d, 2 );
        
        d.addNeighbour( e, 1 );
        d.addNeighbour( f, 4 );
        
        e.addNeighbour( f, 2 );
        
        return List.of(a,b,c,d,e,f);
    }
}
