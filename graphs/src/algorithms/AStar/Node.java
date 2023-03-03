package algorithms.AStar;

import java.util.ArrayList;
import java.util.List;

public class Node
{
    private String name;
    private double x;
    private double y;
    //parameters for A* search (f = g + h[heuristic function])
    private double g;
    private double h;
    private double f;
    
    //track neightbours;
    private List<Edge> adjacencyList;
    //tracks previous node in the shortest path
    private Node parent;
    
    public Node ( String name, double x, double y){
        this.name=name;
        this.x=x;
        this.y=y;
        this.adjacencyList = new ArrayList<>();
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName( String name )
    {
        this.name = name;
    }
    
    public double getX()
    {
        return x;
    }
    
    public void setX( double x )
    {
        this.x = x;
    }
    
    public double getY()
    {
        return y;
    }
    
    public void setY( double y )
    {
        this.y = y;
    }
    
    public double getG()
    {
        return g;
    }
    
    public void setG( double g )
    {
        this.g = g;
    }
    
    public double getH()
    {
        return h;
    }
    
    public void setH( double h )
    {
        this.h = h;
    }
    
    public double getF()
    {
        return f;
    }
    
    public void setF( double f )
    {
        this.f = f;
    }
    
    public List<Edge> getAdjacencyList()
    {
        return adjacencyList;
    }
    
    public void addNeighbour( Edge edge )
    {
        this.adjacencyList.add( edge );
    }
    
    public Node getParent()
    {
        return parent;
    }
    
    public void setParent( Node parent )
    {
        this.parent = parent;
    }
    
    @Override
    public String toString()
    {
        return "Node{" + "name='" + name + '\'' + '}';
    }
}
