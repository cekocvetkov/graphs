package algorithms;

import graph.IDDFSVertex;
import graph.Vertex;

import java.util.Stack;

public class IDDFS
{
    public void findTargetNode(IDDFSVertex root, IDDFSVertex targetNode){
        boolean isTargetFound=false;
        int depth=0;
        
        while(!isTargetFound){
            System.out.println();
            boolean found = dfs(root, depth, targetNode);
            isTargetFound=found;
            depth++;
        }
    }
    
    private boolean dfs( IDDFSVertex root, int depthLevel, IDDFSVertex targetNode )
    {
        Stack<IDDFSVertex> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            IDDFSVertex vertex = stack.pop();
            System.out.println("vertex: "+vertex.getName());
            
            if(vertex.getName() == targetNode.getName()){
                System.out.println("Node has been found");
                return true;
            }
            
            if(vertex.getDepthLeve() >= depthLevel){
                continue;
            }
            
            //standard dfs
            for(IDDFSVertex v: vertex.getAdjecencyList()){
                v.setDepthLeve( vertex.getDepthLeve()+1 );
                stack.push( v );
            }
        }
        return false;
    }
    
    public static void main (String [] args){
        IDDFS iddfs = new IDDFS();
        IDDFSVertex root = GraphFactory.createGraphIDDFS();
        iddfs.findTargetNode( root , new IDDFSVertex("H"));
    }
}
