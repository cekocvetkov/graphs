package graph;

import java.util.ArrayList;
import java.util.List;

public class IDDFSVertex
{
    private String name;
    private int depthLeve = 0;
    private List<IDDFSVertex> adjecencyList;
    public IDDFSVertex (String name){
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
    
    public int getDepthLeve()
    {
        return depthLeve;
    }
    
    public void setDepthLeve( int depthLeve )
    {
        this.depthLeve = depthLeve;
    }
    
    public List<IDDFSVertex> getAdjecencyList()
    {
        return adjecencyList;
    }
    
    public void addNeighbour( IDDFSVertex vertex )
    {
        this.adjecencyList.add( vertex );
    }

}
