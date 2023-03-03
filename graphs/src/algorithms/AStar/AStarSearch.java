package algorithms.AStar;

import java.util.*;

public class AStarSearch
{
    private Node source;
    private Node destination;
    private Set<Node> explored;
    private PriorityQueue<Node>priorityQueue;
    
    public AStarSearch(Node source, Node destination){
        this.source=source;
        this.destination=destination;
        this.explored = new HashSet<>();
        this.priorityQueue = new PriorityQueue<>(new NodeComparator());
    }
    
    public void run(){
        priorityQueue.add( source );
        
        while ( !priorityQueue.isEmpty() ){
            Node currentNode = priorityQueue.poll();
            explored.add( currentNode );
            
            if(currentNode == destination){
                break;
            }
            
            for(Edge edge: currentNode.getAdjacencyList()){
                Node neighbour = edge.getTarget();
                double cost = edge.getWeight();
                double tempG = currentNode.getG() + cost;
                double tempF = tempG + euclidianDistance(currentNode, destination);
                
                //if we have not considered the neighbour and the f(x) is higher
                if(explored.contains( neighbour ) && tempF >= neighbour.getF()){
                    continue;
                }
                else if (! priorityQueue.contains( neighbour ) || tempF < neighbour.getF()){
                    neighbour.setParent( currentNode );
                    neighbour.setG( tempG );
                    neighbour.setF( tempF );
                
                    //update item in queue
                    if(priorityQueue.contains( neighbour )){
                        priorityQueue.remove(neighbour);
                    }
                    priorityQueue.add( neighbour );
                    
                }
            }
        }
    }
    
    public void printSolutionPath(){
        List<Node> path = new ArrayList<>();
        for(Node node = destination; node != null ; node = node.getParent())
        {
            path.add( node );
        }
        
        Collections.reverse( path );
        System.out.println(path);
    }
    
    //This is the heuristic function
    private double euclidianDistance( Node currentNode, Node destination )
    {
        return Math.sqrt( ((currentNode.getX() - destination.getX()) * (currentNode.getX() - destination.getX()))
                + ( (currentNode.getY() - destination.getY() ) * (currentNode.getY() - destination.getY() )));
    }
    
    public static void main( String[] args )
    {
    
        Node a = new Node( "A", 0,0 );
        Node b = new Node( "B", 10,20 );
        Node c = new Node( "C", 20,40 );
        Node d = new Node( "D", 30,10 );
        Node e = new Node( "E", 40,30 );
        Node f = new Node( "F", 50,10 );
        Node g = new Node( "G", 50,40 );
    
        a.addNeighbour( new Edge(b, 10) );
        a.addNeighbour( new Edge(d, 50) );
        
        b.addNeighbour( new Edge(d, 20) );
        b.addNeighbour( new Edge(c, 10) );
        
        c.addNeighbour( new Edge(e, 10) );
        c.addNeighbour( new Edge(g, 30) );
        
        d.addNeighbour( new Edge(f, 80) );
        
        e.addNeighbour( new Edge(f, 50) );
        e.addNeighbour( new Edge(g, 10) );
       
        g.addNeighbour( new Edge(f, 10) );
        
        AStarSearch aStarSearch = new AStarSearch( a, f );
        aStarSearch.run();
        aStarSearch.printSolutionPath();
    }
}
