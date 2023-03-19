import java.util.ArrayList;

public class Knight extends Chessman {
    public Knight(int positionX, int positionY, boolean alive, String color, String name) {
        super(positionX, positionY, alive, color, name);
    }
    public Knight(){
    }

    @Override
    public void move(int x, int y) {

    }

    public void createWhiteKnights(ArrayList<Knight> knights) {
        Knight WK1 = new Knight(1, 7, true, "white", "WK1");
        knights.add(WK1);
        Knight WK2 = new Knight(6, 7, true, "white", "WK2");
        knights.add(WK2);
    }

    public void createBlackKnights(ArrayList<Knight> knights) {
        Knight BK1 = new Knight(1, 0, true, "black", "BK1");
        knights.add(BK1);
        Knight BK2 = new Knight(6, 0, true, "black", "BK2");
        knights.add(BK2);
    }
}
