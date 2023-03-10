package graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex
{
    private String name;
    private boolean visited;
    private List<Vertex> adjecencyList;
    
    public Vertex (String name){
        this.name = name;
        this.adjecencyList = new ArrayList<>();
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName( String name )
    {
        this.name = name;
    }
    
    public boolean isVisited()
    {
        return visited;
    }
    
    public void setVisited( boolean visited )
    {
        this.visited = visited;
    }
    
    public List<Vertex> getAdjecencyList()
    {
        return adjecencyList;
    }
    
    public void addNeighbour( Vertex vertex )
    {
        this.adjecencyList.add( vertex );
    }
    
    @Override
    public String toString()
    {
        return this.name;
    }
}
