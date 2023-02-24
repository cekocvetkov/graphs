package maze;

public class MazeSolver
{
    private final int startColumn;
    private final int startRow;
    private int [][] maze;
    private boolean [][] visited;
    
    public MazeSolver(int [][] maze, int startRow, int startColumn){
        this.maze=maze;
        this.visited = new boolean[maze.length][maze.length];
        this.startRow = startRow;
        this.startColumn = startColumn;
    }
    
    public void findWay(){
        if(dfs(startRow, startColumn)){
            System.out.println("Solution exists");
        } else {
            System.out.println("No solution exists");
        }
    }
    
    private boolean isValidState(int x, int y){
        // check vertical dimensions
        if(x<0 || x>maze.length-1){
            return false;
        }
        // check horizontal dimensions
        if(y<0 || y>maze.length-1){
            return false;
        }
        // when we have already visited
        if(visited[x][y]){
            return false;
        }
        // if obstacle in the way
        if(maze[x][y]==1){
            return false;
        }
        
        return true;
    }
    
    private boolean dfs( int x, int y )
    {
        if(isValidState( x,y ) && maze[x][y]==3){
            return true;
        }
        if(isValidState( x,y )){
            visited[x][y] = true;
            //then we visit the next cells (up, down, left, right)
            if(dfs(x-1,y)){
                return true;
            }
            if(dfs(x+1,y)){
                return true;
            }
            if(dfs(x,y-1)){
                return true;
            }
            if(dfs(x,y+1)){
                return true;
            }
            
            // if everything is false => backtrack
            visited[x][y] = false;
            return false;
        }
        return false;
    }
}
