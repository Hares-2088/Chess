import java.util.ArrayList;

public class King extends Chessman{
    public King(int positionX, int positionY, boolean alive, String color, String name) {
        super(positionX, positionY, alive, color, name);
    }
    public King(){
    }
    @Override
    public void move(int x, int y) {

    }
    public void createWhiteKing(ArrayList<King> king) {
        King WK1 = new King(4, 7, true, "white", "WKING");
        king.add(WK1);
    }

    public void createBlackKing(ArrayList<King> king) {
        King BK1 = new King(4, 0, true, "black", "BKING");
        king.add(BK1);
    }
}
