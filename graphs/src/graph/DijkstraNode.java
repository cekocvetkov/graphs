package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DijkstraNode implements Comparable<DijkstraNode>
{
    private String name;
    private int distance;
    private List<DijkstraNode> shortestPath;
    
    private Map<DijkstraNode, Integer> adjacentNodes = new HashMap<>();
    
    
    public DijkstraNode(String name){
        this.name = name;
        this.shortestPath = new LinkedList<>();
        this.distance = Integer.MAX_VALUE;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName( String name )
    {
        this.name = name;
    }
    
    public int getDistance()
    {
        return distance;
    }
    
    public void setDistance( int distance )
    {
        this.distance = distance;
    }
    
    public List<DijkstraNode> getShortestPath()
    {
        return shortestPath;
    }
    
    public void setShortestPath( List<DijkstraNode> shortestPath )
    {
        this.shortestPath = shortestPath;
    }
    
    public Map<DijkstraNode, Integer> getAdjacentNodes()
    {
        return adjacentNodes;
    }
    
    public void addNeighbour( DijkstraNode neigbour, int distance )
    {
        this.adjacentNodes.put( neigbour, distance );
    }
    
    @Override
    public int compareTo( DijkstraNode dijkstraNode )
    {
        return Integer.compare( this.distance, dijkstraNode.getDistance() );
    }
    
    @Override
    public String toString()
    {
        return "DijkstraNode{" + "name='" + name + '\'' + ", distance=" + distance + ", shortestPath=" + shortestPath + '}';
    }
}
