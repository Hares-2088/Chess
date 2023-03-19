import java.util.ArrayList;

public class Queen extends Chessman{
    public Queen(int positionX, int positionY, boolean alive, String color, String name) {
        super(positionX, positionY, alive, color, name);
    }
    public Queen(){
    }

    @Override
    public void move(int x, int y) {

    }
    public void createWhiteQueen(ArrayList<Queen> queen) {
        Queen WQ1 = new Queen(3, 7, true, "white", "WQ");
        queen.add(WQ1);
    }

    public void createBlackQueen(ArrayList<Queen> queen) {
        Queen BQ1 = new Queen(3, 0, true, "black", "BQ");
        queen.add(BQ1);
    }
}
