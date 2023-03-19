import java.util.ArrayList;

public class Bishop extends Chessman{
    public Bishop(int positionX, int positionY, boolean alive, String color, String name) {
        super(positionX, positionY, alive, color, name);
    }
    public Bishop(){
    }

    @Override
    public void move(int x, int y) {
    }
    public void createWhiteBishops(ArrayList<Bishop> bishops) {
        bishops.add(new Bishop(2, 7, true, "white", "WB1"));
        bishops.add(new Bishop(5, 7, true, "white", "WB2"));
    }

    public void createBlackBishops(ArrayList<Bishop> bishops) {
        bishops.add(new Bishop(2, 0, true, "black","BB1"));
        bishops.add(new Bishop(5, 0, true, "black","BB2"));
    }
}
