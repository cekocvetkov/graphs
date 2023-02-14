package algorithms;

import graph.Vertex;

import java.util.Stack;

public class DFS
{
    public void traverseWithRecursion(Vertex vertex){
        vertex.setVisited( true );
        System.out.println(vertex);
        for(Vertex v: vertex.getAdjecencyList()){
            if(!v.isVisited()){
                traverseWithRecursion( v );
            }
        }
    }
        
    public void traverseWithStack(Vertex root){
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
    
        Vertex rootForStack = GraphFactory.createGraph();
        System.out.println("DFS with stack:");
        dfs.traverseWithStack( rootForStack );
    
        Vertex rootForRecursion = GraphFactory.createGraph();
        System.out.println("DFS with recursion:");
        dfs.traverseWithRecursion( rootForRecursion );
    }
}
