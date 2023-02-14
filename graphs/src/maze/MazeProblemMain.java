package maze;

public class MazeProblemMain
{
    public static void main(String [] args){
        int [][] map = {
                {1, 1, 1, 1, 1, 1},
                {2, 1, 0, 0, 0, 1},
                {0, 1, 0, 1, 0, 1},
                {0, 1, 0, 1, 0, 3},
                {0, 1, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 1},
        };
        MazeSolver mazeSolver = new MazeSolver( map, 1, 0 );
        mazeSolver.findWay();
    }
}
