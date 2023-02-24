package algorithms;

import graph.DijkstraNode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dijkstra
{
    public void findShortestPath(DijkstraNode root){
        root.setDistance( 0 );
        Set<DijkstraNode> settledNodes = new HashSet<>();
        Queue<DijkstraNode> unsettledNodes = new PriorityQueue<>();
        unsettledNodes.add( root );
        
        while(!unsettledNodes.isEmpty()){
            DijkstraNode currentNode = unsettledNodes.poll();
            currentNode.getAdjacentNodes().entrySet().stream().filter( entry -> !settledNodes.contains( entry.getKey() ) ).forEach( entry -> {
                evaluateDistanceAndPath(entry.getKey(), entry.getValue(), currentNode);
                unsettledNodes.add( entry.getKey() );
            } );
            settledNodes.add( currentNode );
        }
        
    }
    
    private void evaluateDistanceAndPath( DijkstraNode adjacentNode, Integer edgeWeight, DijkstraNode sourceNode )
    {
        int newDistance = sourceNode.getDistance() + edgeWeight;
        if(newDistance< adjacentNode.getDistance()){
            //update distance
            adjacentNode.setDistance( newDistance );
            //update path
            adjacentNode.setShortestPath( Stream.concat(sourceNode.getShortestPath().stream(), Stream.of(sourceNode)).toList());
        }
    }
    
    private void printPaths(List<DijkstraNode> nodes){
        nodes.forEach( node -> {
            String path = node.getShortestPath().stream().map( DijkstraNode::getName ).collect( Collectors.joining("->"));
            System.out.println((path.isBlank()) ? "%s: %s".formatted( node.getName(), node.getDistance() ) : "%s -> %s : %s".formatted( path, node.getName(), node.getDistance() ));
        } );
    }
    
    public static void main( String[] args )
    {
        Dijkstra dijkstra = new Dijkstra();
        List<DijkstraNode> nodes = GraphFactory.createDijkstraGraph();
    
        System.out.println("ROOT: "+nodes.get( 0 ));
        DijkstraNode root = nodes.get( 0 );
        dijkstra.findShortestPath( root );
        dijkstra.printPaths( nodes );
    }
}
