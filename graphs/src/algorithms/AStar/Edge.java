package algorithms.AStar;

public class Edge
{
    private double weight;
    private Node target;
    
    public Edge(Node target, double weight){
        this.target=target;
        this.weight=weight;
    }
    
    public Node getTarget()
    {
        return target;
    }
    
    public double getWeight()
    {
        return weight;
    }
}
